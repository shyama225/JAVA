class mobile{
String brand;
int price;
static String name;
public void show(){
System.out.println(brand+":"+name+":"+price);
}
}
public class demo{
public static void main(String[]args){
mobile obj1=new mobile();
obj1.brand="orange";
obj1.price=1500;
mobile.name="smart phone";
mobile obj2=new mobile();
obj2.brand="samsung";
obj2.price=2000;
mobile.name="phone";
obj1.show();
obj2.show();
}
}
