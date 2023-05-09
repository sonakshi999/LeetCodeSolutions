class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int r=matrix.length,c=matrix[0].length,left=0,right=c-1,top=0,bottom=r-1;
        int dl=0;
        while(top<=bottom && left<=right)
        {
            if(dl==0)
            {
                for(int i=left;i<=right;i++)
                    list.add(matrix[top][i]);
                top++;
            }else if(dl==1){
                for(int i=top;i<=bottom;i++)
                    list.add(matrix[i][right]);
                right--;
            }else if(dl==2){
                for(int i=right;i>=left;i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }else if(dl==3){
                for(int i=bottom;i>=top;i--)
                    list.add(matrix[i][left]);
                left++;
            }
            dl=(dl+1)%4;
        }
        return list;
    }
}