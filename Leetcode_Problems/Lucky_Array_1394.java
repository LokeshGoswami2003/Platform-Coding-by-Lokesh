class Solution {
    public int findLucky(int[] arr) {
        int lmax=0;
        int lt;
        for(int i=0;i<arr.length;i++){
            lt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    lt=lt+1;
                }
            }
            if(lt==arr[i]){
                if(lt>lmax){
                    lmax=lt;
                }
            }
        }
        if(lmax!=0)
        return lmax;
        return -1;
    }
}