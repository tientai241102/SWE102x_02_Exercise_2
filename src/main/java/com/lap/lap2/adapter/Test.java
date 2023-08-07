package com.lap.lap2.adapter;

// Giao diện của thư viện hình ảnh cũ
interface OldImageLibrary {
    void displayOldImage(String filename);
}

// Lớp thư viện hình ảnh cũ
class LegacyImageLibrary implements OldImageLibrary {
    @Override
    public void displayOldImage(String filename) {
        System.out.println("Displaying old image: " + filename);
    }
}

// Giao diện mới cho ứng dụng
interface ImageViewer {
    void displayImage(String filename);
}

// Adapter để chuyển đổi giao diện của thư viện cũ thành giao diện mới
class ImageAdapter implements ImageViewer {
    private OldImageLibrary oldImageLibrary;

    public ImageAdapter(OldImageLibrary oldImageLibrary) {
        this.oldImageLibrary = oldImageLibrary;
    }

    @Override
    public void displayImage(String filename) {
        oldImageLibrary.displayOldImage(filename);
    }
}

// Ứng dụng mới sử dụng giao diện mới
class NewImageViewer implements ImageViewer {
    @Override
    public void displayImage(String filename) {
        System.out.println("Displaying new image: " + filename);
    }
}

public class Test {
    public static void main(String[] args) {
        // Tạo lớp thư viện hình ảnh cũ
        OldImageLibrary oldImageLibrary = new LegacyImageLibrary();

        // Sử dụng adapter để tích hợp thư viện cũ vào ứng dụng mới
        ImageViewer adapter = new ImageAdapter(oldImageLibrary);

        // Sử dụng ứng dụng mới để hiển thị hình ảnh
        adapter.displayImage("image.jpg");

        // Sử dụng ứng dụng mới để hiển thị hình ảnh theo giao diện mới
        ImageViewer newImageViewer = new NewImageViewer();
        newImageViewer.displayImage("image.jpg");
    }
}
