package com.runningfun.coffeelist.backend.rest.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by Herschbach.Stefan on 26.12.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="coffeeconsumer")
public class CoffeeConsumer {

    private String coffeeConsumerId;
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private int totalCoffee;
    private int paidCoffee;
    private Date lastCoffee;
    private boolean isCoffeeMachineManager;

    public String getId() {
        return coffeeConsumerId;
    }

    public void setId(String id) {
        this.coffeeConsumerId = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getTotalCoffee() {
        return totalCoffee;
    }

    public void setTotalCoffee(int totalCoffee) {
        this.totalCoffee = totalCoffee;
    }

    public int getPaidCoffee() {
        return paidCoffee;
    }

    public void setPaidCoffee(int paidCoffee) {
        this.paidCoffee = paidCoffee;
    }

    public Date getLastCoffee() {
        return lastCoffee;
    }

    public void setLastCoffee(Date lastCoffee) {
        this.lastCoffee = lastCoffee;
    }

    public boolean isCoffeeMachineManager() {
        return isCoffeeMachineManager;
    }

    public void setCoffeeMachineManager(boolean coffeeMachineManager) {
        isCoffeeMachineManager = coffeeMachineManager;
    }
}
