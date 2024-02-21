class Solution {
    public boolean isAnagram(String s, String t) {
        char []arr = s.toCharArray(); 
        Arrays.sort(arr);
        
        char []arr2 = t.toCharArray(); 
        Arrays.sort(arr2);
        
        String s1 = String.valueOf(arr);
        String s2 = String.valueOf(arr2);
        
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}