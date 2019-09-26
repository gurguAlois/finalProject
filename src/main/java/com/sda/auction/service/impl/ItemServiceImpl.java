package com.sda.auction.service.impl;

import com.sda.auction.dto.ItemForm;
import com.sda.auction.mapper.ItemMapper;
import com.sda.auction.model.Item;
import com.sda.auction.repository.ItemRepository;
import com.sda.auction.service.ItemService;
import com.sda.auction.util.AuthenticationFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemServiceImpl implements ItemService {

    private final AuthenticationFacade authentication;
    private ItemRepository itemRepository;
    private ItemMapper itemMapper;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, ItemMapper itemMapper, AuthenticationFacade authentication) {
        this.itemRepository = itemRepository;
        this.itemMapper = itemMapper;
        this.authentication = authentication;
    }

    @Override
    public void saveItem(ItemForm itemForm) {
        Item item = itemMapper.map(itemForm);
        item.setUser(authentication.getUser());
        itemRepository.save(item);
    }
}
