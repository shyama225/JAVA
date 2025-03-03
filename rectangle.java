class rectangle{
  double length;
  double breadth;
  double area()
  {
   return length*breadth;
  }
  public static void main (String args[])
  {
   rectangle rect1=new rectangle();
   rectangle rect2=new rectangle();
   rect1.length=10;
   rect1.breadth=20;
   rect2.length=5;
   rect2.breadth=10;
   System.out.println("area of first rectangle" +rect1.area());
   System.out.println("area of second rectangle" +rect2.area());
   }
  } 
   
