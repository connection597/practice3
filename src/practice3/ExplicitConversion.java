package practice3;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9F;
		
		int iNum3 =(int)dNum1 +(int)fNum2; //두 실수가 가가가 형 변환되어서 더해짐
		int iNum4 = (int)(dNum1+fNum2); // 두실수 합을 계산되고 형변화이 됨
		
		System.out.println(iNum3);
		System.out.println(iNum4);
		

	}

}
