import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContactBook contactList1 = new ContactBook();
        Scanner scan = new Scanner(System.in);
        System.out.println("CONTACT BOOK");

        while(true){
            System.out.println("Press '1' to add contact");
            System.out.println("Press '2' to search contact");
            System.out.println("Press '3' to edit contact");
            System.out.println("Press '4' to remove contact");
            System.out.println("Press '5' to print all contact");
            System.out.println("Press '6' to exit");
            System.out.print("Enter a number: ");
            int choice = scan.nextInt();

            switch(choice){
                case 1: contactList1.add();
                    break;
                case 2: contactList1.search();
                    break;
                case 3: contactList1.edit();
                    break;
                case 4: contactList1.remove();
                    break;
    //            case 5: contactList1.printall();
     //               break;
                case 6: System.out.println("Thank you and Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Enter valid command");
            }
        }
    }
}
