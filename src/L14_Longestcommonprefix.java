package src;

class Longestcommonprefix {
    public int shortestWord(String[] str){
        int small = str[0].length();
        for(int i = 1;i<str.length;i++){
            if(small > str[i].length()){
                small = str[i].length();
            }
        }
        return small;
    }
    public String longestCommonPrefix(String[] strs) {
        int small = shortestWord(strs);
        char temp;
        String tempString = "";
        for(int i = 0;i<small;i++){
            temp = strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
                if(temp != strs[j].charAt(i)){
                    return tempString;
                }
            }
            tempString = tempString + temp;
        }

        return tempString;
    }
}
