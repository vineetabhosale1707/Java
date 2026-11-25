public class hw_SimpleInterest {
    public static void main(String[] args) {
        int principle = 400;
        int time = 4;
        float rateOfInterest_perYear = 5;

        double SimpleInterest = (principle*rateOfInterest_perYear*time)/100;

        System.out.println("Simple Intrest : " + SimpleInterest);

    }
}
