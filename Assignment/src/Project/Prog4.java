package Project;
import java.util.Scanner;


class Intro
{
	void method()
	{
		System.out.println("*******PATIENT DETAILS*******");
		System.out.println("=============================");
		System.out.print("name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		System.out.print("phno:");
		String ph=sc.next();
		System.out.print("age:");
		int age=sc.nextInt();
		System.out.print("addr:");
		String add=sc.next();
		System.out.println("=============================");
	}
	void method1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("               WELCOME TO APOLLO HOSPITAL");
		System.out.println("visiting purpose:");
		String pu=sc.next();
		switch(pu)
		{
		case "treatment":
			Intro i=new Intro();
                         i.method();
			             System.out.println("tell the problem");
		                 problem p=new problem();
		                 p.problem();
		                 break;                 
		 
		case "visiting":System.out.println("respective patient details is given");                 
		                 break;
		}
				

	
	}
}
class xyz
{
	void fever()
	{
		System.out.println("******BILL DETAILS******");
		System.out.println("-----------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.println("would you like to buy all the medicines");
		String s=sc.next();
		if(s.equals("yes"))
	    {
		int pl=35;
		int dol=20;
		int cf=100;
		int total=0;
		total=pl+dol+cf;
		System.out.println("paracetamol"+"            "+pl);
		System.out.println("Dolo650"+"                "+dol);
		System.out.println("consultation"+"           "+cf);
		System.out.println("-----------------------------");
		System.out.println("total:"+"               "+total);
		System.out.println("-----------------------------");
	    }
		else
		{
			System.out.println("enter the medicines that you wish to buy");
			int ss=sc.nextInt();
			switch(ss)
			{
			case 1:int pl=35;
			int cf=100;
			int total=0;
			total=pl+cf;
			System.out.println("paracetamol"+"            "+pl);
			System.out.println("consultation"+"           "+cf);
			System.out.println("-----------------------------");
			System.out.println("total:"+"               "+total);
			System.out.println("-----------------------------");
			break;
			case 2:int dol1=20;
			int cf1=100;
			int total1=0;
			total=dol1+cf1;
			System.out.println("Dolo650"+"                "+dol1);
			System.out.println("consultation"+"           "+cf1);
			System.out.println("-----------------------------");
			System.out.println("total:"+"               "+total);
			System.out.println("-----------------------------");
			}
		}
	}
	void child()
	{
		System.out.println("******BILL DETAILS******");
		System.out.println("-----------------------------");
		int pl=35;
		int dol=45;
		int cf=100;
		int total=0;
		total=pl+dol+cf;
		System.out.println("benylin"+"               "+pl);
		System.out.println("colpol"+"                "+dol);
		System.out.println("consultation"+"           "+cf);
		System.out.println("-----------------------------");
		System.out.println("total:"+"               "+total);
		System.out.println("-----------------------------");
	}
	void girl()
	{
		System.out.println("******BILL DETAILS******");
		System.out.println("-----------------------------");
		int pl=35;
		int dol=45;
		int cf=150;
		int total=0;
		total=pl+dol+cf;
		System.out.println("meftal spas"+"                   "+pl);
		System.out.println("combliflam"+"                    "+dol);
		System.out.println("consultation"+"                  "+cf);
		System.out.println("-----------------------------");
		System.out.println("total:"+"               "+total);
		System.out.println("-----------------------------");
	}
	void teeth()
	{
		System.out.println("******BILL DETAILS******");
		System.out.println("-----------------------------");
		int pl=500;
		int dol=45;
		int cf=150;
		int total=0;
		total=pl+dol+cf;
		System.out.println("Dentalfilling"+"                   "+pl);
		System.out.println("combliflam"+"                      "+dol);
		System.out.println("consultation"+"                    "+cf);
		System.out.println("-----------------------------");
		System.out.println("total:"+"               "+total);
		System.out.println("-----------------------------");
	}
}
class payment
{
	void pay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the payment method");
		String s3=sc.next();
		System.out.println("payment successful");
		System.out.println("thank you visit us again");
	}
}
class Specialist
{
	void input()
	{
		String s[]= {"1.GENERAL PHYSICIAN","2.PEDIATRICIAN","3.GYNECOLOGIST","4.DENTIST","5.ORTHOPEDIC","6.CARDIOLOGIST","7.DERMATOLOGIST"};
		for(String str:s)
	       {
			
	    	   System.out.println(str);
	       }

	}
	void general()
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("consult general physician");
		System.out.println("select the doctor");
		String[] s3= {"Dr.DHANANJAYA availble from 1pm","Dr.SRIDHAR available from 3pm","Dr.SHUBHA from 6pm"};
		for(String str:s3)
		{
			System.out.println(str);
		}
		String s5=sc.next();
		System.out.println("would like to taken appointment with"+" "+s5);
		String s6=sc.next();
		if(s6.equals("yes"))
		{
		System.out.println("go to room 102");
		System.out.println("GREETING EACH OTHER");
		System.out.println("Doc: tell me ");
		System.out.println("enter Symptoms");
		
		String s1[]=new String[3];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("-----------------");
		System.out.println("CHECKING PROCESSS");
		System.out.println("------------------");
		System.out.println("==============prescription=========");
		String s2[]= {"paracetamol    1-0-1", "dolo650     1-0-0"};
		for(String str:s2)
		{	
		System.out.println(str);
	    }
		System.out.println("===================================");
		xyz x=new xyz();
		x.fever();
		payment p1=new payment();
		p1.pay();
		}
	
