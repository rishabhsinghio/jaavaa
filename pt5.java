class Car{
    String name;
    String cars;
    int year;

    void printMessage(){
        System.out.print("Hi! My name is "+ name + " and i drive this "+ cars + " for last "+ year + " years and i love this.");
    }
}

public class pt5{
    public static void main(String[]args){
        Car brand = new Car();

        brand.name = "Rishabh";
        brand.cars = "Tata Harrier";
        brand.year = 4;

        brand.printMessage();
    }
}