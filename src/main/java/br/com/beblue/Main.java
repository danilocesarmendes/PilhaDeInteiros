package br.com.beblue;

public class Main {

	public static void main(String[] args) {
		// creating stack
		StackBeblue.push(100);
		StackBeblue.push(80);
		StackBeblue.push(2090);
		StackBeblue.push(10);
		StackBeblue.push(-10);
		StackBeblue.push(555);
		StackBeblue.push(444);
		StackBeblue.push(2342);
		StackBeblue.push(8080);

		StackBeblue.showStack();

		StackBeblue.pop();
		StackBeblue.pop();

		System.out.println("\n" + StackBeblue.removeObject(-1));

		System.out.println("\n" + StackBeblue.removeObject(-10));

		StackBeblue.showStack();

		System.out.println("\nMin: " + StackBeblue.min());

	}

}
