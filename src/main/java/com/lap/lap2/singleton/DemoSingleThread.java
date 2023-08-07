package com.lap.lap2.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        //là một mẫu thiết kế sáng tạo, đảm bảo rằng chỉ có một đối tượng thuộc loại này tồn tại và cung cấp một điểm truy cập duy nhất vào đối tượng đó cho bất kỳ mã nào khác
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
