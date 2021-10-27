package Java08;

import java.util.Scanner;

class Ctest {
	 void test(int x){
		
		if (x==0)
			System.out.println("计0");
		else if (x%2==1)
			System.out.println("计计");
		else if (x%2==0)
			System.out.println("计案计");
		
	}

	public static void main(String[] args) {
		Ctest test = new Ctest();
		Scanner sc = new Scanner(System.in);
		System.out.print("叫块俱计 x");
		int x = sc.nextInt();
		test.test(x);
	}

}
