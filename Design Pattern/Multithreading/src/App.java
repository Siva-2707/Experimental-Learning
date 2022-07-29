
public class App {
	static int result;
	public static void main(String[] args) {
			 
		 System.out.println("######### Start of main thread #############");
		 
		 //Long operation that is to be executed 
		 LongOperationThread longTask = new LongOperationThread();
		 //The start method will invoke the run method internally
		 longTask.start();
		 shortTask();
		 
		 Runnable r = new InheritedClass();
		 Thread task = new Thread(r);
		 task.start();
		 
		 System.out.println("####### End of Main thread ############");
	}
	
	public static synchronized void shortTask() {
		for(int i=1;i<20;i++) {
			if(i%2 == 0) {
				result += i;
				System.out.println("Short operation result :"+result);
			}
		}
	}

	

}

class LongOperationThread extends Thread{
	
	@Override
	public synchronized void run() {
		System.out.println("------------ Start of Longoperation thread ------------");
			int longOperationResult = 0;
			for(int i=1;i<50;i++) {
				if(i%2!=0) {
					longOperationResult += i;
					System.out.println("longOperationResult :" +longOperationResult);
				}
			}
			System.out.println("----------- End of Longoperation thread -----------");
	}
}
//Since java doesn't support multiple inheritance
class InheritedClass extends Object implements Runnable{

	@Override
	public synchronized void run() {
		System.out.println("------------ Start of InheritedClass thread ------------");
		int longOperationResult = 0;
		for(int i=1;i<50;i++) {
			if(i%2!=0) {
				longOperationResult += i;
				System.out.println("InheritedClass :" +longOperationResult);
			}
		}
		System.out.println("----------- End of InheritedClass thread -----------");
	}
	
}
