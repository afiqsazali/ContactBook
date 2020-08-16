import java.util.Scanner;

public class ContactInfo {

		String name;
		String number;
		String address;

		public ContactInfo() {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Name : ");
				String name = scanner.nextLine();
				System.out.println("Phone number : ");
				String number = scanner.nextLine();
				System.out.println("Address : ");
				String address = scanner.nextLine();

				this.name = name;
				this.number = number;
				this.address = address;
		}

public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public String getNumber() {
				return number;
		}

		public void setNumber(String number) {
				this.number = number;
		}

		public String getAddress() {
				return address;
		}

		public void setAddress(String address) {
				this.address = address;
		}

}
