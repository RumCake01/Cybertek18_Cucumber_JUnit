package Day39_Custom_Class;

public class Car {
    /*
    model
    brand
    year
    mileage
    color
     */

    // instance variable - each object has its own copy, declared outside the method, outside the block

   Class Car;
    String brand; // this is our instance variable, one attribute of the car class

    String model; // another instance variable

    int year;

    String color;

    double mileage;

    double price;

    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice, double carMileage) {
        // this is our action  setInfo => Instance Method, objects method. It sets the given data of the car.(info ins provided in the () )

        // instance methods belong to the object, can not be used with Static, it wont allow to make several copies.
        // It means there will be only one copy for all the objects.


        //instance means each object has its own copy.

        brand = carBrand;
        model= carModel;
        year = carYear;
        color = carColor;
        price = carPrice;
        mileage = carMileage;
// sets the infor of the car objects

    }
    public void getCarInfo() {
        System.out.println(year + " " + brand+ " " + model+" " + color+" " + mileage + ", $" +price);

        // prints the car info



    /*
    car1: Toyota
    car2: BMW
    car3: Tesla
     */

    }
    public void start (){
        System.out.println(brand + " " +model+" is started");

    }
}


