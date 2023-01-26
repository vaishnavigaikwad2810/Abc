

import java.util.Scanner;
import java.util.Stack;

public class List {
Node head;
String dummy;
Node root,root1;
Scanner sc=new Scanner (System.in);
public List() {
head=null;
root=null;
root1=null;
}
    void Create() {
   try {
   dummy=sc.nextLine();
   System.out.println("Enter name of owner");
   String n=sc.nextLine();
   System.out.println("Enter Phone No. of Owner");
   long ph=sc.nextLong();
   dummy=sc.nextLine();
   System.out.println("Enter address of Property");
   String a=sc.nextLine();
   System.out.println("Enter type of Property-1BHK,2BHK,Bunglow etc");
   String t=sc.nextLine();
   System.out.println("Enter whether property is for Rent or Sale");
   String rs=sc.next();
   System.out.println("Enter price for Rent or Sale");
   int p=sc.nextInt();

 
   Node new_node = new Node(n,a,t,rs,p,ph);
   new_node.next = null;
   if (head == null) {
   head = new_node;
   }
   else {
   Node ptr = head;
   while (ptr.next != null) {
   ptr = ptr.next;
   }
   ptr.next = new_node;
   }
   System.out.println("Property is added ");
   }catch(Exception e) {}
   }
void Admin() {
System.out.println("Welcome to admin portal !!");
  System.out.println("Enter Password");
  String p=sc.nextLine();
  if(p.equals("admin"))
  {
  int j;
  try {
   do{
 
System.out.print("------------ENTER YOUR CHOICE----------\n");
           System.out.print("1-Add a new Property\n2-Display all Properties\n3-Delete Existing Property\n4-Update Existing Property"
            + "\n5-Insert at a specific Lcation\n6-Exit\n");
         
j=sc.nextInt();
switch(j)
{
case 2:  

Display();

break;
case 1:  

   Create();

         break;
case 3:
 Delete();
break;
case 4:
Update();
break;
case 6:
System.out.println("You have exited Admin Portal Successfully");break;
case 5:
Insert(); break;

}
 
}while(j!=6);
   }catch(Exception e) {}
  }
  else
System.out.println("Incorrect Password");
 


}
void Customer() {
int j;
System.out.println("Welcome to Customer portal !!");
   do{

System.out.print("------------ENTER YOUR CHOICE----------\n");
            System.out.print("1-Display all Properties\n2-Search by Area\n3-Search by Price\n4-Search by rent or Sale Option\n"
            + "5-Search by type of house(1BHK,HU etc)\n6-View Sorted List of houses by Price\n7-Exit\n");
j=sc.nextInt();
switch(j)
{
case 1:  

Display();

break;
case 2:  

SearchByArea();

         break;
case 3:
SearchByPrice();
break;
case 4:
SearchBySellorRent();
break;
case 7:
System.out.println("You have exited Customer Portal Successfully");break;
case 5:SearchByType();
break;
case 6:SrtPriceBT();
break;
}

}while(j!=7);
   

}

void Insert() {
try {
dummy=sc.nextLine();
System.out.println("Enter name of owner");
    String n=sc.nextLine();
    System.out.println("Enter address of Property");
    String a=sc.nextLine();
    System.out.println("Enter type of Property-1BHK,2BHK,Bunglow etc");
    String t=sc.nextLine();
 
    System.out.println("Enter whether property is for Rent or Sale");
    String rs=sc.next();
    System.out.println("Enter price for Rent or Sale");
    int p=sc.nextInt();
    System.out.println("Enter Phone No. of Owner");
    long ph=sc.nextLong();
    System.out.println("Enter position at which you want to insert");
    int pos=sc.nextInt();
    Node new_node = new Node(n,a,t,rs,p,ph);
if(pos==1) {
new_node.next=head;
head=new_node;
System.out.println("Property is added ");
}
else  {
int i=1;
Node ptr=head;
while(i<pos-1){

ptr = ptr.next;
i++;
}
new_node.next=ptr.next;
ptr.next=new_node;

}
System.out.println("Property is added ");
}catch(Exception e) {}
}
void Delete() {
try {
dummy=sc.nextLine();
System.out.println("Enter Name of Owner, and Address of Property for Deletion");

  String o=sc.nextLine();

  String a=sc.nextLine();
 
  int flag=0;
 
Node ptr=head;
Node prev=head;

if(head.Name.equalsIgnoreCase(o)&&head.Address.equalsIgnoreCase(a))
{
	head=ptr.next;flag=1;
	}
else {
while(ptr!=null)
{

if(ptr.Name.equalsIgnoreCase(o)&&ptr.Address.equalsIgnoreCase(a))
{
prev.next=ptr.next;
flag=1;
System.out.println("Property is deleted ");
    break;

}
prev=ptr;
ptr=ptr.next;
}
}
if(flag==0) {
System.out.println("Property to be deleted is not found!");
}

}catch(Exception e) {}
}

void Update() {try {
    dummy=sc.nextLine();
System.out.println("Enter the name of Owner");
String o=sc.nextLine();
System.out.println("Enter Phone No. of Owner");
Long p=sc.nextLong();
dummy=sc.nextLine();
System.out.println("Enter the Address of Property which you want to update ");
String a=sc.nextLine();
Node ptr=head;
int flag=0;
while(ptr!=null)
{
if(ptr.Name.equalsIgnoreCase(o)&&ptr.Address.equalsIgnoreCase(a)&&p==ptr.Phone_no)
{
System.out.println("Enter updated rent or sale price ");
int u=sc.nextInt();
ptr.price=u;
System.out.println("Property details are updated");
flag=1;
break;

}
ptr=ptr.next;
}
if(flag==0) {
System.out.println("Property to be updated is not found!");
}
}catch(Exception e) {}
}

void Display() {

Node ptr=head;

System.out.println("Name of Owner\t Address of Property\t Type\t Rent Or Sale\t "
   + "Rent/Sale Price \tPhone No. of Owner");
do {
System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+"\t\t"+ptr.price+"\t\t"+ptr.Phone_no);
ptr = ptr.next;
}while(ptr!= null);


}

