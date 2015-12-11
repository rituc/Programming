import java.util.*;
import java.io.*;

class Stack{
	int top;
	int capacity;
	int a[];

	Stack(int capacity){
		this.capacity = capacity;
		a = new int[capacity];
	}

	boolean isEmpty(){
		if(top == 0)
			return true;
		return false;
	}

	void push(int data){
		a[top] = data;
		top++;
	}

	/*int pop() throws RunTimeException{
		if (isEmpty())
			throw new RunTimeException("could not pop from empty stack");
		else{
			top--;
			return a[top+1];
		}
	}

	public static void main(String args[]) throws RunTimeException{
		Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
		Stack stack = new Stack(N);
		for(int i = 0; i<N; i++){
			stack.push(in.nextInt());
		}
	}*/
	int pop(){
		if (isEmpty())
			return -1;
		else{
			top--;
			return a[top];
		}
	}

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int N;
		N = in.nextInt();
		Stack stack = new Stack(N);
		for(int i = 0; i<N; i++){
			stack.push(in.nextInt());
		}
		System.out.print(stack.pop());
	}
}