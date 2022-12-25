/*class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int ans[] = new int[queries.length];
        for(int i=0;i<queries.length;i++) {
            int max = queries[i];
            int sum = 0;
            int cnt = 0;
            for(int j=0;j<nums.length;i++) {
                if(max >= sum) {
                  sum += nums[j];
                  cnt++;
                }else{
                    break;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}*/
class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        // Sort 'nums'
        Arrays.sort(nums);
        int n = nums.length, m = queries.length;
        int answer[] = new int[m];
        
        // For each query, collect numbers from lowest to highest.
        // If their sum exceeds the limit 'query', move on to the next query.
        for (int i = 0; i < m; ++i) {
            int count = 0;
            int query = queries[i];
            for (int num : nums) {
                if (query >= num) {
                    count++;
                    query -= num;
                }
                else
                    break;
            }
            answer[i] = count;
        }
        return answer;
    }
}