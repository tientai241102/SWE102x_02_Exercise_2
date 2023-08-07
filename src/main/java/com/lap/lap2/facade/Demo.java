package com.lap.lap2.facade;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        //Cung cấp giao diện đơn giản hóa cho thư viện, khung hoặc bất kỳ tập hợp lớp phức tạp nào khác.
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
