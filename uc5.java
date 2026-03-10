public class OOPSBannerApp {
    public static void main(String[] args) {

        // Array declaration + initialization in one step
        String[] bannerLines = {
            String.join(" ", "    ***   ", "    ***   ", "*****  ", "    *****  "),
            String.join(" ", "  **   ** ", "   **   ** ", "**   ** ", "  **      "),
            String.join(" ", " **     **", " **     **", "**   ** ", " **       "),
            String.join(" ", " **     **", " **     **", "**   ** ", "  **      "),
            String.join(" ", " **     **", " **     **", "*****   ", "    ****   "),
            String.join(" ", " **     **", " **     **", "**       ", "        ** "),
            String.join(" ", " **     **", " **     **", "**       ", "         **"),
            String.join(" ", "  **   ** ", "   **   ** ", "**       ", "        ** "),
            String.join(" ", "    ***   ", "    ***   ", "**       ", "   *****   ")
        };

        // Loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
