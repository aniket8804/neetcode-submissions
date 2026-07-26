class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append("#").append(s);
        }

        String encoded_string = sb.toString();
        return encoded_string;
    }

    public List<String> decode(String str) {
        if(str.length()==0){
            List<String> list = new ArrayList<>();
            return list;
        }
        List<String> list = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));

            list.add(str.substring(j+1, j+length+1));

            i=j+length+1;
        }return list;
    }
}

