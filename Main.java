package practicePRojectPhase;
class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 


public class Main {

	public static void main(String[] args) {
        try
        { 
            throw new MyException("NotFound"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println(" Error Caught"); 
            System.out.println(ex.getMessage()); 
        } 


	}
	

}
