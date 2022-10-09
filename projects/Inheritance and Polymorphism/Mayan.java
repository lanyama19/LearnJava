class Mayan extends Language{
    // constructor
    Mayan(String _name, int _numSpeakers){
        super(_name, _numSpeakers, "Central America", "verb-object-subject");
    }

    // override the getInfo() method
    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }

}