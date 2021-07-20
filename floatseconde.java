class floatone{
  public static void main(String[] args) {
		Float myNum = new Float(1.23);  
		
	  int intVal = myNum.intValue();
      System.out.println(intVal);
	  
      byte byteVal = myNum.byteValue();  // i didnt understand this form myNum.byteValue();
      System.out.println(byteVal);
	  
      short shortVal = myNum.shortValue();
      System.out.println(shortVal);
	  
      float floatVal = myNum.floatValue();
      System.out.println(floatVal);
	  
      double doubleVal = myNum.doubleValue();
      System.out.println(doubleVal);
	}
  
}