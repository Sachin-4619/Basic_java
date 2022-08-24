package InheritancePackage;
class student{
    void name(){
        System.out.println("Govind");
    }
}
class arts extends student{
    void subject(){
        System.out.println("history");
    }
}
class science extends student{
    void percent(){
        System.out.println("80");
    }
}
class commerce extends student{
    void number(){
        System.out.println("87");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        commerce c=new commerce();
        science  s=new science();
        arts a =new arts();
        c.name();
        s.name();
        a.name();
        c.number();
        s.percent();
        a.subject();

    }
}
