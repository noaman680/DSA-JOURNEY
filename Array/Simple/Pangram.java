public class Pangram {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz"; 
    }
    static boolean check(String sentence){
        for(char c = 'a';c<='z';c++){
            if(sentence.indexOf(c)==-1){
                return false;
            }
        }
        return true;
    }
}
