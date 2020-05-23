/*
 * Copyright 2004-2010 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package sample.service;

import java.util.List;
import org.springframework.stereotype.Service;
import sample.repository.ItemRepository;
import sample.entity.Item;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public boolean isItemInStock(String itemId) {
        Integer i = itemRepository.selectInventoryQuantity(itemId);
        return (i != null && i > 0);
    }

    public Item getItem(String itemId) {
        return itemRepository.selectItem(itemId);
    }

    public List<Item> getItemsByProduct(String productId) {
        return itemRepository.selectItemsByProduct(productId);
    }
}
