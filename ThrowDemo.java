package practicePRojectPhase;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=100,b=0,f;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                f= a / b;
                System.out.print("\n\tThe result is : " + f);
            }
        }
        catch(ArithmeticException E)
        {
            System.out.print("\n\tError : " + E.getMessage());
        }


	}

}
