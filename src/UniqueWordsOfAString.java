public class UniqueWordsOfAString {
    public static void main(String[] args) {
        String s = "Naga Sudheer";
        for (int i =0;i<s.length();i++){
            if(s.indexOf(i)==s.lastIndexOf(i)){
                System.out.println(s.charAt(i));
            }
        }
    }
}
