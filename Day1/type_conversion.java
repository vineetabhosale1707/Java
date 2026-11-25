//demonstarate widening conversion from int to double and narrowing from double to end

public class type_conversion {
    public static void main(String[] args) {
        //widening
        int a = 4;
        double a1 = a;
        System.out.println(a1);
        //narrowing
        double n = 40.0;
        int n1 = (int)n;
        System.out.println(n1);
    }
    
}
