import java.util.*;

public class Hw1_HashMap{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("�п�J1~12? ");
        int num = input.nextInt();
        while (num < 1 || num > 12){
            System.out.printf("�d����~�I%n�п�J1~12? ");
            num = input.nextInt();
        }
        
        var month = new HashMap<>();
        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");
        
        System.out.printf("��%d�몺�^���r�� %s", num, month.get(num));
    }
}