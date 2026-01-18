import java.util.*;
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();

        calcDist(p1, p2, set);
        calcDist(p1, p3, set);
        calcDist(p1, p4, set);
        calcDist(p2, p3, set);
        calcDist(p2, p4, set);
        calcDist(p3, p4, set);

        return !set.contains(0) && set.size()==2; 
    }

    public void calcDist(int[] a, int[] b, Set<Integer>set){
        int dx = a[0]-b[0];
        int dy = a[1]-b[1];
        
        int dist = dx*dx + dy*dy;

        set.add(dist);
    }
}
