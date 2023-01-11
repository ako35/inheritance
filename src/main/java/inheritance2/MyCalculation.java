package inheritance2;

public class MyCalculation extends Calculation{

    public void carpma(int x, int y){
        System.out.println("1");
        super.toplama(a,b);
        super.cikarma(a,b);
        z=x*y;
        System.out.println("Verilen sayilarin carpimi: "+z);
    }

    public void bolme(int x, int y){
        System.out.println(super.buyukSayi);
        z=x/y;
        System.out.println("Verilen sayilarin bolumu: "+z);
    }

    public static void main(String[] args) {

//        Calculation calculation=new Calculation();
//        calculation.toplama(5,7);
//        calculation.cikarma(10,7);

        MyCalculation demo=new MyCalculation();
        demo.toplama(a,b);
        demo.cikarma(a,b);

        System.out.println();

        demo.carpma(a,b);
        demo.bolme(a,b);

        System.out.println();
        System.out.println(demo.buyukSayi);

    }
}
