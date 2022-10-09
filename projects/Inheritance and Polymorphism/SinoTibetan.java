class SinoTibetan extends Language{

    // constructor
    SinoTibetan(String _name, int _numSpeakers){
        super(_name, _numSpeakers, "Asia", "subject-object-verb");
        if(_name.contains("Chinese")){
            this.wordOrder = "subject-verb-object";
        }

    }

}