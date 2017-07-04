package com.example.demo;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    @Autowired
    private ItemRepository itemRepository;

    public void showData() {
        for (Item item : itemRepository.findAll()) {
            System.out.println("item: "+item);
        }
    }

}
