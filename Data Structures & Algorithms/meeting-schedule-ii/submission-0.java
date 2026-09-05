/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int size =  intervals.size();
        if(size<=1) return size;
        intervals.sort((a,b) ->  Integer.compare(a.start,  b.start));
        PriorityQueue<Integer>  available =  new PriorityQueue<>();
        available.offer(intervals.get(0).end);
        for(int i =1 ;  i<size; i++){
            if(!available.isEmpty() && available.peek() <= intervals.get(i).start){
                available.remove();
                
            }
            available.offer(intervals.get(i).end);
        }

        return available.size();

    }
}
