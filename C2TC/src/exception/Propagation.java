package exception;

import java.io.IOException;

public class Propagation {

  void m() throws IOException{  
	  
    throw new java.io.IOException("device error");//checked exception  
  }  
  void n() throws IOException{  
	  
    m();  
  }  
  void p(){
	  
   try{  
	   
    n();  
    
   }catch(Exception e)
   
      {System.out.println("exception handeled");}  
  }  
  public static void main(String args[]){
	  
  Propagation obj=new Propagation();  
  
   obj.p();  
   
   System.out.println("normal flow");  
  }  
}
