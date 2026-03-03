
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

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
                " ******  ",
                " **   ** ",
                " **   ** ",
                " ******  ",
                " **      ",
                " **      ",
                " **      "
        });

        patternMap.put('S', new String[]{
                "  ****** ",
                " **      ",
                " **      ",
                "  *****  ",
                "      ** ",
                "      ** ",
                " ******  "
        });

        renderBanner("OOPS", patternMap);
    }

    public static void renderBanner(String word, Map<Character, String[]> map) {
        for (int i = 0; i < 7; i++) {
            StringBuilder lineResult = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (map.containsKey(c)) {
                    lineResult.append(map.get(c)[i]).append("  ");
                }
            }
            System.out.println(lineResult.toString());
        }
    }
}