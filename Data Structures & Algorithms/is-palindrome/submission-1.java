class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] a = cleaned.toCharArray();

    int i = 0, j = a.length - 1;
    while (i < j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
    }

    String reversed = new String(a);
    return cleaned.equals(reversed);
    }
}
