public class FindGeneSampleAndTest {
    public static String findGeneSampleAndTest(String dna) {

        if (dna.contains("ATG") && dna.contains("TAA")) {
            System.out.println("Gene found");
            int startIndex = dna.indexOf("ATG");
            int endIndex = dna.indexOf("TAA");
            int endOfGene = endIndex + 3;
            String result = dna.substring(startIndex,endOfGene);
            System.out.println(result);
        } else {
            System.out.println("Gene not found");
        }
        return "";
    }

}