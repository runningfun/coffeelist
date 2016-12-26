package com.runningfun.coffeelist.backend.rest.dto;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Herschbach.Stefan on 26.12.2016.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="coffeegroup")
public class CoffeeGroup {

    private String groupId;
    private String groupName;
    private String groupLocation;
    private String company;
    private List<CoffeeConsumer> coffeeConsumers;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupLocation() {
        return groupLocation;
    }

    public void setGroupLocation(String groupLocation) {
        this.groupLocation = groupLocation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<CoffeeConsumer> getCoffeeConsumers() {
        return coffeeConsumers;
    }

    public void setCoffeeConsumers(List<CoffeeConsumer> coffeeConsumers) {
        this.coffeeConsumers = coffeeConsumers;
    }
}
