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

		public void search() {

				Node current;
				System.out.print("Enter a name for search contact : ");

				current = contactList.head;

				String newName = input.next();
				String name = newName;

				if (contactList.head == null) {
						System.out.print("No record inside contact list");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				if (name.equals(current.contact.name)) {
						System.out.println("Name " + current.contact.name + " recorded inside contact list");
				}

				else {
						System.out.println("Name " + current.contact.name + " not recorded inside contact list");
				}

		}

//		public void edit(String name) {
//				LinkedList current = new LinkedList();
//				current
//		}
//
//		public void remove(Contact contact) {
//
//		}

}
