package p0503;
class Student1{//class의 name과 같아야 한다.
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
}//이것을 잘라내기 하여 메인없이 class생성하여 붙여넣기해도 된다.같은 패키지 X 경로설정 &public을 붙여줘야함

