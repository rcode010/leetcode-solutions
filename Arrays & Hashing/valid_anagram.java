
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String x[] = s.split("");
        String y[] = t.split("");

        Arrays.sort(x);
        Arrays.sort(y);
        String h = String.join("",x);
        String g = String.join("",y);


        if(g.equals(h)){
            return true;
        }else{
            return false;
        }
}
}
