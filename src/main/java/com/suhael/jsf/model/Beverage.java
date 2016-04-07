package com.suhael.jsf.model;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class Beverage {
    private String name;
    private Double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void beverageSelected(ValueChangeEvent event) {
        String selectedBeverage = event.getNewValue().toString();
        if ("tea".equals(selectedBeverage)) {
            price = 2.0;
        } else if ("coffee".equals(selectedBeverage)) {
            price = 2.5;
        } else if ("cocacola".equals(selectedBeverage)) {
            price = 3.0;
        }
    }
}