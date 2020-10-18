package Project;
import java.util.Scanner;

public class Prog3 {
		class Electronics
		{
			String s1[]= {"mobiles","television"};
			int a[]= {25000,30000,40000,50000};
			int b[]= {22000,28000,38000,48000};
			Scanner sc=new Scanner(System.in);
			int ch,ch2;
			void display()
			{
				System.out.println("categries in electronics sections are");
				for(int i=0;i<2;i++)
				{
					System.out.println((i+1)+" "+s1[i]);
				}
				System.out.println("enter the choice");
				 ch=sc.nextInt();
			}
			void select()
			{
				if(ch==1)
				{
					String s2[]= {"samsung","iphone"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s2[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println("samsung m30S");
							payment(a[0]);
							//System.out.println("the cost of the mobile is 24000");
							//System.out.println("the product could be delivered by this week");
							break;
						case 2:
							System.out.println("iphone 11");
							payment(a[1]);
							//System.out.println("the cost of the mobile is 65000");
							//System.out.println("the product could be delivered by this week");
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else if(ch==2)
				{
					String s3[]= {"sony","mi"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s3[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println(s3[0]);
							//System.out.println("the cost of the tv is 24000");
							payment(a[2]);
							;
							break;
						case 2:
							System.out.println(s3[1]);
							//System.out.println("the cost of the tv is 65000");
							payment(a[3]);
							//System.out.println("the product could be delivered by this week");
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else
					System.out.println("invalid input");
			}
			void payment(int a)
			{
				int i=0,s;
				float gst=0;
				System.out.println("the product price inclusive of taxes is "+a);
				gst=a+a*(.18f);
				System.out.println("the product price after gst would be "+gst);
				System.out.println("total price is "+gst);
				System.out.println("the product could be delivered by this week");
				i++;
				System.out.println("could u like buy the order or not ,press 1.confirm 2.cancel");
				s=sc.nextInt();
				if(s==1)
				{
					System.out.println("ordered confirmed ");
					System.out.println("thank you for shopping");
				}
			}
		}
		class Clothes
		{
			String s1[]= {"female","male"};
			int a[]= {500,300,4000,500};
			int b[]= {350,280,3800,400};
			Scanner sc=new Scanner(System.in);
			int ch,ch2;
			void display()
			{
				System.out.println("categries in clothes sections are");
				for(int i=0;i<2;i++)
				{
					System.out.println((i+1)+" "+s1[i]);
				}
				System.out.println("enter the choice");
				 ch=sc.nextInt();
			}
			void select()
			{
				if(ch==1)
				{
					String s2[]= {"kurtas","gowns"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s2[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println(s2[0]);
							payment(a[0]);
							//System.out.println("the cost of the kurta is 24000");
							//System.out.println("the product could be delivered by this week");
							break;
						case 2:
							System.out.println(s2[1]);
							//System.out.println("the cost of the gown is 65000");
							//System.out.println("the product could be delivered by this week");
							payment(a[1]);
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else if(ch==2)
				{
					String s3[]= {"pant","shirts"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s3[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println(s3[0]);
							payment(a[2]);
							//System.out.println("the cost of the pant is 24000");
							//System.out.println("the product could be delivered by this week");
							break;
						case 2:
							System.out.println(s3[1]);
							payment(a[3]);
							//System.out.println("the cost of the shirt is 65000");
							//System.out.println("the product could be delivered by this week");
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else
					System.out.println("invalid input");
			}
			void payment(int a)
			{
				int i=0,s;
				float gst=0;
				System.out.println("the product price inclusive of taxes is "+a);
				gst=a+a*(.18f);
				System.out.println("the product price after gst would be "+gst);
				System.out.println("total price is "+gst);
				System.out.println("the product could be delivered by this week");
				i++;
				System.out.println("could u like buy the order or not ,press 1.confirm 2.cancel");
				s=sc.nextInt();
				if(s==1)
				{
					System.out.println("ordered confirmed ");
					System.out.println("thank you for shopping");
				}
			}
		}
		class Sports
		{
			String s1[]= {"indoor","outdoor"};
			int a[]= {2500,3000,4000,5000};
			int b[]= {2200,2800,3800,4800};
			Scanner sc=new Scanner(System.in);
			int ch,ch2;
			void display()
			{
				System.out.println("categries in sports sections are");
				for(int i=0;i<2;i++)
				{
					System.out.println((i+1)+" "+s1[i]);
				}
				System.out.println("enter the choice");
				 ch=sc.nextInt();
			}
			void select()
			{
				if(ch==1)
				{
					String s2[]= {"chess","table tennis"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s2[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println(s2[0]);
							payment(a[0]);
							//System.out.println("the cost of the chess is 24000");
							//System.out.println("the product could be delivered by this week");
							break;
						case 2:
							System.out.println(s2[1]);
							payment(a[1]);
							//System.out.println("the cost of the table tennis is 65000");
							//System.out.println("the product could be delivered by this week");
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else if(ch==2)
				{
					String s3[]= {"volleyball","football"};
					for(int i=0;i<2;i++)
					{
						System.out.println((i+1)+" "+s3[i]);
					}
					System.out.println("enter the choice");
					 ch2=sc.nextInt();
					 switch(ch2)
						{
						case 1:
							System.out.println(s3[0]);
							payment(a[2]);
							//System.out.println("the cost of the volleyball is 24000");
							//System.out.println("the product could be delivered by this week");
							break;
						case 2:
							System.out.println(s3[1]);
							payment(a[3]);
							//System.out.println("the cost of the football is 65000");
							//System.out.println("the product could be delivered by this week");
							break;
						default:
							System.out.println("invalid input");
							break;
						}
				}
				else
					System.out.println("invalid input");
			}
					 void payment(int a)
						{
							int i=0,s;
							float gst=0;
							System.out.println("the product price inclusive of taxes is "+a);
							gst=a+a*(.18f);
							System.out.println("the product price after gst would be "+gst);
							System.out.println("total price is "+gst);
							System.out.println("the product could be delivered by this week");
							i++;
							System.out.println("could u like buy the order or not ,press 1.confirm 2.cancel");
							s=sc.nextInt();
							if(s==1)
							{
								System.out.println("ordered confirmed ");
								System.out.println("thank you for shopping");
							}
						}
				}
			}
