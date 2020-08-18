import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ContactBook contactList1 = new ContactBook();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("1 = add");
            System.out.println("2= search");
            System.out.println("3= edit");
            System.out.println("4= remove");
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
