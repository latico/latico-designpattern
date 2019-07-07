package com.latico.designpattern.creational.prototype.personprototype;

/**
 * <PRE>
 * 原型
 * </PRE>
 * @Author: latico
 * @Date: 2019-01-14 17:49:28
 * @Version: 1.0
 */
public abstract class PersonPrototype implements Cloneable {

    private String id;
    private String name;
    private String country;
    private String city;
    /**
     * 做某事
     * @param something
     */
    public abstract void doSomething(String something);

    /**
     * 复写，同时把方法改成public修饰，返回对象也进行强转
     * @return
     */
    @Override
    public PersonPrototype clone(){
        try {
            return (PersonPrototype)super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonPrototype{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
