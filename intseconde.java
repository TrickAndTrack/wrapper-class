class floatone{
  public static void main(String[] args) {
		Integer intObj = new Integer("89745");
	
    byte b = intObj.byteValue();
    System.out.println(b);
// 10001111

    short s = intObj.shortValue();
    System.out.println(s);

    int i = intObj.intValue();
    System.out.println(i);

    float f = intObj.floatValue();
    System.out.println(f);

    double d = intObj.doubleValue();
    System.out.println(d);
  }	
	}
  
