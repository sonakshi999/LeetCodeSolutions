class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> sc = new Stack<>();
        for(int i=0;i<asteroids.length;i++) {
            int curr = asteroids[i];
            if(sc.isEmpty()){
                sc.push(curr);
            }else {
                if(curr >= 0) {
                    sc.push(curr);
                }else {
                    if(sc.peek() <= 0) {
                        sc.push(curr);
                    }else{
                        int go = 0;
                        while(!sc.isEmpty()){
                            if(sc.peek()>Math.abs(curr)){
                                go=0;
                                break;
                            }else if(sc.peek()>0 && sc.peek()==Math.abs(curr)){ 
                                go=0;
                                sc.pop();
                                break;
                            }else if(sc.peek() < Math.abs(curr) && sc.peek() > 0){
                               sc.pop();
                                go=1;
                            } else if(sc.peek()<0) {
                                go=0;
                                sc.push(curr);
                                break;
                            }
                        }
                        if(go==1){
                            sc.push(curr);
                        }
                    }
                }
            }
        }
        int ans[] = new int[sc.size()];
        int i = sc.size()-1;
        while(!sc.isEmpty()){
            ans[i--]=sc.pop();
        }
        //Collections.reverse(Arrays.asList(ans));
        return ans;
    }
}