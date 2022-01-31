package lesson24;

public class Synchronization {
	
	//Synchronization is all about wait time; There are 3 types of synchronization 
	//1 Implicit wait (Global wait time) 
	
	//Explicit wait overrrides Implicit (global) wait but it applies only for that specific test
	
	
	
	
	//2 WebDriver Wait and it has 2 subbranches such as Explicit wait and Fluent Wait 
	//	Explicit Wait applies for certain elements 
	
	// Fluent Wait almost never used. Fluent wait has extra polling time,in addition to the wait time 
	//it listens in every polling time we provided then sleeps until next polling time, 
	// than 6 than 9. however Implicit and Explicit Wait doesnt have polling time which means it listens 
	// or active during of period of wait time (for ex full 10 sec) 
	

}	// 3 Thread.sleep which is not recommended in soleniem since thread.sleep will wait even our element 
	// available on page 
