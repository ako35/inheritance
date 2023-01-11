package inheritance2;

public class Parent {

    public int sayi1;
    public int sayi2;
    public Parent() {
        System.out.println("Parent parametresiz constructor calisti...");
    }

    public Parent(int sayi1) {
        System.out.println("Parent 1 parametreli constructor calisti...");
    }

    public Parent(int sayi1, int sayi2) {
        System.out.println("Parent 2 parametreli constructor calisti...");
    }
}
