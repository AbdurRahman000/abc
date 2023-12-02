package practicePRojectPhase;

public class MyThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyThread m1=new MyThread();
MyThread m2=new MyThread();
MyThread m3=new MyThread();
m1.start();
m2.start();
m3.start();

	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		}
	}

}
