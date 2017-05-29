package com.sonarsource.support;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Ignore;

 public class AppTest {

	 
	@Ignore @Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(true);
	}


    @Ignore("renable when TCKT-1234 is fixed")
    @Test
    public void testDoTheThing2() { 
      // ... 
	}
    
    @Ignore  // renable when TCKT-1234 is fixed
    @Test
    public void testDoTheThing() { 
      int i;
      
      i = 0;
      i++;
      i--;
      if (i==0){    	  
    	  i++;
      }
      
      i = 0;
      i++;
      i--;
      if (i==0){    	  
    	  i++;
      }
	}
    
    
    private void myNewIssueMethod()
    {
    	System.out.println( "Hello World!" );
    	
        for (int i = 0; i <10; i++ ) {
        	  // ...
        		String a = "Let's duplicate something";
        		String b = "22";
        	}

        for (int i = 0; i <10; i++ ) {
	      	  // ...
    			String a = "Let's duplicate something";
    			String b = "22";
	      	}
          

    }
}