void SrtPriceBT() {
try {
Node pntr=head;
Node ptr = root;
while(pntr!=null)
{
int flag=0;

 if(root==null)
{

root=pntr;
flag=1;   System.out.println();

}

 else {
ptr=root;
while(flag!=1)
{
if(pntr.price<=ptr.price)
{
if(ptr.left==null)
{ ptr.left=pntr;
                  flag=1;
}
else
ptr=ptr.left;

}
else
{
if(pntr.price>ptr.price)
{
if(ptr.right==null)
{ ptr.right=pntr;
                      flag=1;   System.out.println();
}
else
ptr=ptr.right;
  }}} }
 pntr=pntr.next;
}

System.out.println("Name of Owner\t Address of Property\t Type\t Rent Or Sale\t "
   + "Rent/Sale Price\tPhone No. of Owner");

DisplayBst(root);
}catch(Exception e) {System.out.println("Error "+e);}

}
void DisplayBst(Node ptr) {
try {
        if(ptr.left!= null)  
        {
        	System.out.println("1.");
            DisplayBst(ptr.left); 
            }
        System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+" \t\t"+ptr.price+
        "\t\t"+ptr.Phone_no);
        if(ptr.right!= null)  
        { DisplayBst(ptr.right);  }

     
}catch(Exception e) {System.out.println("Error "+e);}
}
   
    void SearchByPrice() {
   
    try {
    System.out.println("Enter the maximum price, below which you are searching a house");
    int p=sc.nextInt();
    Node ptr=head;
    System.out.println("Name of Owner\t Address of Property\tType\t Rent Or Sale\t "
    + "RentSale Price\t Phone No. of Owner");
    while(ptr!=null)
    {
    if(ptr.price<=p)
   
    {System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+"\t\t"+ptr.price+
    "\t\t"+ptr.Phone_no);
    }
    ptr=ptr.next;
   
   
    }
   
   
    }catch(Exception e) {}
    }
    void SearchByType() {
    dummy=sc.nextLine();
    System.out.println("Enter the type for which you are searching a house");
    String t=sc.nextLine();
    Node ptr=head;
    System.out.println("Name of Owner\tAddress of Property\t Type\t Rent Or Sale\t "
    + "RentSale Price\t Phone No. of Owner");
    while(ptr!=null)
    {
    if(ptr.Type.equalsIgnoreCase(t))
    {  System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+"\t\t"+ptr.price+
    "\t\t"+ptr.Phone_no);
    }
    ptr=ptr.next;
   
   
    }
    }
    void SearchByArea() {
    int flag=0;
    dummy=sc.nextLine();
    System.out.println("Enter the area for which you are searching a house");
    String a=sc.nextLine();
    Node ptr=head;
    System.out.println("Name of Owner\tAddress of Property\t Type\t Rent Or Sale\t "
    + "RentSale Price\t Phone No. of Owner");
    while(ptr!=null)
    {
    if(ptr.Address.equalsIgnoreCase(a))
    {  System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+"\t\t"+ptr.price+
    "\t\t"+ptr.Phone_no);
    flag++;
    }
    ptr=ptr.next;
    }
    if(flag==0) {
    System.out.println("Property in that area not found!");
    }

}
    void SearchBySellorRent() {
    try {
   
    dummy=sc.nextLine();
    System.out.println("Enter Sale if u want to buy a house, or else if you are searching for a "
    + "house on rent enter Rent ");
    String sr=sc.nextLine();
    Node ptr=head;
    System.out.println("Name of Owner\tAddress of Property\t Type\t Rent Or Sale\t "
    + "RentSale Price\t Phone No. of Owner");
    while(ptr!=null)
    {
    if(ptr.Sell_or_Rent.equalsIgnoreCase(sr))
    {System.out.println(""+ptr.Name+"\t\t"+ptr.Address+"\t\t\t"+ptr.Type+"\t\t"+ptr.Sell_or_Rent+"\t\t"+ptr.price+
    "\t\t"+ptr.Phone_no);
    }
    ptr=ptr.next;
   
   
    }
   
   
    }catch(Exception e) {}
    }
   
}