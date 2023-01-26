
public class Node {
Node left,right,next;
int price;
long Phone_no;
String Address,Type,Name,Sell_or_Rent;

Node(String n,String a,String t,String rs,int p,long ph)
{
Address=a;
Type=t;
Name=n;
Sell_or_Rent=rs;
   price=p;
   Phone_no=ph;
   left=null;
   right=null;
   next=null;
}
}