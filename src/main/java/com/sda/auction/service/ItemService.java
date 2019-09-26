package com.sda.auction.service;

import com.sda.auction.dto.ItemForm;
import org.springframework.security.core.userdetails.User;


public interface ItemService {

	void saveItem(ItemForm itemForm);

}
