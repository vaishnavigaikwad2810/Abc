

import java.util.Scanner;

public class Project {

public static void main(String[] args) {

Scanner sc=new Scanner (System.in);
List l=new List();int i=0;
System.out.println("WELCOME DEAR USER!!!");
System.out.println("Enter 1 , if you are a Admin, Enter 2 if you are the Customer, 3-Exit this"
		+ " applicaion");
i=sc.nextInt();
while(i!=3)
{
    
    if(i==1)
    l.Admin();
    
    else if(i==2)
        l.Customer();
    else if(i==3)
{
    	System.out.println("You have Exited Successfully");
    	}
    System.out.println("Enter 1 , if you are a Admin, Enter 2 if you are the Customer, 3-Exit this"
    		+ " applicaion");
    i=sc.nextInt();
}

System.out.println("In case you want to register any of your property with us for "
		+ "Renting or Sale,Kindly contact our Admin Office.");
System.out.println("Officer incharge-Shrusti Dixit");
System.out.println("Address-Lloyds Building, Floor-5, Pune-6");
System.out.println("Contact No.-1788943228");
}

}
