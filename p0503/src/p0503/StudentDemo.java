package p0503;//속성(학번,이름,주소)인 객체 2개 생성
/*class Student{
	String name,address;
	int hakbun;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	void print(){
		System.out.printf("*학번 : %d\n",hakbun);
		System.out.printf("*이름 : %s\n",name);
		System.out.printf("*주소 : %s\n",address);
	}
}이것을 잘라내기 하여 메인없이 class생성하여 붙여넣기해도 된다.같은 패키지 X 경로설정 &public을 붙여줘야함*/
public class StudentDemo {
	public static void main(String[] args) {
		
		Student1 s1=new Student1();//새로 변경된 class이름으로 변경 시켜야 한다.
		s1.setHakbun(11);
		s1.setName("홍길동");
		s1.setAddress("부산시 동래구");
		s1.print();
		
		System.out.print("\n");
		
		Student1 s2=new Student1();
		s2.setHakbun(22);
		s2.setName("백하진");
		s2.setAddress("부산시 연제구");
		s2.print();
		
		System.out.print("\n");
		
		String n=s2.getName();
		System.out.println("학생2이름 : "+n);
		String a=s2.getAddress();
		System.out.print("학생2주소 : "+a);
		
	}

}
