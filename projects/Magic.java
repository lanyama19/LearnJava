public class Magic {
    public static void main(String[] args) {
        // Original number
        int myNumber = 42;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo/myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive/6;
        System.out.println(stepSix);
    }
}