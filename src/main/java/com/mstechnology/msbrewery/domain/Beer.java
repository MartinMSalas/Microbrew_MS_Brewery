package com.mstechnology.msbrewery.domain;

import com.mstechnology.msbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer {
    @Id
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;


}
