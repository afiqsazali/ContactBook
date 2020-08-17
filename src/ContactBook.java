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
				person.setphoneNum(phoneNum);

				System.out.print("\nEnter Posmail: ");
				String PosMail = input.nextLine();
				person.setPosMail(PosMail);

				contactList.insert(person);

		}

		public void search() {

				Node current;
				System.out.print("Enter a name for search contact : ");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("No record inside contact list");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				if (name.equals(current.contact.name)) {
						System.out.println("Name "+ current.contact.name +" recorded inside contact list");
						System.out.println("Email "+ current.contact.email +" recorded inside contact list");
						System.out.println("Phone Number "+ current.contact.phoneNum +" recorded inside contact list");
						System.out.println("Post Mail "+ current.contact.posMail +" recorded inside contact list");
				}

				else {
						System.out.println("Name "+ current.contact.name +" not recorded inside contact list");
				}

		}

		public void remove() {

				Node current;
				System.out.println("Enter a name to be removed: ");

				current = contactList.head;

				String name = input.nextLine();

				if (contactList.head == null) {
						System.out.println("No record inside contact list");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				contactList.remove(current.contact);

		}

		public void edit() {

				Node current;
				System.out.println("Enter a name for search contact");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("No record inside contact list");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				if (name.equals(current.contact.name)) {
						System.out.println("Name "+ current.contact.name +" recorded inside contact list");
						System.out.println("Email "+ current.contact.email +" recorded inside contact list");
						System.out.println("Phone Number "+ current.contact.phoneNum +" recorded inside contact list");
						System.out.println("Post Mail "+ current.contact.posMail +" recorded inside contact list");
				}

				else {
						System.out.println("Name "+ current.contact.name +" not recorded inside contact list");
				}

		}

}
