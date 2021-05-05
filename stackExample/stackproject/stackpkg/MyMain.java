package stackpkg;

public class MyMain {

	public static void main(String[] args) {
		Stack myStack = new Stack();
		System.out.println(myStack);
		
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		System.out.println(myStack);
		System.out.println("popped: " +myStack.pop());
		System.out.println(myStack);
		
		for (int i = 0; i < 8; i++) {
			myStack.push(i);
		}
		
		System.out.println(myStack.sum());
		
		System.out.println(myStack);
		for (int i = 0; i < 10; i++) {
			System.out.println("popped: " +myStack.pop());
		}
	}

}
