import java.util.Stack;

class Main { // class Main {
  public static void main(String[] args) {
    /*
     * Switch back and forth between the below 2 lines (by uncommenting
one of them only) to test and compare your MyStack class with the original
	  Stack in java. */
	    Stack MyStack = new Stack();
	    // MyStack myStack = new MyStack();
	MyStack.add(1);
	
	MyStack.add(2);
	
	MyStack.add(3);
	
	MyStack.add(4); 
	
	MyStack.add(5);
	
	
	printStack(MyStack);
	
	int topOfStack = (int) MyStack.peek(); 
	
	System.out.println("Top = " + topOfStack); 
	
	System.out.println(MyStack);
	
	topOfStack = (int) MyStack.pop();
	
	System.out.println("Top = " + topOfStack);
	
	System.out.println(MyStack);
	MyStack.push(5); 
	System.out.println(MyStack);
	}

private static void printStack(Stack myStack) {
	// TODO Auto-generated method stub
	
} }