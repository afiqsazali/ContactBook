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

		void remove(Contact contact1) {

				// If linked list is empty
				if (head == null)
					return;

				// Store head node
				Node temp = head;

				// If head needs to be removed
				if (contact1.name.equals(head.contact.name)==true)
				{
					head = temp.next;   // Change head
					return;
				}

				// Find previous node of the node to be deleted
				while ( temp!=null && temp.next.contact.name.equals(contact1.name)==false)
					temp = temp.next;

				// If position is more than number of nodes
				if (temp == null || temp.next == null)
					return;

				// Node temp->next is the node to be deleted
				// Store pointer to the next of node to be deleted
				Node next = temp.next.next;

				temp.next = next;  // Unlink the deleted node from list

		}

}
