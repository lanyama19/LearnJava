class NoodleRestaurant {
    String name;

    public NoodleRestaurant(String customerName){
        name = customerName;
    }

    // Method with parent class as parameter
    public void order(Noodle noodle) {
        System.out.println(noodle.getCookPrep());
        System.out.println("Order for " + name + " is ready.");
    }

    public static void main(String[] args) {
        // Using a Child Class as its Parent Class/
        Noodle ramen, pho;
        ramen = new Ramen();
        pho = new Pho();
        // call order() method with child instances as parameter
        NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
        NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");
        customer1.order(pho);
        customer2.order(ramen);

    }
}