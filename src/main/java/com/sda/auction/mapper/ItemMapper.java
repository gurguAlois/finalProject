package com.sda.auction.mapper;

import com.sda.auction.dto.ItemForm;
import com.sda.auction.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ItemMapper {

    private String dateFormat = "dd-MM-yyyy";

    private Item item;

    public ItemMapper(){

    }


    public Item map(ItemForm itemForm) {
        Item item = new Item();
        item.setName(itemForm.getName());
        item.setDescription(itemForm.getDescription());
        item.setStartingPrice(itemForm.getStartingPrice());

        Date startDate = this.dateConvert(itemForm.getStartDate());
        Date endDate = this.dateConvert(itemForm.getEndDate());

        item.setStartDate(startDate);
        item.setEndDate(endDate);

        return item;
    }


    public Date dateConvert(String stringDate) {
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
        try {

            Date date = formatter.parse(stringDate);
            return date;

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
