interface interfaceOne{
public void show();
}
interface interfaceTwo{
public void display();
}
class A implements interfaceOne,interfaceTwo{
@Override
public void show(){
System.out.println("show something");
}
@Override
public void display(){
System.out.println("display something");
}
}
public class Test{
public static void main(String[]args){
A a=new A();
a.show();
a.display();
}
}
