package JavaAssignment.javaassignment.com.task;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println(getFabonacciSeries(5));
	}
	
	public static List<Integer> getFabonacciSeries(int number) {
		
		List<Integer> series = new ArrayList<Integer>();
		int firstNum = 0;
		int secondNum = 1;
		
		series.add(firstNum);
		series.add(secondNum);
		for(int i = 0; i < number ; i++) {
			int next = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = next;
			series.add(next);
		}
		
		return series;
	}

}
