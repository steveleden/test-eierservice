package ejb;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class ScheduledTasks {

	public ScheduledTasks() {
		System.out.println("Init Scheduler.... ");
	}
	
	@Schedule(second = "*", minute = "*/30", hour = "*")
	public void someTask() {
		System.out.println("Test scheduler");
	}
}
