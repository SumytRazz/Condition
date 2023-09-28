import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("How many items?");
        int items= sc.nextInt();

        int MOMO=250;
        int Cake=200;
        int Ice_Cream=100;
        int Pizza=500;
        int total=0;
        int order, total_items=items;

        while (items>0){
            System.out.println("What would you like to order?");
            System.out.println("1. MOMO");
            System.out.println("2. Cake");
            System.out.println("3. Ice Cream");
            System.out.println("4. Pizza");

            System.out.println("item number:");
            int item =sc.nextInt();


            if (item==1){
                order=MOMO;
            }
            else if (item==2){
                order=Cake;
            }
            else if (item==3){
                order=Ice_Cream;
            }
            else if (item==4){
                order=Pizza;
            }
            else{
                System.out.println("Item Not Found !");
                break;
            }
            System.out.println("Enter Quantity: ");
            int quantity= sc.nextInt();
            total=total+(order*quantity);
            items=items-1;
        }

        System.out.println("Your Bill");
        System.out.println("No of Items Ordered:"+total_items);
        System.out.println("Total Price:"+total);

    }


    }

