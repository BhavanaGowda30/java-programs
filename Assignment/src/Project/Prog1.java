package Project;
import java.util.Scanner;
public class Prog1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
				String courses[]={"UC1","UC2","UC3","Software Testing","Full Stack Developer"};
				float fees[]= {25000,30000,35000,40000,45000};
				int ch1;
				do
				{
					System.out.println("WELCOME TO ABC FOR TECHNOLOGY TRAINING AND UPSKILL");
					System.out.println("Courses available at Vijaynagar Branch are:");
					
					System.out.println("1.UC1");
					System.out.println("2.UC2");
					System.out.println("3.UC3");
					System.out.println("4.Software Testing");
					System.out.println("5.Full Stack Developer");
					System.out.println("Enter the course number to know further details:");
					int ch=sc.nextInt();
					
					switch(ch)
					{
					case 1:
						System.out.println("UC1 courses details");
						System.out.println("This Course cotains 1.Core Java Programming \n 2. Testing knowledge");
						System.out.println("3.Basic aptitude knowledge \n 4.Communicatio skill practice");
						System.out.println("Fees Structure :" +fees[0]);
						break;
					
					case 2:
						System.out.println("UC2 courses details");
						System.out.println("This Course cotains 1.Core Java Programming and python Programming \n 2. Testing knowledge");
						System.out.println("3.Basic aptitude knowledge \n 4.Communicatio skill practice");
						System.out.println("Fees Structure :" +fees[1]);
						break;
						
					case 3:
						System.out.println("UC3 courses details");
						System.out.println("This Course cotains 1.Core Java Programming and python programming \n 2. Testing knowledge");
						System.out.println("3.Basic aptitude knowledge \n 4.Communicatio skill practice \n 5.Placement activities");
						System.out.println("Fees Structure :" +fees[2]);
						break;
						
					case 4:
						System.out.println("Software Testing courses details");
						System.out.println("This Course cotains 1. Testing knowledge");
						System.out.println("2.Basic aptitude knowledge \n 3.Communicatio skill practice \n 4.Placment activities");
						System.out.println("Fees Structure :" +fees[3]);
						break;
						
					case 5:
						System.out.println("Full Stack Developing courses details");
						System.out.println("This Course cotains 1.Front end and Back end coding of frameworks \n 2. Testing knowledge");
						System.out.println("3.Basic aptitude knowledge \n 4.Communicatio skill practice");
						System.out.println("Fees Structure :" +fees[4]);
						break;
					default:
						System.out.println("Invalid Input");
						break;
					}
					System.out.println("Do you want to continue? press 1.Yes or 2.No");
					ch1=sc.nextInt();
				}
				while(ch1==1);
				}
	}

