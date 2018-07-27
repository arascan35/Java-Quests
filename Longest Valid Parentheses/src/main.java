import java.util.Stack;

public class main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		String s = ")()())";
		String[] alphabets = s.split("");
		int numOfParentheses=0;
		int maxLenght=0;
		
		for (String string : alphabets) {
			//System.out.println(string);
			if(string.equals("(")) {
				stack.push(string);
			}
			else if(string.equals(")")) {
				if(stack.isEmpty()) {
					
				}
				else {
					stack.pop();
					numOfParentheses++;
				}
				
			}
		}
		
		System.out.println(numOfParentheses);
		maxLenght=numOfParentheses*2;
		System.out.println("The longest valid parentheses substring is "+maxLenght);
		
		
	

	}

}
