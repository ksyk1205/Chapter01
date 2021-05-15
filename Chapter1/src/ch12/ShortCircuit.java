package ch12;

public class ShortCircuit {

	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		//논리 합의 경우 앞의 항이 false이기 때문에 i는 증가 하지않은 것을 확인할 수 있습니다.
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);


	}

}
