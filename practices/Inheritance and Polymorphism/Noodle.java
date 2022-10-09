public class Noodle {

    private double lengthInCentimeters;
    private double widthInCentimeters;
    protected String shape;
    protected String ingredients;
    protected String texture = "brittle";

    // constructor
    Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

        this.lengthInCentimeters = lenInCent;
        this.widthInCentimeters = wthInCent;
        this.shape = shp;
        this.ingredients = ingr;

    }

    public void cook() {
        this.texture = "cooked";
    }

    // disallow child classes from changing with final keyword
    public final boolean isTasty() {
        return true;
    }

    public String getCookPrep() {
        return "Boil noodle for 7 minutes and add sauce.";
    }

    public static void main(String[] args) {

        // Inherit cook() method
        Spaghetti spaghettiPomodoro = new Spaghetti();
        System.out.println(spaghettiPomodoro.texture);

        // Inherit the constructor
        Pho phoChay = new Pho();
        System.out.println(phoChay.shape);

        // protected and final keyword
        Ramen yasaiRamen = new Ramen();
        System.out.println(yasaiRamen.ingredients);
        System.out.println(yasaiRamen.isTasty()); // return true

        // method overriding
        Spaetzle kaesespaetzle = new Spaetzle();
        kaesespaetzle.cook();

        // Child Classes in Arrays and ArrayLists
        Noodle spaghetti, ramen, pho;
        spaghetti = new Spaghetti();
        ramen = new Ramen();
        pho = new Pho();
        Noodle[] allTheNoodles = {spaghetti, ramen, pho}; // put objects of child classes into an array
        for (Noodle noodle: allTheNoodles){
            System.out.println(noodle.getCookPrep());
        }

    }

}