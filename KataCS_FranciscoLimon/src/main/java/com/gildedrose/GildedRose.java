package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            drecrementQualitySellInByOne(items[i]);
//            if (!"Aged Brie".equalsIgnoreCase(items[i].name)
//                    && !"Backstage passes to a TAFKAL80ETC concert".equalsIgnoreCase(items[i].name)) {
//                if (items[i].quality > 0) {
//                    if (!"Sulfuras, Hand of Ragnaros".equalsIgnoreCase(items[i].name)) {
//                        items[i].quality = items[i].quality - 1;
//                    }
//                }
//            } else {
//                if (items[i].quality < 50) {
//                    items[i].quality = items[i].quality + 1;
//
//                    if ("Backstage passes to a TAFKAL80ETC concert".equalsIgnoreCase(items[i].name)) {
//                        if (items[i].sellIn < 11) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//
//                        if (items[i].sellIn < 6) {
//                            if (items[i].quality < 50) {
//                                items[i].quality = items[i].quality + 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//            if (!"Sulfuras, Hand of Ragnaros".equalsIgnoreCase(items[i].name)) {
//                items[i].sellIn = items[i].sellIn - 1;
//            }
//
//            if (items[i].sellIn < 0) {
//                if (!"Aged Brie".equalsIgnoreCase(items[i].name)) {
//                    if (!"Backstage passes to a TAFKAL80ETC concert".equalsIgnoreCase(items[i].name)) {
//                        if (items[i].quality > 0) {
//                            if (!"Sulfuras, Hand of Ragnaros".equalsIgnoreCase(items[i].name)) {
//                                items[i].quality = items[i].quality - 1;
//                            }
//                        }
//                    } else {
//                        items[i].quality = items[i].quality - items[i].quality;
//                    }
//                } else {
//                    if (items[i].quality < 50) {
//                        items[i].quality = items[i].quality + 1;
//                    }
//                }
//            }
        }
    }
    
    public Item drecrementQualitySellInByOne(Item item) {
        if (item.quality > 0) {
            if ("Sulfuras, Hand of Ragnaros".equalsIgnoreCase(item.name)) {
                item.sellIn = item.sellIn - 1;
            } else if ("Conjured".equalsIgnoreCase(item.name)) {
                item.quality = item.quality - 2;
            } else if ("Aged Brie".equalsIgnoreCase(item.name)) {
                if (item.sellIn >= 0) {
                    item.quality = item.quality + 1;
                } else {
                    item.quality = item.quality + 2;
                }
                item.sellIn = item.sellIn - 1;
            } else if ("Backstage passes to a TAFKAL80ETC concert".equalsIgnoreCase(item.name)) {
                if (item.sellIn <= 0) {
                    item.quality = 0;
                } else if (item.quality >= 49 ) {
                    item.quality = 50;
                } else if (item.sellIn < 6 && item.quality < 50) {
                    item.quality = item.quality + 3;
                } else if (item.sellIn < 11 && item.quality < 50) {
                    item.quality = item.quality + 2;
                }
            } else if (item.sellIn < 0) {
                item.sellIn = item.sellIn - 1;
                item.quality = item.quality - 2;
            } else {
                item.sellIn = item.sellIn - 1;
                item.quality = item.quality - 1;
            }
        }
        
        return item;
    }
    
    public Item decrementarSellInSulfuras(Item item) {
        Item it = new Item(item.name, item.sellIn, item.quality);
        
        if ("Sulfuras, Hand of Ragnaros".equalsIgnoreCase(item.name)) {
            item.sellIn = 0;
            it = item;
        } else {
            it = null;
        }
        return it;
    }
    
}
