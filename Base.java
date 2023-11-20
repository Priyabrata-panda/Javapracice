
class Base1 {
    void display() {
        System.out.println("Derived");
    }
}

class Derived extends Base1 {
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
        Base1 base = new Derived();
        base.display();
    }
}