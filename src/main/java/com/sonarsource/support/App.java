package com.sonarsource.support;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
    

        
    }
    
    private void test(){
        
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
    
        for (;;) {  // Noncompliant; end condition omitted
      	  // ...
      	}        
    }
    
    private void myNewIssueMethod()
    {
    	System.out.println( "Hello World!" );
    }
        
    public String myDuplicatedCode(){
    	
    	String b;    			
    	String c;
    	boolean m;
    	
    	
    	b = "br";    			
    	c = "rb";    			
    	m = c.equals(b);
    	
    	b = "br";    			
    	c = "rb";    			
    	m = c.equals(b);    	
    	    	
    	String e, f, g;
    	e = String.valueOf(22);
    	f = String.valueOf(44);
    	
    	
    	return (new Boolean(e)).toString();
    }
    
    public String duplicateMe(){

    	String e, f, g;
    	e = String.valueOf(22);
    	f = String.valueOf(44);
    	    	
    	return e.toLowerCase() + f.toLowerCase();
    }
    
    
}
