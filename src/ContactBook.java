import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class ContactBook {

		LinkedList contactList = new LinkedList();

		Scanner input = new Scanner(System.in);

		public void add(String Name, String email, String phoneNum, String PosMail) {

				Contact person = new Contact();
				person.setName(Name);

				person.setEmail(email);

				person.setphoneNum(phoneNum);

				person.setPosMail(PosMail);

				contactList.insert(person);

				System.out.println("\nContact " + Name + " Added succesfully!\n");

		}

		public void search(String newName) {

				Node current;

				current = contactList.head;

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

		public void remove(String name) {

				Node current;

				current = contactList.head;

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

		public void edit(String newName) {

				Node current;

				current = contactList.head;

				String name = newName;

				if (contactList.head == null) {
						System.out.println("Error, no contact found.");
						return;
				}

				while(current.next!=null && !name.equals(current.contact.name)) {
				current=current.next;
				}

				System.out.println("\nName '"+ current.contact.name +"' is in the contact list");
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

			System.out.format("%-20s%-30s%-15s%-40s", "Name", "Email", "Phone Number", "Postal Address");
			System.out.println("\n");
			while(current!=null) {

//				System.out.println(current.contact.name);
					System.out.format("%-15s%-30s%-15s%-40s", current.contact.name, current.contact.email, current.contact.phoneNum, current.contact.posMail);
					System.out.println("\n");
					current=current.next;

			}

		}
}
