import java.util.Scanner;
public class EvenOdd_Switch {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        switch(n % 2) {
            case 0: System.out.println("Even");
            break;
            case 1: System.out.println("Odd"); 
            break;
        }
    }
}

