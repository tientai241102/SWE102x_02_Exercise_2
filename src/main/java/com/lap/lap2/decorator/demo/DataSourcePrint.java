package com.lap.lap2.decorator.demo;

public class DataSourcePrint implements DataSource{
    @Override
    public void print() {
        System.out.println("data");
    }
}
