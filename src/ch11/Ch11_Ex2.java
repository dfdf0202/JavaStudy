package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ch11_Ex2 {

	public static void main(String[] args) {
		
		Stack st = new Stack();
		Queue q = new LinkedList(); // Queue 인터페이스의 구현체인 LinkedList를 사용 
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
		
		// Stack 은 LIFO 구조이기 때문에 제일 마지막에 넣은게 제일 먼저 출력 됨 
		// Queue 는 FIFO 구조이기 때문에 가장 먼저 넣은게 제일 먼저 출력 됨 
		
	}

}
