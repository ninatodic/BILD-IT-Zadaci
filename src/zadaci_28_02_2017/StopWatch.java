package zadaci_28_02_2017;

public class StopWatch {
	// data fields
	private long startTime;
	 private long endTime;
	 
	 // constructor
	 public StopWatch(){
		 startTime = System.currentTimeMillis();
	 }
	 
	 // getter methods
	 public long getStartTime (){
		 return startTime;
	 }
	 
	 public long getEndTime(){
		 return endTime;
	 }
	 
	 //  method that sets startTime when invoked
	 public void  start (){
		 startTime=System.currentTimeMillis();
	 }
	 
	//  method that sets endTime when invoked
	 public void stop(){
		 endTime = System.currentTimeMillis();
	 }
	 
	 // method that returns elapsed time between invoking start and stop method
	 public long getElapsedTime(){
		 return endTime - startTime;
	 }
	 
	 
}
