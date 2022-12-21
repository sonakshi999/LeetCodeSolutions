class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Stack<Integer> sc = new Stack<>();
        sc.add(0);
        boolean seen[] = new boolean[rooms.size()];
        seen[0] = true;
        
        while(!sc.isEmpty()) {
            int curr = sc.pop();
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