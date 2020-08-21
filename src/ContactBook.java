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

				System.out.println("\nContact " + Name + " Added succesfully!");

		}

		public void search() {

				Node current;
				System.out.print("\nPlease enter a name to be searched in the contact book: ");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current.next!=null && !name.equals(current.contact.name)) {
						current=current.next;
				}

				try {
					if (name.equals(current.contact.name)) {
					System.out.println("\nName '"+ current.contact.name +"' is in the contact list");
					System.out.println("Email: "+ current.contact.email);
					System.out.println("Phone Number: "+ current.contact.phoneNum);
					System.out.println("Post Mail: "+ current.contact.posMail);
				}

				else {
					System.out.println("Error, name '"+ newName +"' is not inside contact list");
				}
				} catch( NullPointerException e){
					System.out.println("");
				}
				finally{
					System.out.println(" ");
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

				while(current.next!=null && name.equals(current.contact.name)==false) {
					current=current.next;
				}

				contactList.remove(current.contact);
				System.out.println("Contact '"+ name +"' has been removed successfully. ");
		}

		public void edit() {

				Node current;
				System.out.print("\nPlease enter a name to be edited: ");

				current = contactList.head;

				String newName = input.nextLine();
				String name = newName;

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current.next!=null && !name.equals(current.contact.name)) {
				current=current.next;
				}

				System.out.print("what would you like to edit?\n(1)-Name \n(2)-Email \n(3)-Phone Number \n(4)-Postal Address \nEnter a number: ");
				Scanner opt = new Scanner(System.in);
				int option = opt.nextInt();

				switch (option) {
						case 1:
								System.out.print("Enter new name: ");
								current.contact.setName(input.nextLine());
								break;
						case 2:
								System.out.print("Enter new email: ");
								current.contact.setEmail(input.nextLine());
								break;
						case 3:
								System.out.print("Enter new phone number: ");
								current.contact.setphoneNum(input.nextLine());
								break;
						case 4:
								System.out.print("Enter new Postal Address: ");
								current.contact.setphoneNum(input.nextLine());
								break;
				}

		}

	public void printall(){

			Node current;
			current = contactList.head;
			if (contactList.head == null) {
				System.out.println("Error, no contact found.");
				return;
			}
			while(current!=null) {

				System.out.println(current.contact.name);
				current=current.next;

			}

		}
}
