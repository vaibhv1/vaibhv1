package InnerClasses;
abstract class Person{
    abstract void eat();
}
public class Program2 {
    public static void main(String[] args)
    {
        Person p = new Person()
        {
          void eat()
          {
              System.out.println("Eat Fruits");
          }
        };
        p.eat();
    }
}
