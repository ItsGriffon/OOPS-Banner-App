
public class OOPSBannerApp {
    public static void main(String[] args) {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
            "  ****** ",
            " **      ",
            " **      ",
            "  *****  ",
            "      ** ",
            "      ** ",
            " ******  "
        });

        for (int i = 0; i < 7; i++) {
            System.out.println(
                String.join("  ",
                    o.getLine(i),
                    o.getLine(i),
                    p.getLine(i),
                    s.getLine(i)
                )
            );
        }
    }

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }
    }
}