package com.lap.lap2.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        // Builder xây dựng đối tượng theo các thuộc tính được cấu hình
        // Builder là cho phép 1 đối tượng được xây dựng từ nhiếu đối tượng khác nhau
        //Bạn muốn tạo ra các đối tượng có nhiều thuộc tính tùy chọn và bạn muốn tránh việc tạo ra nhiều constructor hoặc phương thức tạo với các tham số khác nhau.
        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
