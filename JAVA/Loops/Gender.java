import java.util.Scanner;
public class Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gender;
        System.out.print("Enter M or F: ");
        gender = sc.nextLine();
        gender = gender.toLowerCase();
        switch(gender) {
            case "m":
                System.out.println("Male");
                break;
            case "f":
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

