public class Language{

    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String _name, int _numSpeakers, String _regionsSpoken, String _wordOrder){
        this.name = _name;
        this.numSpeakers = _numSpeakers;
        this.regionsSpoken = _regionsSpoken;
        this.wordOrder = _wordOrder;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }

    public static void main(String[] args){
        // Initiate and call method
        Language Spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
        Spanish.getInfo();

        Mayan KiChe = new Mayan("Ki'che'", 2330000);
        KiChe.getInfo();

        SinoTibetan Mandarin = new SinoTibetan("Mandarin Chinese", 1400000000);
        Mandarin.getInfo();
        SinoTibetan Burmese = new SinoTibetan("Burmese", 33000000);
        Burmese.getInfo();
    }

}