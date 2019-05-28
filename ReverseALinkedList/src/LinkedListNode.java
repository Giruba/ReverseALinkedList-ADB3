
public class LinkedListNode {
	private int data;
	private LinkedListNode next;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeData(int data) {
		this.data = data;
	}
	
	public void SetLinkedListNodeNext(LinkedListNode nextNode) {
		this.next = nextNode;
	}
	
	public int GetLinkedListNodeData() {
		return this.data;
	}
	
	public LinkedListNode GetLinkedListNodeNext() {
		return this.next;
	}
}
