package week1.day1;

public class Fibaonacci {

	public static void main(String[] args) {
	int fi = 0, s=1, range = 8, sum ;
	
	System.out.println(fi);
	System.out.println(s);
	
	
	for(int i=1; i<=range; i++) {
		sum = fi+s;
		fi =s;
		s = sum;
		System.out.println(sum);
	}
	

	}

}
