
public class Test extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				//Thread.sleep(1000);
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.start();
		t.interrupt();
	}

}
