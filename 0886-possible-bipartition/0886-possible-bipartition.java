class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // construct adjancey list
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int edge[] : dislikes) {
            int a = edge[0],b=edge[1];
            mp.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
            mp.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
        }
        // initialize color array for all node
        int c[] = new int[n+1];
        Arrays.fill(c,-1);
        for(int i=1;i<=n;i++) {
            if(c[i] == -1) {
                if(!dfs(i,0,mp,c)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int node,int nodeC,Map<Integer,List<Integer>> mp,int c[]) {
        c[node] = nodeC;
        if(!mp.containsKey(node)){
            return true;
        }
        for(int n:mp.get(node)) {
            if(c[n] == c[node]) {
                return false;
            }
            if(c[n] == -1) {
                if(!dfs(n,1-nodeC,mp,c)) {
                    return false;
                }
            }
        }
        return true;
    }
    
}