import java.util.ArrayList;
import java.util.Collections;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
 
class Solution {
	

	public Solution() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


		ListNode solution= new ListNode(0);
		int temp=0;
		int remainder=0;
		ArrayList<Integer> solutionNums = new ArrayList<Integer>();
		
		
		while (l1 != null || l2 != null) {
			temp =  l1.val+l2.val;
			if(temp >= 10) {
				remainder=temp%10;
				l1.next.val=l1.next.val+1;
			}
			solutionNums.add(temp);
			l1=l1.next;
			l2=l2.next;
		}
		
    	Collections.reverse(solutionNums);
    	
		for (int i = 0; i < solutionNums.size(); i++) {
			solution.val=(int) solutionNums.get(i);
			solution=solution.next;
			System.out.println("+");
		}

		
		//System.out.println(solution.next.val);
		//System.out.println(solution.next.next.val);
		return solution;
        
    }
}

