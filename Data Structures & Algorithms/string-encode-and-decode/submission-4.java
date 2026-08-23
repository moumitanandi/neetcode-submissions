class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str: strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0, j = 0;
        while(i < str.length()) {
            while(j < str.length()) {
                if(str.charAt(j) == '#' && Character.isLetterOrDigit(str.charAt(j-1))) {
                    int size = Integer.parseInt(str.substring(i,j));
                    res.add(str.substring(j+1, j+1+size));
                    i = j+1+size;
                }
                j++;
            }
        }
        return res;
    }
}
