class Solution {
    public int[] twoSum(int[] a, int k) {
        int i = 0;
        int j = a.length-1;
        int[] b = new int[2];
        while(i < j){
          if(a[i] + a[j] == k) {
             b[0] = i+1;
             b[1] = j+1;
             return b;
          } else if(a[i] + a[j] > k){
             j--;
          } else{
             i++;
          }
        }
        return b;
    }
}