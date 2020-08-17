public class LinkedList {

		Node head;
		Node tail;

		public LinkedList() {
				this.head = null;
				this.tail = null;
		}

		void insert(Contact contact) {

				Node current = new Node(contact);

				if (this.tail == null) {
						this.head = this.tail = current;
						return;
				}

				this.tail.next = current;
				this.tail = current;

		}

		void remove(Contact contact) {

				Node temp = head, prev = null;

				if (temp != null && temp.contact == contact) {
						head = temp.next;
						return;
				}

				while (temp != null) {
						prev = temp;
						temp = temp.next;
				}

				if (temp == null) return;

				prev.next = temp.next;

		}

}
