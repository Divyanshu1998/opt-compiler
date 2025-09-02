class input3 {
    public static void main(String[] a) {
        A x;
        int s;
        x = new A();
        s = x.abc();
        System.out.println(s);
    }
}
class A {
    public int A() {
        int i;
        int t1;
        int t2;
        int t3;
        t1 = 5;
        t3 = 1;
        for(i=0;i<t1;i=i+t3){
            t2 = 1;
            t2 = i + t2;
            System.out.println(t2);
        }
        return i;
    }
}

