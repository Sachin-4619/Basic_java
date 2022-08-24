package InheritancePackage;

class Brand {
    void name() {
        System.out.println("Nexa");
    }
}
class color extends Brand {
        void nam(){
            System.out.println("black");
        }
}

public class Car {

    public static void main (String[] args){
        color b=new color();
        b.name();
        b.nam();
    }
}
