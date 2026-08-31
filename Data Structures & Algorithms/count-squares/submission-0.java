class CountSquares {

    private Map<List<Integer> , Integer> pcount;
    private List<List<Integer>> plist;

    public CountSquares() {
        pcount = new HashMap<>();
        plist = new ArrayList<>();
        
    }
    
    public void add(int[] point) {
        List<Integer> p = Arrays.asList(point[0], point[1]);
        pcount.put(p, pcount.getOrDefault(p, 0) +1);
        plist.add(p);
        
    }
    
    public int count(int[] point) {
        int res = 0 ;
        int px = point[0];
        int py = point[1];
        for(List<Integer> p :  plist ){
            int x = p.get(0);
            int y = p.get(1);
            if((Math.abs(py - y) == Math.abs(px - x) && x != px && y != py)){
                res += pcount.getOrDefault(Arrays.asList(px, y), 0) *  pcount.getOrDefault(Arrays.asList(x, py), 0);

            }

        }
        return res;
        
    }
}
