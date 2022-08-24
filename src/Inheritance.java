class Dog{
    void eat(){
        System.out.println("i am eating");
    }
    void sleep(){
        System.out.println("i am sleeping");
    }
    void bark(){
        System.out.println("i am barking");
    }
}
class Bird extends Dog{
    void fly(){
        System.out.println("i am flying");
    }
        }
public class Inheritance {
    public static void main(String[] args) {
        Bird b=new Bird ();
        b.fly();
        b.sleep();
        b.eat();

    }
}

