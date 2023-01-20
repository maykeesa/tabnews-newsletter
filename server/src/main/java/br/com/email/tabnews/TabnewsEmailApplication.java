package br.com.email.tabnews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.email.tabnews.service.SchedulerService;

@SpringBootApplication
public class TabnewsEmailApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TabnewsEmailApplication.class, args);
	}
	
	@Autowired
	private SchedulerService schedService;
	
	@Override
	public void run(String... args) throws Exception {
		schedService.dailyTask();
		schedService.weeklyTask();
		schedService.monthlyTask();
	}
}
