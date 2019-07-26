package io.github.zdp072.mapstruct.converter;

import io.github.zdp072.mapstruct.dataobject.Item;
import io.github.zdp072.mapstruct.dataobject.Sku;
import io.github.zdp072.mapstruct.dto.SkuDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ItemConverter {
    ItemConverter INSTANCE = Mappers.getMapper(ItemConverter.class);

    @Mappings({
            @Mapping(source = "sku.id", target = "skuId"),
            @Mapping(source = "sku.code", target = "skuCode"),
            @Mapping(source = "sku.price", target = "skuPrice"),
            @Mapping(source = "item.id", target = "itemId"),
            @Mapping(source = "item.title", target = "itemName")
    })
    SkuDTO domain2dto(Item item, Sku sku);
}