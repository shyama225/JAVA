class Person{
String name;
int phone;
public void showaddress(){
System.out.println("Name:"+name);
System.out.println("Phone:" +phone);
}
}
class Teachers extends Person{}
class Students extends Person{}
class Staff extends Person{}
public class School{
public static void main(String[] args){
Teachers t1=new Teachers();
t1.name="john";
t1.phone=123456789;
t1.showaddress();
System.out.println("..................");
Students st1=new Students();
st1.name="annie";
st1.phone=369852147;
st1.showaddress();
System.out.println("..................");
Staff s1=new Staff();
s1.name="niya";
s1.phone=456123987;
s1.showaddress();
}}
