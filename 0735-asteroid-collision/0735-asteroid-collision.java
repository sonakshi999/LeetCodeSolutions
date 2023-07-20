class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sc = new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
            int curr = asteroids[i];
            
            if(curr > 0) {
                sc.add(curr);
            } else {
                int go = 0;
                if(sc.isEmpty() || sc.peek()<0){
                    sc.push(curr);
                    
                }else{
                while(!sc.isEmpty() && sc.peek() > 0) {
                    
                    int temp = sc.pop();
                    if(temp > Math.abs(curr)) {
                        sc.push(temp);
                        go=0;
                        break;
                    }else if(temp == Math.abs(curr)) {
                        go =0;
                        break;
                    }else{
                        go =1;
                    }
                    
                }
                if(go==1){
                    sc.push(curr);
                }
            }
            }
        }
        
        int sz = sc.size();
        
        int ans[] = new int[sz];
        for(int i=sz-1;i>=0;i--) {
            ans[i] = sc.pop();
        }
        return ans;
    }
}