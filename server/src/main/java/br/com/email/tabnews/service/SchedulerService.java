package br.com.email.tabnews.service;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.stereotype.Service;

@Service
public class SchedulerService {
	
	private final long oneDay;
	private Timer timer;
	
	public SchedulerService() {
		this.timer = new Timer();
		this.oneDay = 86400000;
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
		long week = oneDay * 7;
		
		TimerTask weekly = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task semanal: 7");
			}
		};
		timer.schedule(weekly, week, week);
	}
	
	public void monthlyTask() {
		long month = oneDay * 30;
		
		TimerTask weekly = new TimerTask() {
			@Override
			public void run() {
				System.out.println("Task mensal: 30");
			}
		};
		timer.schedule(weekly, month, month);
	}
}
