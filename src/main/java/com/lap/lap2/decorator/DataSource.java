package com.lap.lap2.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
