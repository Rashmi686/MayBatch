package pkg;

public class Student {
	public int sum(int a,int b) {
	int c;
	c=a+b;
    System.out.println("Sumresult :"+c);
	return c;
	}
	public int sum1(int Sumresult,int d) {
		int e;
		e=Sumresult+d;
		System.out.println("Sumresult1 :"+e);
		return e;
		}
	public int sub(int Sumresult1 ,int f) {
		int g;
		g= Sumresult1-f;
        System.out.println("Subresult :"+g);
        return g;
		}
	public int mul(int Sumresult ,int i) {
		int j;
		j=Sumresult*i;
		System.out.println("Mulresult :"+j);
		return j;
		}
	public int div(int Mulresult ,int k) {
		int l;
		l= Mulresult/k;
	    System.out.println("Divresult :"+l);
		return l;
		}
	public static void main(String[] args) {
		Student ref = new Student();
		int sumres = ref.sum(10, 2);
		int subres = ref.sum1(sumres, 2);
		int subres1 =ref.sub(subres, 2);
		int mulres = ref.mul(subres1, 2);
		int divres =ref.div(mulres, 2);
	}
}
		
