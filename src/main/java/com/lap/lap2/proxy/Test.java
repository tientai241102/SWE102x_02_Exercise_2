package com.lap.lap2.proxy;
// Giao diện chung cho tệp hình ảnh
interface ImageFile {
    void display();
}

// Lớp thực tế cho tệp hình ảnh
class RealImageFile implements ImageFile {
    private String filename;

    public RealImageFile(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading image: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}

// Lớp Proxy cho tệp hình ảnh
class ImageFileProxy implements ImageFile {
    private RealImageFile realImage;
    private String filename;

    public ImageFileProxy(String filename) {
        this.filename = filename;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImageFile(filename);
        }
        realImage.display();
    }
}

public class Test {
    public static void main(String[] args) {
        ImageFile image = new ImageFileProxy("image.jpg");

        // Đầu tiên, chỉ tạo proxy, không tải hình ảnh ngay lập tức
        image.display();

        // Lần thứ hai, proxy đã tải và lưu hình ảnh, không cần tải lại
        image.display();
    }
}