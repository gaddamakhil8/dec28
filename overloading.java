package dec28;
class AddDemo{
	void add(int a,int b){
		System.out.println("a+b---->"+(a+b));
	}
	void add(int a,int b,int c) {
		System.out.println("a+b+c---->"+(a+b+c));
	}
	void add(String firstname,String lastname) {
		System.out.println("full name--->"+firstname+" "+lastname);
	}
}
public class overloading {
	public static void main(String[] args) {
		AddDemo add=new AddDemo();
		add.add(100, 200);
		add.add("asdf", "qwer");
		add.add(100,200,300);	}
	public static void main(String fname,String lname) {
}
	public static void main(int a,int b) {
}}
