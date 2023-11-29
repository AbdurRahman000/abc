package practicePRojectPhase;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Throws ob1 = new Throws();
             try
            {
                ob1.Division();
            }
            catch(ArithmeticException e)
            {
                System.out.println("Error is: " + e.getMessage());
            }
            System.out.print("Result is undefined");

	}
	void Division() throws ArithmeticException
    {
        int a=100,b=0,f;
f= a / b;
        System.out.print("\n\tThe result is : " + f);
    }


}
