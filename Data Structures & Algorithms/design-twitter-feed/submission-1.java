class Twitter {
    private int time = 0;                       // global clock: stamps every tweet
    private final Map<Integer, List<int[]>> tweets = new HashMap<>();   // user -> {time, id}
    private final Map<Integer, Set<Integer>> following = new HashMap<>();
 
    public void postTweet(int userId, int tweetId) {
        tweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(new int[]{time, tweetId});
        time += 1;
    }
 
    public List<Integer> getNewsFeed(int userId) {
        // max-heap by time: one entry {time, tweetId, uid, index} per source
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        Set<Integer> sources = new HashSet<>(following.getOrDefault(userId, Set.of()));
        sources.add(userId);
        for (int uid : sources) {
            List<int[]> posts = tweets.getOrDefault(uid, List.of());
            if (!posts.isEmpty()) {
                int[] newest = posts.get(posts.size() - 1);   // that user's newest tweet
                heap.offer(new int[]{newest[0], newest[1], uid, posts.size() - 1});
            }
        }
        List<Integer> feed = new ArrayList<>();
        while (!heap.isEmpty() && feed.size() < 10) {
            int[] top = heap.poll();
            feed.add(top[1]);
            int uid = top[2], i = top[3];
            if (i > 0) {                              // this user has an older tweet
                int[] next = tweets.get(uid).get(i - 1);
                heap.offer(new int[]{next[0], next[1], uid, i - 1});
            }
        }
        return feed;
    }
 
    public void follow(int followerId, int followeeId) {
        following.computeIfAbsent(followerId, k -> new HashSet<>()).add(followeeId);
    }
 
    public void unfollow(int followerId, int followeeId) {
        Set<Integer> s = following.get(followerId);
        if (s != null) s.remove(followeeId);
    }
}