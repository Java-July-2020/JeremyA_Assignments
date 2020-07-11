public class StringManipulator {    
    public String trimAndConcat(String string1, String string2) {
        string1 = string1.trim();
        string2 = string2.trim();
        return string1 + string2;
    }
    public Integer getIndexOrNull(String string1, char character) {
        int number = string1.indexOf(character);
        if (number >= 0){
            return number;
        }
        else {
            return null;
        }
    }
    public Integer getIndexOrNull(String string1, String string2){
        int number = string1.indexOf(string2);
        if (number >= 0){
            return number;
        }
        else {
            return null;
        }
    }

    public String concatSubstring(String string1, int number1, int number2, String string2){
        return string1.substring(number1, number2) + string2;
    }
}