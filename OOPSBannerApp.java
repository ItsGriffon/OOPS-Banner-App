
public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC6: Modular programming using helper methods
        String[] bannerLines = new String[7];
        
        // Loop through each of the 7 lines of the banner
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = buildLine(i);
        }

        // Final loop-based rendering system
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    // Helper method to assemble each line
    public static String buildLine(int index) {
        return String.join("  ", getO(index), getO(index), getP(index), getS(index));
    }

    // Fixed O (clean round shape)
    private static String getO(int i) {
        String[] pattern = {
            "  *****  ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "  *****  "
        };
        return pattern[i];
    }

    // Fixed P (proper top + middle bar)
    private static String getP(int i) {
        String[] pattern = {
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **       ",
            " **       ",
            " **       "
        };
        return pattern[i];
    }

    // Fixed S (proper curve like screenshot)
    private static String getS(int i) {
        String[] pattern = {
            "  *****  ",
            " **      ",
            " **      ",
            "  *****  ",
            "      ** ",
            "      ** ",
            "  *****  "
        };
        return pattern[i];
    }
}