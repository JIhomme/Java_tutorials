package org.opentutorials.javatutorials.variables;

public class ConstantDemo {

	public static void main(String[] args) {
		double a = 2.2;
		System.out.println(a);

		/**
		 * 2.2 = 데이터 타입은 duble형이다.
		 */

		float b = 2.2F;
		System.out.println(b);

		long c = 2147483648L;
		System.out.println(c);

		/**
		 * 소수점이 붙어있는 실수의 기본 데이터
		 * 타입은 double이므로 float으로 사용하려면
		 * 해당 값 뒤에 F를 붙인다(대문자 필수)
		 * 
		 * 정수형의 기본 데이터값은 int이므로
		 * long을 사용하려면 뒤에 L을 붙인다.
		 */
	}

}
