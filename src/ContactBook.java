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

		System.out.println("Enter a name for search contact");
		String newName = input.next();
		if (contactList.insert(person) == 0) {
			System.out.println("No record inside contact list");
			return;
		}
		else if (String name == newName()){
			System.out.println(contactList.insert(person));
			return;
		}
		else if (String name != newName){
			System.out.println("No name recorded in contact");
			return;
		}
	}
}

//
//		public void edit(String name) {
//
//		}
//
//		public void remove(Contact contact) {
//
//		}


