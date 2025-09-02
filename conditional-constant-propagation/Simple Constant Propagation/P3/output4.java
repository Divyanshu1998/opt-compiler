class input4 {
    public static void main(String[] a) {
        A x;
        int s;
        x = new A();
        s = x.abc();
        System.out.println(s);
    }
}

class A {
    public int abc(){
        int a;
        int b;
        int c;
        int d;
        int e;
        int t1;
        int t2;
        int t3;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        t1 = c + d;
        t2 = t1 + e;
        t3 = b + t2;
        e = a + t3;
        return e;
    } 
}




