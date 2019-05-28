
public class LinkedList {
	private LinkedListNode head;
	
	public LinkedList(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public void SetLinkedListHead(LinkedListNode linkedListNode) {
		this.head = linkedListNode;
	}
	
	public LinkedListNode GetLinkedListHead() {
		return this.head;
	}
	
	public LinkedListNode InsertAtEnd(LinkedListNode linkedListNode, int data) {
		
		if(linkedListNode == null) {
			linkedListNode = new LinkedListNode(data);
			return linkedListNode;
		}
		LinkedListNode temp = linkedListNode;
		while(temp != null && temp.GetLinkedListNodeNext() != null) {
			temp = temp.GetLinkedListNodeNext();
		}
		temp.SetLinkedListNodeNext(new LinkedListNode(data));
		
		return linkedListNode;
	}
	
	public void PrintLinkedList() {
		LinkedListNode linkedListNode = this.head; 
		if(this.head == null) {
			System.out.println("Linked list is empty!");
			return;
		}
		
		while(linkedListNode != null) {
			System.out.print(linkedListNode.GetLinkedListNodeData()+" ");
			linkedListNode = linkedListNode.GetLinkedListNodeNext();
		}
	}
	
	public LinkedListNode ReverseLinkedList() {
		
		LinkedListNode currentNode = this.head;
		LinkedListNode previousNode = null;
		LinkedListNode nextNode = null;
		
		while(currentNode != null) {
			nextNode = currentNode.GetLinkedListNodeNext();
			currentNode.SetLinkedListNodeNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;
	}
}
