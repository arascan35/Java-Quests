import java.awt.List;
import java.util.LinkedList;
import java.util.Random;

public class main {

	public static void main(String[] args) {
		

		LinkedList<ListNode> ls1 = new LinkedList<ListNode>();
		LinkedList<ListNode> ls2 = new LinkedList<ListNode>();
		LinkedList<ListNode> ls3 = new LinkedList<ListNode>();
		LinkedList<ListNode> ls4 = new LinkedList<ListNode>();
		
		Random rand = new Random();

		
		
		Solution temp = new Solution();
		
		for (int i = 0; i < 9; i++) {
			int  n = rand.nextInt(50) + 1;
			ListNode ln  = new ListNode(n);
			ls1.add(ln);
	
		}
		
		for (int i = 0; i < 9; i++) {
			int  n = rand.nextInt(50) + 1;
			ListNode ln  = new ListNode(n);
			ls2.add(ln);
		}
		
		for (int i = 0; i < 9; i++) {
			int  n = rand.nextInt(50) + 1;
			ListNode ln  = new ListNode(n);
			ls3.add(ln);
	
		}
		
		for (int i = 0; i < 9; i++) {
			int  n = rand.nextInt(50) + 1;
			ListNode ln  = new ListNode(n);
			ls4.add(ln);
		}
		
		//temp.printNode(ls4.get(0));
	
		for (int i = 8; i >= 0; i--) {
			temp.printNode(ls1.get(i));
		}
		System.out.println();
		for (int i = 8; i >= 0; i--) {
			temp.printNode(ls2.get(i));
		}
		System.out.println();
		for (int i = 8; i >= 0; i--) {
			temp.printNode(ls3.get(i));
		}
		System.out.println();
		for (int i = 8; i >= 0; i--) {
			temp.printNode(ls4.get(i));
		}
		System.out.println();
		System.out.println(ls1.get(ls1.size()-1).val);
		System.out.println();
		System.out.println(ls2.get(0).val);
		
		LinkedList<LinkedList<ListNode>> mergerList = new LinkedList<LinkedList<ListNode>>();
		
		mergerList.add(ls1);
		mergerList.add(ls2);
		mergerList.add(ls3);
		mergerList.add(ls4);
		
		temp.sortList(mergerList);

		
	}

}
