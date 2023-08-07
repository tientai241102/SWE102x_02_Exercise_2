package com.lap.lap2.decorator;

public class Demo {
    public static void main(String[] args) {
        //là một mẫu cấu trúc cho phép thêm các hành vi mới vào các đối tượng một cách linh hoạt bằng cách đặt chúng bên trong các đối tượng bao bọc đặc biệt
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
