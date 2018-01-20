package com.gildedrose.model;

import com.gildedrose.Item;

public class Product extends Item {

    public Product(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    private String name;
    private int sellIn;
    private int quality;
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the sellIn
     */
    public int getSellIn() {
        return sellIn;
    }
    /**
     * @param sellIn the sellIn to set
     */
    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }
    /**
     * @return the quality
     */
    public int getQuality() {
        return quality;
    }
    /**
     * @param quality the quality to set
     */
    public void setQuality(int quality) {
        this.quality = quality;
    }
}
