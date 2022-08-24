class Lion {
    void eat() {
        System.out.println("i am eating");
    }

    void sleep() {
        System.out.println("i am sleeping");
    }

    void bath() {
        System.out.println("i am bathing");
    }
}
class Cat extends Lion {
    void sing() {
        System.out.println("miauu");
    }
}
class Rat extends Cat{
    void run(){
        System.out.println("i ma running");
    }
}
public class Multilevel {
    public static void main(String[] args) {
        Rat r=new Rat();
        r.run();
        r.eat();
        r.sing();
        r.bath();
    }
}