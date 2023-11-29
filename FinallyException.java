package practicePRojectPhase;

public class FinallyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=0,f=0;
        try
        {
            f= a / b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        finally
        {
            System.out.println("The result is : " + f);
        }

	}

}
