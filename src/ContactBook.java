import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ContactBook {

		LinkedList contactList = new LinkedList();

		Scanner input = new Scanner(System.in);

		public void add() {

				Contact person = new Contact();
				System.out.print("Please enter a name to be added: ");
				String Name = input.nextLine();
				person.setName(Name);

				System.out.print("\nPlease enter an email to be added: ");
				String email = input.nextLine();
				person.setEmail(email);

				System.out.print("\nPlease enter a phone number to be added: ");
				String phoneNum = input.nextLine();
				person.setphoneNum(phoneNum);

				System.out.print("\nPlease enter a post code to be added: ");
				String PosMail = input.nextLine();
				person.setPosMail(PosMail);

				contactList.insert(person);

		}

		public void search() {

				Node current;
				System.out.print("Please enter a name to be searched in the contact book: ");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				try {
				if (name.equals(current.contact.name)) {
					System.out.println("Name '"+ current.contact.name +"' is inside contact list");
					System.out.println("Email '"+ current.contact.email +"' is inside contact list");
					System.out.println("Phone Number '"+ current.contact.phoneNum +"' is inside contact list");
					System.out.println("Post Mail '"+ current.contact.posMail +"' is inside contact list");
				}

				else {
					System.out.println("Error, name '"+ current.contact.name +"' is not inside contact list");
				}
				} catch( NullPointerException e){
					System.out.println(e);
				}
				finally{
					System.out.println("There is no such name in contact book");
				}

		}

		public void remove() {

				Node current;
				System.out.println("Please enter a name to be removed: ");

				current = contactList.head;

				String name = input.nextLine();

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				contactList.remove(current.contact);
		}

		public void edit() {

				Node current;
				System.out.println("Please enter a name to be edited.");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				if (name.equals(current.contact.name)) {
						System.out.println("Name '"+ current.contact.name +"' is inside contact list");
						System.out.println("Email '"+ current.contact.email +"' is inside contact list");
						System.out.println("Phone Number '"+ current.contact.phoneNum +"' is inside contact list");
						System.out.println("Post Mail '"+ current.contact.posMail +"' is inside contact list");
				}

				else {
						System.out.println("Error, name '"+ current.contact.name +"' is not inside contact list");
				}

		}

}
