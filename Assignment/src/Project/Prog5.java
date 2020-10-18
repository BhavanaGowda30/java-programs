package Project;

import java.util.Scanner;

public class Prog5 {

	abstract class Hospitalsss
	{
		abstract void Adress();
		

	abstract void facilities();

	public void headache() {
		System.out.print("next patient\n");
		Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    System.out.print(" yes come in\n");
	    String s1=sc.nextLine();
	    System.out.print(" Namasthe\n");
	    System.out.print(" pls be seated\n");
	    String s7=sc.nextLine();
	    System.out.print(" what is your health issue\n");
	    String s2=sc.nextLine();
	    System.out.print(" do u have fever\n");
	    String s3=sc.nextLine();
	    System.out.print(" OK,then take these medecine\n");
		System.out.print("1.Generic Name:acetaminophen/butalbital/caffeine systemic\n");
		System.out.print("Drug class:analgesic combinations\n");
		System.out.print("2.Generic Name:ibruprofen systemic\n");
		System.out.print("Drug class:Nonsteroidal anti-inflammatory\n");
		System.out.print("3.Generic Name:naproxen systemic\n");
		System.out.print("Drug class:Nonsteroidal anti-inflammatory\n");
		System.out.print("4.Generic Name:aspirin/butalbital/caffeine systemic\n");
		System.out.print("Drug class:analgesic combinations\n");
	    String s4=sc.nextLine();
	    System.out.print(" if it is reduce the headche using these medecine then its fine ,otherwise we have to scan your head for further process\n");
	    String s5=sc.nextLine();
	    System.out.print(" OK then its fine ,u can pay fees in the reception\n");
	    String s6=sc.nextLine();
	    Scanner scan=new Scanner(System.in);
			System.out.print("pay doctor fees and medecine fees \n");
			System.out.print(" payment method \n");
			System.out.print("enter 1 for online payment method \n");
			System.out.print("enter 2 for cash on the spot payment method\n");
			int n15=scan.nextInt();
			if(n15==1)
			{
				
				System.out.print(" press 1 for Google pay \n");
				System.out.print(" press 2 for Phone pay \n");
				long c=scan. nextLong();
				System.out.print(c);
				
			}

			System.out.print(" pay cash \n");
			int n16=scan.nextInt();
			System.out.print("Billing process  completed  \n");
			System.out.print("Get Well Soon  \n");
			System.out.print("<<< THANK YOU>>>\n");
		
	}

	public void StomuckPain() {
		
	}

	public void LegPain() {
		// TODO Auto-generated method stub
		
	}
	}
	 class Appoloo extends Hospitalsss
	{
		void  address()
		{
			 System.out.print("WELCOME TO HEALTHCARE CENTER\n  ");
			System.out.println("The appolo hospital near ");
			 System.out.print("  ");
			 System.out.println("Bannergatta road ");
			 System.out.print("  ");
		}
		void infrastructure()
		{
			System.out.println("good");
			 
		}

		void facilities()
		{
			
			
			 System.out.println("please register for appointment date\n");
				System.out.println("Patient FirstName,LastName :\n");
				Scanner scan=new Scanner(System.in);
				String name=scan.nextLine();
				System.out.println("Age of Patient:\n");
				int a=scan.nextInt();
				 System.out.println("your appointment date will be on\n ");
				 System.out.println(" ");
				 System.out.println("12/4/2020\n");
				 System.out.println("your token number will be\n ");
				 System.out.println(" ");
				 System.out.println("22");
				 System.out.println("Thank you for Registration\n");
					System.out.println("enter into Reception\n");
					 System.out.print("Display your token No\n");
					 int a1=scan.nextInt();
					 if(a1==22)
					 {
					System.out.println(" fill the application for further process\n");
					System.out.println("Patient FirstName,LastName :");
					Scanner scan1=new Scanner(System.in);
					String name1=scan1.nextLine();
					System.out.println("Age of Patient:");
					int a11=scan1.nextInt();
					System.out.println("name of Disease :");
					Scanner sc=new Scanner(System.in);
					String d[]=new String[3];
					d[0]="Headache";
					d[1]="StomuckPain";
					d[2]="LegPain"; 
					for (int j = 0; j < 3; j++) {
						System.out.println(d[j]);
						
					}
					  String c[]=new String[1]; 
					  
						for(int j=0;j<=c.length-1;j++)
						{
								c[j]=sc.nextLine();	
							
								 
						if(c[j].equalsIgnoreCase(d[0])==true) 
								{
							System.out.println("consult Dr Preetham for medical advise \n");
							System.out.println("meet him at 2PM\n");
							 String s1=sc.nextLine();
						     headache();
								}
										
							else 
								if(c[j].equalsIgnoreCase(d[1])==true) 
								{
									System.out.println("consult Dr Lavanya for medical advise \n");
									System.out.println("meet him at 12PM\n");
								   StomuckPain();
								}
								else 
									if(c[j].equalsIgnoreCase(d[2])==true) 
									{
										System.out.println("consult Dr Raghuveer for medical advise \n");
										System.out.println("meet him at 3PM\n");
									    LegPain();						}
						}
					
						 
					 }
					 else
					 {
						 System.out.println("Sorry,your appointment will be on some oether day Check it once!!!");
					 }
		}
		@Override
		void Adress() {
	
			
		}

				
			

		}
		

		
		

	class Fortiss extends Hospitalsss
	{
		void  address()
		{
			
			
		}
			 void infrastructure()
				{
					
					
					 
				}
			 void facilities()
			 {
			 
			 }
			@Override
			void Adress() {
				
				
			}
			
	}
	class Manipall extends Hospitalsss
	{
		void  address()
		{
			
			
		}
			 void infrastructure()
				{
					
					
					 
				}
			 void facilities()
			 {
			 
			 }
			@Override
			void Adress() {
				
				
			}
			
	}
	class Healthcaress
	{
		void permit(Hospitalsss ref)
		{
			ref.Adress();
			ref.facilities();
			
		}
	}


	public class Ab
	{
	  public void main(String arg[])
	  {
		  Hospitalsss ref;
		 Appoloo cp=new Appoloo();
		 Fortiss pp=new Fortiss();
		Manipall fp=new Manipall();
		Healthcaress a=new Healthcaress();
		a.permit(cp);
		a.permit(pp);
		a.permit(fp);
		cp.infrastructure();
		pp.infrastructure();
		fp.infrastructure();
		  }
	}
}
