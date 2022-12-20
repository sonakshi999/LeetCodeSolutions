class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean c[] = new boolean[n];
        c[0] = true;
        Stack<Integer> sc = new Stack<>();
        sc.push(0);
        while(!sc.isEmpty()) {
            int curr = sc.pop();
            for(int i : rooms.get(curr)) {
                if(c[i] == false) {
                 sc.push(i);
                 c[i] = true;
                }
            }
        }
        for(boolean v:c) {
            if(!v) return false;
        }
        return true;
    }
}