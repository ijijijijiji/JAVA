package s21200;

import java.util.*;
import java.io.*;

public class S212_Gugudan_v1 {
	public static void main(String[] args) {
		
		int x,y;
		Random r = new Random();
		
		// System.out.print("args.length: " + args.length);
		// 랩퍼 크래스를 이용하여 int형으로 형변환
		x = Math.abs(r.nextInt() % 9) + 1;
		y = Math.abs(r.nextInt() % 9) + 1;
		int num = x*y;
		
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
