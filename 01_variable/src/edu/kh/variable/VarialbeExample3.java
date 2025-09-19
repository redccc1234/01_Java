package edu.kh.variable;

public class VarialbeExample3 {

	public static void main(String[] args) {
		
		//형변환 (Casting) : 값의 자료형을 변환하는 것(단, boolean 제외)
		/*형변환은 왜 필요한가?
		 * - 컴퓨터는 기본적으로 같은 자료형끼리만 연산 가능
		 * 다른 자료형과 연산 시 오류 발생
		 * --> 이런 상황을 해결하기 위해서 필요한 기술이 형변화
		 * 
		 * 자동 형변환/ 강제 형변환 존재
		 * 
		 * 
		 * */
		
		int num1 = 10;
		double num2 = 3.5;
		
		System.out.println("자동 형변환 결과 : "  +  (num1 + num2) );
		// 13.5 ( 원래 에러가 발생해야 하지만 " 자동형변환 " 덕분에 발생 X)
		
		// int -> long 형변환
		int i2 = 2_100_000_000; // 21억
		long l2 = 10_000_000_000l; // 100억
		
		long result = i2 + l2 ;
		//            int -> long
		// long = long + long
		
		System.out.println(result);
		
		// char -> int 형변환
		  
		char ch3 = 'V';
		System.out.println(ch3);
		int i3 = ch3;
		System.out.println(i3);
		
		// '각' 이라는 글자는 숫자 몇일까
		char ch1 = '각';
		System.out.println(ch1);
		int i1 = ch1;
		System.out.println(i1);
		
	
		
	}

}
