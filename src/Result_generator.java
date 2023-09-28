import java.util.Scanner;

public class Result_generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of Physics: ");
        double physics = scanner.nextDouble();
        System.out.println("Enter marks of Maths: ");
        double maths = scanner.nextDouble();
        System.out.println("Enter marks of Chem: ");
        double chem = scanner.nextDouble();

        double percentage = ((physics + maths + chem) / 300) * 100;

        if(percentage > 90){
            System.out.println("A+");
        } else if (percentage > 80) {
            System.out.println("A");
        } else if (percentage > 70) {
            System.out.println("B+");
        } else if (percentage > 60) {
            System.out.println("B");
        }else if (percentage > 50){
            System.out.println("C+");
        }
        else if (percentage < 50) {
                System.out.println("Below C+");
        }else{
            System.out.println("Failed");
        }
    }
}