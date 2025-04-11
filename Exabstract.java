abstract class Animal{
abstract void sound();
void eat(){
System.out.println("eating....");
}
}
class dog extends Animal{
void sound(){
System.out.println("bark");
}
}
public class  Exabstract{
public static void main(String[]args){
dog d=new dog();
d.sound();
d.eat();
}
}

