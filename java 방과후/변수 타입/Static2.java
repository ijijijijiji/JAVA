package S21200_java00;

class Student9 {
	static int count = 0; 
	int count9 = 0;
	
	Student9(String name) {
		count ++;
		count9++;
	}
}

public class Static2 {
	public static void main(String[] args) {
		
		Student9 n1 = new Student9("John");
		System.out.println("1static count: " + n1.count9 + " count9: " + n1.count9);
		
		Student9 n2 = new Student9("Nim");
		System.out.println("2static count: " + n2.count9 + " count9: " + n2.count9);
		
		Student9 n3 = new Student9("Sun");
		System.out.println("3static count: " + n3.count9 + " count9: " + n3.count9);
		
		// 클래스(static) 변수와 인스턴스 변수의 차이점
		System.out.println("===========================");
		n1.count9 += n1.count;
		n1.count9 += n1.count9;
		
		System.out.println("4static count: " + n1.count + " count9: " + n1.count9);
		System.out.println("5static count: " + n2.count + " count9: " + n2.count9);
		System.out.println("6static count: " + n3.count + " count9: " + n3.count9);
	}
}
