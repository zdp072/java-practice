package io.github.zdp072.test;

import io.github.zdp072.converter.ItemConverter;
import io.github.zdp072.dataobject.Item;
import io.github.zdp072.dataobject.Sku;
import io.github.zdp072.dto.SkuDTO;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * 两个对象复制进一个对象
 */
public class ItemConverterTest {

    @Test
    public void test() {
        Item item = new Item(1L, "iPhone X");
        Sku sku = new Sku(2L, "phone12345", 1000000);
        SkuDTO skuDTO = ItemConverter.INSTANCE.domain2dto(item, sku);
        assertNotNull(skuDTO);
        assertEquals(skuDTO.getSkuId(), sku.getId());
        assertEquals(skuDTO.getSkuCode(), sku.getCode());
        assertEquals(skuDTO.getSkuPrice(), sku.getPrice());
        assertEquals(skuDTO.getItemId(), item.getId());
        assertEquals(skuDTO.getItemName(), item.getTitle());
    }
}