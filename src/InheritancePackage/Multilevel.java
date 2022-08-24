package InheritancePackage;
class Animal{
    void name(){
        System.out.println("Dog");
    }
}
class eat extends Animal{
    void food(){
        System.out.println("rice");
    }
}
class weight extends eat {
    void gram(){
        System.out.println("two");
    }
}
class time extends weight{
    void clock(){
        System.out.println("three");

    }
}

public class Multilevel {
    public static void main(String[] args){
        time t=new time();
        t.clock();
        t.food();
        t.name();
        t.gram();
        }
    }


