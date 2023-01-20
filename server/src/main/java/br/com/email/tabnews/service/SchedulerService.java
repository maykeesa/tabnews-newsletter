package br.com.email.tabnews.service;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	private final long oneDay = 86400000;
	private Timer timer;
	
	public SchedulerService() {
		this.timer = new Timer();
	}
	
	public void dailyTask() {
		TimerTask daily = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task diária: 1");
			}
		};
		timer.schedule(daily, 0, oneDay);
	}
	
	public void weeklyTask() {
		TimerTask weekly = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task semanal: 7");
			}
		};
		timer.schedule(weekly, 0, oneDay * 7);
	}
	
	public void monthlyTask() {
		TimerTask weekly = new TimerTask() {

			@Override
			public void run() {
				System.out.println("Task mensal: 30");
			}
		};
		timer.schedule(weekly, 0, oneDay * 30);
	}
}
