//Aditya Sarode

//3b. Build a Java class representing a 'Car' with attributes like model, year, and methods to display information.


class Car {
    String model;
    int year;

    void display() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car();
        Car c2 = new Car();
        c.model = "Honda City";
        c.year = 2022;
        c2.model = "BMW M5";
        c2.year = 2023;
        c.display();
        c2.display();
    }
}
