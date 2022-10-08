// determines whether there is a protein in a strand of DNA.
public class DNA {

    public static void checkProtein(String dna) {
        int lenDNA = dna.length();
        int indexATG = dna.indexOf("ATG");
        int indexTGA = dna.indexOf("TGA");
        // System.out.println(lenDNA);
        // System.out.println(indexTGA);
        if ((indexATG != -1) && (indexTGA == lenDNA - 3)) {
            String protein = dna.substring(indexATG + 3, lenDNA - 3);
            if (protein.length() % 3 == 0) {
                System.out.println(dna + " contains a protein");
            } else {
                System.out.println("No protein");
            }
        } else {
            System.out.println("No protein");
        }
    }

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        checkProtein(dna1);
        checkProtein(dna2);
        checkProtein(dna3);

    }

}