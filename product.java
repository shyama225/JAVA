class product{
 int pcode,price;
 String pname;
 public static void main(String args[])
 {
  product pro1 = new product();
  product pro2= new product();
  product pro3= new product();
  pro1.pcode=165738;
  pro1.pname="Chandrika";
  pro1.price=30;
  pro2.pcode=13427;
  pro2.pname="himalaya";
  pro2.price=200;
  pro3.pcode=34754;
  pro3.pname="milkybar";
  pro3.price=50;
  System.out.println("The pname is " +pro1.pname);
  System.out.println("The pcode of " +pro1.pname+ " is " +pro1.pcode);
  System.out.println("The price of "+pro1.pname+" is " +pro1.price);
  System.out.println("The pname  is " +pro2.pname);
  System.out.println("The pcode of "+pro2.pname+ " is " +pro2.pcode);
  System.out.println("The price of "+pro2.pname+ " is " +pro2.price);
  System.out.println("The pname is " +pro3.pname);
  System.out.println("The pcode of "+pro3.pname+" is " +pro3.pcode);
  System.out.println("The price of" +pro3.pname+" is " +pro3.price);
  if(pro1.price < pro2.price && pro1.price < pro3.price)
  {
   System.out.println(pro1.pname+ "has the lowest price");
  }
  else if(pro2.price<pro1.price && pro2.price<pro3.price)
  {
   System.out.println(pro2.pname+ "has the lowest price");
   }
  else
  {
   System.out.println(pro3.pname+ "has the lowest price");
   } 
  }
  }
  
