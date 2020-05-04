package p0503;
class Phone{//class선언(틀)
	int value;
	String model;
	
	Phone(){
		System.out.println("Phone(){//생성자함수:new가 실행될때마다 반복");
		model="아이폰SE(model의 default값)";	
	}
	
	void print(){
		System.out.println(value+"만원 짜리 "+model+"스마트폰");
	}
}

//메인 시작
public class PhoneDemo {//패키지 클래스 name과 동일해야한다
	public static void main(String[] args) {
		Phone p1=new Phone();//p1은 첫번째 객체(붕어빵)
		p1.model="갤럭시s10";
		p1.value=100;
		p1.print();
		
		Phone p2=new Phone();//p2는 두번째 객체
		/*p2.model="iPhone";*/
		p2.value=95;
		p2.print();
		
		

	}

}
