package s21200;

import java.util.*;
import java.io.*;

public class S21200_Gugudan_v2 {
	public static void main(String[] args) {
		int x,y;
		Random r = new Random();
		
		// 랩퍼 크래스를 이용하여 int형으로 형변환
		x = Math.abs(r.nextInt() % 9) + 1;
		y = Math.abs(r.nextInt() % 9) + 1;
			
		// 커맨드 라인으로부터 받는 외부 변수가 있다면
		// main으로부터 받는 외부 입력된 자료의 수(길이) args.length
		if(args.length > 0) {
			// 외부 입력된 값을 랩퍼 클래스를 통하여 String 값을 integer형으로 변경
			x = Integer.parseInt(args[0]);
		}
		
		int num = x*y;
		
		// 커맨드 라인으로부터 받는 외부 변수가 있다면
		// main으로부터 받는 외부 입력된 자료의 수(길이) args.length
		System.out.println();
		System.out.println("* 구구단 " + x + "단에 대한 문제입니다.");
		System.out.println();
		
		System.out.print(x + " * " + y + " = ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a == num) {
			System.out.println("맞았습니다!");
		}else {
			System.out.println("틀렸습니다! 정답은 " + num + "입니다." );
		}
	}

}
