class test {
    public static void main(String[] args) {
    int _p4;
    int _i4;
    int _b4;
    A _a4;
    boolean _a14;
    int _x4;
    int _a24;
    int _z4;
    int _k4;
    int _ret4;
    int _t1;
    C t2;
    A t3;
    int j;
    int k;
    int i;
    t2 = new C();
    t3 = new A();
    i = 10;
    j = 5;
    k = 4;
    {
    _k4 = i;
    _z4 = j;
    _a24 = k;
    _a4 = new B();
    _x4 = 5;
    _b4 = 10;
    _a14 = _x4<_b4;
    _x4 = _a4.foo(_k4);
    _p4 = 1;
    while(_a14)
    {
    _x4 = _x4*_k4;
    System.out.println( _x4 );
    _x4 = _x4+_k4;
    System.out.println( _x4 );
    _b4 = 2;
    _x4 = _x4+_b4;
    _b4 = 10;
    _a14 = _x4<_b4;
    }
    for( _i4=0;_a14; _i4 = _i4+_k4)
    {
    _b4 = _b4*_k4;
    System.out.println( _b4 );
    _x4 = _x4+_p4;
    _a14 = _x4<_b4;
    }
    _ret4 = _k4;
    }
    _t1 = _ret4;
    _t1 = t3.foo(i);
    System.out.println(_t1);
    }
    }
    class A{
    public int foo(int x){
    int a;
    a = x*x;
    return a;
    }
    }
    class B extends A{
    public int foo(int k){
    C c;
    int i;
    int x;
    int y;
    int [] a;
    A _z5;
    boolean _a15;
    int _l5;
    int _x5;
    A _y5;
    int _ret5;
    y = 100;
    a = new int [y];
    c = new C();
    a[k] = y;
    {
    _y5 = c;
    _z5 = new A();
    _l5 = 2;
    _x5 = 1;
    _a15 = _x5<_l5;
    if(_a15)
    {
    System.out.println( _a15 );
    }
    else
    {
    }
    this.foo(_x5);
    _ret5 = _x5;
    }
    y = _ret5;
    x = 10;
    x = x*k;
    return x;
    }
    }
    class C extends A{
    public int foo(int k,int z,int a2){
    int x;
    boolean a1;
    A a;
    int b;
    int i;
    int p;
    a = new B();
    x = 5;
    b = 10;
    a1 = x<b;
    x = a.foo(k);
    p = 1;
    while(a1)
    {
    x = x*k;
    System.out.println(x);
    x = x+k;
    System.out.println(x);
    b = 2;
    x = x+b;
    b = 10;
    a1 = x<b;
    }
    for(i = 0;a1;i = i+k)
    {
    b = b*k;
    System.out.println(b);
    x = x+p;
    a1 = x<b;
    }
    return k;
    }
    public int bar(A y){
    int x;
    int l;
    boolean a1;
    A z;
    int _p4;
    int _i4;
    int _b4;
    A _a4;
    boolean _a14;
    int _x4;
    int _a24;
    int _z4;
    int _k4;
    int _ret4;
    z = new A();
    l = 2;
    x = 1;
    a1 = x<l;
    if(a1)
    {
    System.out.println(a1);
    }
    else
    {
    }
    {
    _k4 = x;
    _z4 = l;
    _a24 = l;
    _a4 = new B();
    _x4 = 5;
    _b4 = 10;
    _a14 = _x4<_b4;
    _x4 = _a4.foo(_k4);
    _p4 = 1;
    while(_a14)
    {
    _x4 = _x4*_k4;
    System.out.println( _x4 );
    _x4 = _x4+_k4;
    System.out.println( _x4 );
    _b4 = 2;
    _x4 = _x4+_b4;
    _b4 = 10;
    _a14 = _x4<_b4;
    }
    for( _i4=0;_a14; _i4 = _i4+_k4)
    {
    _b4 = _b4*_k4;
    System.out.println( _b4 );
    _x4 = _x4+_p4;
    _a14 = _x4<_b4;
    }
    _ret4 = _k4;
    }
    return x;
    }
    }