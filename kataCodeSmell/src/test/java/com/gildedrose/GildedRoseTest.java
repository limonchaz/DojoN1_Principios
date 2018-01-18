package com.gildedrose;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class GildedRoseTest {

   // Item[] items = new Item[]{ new Item("Sulfuras, Hand of Ragnaros", 1, 1) };
    Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20), //
            new Item("Aged Brie", 2, 0), //
            new Item("Elixir of the Mongoose", 5, 7), //
            new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
            new Item("Sulfuras, Hand of Ragnaros", -1, 80),
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
            new Item("Conjured Mana Cake", 3, 6) };

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("fixme", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    public void drecrement() {
        GildedRose app = new GildedRose(items);
        
        for (Item item : items) {
            int sellInPrev = item.sellIn - 1;
            int quealityPrev = item.quality - 1;
            
            app.drecrementQualitySellInByOne(item);
            
            assertEquals(sellInPrev, item.sellIn);
            assertEquals(quealityPrev, item.quality);
        }
    }
    
    @Test
    public void decrementarItemSulfuras() {
        GildedRose app = new GildedRose(items);
        
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 0) };
        
        Item item = app.decrementarSellInSulfuras(items[0]);
        
        assertEquals(0, item.sellIn);
    }
    
    @Test
    public void decrementarNoSulfuras() {
        GildedRose app = new GildedRose(items);
        
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        
        Item item = app.decrementarSellInSulfuras(items[0]);
        
        assertNull(item);
    }
}
