package Day39_Custom_Class;

public class Car_Objects_Intro {

    // the new keyboard is used to create an instance of a class

    // class name, object name = new keyboard, constructor


    public static void main(String[] args) {


        Car car1 = new Car();
          /*  car1.brand = "Toyota";
            car1.model ="Corolla";
            car1.year= 2020;
            car1.color = "Green";
            car1.mileage = 20000;
            car1.price = 97000.50; */

        car1.setCarInfo("Toyota", "Corolla", 2010, "Red", 17000, 45000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.price);
        System.out.println("================");


        Car car2 = new Car(); // second object, but it has its own copy of instance variable
        // car2 is instance variable that has its own copy of values

           /* car2.brand = "Mercedes";
            car2.model = "G 550";
            car2.year = 2020;
            car2.color = "red"; */

        car2.setCarInfo("BMW", "X5", 2020, "Purple", 97000.50, 23000);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.price);
        System.out.println("=========================================");

        Car car3 = new Car();

        car3.setCarInfo("Porsche", "Cayenne", 2020, "White", 67000.99, 530040);
        car3.getCarInfo();

         Car car4 = new Car();
         car4.setCarInfo("Lamborghini", "Aventador", 2020, "Silver", 99000.50, 51900);
         car4.getCarInfo();

    }
}

