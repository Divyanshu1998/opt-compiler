class output1{
    public static void main(String[] a) {
        int t2;
        A t1;
        int t3;
        t2 = 10;
        t1 = new A();
        t3 = t1.abc(t2);
        System.out.println(t3);
    }
}
class A{
int abc(int x) {

	int a;
	int b;
	int c;
	boolean t1;
	a = 10;
	b = 5;
	t1 = a > b;
	if(t1) {
	c = 10;
	}
	else {
	c = 5;
	}
	System.out.println(c);
	return b;
}
}