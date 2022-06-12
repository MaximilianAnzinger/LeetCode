class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination) {
            int t = start;
            start = destination;
            destination = t;
        }
        int sum = 0, r = 0;
        for(int i = 0; i < distance.length; i++) {
            sum += distance[i];
            if(start <= i && i < destination)
                r += distance[i];
        }
        return (int) Math.min(r, sum - r);
    }
}