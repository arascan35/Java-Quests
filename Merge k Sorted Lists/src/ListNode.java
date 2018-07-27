import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }
 
 
class Solution {
	
    public Solution() {
		super();
	
	}
    
    public void printNode(ListNode ln) {
    	
    	System.out.print(ln.val+"<-");

    	
    }
    
    public void sortList(LinkedList linkedList) {
    	ArrayList<Integer> arrList = new ArrayList<Integer>();
    	
    	LinkedList<ListNode> tempList = new LinkedList<ListNode>();
    	
    	int tempCount=linkedList.size();
    	
    	for (int i = 0; i < tempCount; i++) {
    		tempList=(LinkedList<ListNode>) linkedList.get(i);
    		
			for (int j = 0; j < tempList.size(); j++) {
				arrList.add(tempList.get(j).val);
			}
		}
    	
    	Collections.sort(arrList);
    	System.out.println(arrList);
    	
    	
    }

	public ListNode mergeKLists(ListNode[] lists) {
		
		return null;
       
    }
}