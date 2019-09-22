package com.sda.auction.service.impl;

import com.sda.auction.dto.ItemForm;
import com.sda.auction.repository.ItemRepository;
import com.sda.auction.service.ItemService;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository itemRepository;


    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void saveItem(ItemForm itemForm) {

    }
}
