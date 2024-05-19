package com.mstechnology.msbrewery.web.mappers;

import com.mstechnology.msbrewery.domain.Beer;
import com.mstechnology.msbrewery.web.model.v2.BeerDtoV2;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDtoV2 beerToBeerDtoV2(Beer beer);
    Beer beerDtoV2ToBeer(BeerDtoV2 beerDtoV2);
}
