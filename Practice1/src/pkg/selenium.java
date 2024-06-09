package pkg;

public class selenium {

public selenium() {
	this(10, 20, 30);
	System.out.println("Default constructor");
}
		
public selenium(int a,int b,int c) {
	System.out.println("Three parameterized constructor");
}
		
public selenium(int a) {
	System.out.println("One parameterized constructor");
}			
public selenium(int a,int b) {
	System.out.println("Two parameterized constructor");
}	
public static void main(String[] args) {
	selenium res = new selenium();
	selenium res1 = new selenium(10);
	selenium res2 = new selenium(10,20);
}	



}

