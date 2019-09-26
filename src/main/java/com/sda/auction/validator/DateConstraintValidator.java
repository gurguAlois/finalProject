package com.sda.auction.validator;


import com.sda.auction.dto.ItemForm;
import com.sda.auction.util.DateParser;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConstraintValidator implements ConstraintValidator<DateConstraint, Object> {

    @Autowired
    private DateParser dateParser;
    private String dateFormat = "yyyy-MM-dd";


    @Override
    public void initialize(DateConstraint constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object obj, ConstraintValidatorContext context) {
        ItemForm item = (ItemForm) obj;

        Date startDate = dateParser.parse(item.getStartDate());
        Date endDate = dateParser.parse(item.getEndDate());

        if(startDate == null || endDate == null) {
            return true;
        }

        Date actualDate = new Date(System.currentTimeMillis());
        actualDate.setTime(0);

        if(startDate.before(actualDate) || endDate.before(startDate)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
                    .addNode("startDate").addConstraintViolation();
            return false;
        }

        return true;
    }
}
