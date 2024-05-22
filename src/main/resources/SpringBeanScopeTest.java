//SpringBeanScopeTest.java (Client App)
package com.nt.main;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;
import com.nt.ston.Printer;

public class SpringBeanScopeTest {

	public static void main(String[] args) {
		//create the IOC container 
		AnnotationConfigApplicationContext ctx=   
				  new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("--------------------------------------");
		  LocalDateTime  ldt=ctx.getBean("ldt",LocalDateTime.class);
		  System.out.println("-------------------");
		  Date  d1=ctx.getBean("dt1",Date.class);
		  System.out.println(ldt+"....."+d1);
	/*	System.out.println("------------------------------");
		
			 WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
			 WishMessageGenerator generator2=ctx.getBean("wmg",WishMessageGenerator.class);
			 System.out.println(generator1.hashCode()+"   "+generator2.hashCode());
			 
			 System.out.println("generator1==generator2"+(generator1==generator2));*/
			 
			 System.out.println("----------------------------");
		/*	 Date d1=ctx.getBean("dt1",Date.class);
			 Date d2=ctx.getBean("dt1",Date.class);
			 System.out.println(d1.hashCode()+"  "+d2.hashCode());
			
			 System.out.println("------------------------------");
				
			 Date d11=ctx.getBean("dt2",Date.class);
			 Date d22=ctx.getBean("dt2",Date.class);
			 System.out.println(d11.hashCode()+"  "+d22.hashCode());*/
		
		/*    Printer p1=ctx.getBean("prn1",Printer.class);
		    Printer p2=ctx.getBean("prn1",Printer.class);
		    System.out.println(p1.hashCode()+"  "+p2.hashCode());
		    
		    
		    Printer p11=ctx.getBean("prn2",Printer.class);
		    Printer p22=ctx.getBean("prn2",Printer.class);
		    System.out.println(p11.hashCode()+"  "+p22.hashCode());*/
		    
		    
		/* Printer p11=ctx.getBean("prn",Printer.class);
		    Printer p22=ctx.getBean("prn",Printer.class);
		    System.out.println(p11.hashCode()+"  "+p22.hashCode());
		 */
			 
		/*	 Printer p=ctx.getBean("printer",Printer.class);
			 System.out.println(p);
			 System.out.println("---------------------------");
			 LocalDateTime  dt=ctx.getBean("createLDT",LocalDateTime.class);
			 System.out.println(dt);
		*/

		//close the container
		ctx.close();
		System.out.println("----------------------------");
		
	
		
		
	}

}
