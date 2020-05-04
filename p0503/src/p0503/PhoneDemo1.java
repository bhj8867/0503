package p0503;
class Phone1{
	String model;
	int value;
	
	public String getModel() {//괄호안에서 값을 가져와서 model값으로 준다
		return model;
	}
	public void setModel(String model) {
		this.model = model;//this는 class변수와 이름이 같이서(지역변수)
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	void print(){
		System.out.println("*모델명: "+model+" *가격(만원): "+value);
	}
}
public class PhoneDemo1 {
	public static void main(String[] args) {
	
	Phone1 p1=new Phone1();
	p1.setModel("갤럭시20");
	p1.setValue(100);
	p1.print();
	
	Phone1 p2=new Phone1();
	p2.setModel("아이폰10");
	p2.setValue(99);
	p2.print();
	
	String m=p1.getModel();
	System.out.println("p1모델명 : "+m);
	int v=p1.getValue();
	System.out.println("p1가격(만원): "+v);
	}

}
