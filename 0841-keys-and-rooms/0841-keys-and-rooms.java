class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> sc = new LinkedList<>();
        sc.add(0);
        boolean seen[] = new boolean[rooms.size()];
        seen[0] = true;
        
        while(!sc.isEmpty()) {
            int curr = sc.poll();
            for(int i : rooms.get(curr)) {
                if(seen[i] == false) {
                    seen[i] = true;
                    sc.add(i);
                }
            }
        }
        
        for(boolean vis : seen) {
            if(!vis) {
                return false;
            }
        }
        return true;
    }
}