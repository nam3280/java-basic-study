package day2;

public class CarTest
{
    public static void main(String[] args)
    {
        Car bmw = new Car();
        //class instance = new class();

        bmw.model = "BMW528i";
        bmw.distance = 100000;
        bmw.price = 90000000;
        bmw.company = "BMW";
        bmw.type = 'A';
        bmw.auto = true;
        bmw.year = 2010;
        bmw.gasmi = 12.5f;

        System.out.println(bmw.type);
        System.out.println(bmw.auto);

        bmw.setModel("BMW-1000");
        System.out.println(bmw.getModel());

        String model = bmw.getModel();
        System.out.println("현재 모델은 " + model);
    }
}