		else
		{
			System.out.println("thank you visit again with more disease");
		}
      }
	void pedia()
	{
		System.out.println("consult pediatrician");
		System.out.println("go to room 103");
		System.out.println("enter Symptoms");
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[3];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("-----------------");
		System.out.println("CHECKING PROCESSS");
		System.out.println("------------------");
		System.out.println("==============prescription=========");
		String s2[]= {"benylin    1-0-1", "calpol     1-0-0"};
		for(String str:s2)
		{	
		System.out.println(str);
	    }
		System.out.println("===================================");
		xyz x=new xyz();
		x.child();
		payment p1=new payment();
		p1.pay();
	}
	void girl()
	{
		System.out.println("consult Gynecologist");
		System.out.println("go to room 104");
		System.out.println("enter Symptoms");
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[3];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("-----------------");
		System.out.println("CHECKING PROCESSS");
		System.out.println("------------------");
		System.out.println("==============prescription=========");
		String s2[]= {"meftal spas    1-0-0", "combliflam     1-0-0"};
		for(String str:s2)
		{	
		System.out.println(str);
	    }
		System.out.println("===================================");
		xyz x=new xyz();
		x.girl();
		payment p1=new payment();
		p1.pay();
	}
	void dental()
	{
		System.out.println("consult Dentist");
		System.out.println("go to room 105");
		System.out.println("enter Symptoms");
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[3];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("-----------------");
		System.out.println("CHECKING PROCESSS");
		System.out.println("------------------");
		System.out.println("==============prescription=========");
		String s2[]= {"Dental filling", "combliflam     1-0-0"};
		for(String str:s2)
		{	
		System.out.println(str);
	    }
		System.out.println("===================================");
		xyz x=new xyz();
		x.teeth();
		payment p1=new payment();
		p1.pay();

	}
	void ortho()
	{
		System.out.println("consult Orthopedic");
		System.out.println("go to room 106");
		System.out.println("enter Symptoms");
		Scanner sc=new Scanner(System.in);
		String s1[]=new String[3];
		for(int i=0;i<s1.length;i++)
		{
			s1[i]=sc.next();
		}
		System.out.println("-----------------");
		System.out.println("CHECKING PROCESSS");
		System.out.println("------------------");
		System.out.println("==============prescription=========");
		String s2[]= {"Dental filling", "combliflam     1-0-0"};
		for(String str:s2)
		{	
		System.out.println(str);
	    }
		System.out.println("===================================");
		xyz x=new xyz();
		x.teeth();
		payment p1=new payment();
		p1.pay();
	
	}
}
class problem
{
	void problem()
	{
		System.out.println("the problem:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s)
		{
		case "fever":Specialist s1=new Specialist();
		             s1.general();
		             break;
		case "children": Specialist s2=new Specialist();
		                 s2.pedia();
		                 break;
		case "girl": Specialist s3=new Specialist();
                      s3.girl();
                      break;
		case "dental": Specialist s4=new Specialist();
                        s4.dental();
                        break;
		case "orthopedic":Specialist s5=new Specialist();
                          s5.ortho();
                            break;
		             
		}
	}
}

 class Prog4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Intro i=new Intro();
    i.method1();

	}

}


