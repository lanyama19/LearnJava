public class Droid {
    int batteryLevel;
    String name;
    // constructor
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }
    //
    public String toString() {
        return "Hello, I’m the droid: " + name;
    }
    //
    public void performTask(String Task) {
        System.out.println(name + " is performing task: " + Task);
        batteryLevel -= 10;
    }

    public void energyReport(){
        System.out.println(batteryLevel);
    }

    public void energyTransfer(Droid a,Droid b){
        int exchange=a.batteryLevel;
        a.batteryLevel=b.batteryLevel;
        b.batteryLevel = exchange;
    }

    public static void main(String[] args){
        Droid Codey = new Droid("Codey");
        System.out.println(Codey);
        Codey.performTask("Trolling");
        Codey.energyReport();
    }
}

