package com.sda.auction.dto;

import com.sda.auction.validator.DateConstraint;
import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import java.util.Date;

@Data
@ToString
@DateConstraint(message = "Please insert a valid date")
public class ItemForm {

    @NotEmpty(message = "{error.item.name.empty}")
    private String name;

    @NotEmpty(message = "{error.item.description.empty}")
    private String description;

    @Positive(message = "{error.item.startingPrice.positive}")
    private int startingPrice;

    @NotEmpty(message = "{error.item.startingDate.empty}")

    private String startDate;


    @NotEmpty(message = "{error.item.endingDate.empty}")
    private String endDate;

}
