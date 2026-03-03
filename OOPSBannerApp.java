/**
 * OOPSBannerApp UC7 - OOPS Banner Display Application
 * @author Uzair Sikwani
 * @version 7.0
 */
public class OOPSBannerApp {
    static class CharacterPatternMap{
        private char character;
        private String[] pattern;

    public CharacterPatternMap(char character,String[] pattern){
        this.character=character;
        this.pattern=pattern;
    }
    public char getCharacter(){
        return character;
    }
    public String[] getPattern(){
        return pattern;
    }
}

public static void main(String[] args){
    CharacterPatternMap[] letters = {
        new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        }),
        new CharacterPatternMap('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        }),
        new CharacterPatternMap('P', new String[]{
                "******   ",
                "**    ** ",
                "**     **",
                "**    ** ",
                "******   ",
                "**       ",
                "**       "
        }),
        new CharacterPatternMap('S', new String[]{
                "   ***** ",
                " **      ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "  *****  "
        })
    };

    for (int row = 0; row < 7; row++) {
        StringBuilder line = new StringBuilder();
        for (CharacterPatternMap letter : letters) {
            line.append(letter.getPattern()[row]).append("  ");
        }
        System.out.println(line);
        }
    }
}