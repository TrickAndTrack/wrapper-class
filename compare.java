        //Convert Java Boolean object to boolean primitive example

public static void main(String[] args) {
Boolean blnObj = new Boolean("true");
boolean b = blnObj. booleanValue();
System. out. println(b);


class BooleanObj{
	public static void main(String[] args) {
        Boolean b= new Boolean("true");
        boolean bb = b;
        System.out.println(bb);
		
	}}

	// Convert Java String Object to Boolean Object
	
public class StringToBooleanExample{  
public static void main(String args[]){  
String s1="true";  
 
boolean b1=Boolean.parseBoolean(s1);  
  
System.out.println(b1);    
}
}  	

class BooleanObj{
	public static void main(String[] args) {
   
        boolean b = false;
     
        Boolean bb = b;
        System.out.println(bb);
		
	}	

}


	// Convert Java boolean Primitive to Boolean object
	
class BooleanPrimToBooleanObj {
	 
  public static void main(String[] args) {
     boolean bvar = true;

     Boolean bObj = new Boolean(bvar);
     System.out.println(bObj);
	   
     Boolean bObj2 = Boolean.valueOf(bvar);
     System.out.println(bObj2);
  }
}	
	
	// Convert java Boolean object to String object Example
	
	
	public class BooleanToStringExample1{
public static void main(String args[]){
boolean b1=true;

String s1=String.valueOf(b1);

System.out.println(s1);




