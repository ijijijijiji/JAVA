package S21200_java00;

public class S21200_00v2 {
	public static void main(String[] args) {
		
		int sum = 0;
		int even = 0;
		int odd = 0;
		int cnt;
		
		for(cnt=1; cnt<11; cnt++) {
			sum += cnt;
			if(cnt%2==0) {
				even += cnt;
			}else {
				odd += cnt;
			}
			System.out.println("cnt: " + cnt + " sum: " + sum + " even: "+ even + " odd: " + odd);
		}
	}

}
