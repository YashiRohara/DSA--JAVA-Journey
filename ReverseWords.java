class Solution{
    public String reverseWords(String s){
        StringBuilder result = new StringBuilder();
        int i = s.length()-1;
        while(i>=0){
            if(s.charAt(i) == ' '){
                i--;
                continue;
            }
            int end =i;
            while(i>=0 && s.charAt(i) != ' '){
                i--;
            }
            String word = s.substring(i+1,end+1);
            result.append(word).append(" ");
        }
        return result.toString().trim();

    }
}