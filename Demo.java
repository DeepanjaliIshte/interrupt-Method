
public class Demo extends Thread{
	public void run() {
		System.out.println("A : "+Thread.interrupted());
		//System.out.println((Thread.currentThread().isInterrupted()));
		try 
		{
		for (int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
				System.out.println(" B : "+Thread.interrupted());
			}
		}
	catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.start();
		d.interrupt();
	}

}
