package Programs;

public class SumAndAvg {
	public static void main(String[] args) {
		int n=100;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
	   }
		float avg=sum/n;
		System.out.println(sum);
		
		System.out.println(avg);
	}

}
