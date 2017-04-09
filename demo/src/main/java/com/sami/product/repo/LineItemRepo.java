package com.sami.product.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sami.product.domain.LineItem;

@RestResource(path = "items", rel = "item")

public interface LineItemRepo extends CrudRepository<LineItem, Long> {

}
