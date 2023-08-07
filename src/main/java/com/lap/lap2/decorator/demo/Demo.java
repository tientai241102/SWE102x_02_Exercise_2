package com.lap.lap2.decorator.demo;

public class Demo {
    public static void main(String[] args) {
        DataSourcePrintData dataSourcePrintData = new DataSourcePrintData(new DataSourcePrint());
        dataSourcePrintData.print();
    }
}
