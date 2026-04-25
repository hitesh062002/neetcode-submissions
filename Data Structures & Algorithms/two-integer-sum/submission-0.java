class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] b = new int[2];
        int i = 0;
        for(int x : a) {
            if(h.containsKey(target - x)) {
                b[0] = h.get(target - x);
                b[1] = i;
            } else {
                h.put(x, i);
            }
            i++;
        }
        return b;
    }
}
