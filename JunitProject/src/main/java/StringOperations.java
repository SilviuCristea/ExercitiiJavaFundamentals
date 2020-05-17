public class StringOperations {

    public int stingLength (String text){
        return text.length();
    }

    public String stringConcat(String text1, String text2){
        return text1.concat(text2);
    }

    public boolean stringContains (String text1, String text2){
        if (text1.contains(text2)){
            return true;
        }else {
            return false;
        }
    }
}
