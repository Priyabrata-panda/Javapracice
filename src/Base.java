package src;

class Base3 {
    void display() {
        System.out.println("src.Derived");
    }
}

class Derived extends Base3 {
    void display() {
        System.out.println("src.Base");
    }
}
class Raka extends Derived {
    void display() {
        System.out.println("src.Raka");
    }
}


public class Base{
    public static void main(String[] args) {
        Base3 base = new Derived();
        base.display();
    }
}
