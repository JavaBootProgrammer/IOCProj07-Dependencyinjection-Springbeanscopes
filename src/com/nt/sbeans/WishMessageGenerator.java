//WishMessageGenerator(target class)
package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
//@Lazy(true)
@Scope("singleton")
public class WishMessageGenerator {
	@Autowired   // Filed Injection
	private  LocalDateTime dateTime;  //HAS-A property/Filed
	@Autowired
	@Qualifier("dt1")
	private   Date  date;
	
	
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
/*	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime) {
		this.dateTime=dateTime;
		System.out.println("WishMessageGenerator::1-param constructor");
	}*/
	
	/*@Autowired
	public WishMessageGenerator(LocalDateTime dateTime,Date date) {
		this.dateTime=dateTime;
		this.date=date;
		System.out.println("WishMessageGenerator::2-param constructor");
	}*/
	
	/*//setter method for  setter injection
	@Autowired
	 public void setDateTime(LocalDateTime  dateTime) {
		 System.out.println("WishMessageGenerator.setDateTime()");
		 this.dateTime=dateTime;
	 }*/
	
/*	@Autowired
	public  void  assign(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.assign()");
		this.dateTime=dateTime;
	}
	
	@Autowired
	public  void  putData(Date date) {
		System.out.println("WishMessageGenerator.putData()");
		this.date=date;
	}*/
	
	
	
	// b.method having b.logic
	public String showWishMessage(String user) {
		System.out.println(dateTime+"......"+date);
		//get current hour of the day
		 int hour=dateTime.getHour(); //24 hours format
		 //generate the wish message
		 if(hour<12)
			 return "Good Morning:"+user;
		 else if(hour<16)
			 return "Good Afternoon:"+user;
		 else if(hour<20)
			 return "Good Evening::"+user;
		 else
			 return "Good Night :"+user;
			 
	}

}
