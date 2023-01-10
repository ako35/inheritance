package inheritance1;

public class Parent {

    public  int sayi=12;
    protected Parent(){
        System.out.println("Parent parametresiz constructor calisti.");
    }

    public Parent(int sayi1, int sayi2){
        System.out.println("Parent 2 parametreli constructor calisti.");
    }

    public Parent(int sayi3){
        System.out.println("Parent 1 parametreli constructor calisti.");
    }
}
