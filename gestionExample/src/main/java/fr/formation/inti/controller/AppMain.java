package fr.formation.inti.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.formation.inti.config.AppConfiguration;
import fr.formation.inti.service.EmployeeService;
import fr.formation.inti.service.IEmployeeService;

public class AppMain {
	private final static Log log = LogFactory.getLog(AppMain.class);
	
	public static void main(String[] args) {


		// Creating a Context Application object by reading
	       // the configuration of the 'AppConfiguration' class.
		   ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	       IEmployeeService service = context.getBean("employeeService",EmployeeService.class);
	       log.info("------------- Bean service "+service);
	       
	       service.findAll();
	       
	       context.close();
	}

}
