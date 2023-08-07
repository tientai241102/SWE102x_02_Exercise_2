package com.lap.lap2.abstractFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        //AbstractFactory xây dựng các đối tượng với chức năng từ đầu
        //Nhưng thuộc tính của đối tượng đều được xậy dựng theo 1 chuẩn từ đầu và các đổi tưởng mới sẽ impl lại
        // Abstract Factory tập trung vào việc tạo ra một "xưởng sản xuất" (factory) chứa nhiều đối tượng có liên quan đến một chủ đề cụ thể.
        // AbstractFactory sử dụng với các đối tượng có cùng thuộc tính
        //Bạn muốn tạo ra các đối tượng có liên quan hoặc tương thích với nhau và muốn che giấu cách tạo đối tượng cụ thể khỏi mã nguồn sử dụng.
        Application app = configureApplication();
        app.paint();
    }
}
