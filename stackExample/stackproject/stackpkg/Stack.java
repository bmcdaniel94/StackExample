package stackpkg;

public class Stack {
	private int[] myData;
	private int top;
	
	public Stack() {
		top = 0;
		myData = new int[10];
	}
	
	public int sum() {
		int toReturn = 0;
		for (int i = 0; i < top; i++) {
			toReturn += myData[i];
		}
		return toReturn;
	}
	public void push (int i) {
		if (top < myData.length) {
			myData[top] = i;
			top++;
		}
	}
	
	public int pop () {
		if (top > 0) {
			top--;
			return myData[top];
		}
		return -1;
	}
	
	public String toString() {
		String toReturn = "bottom: ";
		for (int i = 0; i < top; i++) {
			toReturn += myData[i] + " ";
		}
		toReturn += " :top";
		return toReturn;
	}
	
}
