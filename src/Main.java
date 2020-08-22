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

            Scanner input = new Scanner(System.in);

            switch(choice){
                case 1:
                    System.out.print("Enter a name: ");
                    String name = input.nextLine();
                    System.out.print("Enter an email: ");
                    String email = input.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNum = input.nextLine();
                    System.out.print("Enter Postal Address: ");
                    String posMail = input.nextLine();
                    contactList1.add(name,email,phoneNum,posMail);
                    break;
                case 2:
                    System.out.print("Enter a name to be searched: ");
                    String srchName = input.nextLine();
                    contactList1.search(srchName);
                    break;
                case 3:
                    System.out.print("Enter a name to be edited: ");
                    String editName = input.nextLine();
                    contactList1.edit(editName);
                    break;
                case 4:
                    System.out.print("Enter a name to be removed: ");
                    String removeName = input.nextLine();
                    contactList1.remove(removeName);
                    break;
                case 5:
                    contactList1.printall();
                    break;
                case 6:
                    System.out.println("Thank you and Goodbye");
                    System.exit(0);
                default:
                    System.out.println("Enter valid command");
            }

        }
    }
}