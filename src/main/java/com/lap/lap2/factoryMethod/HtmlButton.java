package com.lap.lap2.factoryMethod;

import com.lap.lap2.builder.Builder;

public class HtmlButton  implements Button {
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
