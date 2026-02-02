
class Thready extends Thread{
	public void run() {
		try {
			System.out.println("Thread Started it's Execution");
			sleep(10000);
			System.out.println("Thread Finished Execution");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Threadsss {

	public static void main(String[] args) {
		Thready t = new Thready();
		t.start();
		
	}

}
