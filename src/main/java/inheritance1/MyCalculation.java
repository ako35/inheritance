package inheritance1;

public class MyCalculation extends Calculation{

    public static void main(String[] args) {

//        Calculation calculation=new Calculation();
//        calculation.toplama(10,5);
//        calculation.cikarma(20,10);

        MyCalculation calculation2=new MyCalculation();
        calculation2.toplama(a,b);
        calculation2.cikarma(a,b);

        System.out.println();

        calculation2.bolme(a,b);
        calculation2.carpma(a,b);

        System.out.println(buyukSayi);

    }

    public void carpma(int x,int y){
        z=x*y;
        System.out.println("Verilen sayilarin carpimi: "+z);
        super.cikarma(a,b);
        super.toplama(a,b);
    }

    public void bolme(int x,int y){
        z=x/y;
        System.out.println("Verilen sayilarin bolumu: "+z);
        System.out.println(buyukSayi);
        System.out.println(super.buyukSayi);
    }
}
