public class OOPSBannerApp {
    
    // Helper method to generate line segments for 'O' character
    public static String[] generateO() {
        return new String[] {
            "    ***   ",
            "  **   ** ",
            " **     **",
            " **     **",
            " **     **",
            " **     **",
            " **     **",
            "  **   ** ",
            "    ***   "
        };
    }
    
    // Helper method to generate line segments for 'P' character
    public static String[] generateP() {
        return new String[] {
            "*****  ",
            "**   ** ",
            "**   ** ",
            "**   ** ",
            "*****   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };
    }
    
    // Helper method to generate line segments for 'S' character  
    public static String[] generateS() {
        return new String[] {
            "    *****  ",
            "  **      ",
            " **       ",
            "  **      ",
            "    ****   ",
            "        ** ",
            "         **",
            "        ** ",
            "   *****   "
        };
    }
    
    public static void main(String[] args) {
        // Array declaration + initialization using helper methods
        String[] bannerLines = {
            String.join(" ", generateO()[0], generateO()[1], generateP()[0], generateS()[0]),
            String.join(" ", generateO()[1], generateO()[2], generateP()[1], generateS()[1]),
            String.join(" ", generateO()[2], generateO()[3], generateP()[2], generateS()[2]),
            String.join(" ", generateO()[3], generateO()[4], generateP()[3], generateS()[3]),
            String.join(" ", generateO()[4], generateO()[5], generateP()[4], generateS()[4]),
            String.join(" ", generateO()[5], generateO()[6], generateP()[5], generateS()[5]),
            String.join(" ", generateO()[6], generateO()[7], generateP()[6], generateS()[6]),
            String.join(" ", generateO()[7], generateO()[8], generateP()[7], generateS()[7]),
            String.join(" ", generateO()[8], generateO()[9-1], generateP()[8], generateS()[8])
        };
        
        // Loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
