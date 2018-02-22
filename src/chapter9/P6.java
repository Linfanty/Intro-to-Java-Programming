package chapter9;
import java.util.Scanner;



import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Arrays;
import java.util.Date;

public class P6 {
	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		   int [] sortArray=new int[100000];
		   Random rnd=new Random();
		   sw.start();
		   
		   for(int i=0;i<100000;i++) {
		   sortArray[i]=rnd.nextInt()*100;//产生0-100的随机数；
		   }

		   Arrays.sort(sortArray);//调用Arrays类的sort方法排序
		   sw.stop();

		   System.out.println("TimeSpent:"+sw.getElaspsedTime()+"ms");  
	}
}

class StopWatch
{
	
	long startTime;
	long endTime;
	
	public StopWatch() {
		startTime = 0;
		endTime = 100;
	}
	

	public StopWatch(long startTime, long endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	public void start()
	{
		this.startTime = System.currentTimeMillis();
		System.out.println("StartTimeIs:"+ this.startTime );
	}
	
	void stop()
	{
		this.endTime=System.currentTimeMillis();
		System.out.println("EndTimeIs:" + (this.endTime));
	}
	
	public long getElaspsedTime()
	{
		return endTime - startTime;
	}
	
}
