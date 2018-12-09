package com.financialDashboard.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="cats")
public class Cats implements Serializable {

    @Id
    @Column(name = "type")
    public  int type;

    @Column(name = "weight")
    public BigDecimal weight;

    @Column(name = "birthDate")
    public Date birthdate;

    @Column(name="color")
    public String color;

    @Column(name="sex")
    public  String sex;


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(Date birthData) {
        this.birthdate = birthData;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
