package co.edu.unbosque.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
	private Scanner sc;

	public Console() {
		sc = new Scanner(System.in);
	}

	public int readInt() {
		return sc.nextInt();
	}
	
	public String readWholeLine() {
		return sc.nextLine();
	}
	
	public String readWholeChain() {
		return sc.next();
	}
	
	public void burnLine() {
		sc.nextLine();
	}
	
	public void printWithJump(Object object) {
		System.out.println(object);
	}
	
	public void printWithoutJump(Object object) {
		System.out.println(object);
	}
	

}
