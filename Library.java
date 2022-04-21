import java.util.Scanner;
public class Library 
{
    int acc_num;
    String title;
    String author;
    
    public void input()
    {
    	    Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Title of book");
			title  = sc.nextLine();

			System.out.println("Enter the name of author");
			author  = sc.nextLine(); 

			System.out.println("Enter the Number of Books");
			acc_num = sc.nextInt();
		
    }  
    
    public void compute() 
    {
    	
    	Scanner s = new Scanner(System.in);
        System.out.println("Number of day to delay");
        int day = s.nextInt();
        int fine = day*5;
        
        System.out.println("Fine = "+fine+"Rs");
        System.out.println("*********************************");
     }
    
    public void display() 
    {
    	System.out.println("AccessionNumber\ttitle\tAuthor");
    	System.out.println();
    	System.out.println(acc_num+"\t\t"+title+"\t"+author);
    }
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Library obj = new Library();
       
       obj.input();
       obj.compute();
       obj.display();

	}

}
