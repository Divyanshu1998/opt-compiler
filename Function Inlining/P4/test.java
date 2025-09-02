class MoreThan4
{
public static void main (String[] a)
{
       MT4 temp1;
       int temp3;
       int temp2;
       int temp8;
       int temp5;
       int temp4;
       int temp7;
       int temp6;
       temp1=new MT4();
       temp2=1;
       temp3=2;
       temp4=3;
       temp5=4;
       temp6=5;
       temp7=6;
       /*INLINE*/
       temp8=temp1.Start(temp2,temp3,temp4,temp5,temp6,temp7);
       System.out.println(temp8);
}
}

class MT4
{
public int Start(int p1,int p2,int p3,int p4,int p5,int p6)
{
   int temp10;
   MT4 temp9;
   int aux;
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       System.out.println(p4);
       System.out.println(p5);
       System.out.println(p6);
   temp9=this;
   /*INLINE*/
   temp10=temp9.Change(p6,p5,p4,p3,p2,p1);
   aux=temp10;
   return aux;
}
public int Change(int p1,int p2,int p3,int p4,int p5,int p6)
{
   int temp11;
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       System.out.println(p4);
       System.out.println(p5);
       System.out.println(p6);
   temp11=0;
   return temp11;
}
}

