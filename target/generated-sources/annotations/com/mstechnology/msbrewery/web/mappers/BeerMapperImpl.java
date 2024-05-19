package com.mstechnology.msbrewery.web.mappers;

import com.mstechnology.msbrewery.domain.Beer;
import com.mstechnology.msbrewery.web.model.v2.BeerDtoV2;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-18T23:41:29-0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 22 (Oracle Corporation)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Override
    public BeerDtoV2 beerToBeerDtoV2(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDtoV2 beerDtoV2 = new BeerDtoV2();

        return beerDtoV2;
    }

    @Override
    public Beer beerDtoV2ToBeer(BeerDtoV2 beerDtoV2) {
        if ( beerDtoV2 == null ) {
            return null;
        }

        Beer beer = new Beer();

        return beer;
    }
}
