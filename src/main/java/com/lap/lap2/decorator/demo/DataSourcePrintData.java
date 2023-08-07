package com.lap.lap2.decorator.demo;

public class DataSourcePrintData implements DataSource{
    DataSource wrappee;
    DataSourcePrintData (DataSource source){
        this.wrappee = source;
    }
    @Override
    public void print() {
        wrappee.print();
    }
}
