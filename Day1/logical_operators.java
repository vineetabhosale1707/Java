//create boolean variables for hasregistered and haspaidfees to dsiplay if student can attend exam using &&

public class logical_operators {
    public static void main(String[] args) {
        boolean hasRegistered = true;
        boolean haspaidFees = false;

        System.out.println("Student can attend class? " + (hasRegistered && haspaidFees));
    }
}
