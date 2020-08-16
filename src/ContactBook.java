import java.util.Scanner;

public class ContactBook {

		LinkedList contactList = new LinkedList();

		Scanner input = new Scanner(System.in);

		public void add() {
			Contact person = new Contact();
	        System.out.print("Enter name: ");
	        String Name = input.nextLine();
	        person.setName(Name);

	        System.out.print("\nEnter email: ");
	        String email = input.nextLine();
	        person.setEmail(email);

	        System.out.print("\nEnter phone number: ");
	        String phoneNum = input.nextLine();
	        person.setphoneNum(email);

	        System.out.print("\nEnter Posmail: ");
	        String PosMail = input.nextLine();
	        person.setPosMail(PosMail);

	        contactList.insert(person);
		}

//		public boolean search(String name) {
//
//		}
//
//		public void edit(String name) {
//
//		}
//
//		public void remove(Contact contact) {
//
//		}

}
