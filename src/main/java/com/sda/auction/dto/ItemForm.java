package com.sda.auction.dto;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@ToString
public class ItemForm {

    @NotEmpty(message = "{error.item.name.empty}")
    private String name;

    @NotEmpty(message = "{error.item.description.empty}")
    private String description;

    @Positive(message = "{error.item.startingPrice.empty}")
    private int startingPrice;

    @NotEmpty(message = "{error.item.startingDate.empty}")
    private String startDate;

    @NotEmpty(message = "{error.item.endingDate.empty}")
    private String endDate;

}
