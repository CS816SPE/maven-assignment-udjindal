package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        	float a,b, res;
		char choice, ch;
		Scanner scan = new Scanner (System.in);
		do{
			System.out.print("1. Add\n");
			System.out.print("2. Sub\n");
			System.out.print("3. Mul\n");
			System.out.print("4. Exit\n");
			System.out.print("enter your choice: ");
			choice=scan.next().charAt(0);
			switch(choice){
				case '1': System.out.print("enter 2 numbers: ");
						  a=scan.nextFloat();
						  b=scan.nextFloat();
						  res=a+b;
						  System.out.print("Result = "+res);
						  break;
				case '2': System.out.print("enter 2 numbers: ");
						  a=scan.nextFloat();
						  b=scan.nextFloat();
						  res=a-b;
						  System.out.print("Result = "+res);
						  break;
				case '3': System.out.print("enter 2 numbers: ");
						  a=scan.nextFloat();
						  b=scan.nextFloat();
						  res=a*b;
						  System.out.print("Result = "+res);
						  break;
				case '4': System.exit(0);
						  break;
				default : System.out.print("Invalid choice \n");
						  break;

			}
			System.out.print("\n--------------");
		}while(choice!=4);
    }
}
