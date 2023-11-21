package com.productservice.productservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    public String title;
    public String desc;
    public Long price;
    public String image;
    public Category category;

}
