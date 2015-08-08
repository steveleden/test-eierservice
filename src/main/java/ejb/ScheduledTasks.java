package ejb;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ScheduledTasks {

	public ScheduledTasks() {
		System.out.println("Init Scheduler.... ");
	}
	
	@Schedule(second = "*/10", minute = "*", hour = "*")
	public void someTask() {
		System.out.println("5 seconds have passed");
	}
}