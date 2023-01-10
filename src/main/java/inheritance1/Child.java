package inheritance1;

public class Child extends Parent{

    Child(){
        System.out.println("Child class parametresiz constructor");
    }

    Child(int sayi){
        super(sayi);
        System.out.println(super.sayi);
        System.out.println("Child class 1 parametreli constructor");
    }

    Child(int sayi1, int sayi2){
        super(sayi1,sayi2);
        System.out.println("Child class 2 parametreli constructor");
    }
    public static void main(String[] args) {

        Child child=new Child();

        Child child2=new Child(3,6);

        Child child3=new Child(2);
    }
}
