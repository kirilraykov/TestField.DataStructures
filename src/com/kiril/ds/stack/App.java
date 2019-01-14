package com.kiril.ds.stack;


public class App {

	public static void main(String[] args) {
		Stack theStack = new Stack(10);
		theStack.push('a');
		theStack.push('b');
		theStack.push('c');
		theStack.push('d');
		
		while(!theStack.isEmpty()){
			char value = theStack.pop();
			System.out.println(value);
		}
		
		System.out.println(reverseString("hello"));
	}
	
	//reverse string using stack
	public static String reverseString(String str){
		Stack stack = new Stack(str.length());
		
		for(int i = 0; i < str.length(); i++){
			stack.push(str.charAt(i));
		}
		
		String reversed = "";
		while(!stack.isEmpty()){
			char ch = stack.pop();
			reversed += ch;
		}
		
		return reversed;
		
	}

}
