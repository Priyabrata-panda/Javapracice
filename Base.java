
class Base3 {
    void display() {
        System.out.println("Derived");
    }
}

class Derived extends Base3 {
    void display() {
        System.out.println("Base");
    }
}
class Raka extends Derived {
    void display() {
        System.out.println("Raka");
    }
}


public class Base{
    public static void main(String[] args) {
        Base3 base = new Derived();
        base.display();
    }
}
