package inheritance2;

public class Child extends Parent{

    public int sayi3;

    public Child() {
        System.out.println("Child parametresiz constructor calisti...");
    }

    public Child(int sayi3) {
        System.out.println("Child 1 parametreli constructor calisti...");
    }

    public static void main(String[] args) {

        Child child=new Child(12);
        Child child1=new Child();
    }
}
