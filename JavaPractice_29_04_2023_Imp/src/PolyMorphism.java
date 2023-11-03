public class PolyMorphism {
    public static void main(String[] args) {
        A a = new B();
        a.x();
        A b = new A();
        b.y();
    }

}

class A {
    public void x() {
        System.out.println("My Name is Sai");
    }
    public void y() {
        System.out.println("I am a Functional QA");
    }

}


class B extends A {
    public void x() {
        System.out.println("My Name is Sai Sathwik");
    }
    public void y() {
        System.out.println("I am an automation Engineer");
    }
}