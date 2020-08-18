import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContactBook contactList1 = new ContactBook();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Press '1' to add contact");
            System.out.println("Press '2' to search contact");
            System.out.println("Press '3' to edit contact");
            System.out.println("Press '4' to remove contact");
            System.out.println("Press '5' to exit");
            System.out.println("Test jorr");
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
                case 5: System.out.println("adios");
                    System.exit(0);
            }
        }
    }
}
