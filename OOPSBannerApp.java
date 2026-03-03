/**
 * OOPSBannerApp UC8 - OOPS Banner Display Application
 * @author Uzair Sikwani
 * @version 8.0
 */
import java.util.HashMap;

public class OOPSBannerApp{
    public static HashMap<Character, String[]> createPatternMap(){
        HashMap<Character, String[]> patternMap = new HashMap<>();
        patternMap.put('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });
        patternMap.put('P', new String[]{
            "******   ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "******   ",
            "**       ",
            "**       "
        });
        patternMap.put('S', new String[]{
            "   ***** ",
            " **      ",
            "**       ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "  *****  "
        });
        return patternMap;
    }

public static void displayBanner(String message, HashMap<Character,String[]> patternMap){
    int patternHeight = patternMap.get('O').length;
    for (int row=0;row<patternHeight;row++){
        StringBuilder line = new StringBuilder();

        for(char ch : message.toCharArray()){
            line.append(patternMap.get(ch)[row]).append(" ");
        }
        System.out.println(line);
    }
}

public static void main(String[] args) {
    HashMap<Character,String[]> patternMap = createPatternMap();
    String message = "OOPS";
    displayBanner(message,patternMap);
    }
}