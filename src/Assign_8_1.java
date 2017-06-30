//Create a second thread.
//Program to print Timeout after certain interval of time.
class NewThread implements Runnable{ // Created new thread class 
		NewThread(){// Constructor defined 
		System.out.println(" Thread:***");
	}
	public void run(){// run method is overridden
	}
}

class Assign_8_1{
	public static void main(String args[]){
		NewThread tr = new NewThread();// Create New Thread
		try{
			for(int i = 5; i>0; i--){
				System.out.println("Time Out");
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main Thread Interrpted.");
		}

	}

}