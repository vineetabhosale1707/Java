public class simple_bill {
    public static void main(String[] args) {
        int itemPrice = 400;
        int quantity = 6;

        int subTotal = itemPrice*quantity;
        double taxAmount = subTotal*(18/100);
        double final_bill = (subTotal + taxAmount);

        System.out.println("Total bill : " + final_bill);


    }
    
}
