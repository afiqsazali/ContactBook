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

		void remove() {

	        if (this.head == null) {
	            System.out.println("The list is empty");
	            return; }

	        Node current = this.head;
	        this.head = this.head.next;

	        if (this.head == null)
	            this.tail = null;
		}

}
