import java.util.ArrayList;
import java.util.List;

public class Main {

    static String myString = "треугольник ABc qwe фыва";

    public static void findingLatinWords(List<String> listOfLatinWords) {
        int currentPos = 0;
        while (currentPos < myString.length()) {
            String currentWord = "";
            if ((Character.toString(myString.charAt(currentPos)).matches("[a-z?]")) ||
                    (Character.toString(myString.charAt(currentPos)).matches("[A-Z?]"))) {
                while ((!Character.toString(myString.charAt(currentPos)).equals(" ")) && (currentPos < myString.length())) {
                    currentWord += Character.toString(myString.charAt(currentPos));
                    currentPos++;
                }
                listOfLatinWords.add(currentWord);
                currentWord = "";
            } else {
                currentPos++;
            }
        }
    }

    public static void main(String[] args) {
        List<String> listOfLatinWords = new ArrayList<>();
        findingLatinWords(listOfLatinWords);
        listOfLatinWords.forEach(System.out::println);
    }
}
