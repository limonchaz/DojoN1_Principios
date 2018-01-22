package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

    Item[] items = new Item[]{ new Item("Sulfuras, Hand of Ragnaros", 1, 1) };

    @Test
    public void testDecrementByOneBefore() {
        Item[] items = new Item[] { new Item("fixme", 10, 15) };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(9, items[0].sellIn);
        assertEquals(14, items[0].quality);
    }
    
    @Test
    public void testDecrementTwice() {
        Item[] items = new Item[] { new Item("fixme", -1, 15) };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(-2, items[0].sellIn);
        assertEquals(13, items[0].quality);
    }
    
    @Test
    public void testQualityNotNegative() {
        Item[] items = new Item[] { new Item("fixme", 1, 0) };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(0, items[0].sellIn);
        assertEquals(0, items[0].quality);
    }
    
    @Test
    public void testAgedBrieQuality() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 2, 1),
                new Item("Aged Brie", -3, 5)
        };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(2, items[0].quality);
        assertEquals(7, items[1].quality);
    }
    
    @Test
    public void testQualityNeverMoreThanFifty() {
        Item[] items = new Item[] { 
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)
        };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(50, items[0].quality);
    }
    
    @Test
    public void testSulfurasNerverBeSoldOrDecrease() {
        Item[] items = new Item[] { 
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80)
        };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(80, items[0].quality);
        assertEquals(80, items[1].quality);
    }
    
    @Test
    public void testBackstagePassesQuality() {
        Item[] items = new Item[] { 
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 30),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 6),
                new Item("Backstage passes to a TAFKAL80ETC concert", -2, 10),
        };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(32, items[0].quality);
        assertEquals(9, items[1].quality);
        assertEquals(0, items[2].quality);
    }
    
    @Test
    public void testConjured() {
        Item[] items = new Item[] { 
                new Item("Conjured", 5, 25),
                new Item("Conjured", -1, 32)
        };
        
        GildedRose app = new GildedRose(items);

        app.updateItem();
        
        assertEquals(4, items[0].sellIn);
        assertEquals(23, items[0].quality);
        assertEquals(-2, items[1].sellIn);
        assertEquals(28, items[1].quality);
    }
}
