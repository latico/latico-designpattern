package com.latico.designpattern.behavioral.mediator.bean;

/**
 * <PRE>
 *
 * </PRE>
 *
 * @Author: LanDingDong
 * @Date: 2019-01-19 0:34
 * @Version: 1.0
 */
public class House {
    /**
     * 房子价格
     */
    private int price;
    /**
     * 房子大小
     */
    private int size;

    /**
     * 房子格局
     */
    private String structure;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("price=").append(price);
        sb.append(", size=").append(size);
        sb.append(", structure='").append(structure).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }
}
