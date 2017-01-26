package stacksQueues;

import java.util.EmptyStackException;

public class MyStack<T> {
	private class MyStackNode<T> {
		T data;
		MyStackNode<T> next;
		
		public MyStackNode(T data){
			this.data = data;
		}
	}
	
	private MyStackNode<T> top;
	
	public T pop() {
		if(top==null){
			throw new EmptyStackException();
		}
		T item = top.data;
		top = top.next;
		return item;
	}
	
	public T peek() {
		if(top==null){
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public void push(T item){
		MyStackNode<T> t = new MyStackNode<T>(item);
		t.next = top;
		top = t;
	}
	
	public boolean isEmpty() {
		if(top == null){
			return true;
		}
		else return false;
	}
}
