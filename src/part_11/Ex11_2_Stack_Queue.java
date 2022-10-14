package part_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2_Stack_Queue {
    //stack은 마지막에 저장한 데이터를 먼저 꺼내는 LIFO구조 (바닥 막힘)
    //만약 012 로 넣으면 꺼낼 땐 210, 순서 반대, 순차적 ArrayList
    //stack은 push, pop
    //ex) 수식계산, 괄호계산, 워드 undo/redo, 웹브라우저 뒤로 앞으로

    //큐는 처음에 저장한 데이터를 먼저 꺼내는 FIFO구조 (바닥 뚷림)
    //만약 012 로 넣으면 꺼낼 때도 012, 순서 그대로,
    //첫번째 데이터 꺼낸다면? 삭제 후 데이터 복사가 발생하므로  LinkedList가 적합하다.
    //queue는 add, remove
    //ex) 최근 사용 문서, 인쇄작업 대기 목록, 버퍼

    public static void main(String[] args) {


        Stack stack = new Stack();
        Queue queue = new LinkedList();

        stack.push("0");
        stack.push("1");
        stack.push("2");
        System.out.println("===== Stack ====");
        while (!stack.empty()){
            Object pop = stack.pop();
            System.out.println( pop);

        }

        queue.add("0");
        queue.add("1");
        queue.add("2");
        System.out.println("===== Queue ====");
        while (!queue.isEmpty()){
            System.out.println(queue.poll());

        }


    }




}
