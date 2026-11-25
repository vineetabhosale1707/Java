//store mrks for 5 subjects and calculate total and avg


public class student_marks {
    public static void main(String[] args) {
        int subject1 = 80;
        int subject2 = 78;
        int subject3 = 90;
        int subject4 = 70;
        int subject5 = 60;
        int total = subject1+subject2+subject3+subject4+subject5;
        double average = (total)/5;

        System.out.println("Total : " +total);
        System.out.println("Average : " + average);



    }
    
}
