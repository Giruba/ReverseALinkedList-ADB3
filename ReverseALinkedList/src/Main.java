import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Reverse a linked list");
		System.out.println("---------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of nodes in the Linked list");
			int length = scanner.nextInt();
			LinkedList linkedList = new LinkedList(null);
			for(int index = 0; index < length; index++) {
				System.out.println("Enter the element");
				linkedList.SetLinkedListHead(linkedList.InsertAtEnd(linkedList.GetLinkedListHead(), scanner.nextInt()));
			}
			System.out.println("Printing the list");
			linkedList.PrintLinkedList();
			System.out.println();
			linkedList.SetLinkedListHead(linkedList.ReverseLinkedList());
			System.out.println("Printing the reversed list");
			linkedList.PrintLinkedList();
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
