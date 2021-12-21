package org.testing;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	@Test
	public void tc1() {
    Result rs = JUnitCore.runClasses(Sample.class,Testing.class);
    System.out.println("runcount  "+rs.getRunCount());
    System.out.println("Fcount  "+rs.getFailureCount());
    System.out.println("Icount  "+rs.getIgnoreCount());
    System.out.println("RunTime  "+rs.getRunTime());
    
    List<Failure> list = rs.getFailures();
    for (Failure x : list) {
    	System.out.println(x);
		
    	
	}
	}

}
