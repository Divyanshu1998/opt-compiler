class MoreThan4 {
public static void main(String[] a) {
int _aux2;
MT4 _temp92;
int _temp102;
int _p62;
int _p52;
int _p42;
int _p32;
int _p22;
int _p12;
MT4 _this2;
int _ret2;
MT4 temp1;
int temp3;
int temp2;
int temp8;
int temp5;
int temp4;
int temp7;
int temp6;
temp1 = new MT4();
temp2 = 1;
temp3 = 2;
temp4 = 3;
temp5 = 4;
temp6 = 5;
temp7 = 6;
{
_this2 = temp1;
_p12 = temp2;
_p22 = temp3;
_p32 = temp4;
_p42 = temp5;
_p52 = temp6;
_p62 = temp7;
System.out.println( _p12 );
System.out.println( _p22 );
System.out.println( _p32 );
System.out.println( _p42 );
System.out.println( _p52 );
System.out.println( _p62 );
_temp92 = _this2;
_temp102 = _temp92.Change(_p62,_p52,_p42,_p32,_p22,_p12);
_aux2 = _temp102;
_ret2 = _aux2;
}
temp8 = _ret2;
System.out.println(temp8);
}
}
class MT4{
public int Start(int p1,int p2,int p3,int p4,int p5,int p6){
int temp10;
MT4 temp9;
int aux;
int _temp113;
int _p63;
int _p53;
int _p43;
int _p33;
int _p23;
int _p13;
MT4 _this3;
int _ret3;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
temp9 = this;
{
_this3 = temp9;
_p13 = p6;
_p23 = p5;
_p33 = p4;
_p43 = p3;
_p53 = p2;
_p63 = p1;
System.out.println( _p13 );
System.out.println( _p23 );
System.out.println( _p33 );
System.out.println( _p43 );
System.out.println( _p53 );
System.out.println( _p63 );
_temp113 = 0;
_ret3 = _temp113;
}
temp10 = _ret3;
aux = temp10;
return aux;
}
public int Change(int p1,int p2,int p3,int p4,int p5,int p6){
int temp11;
System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
temp11 = 0;
return temp11;
}
}
