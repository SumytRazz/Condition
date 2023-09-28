import java.util.Scanner;
public class True_Neg {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter num:");
        int num= sc.nextInt();

        if (num>0){
            System.out.println("True");
        }
        else if (num==0) {
            System.out.println('0');
        } else{
            System.out.println("Negative");
        }
    }
}
