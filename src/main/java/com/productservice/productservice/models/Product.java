package com.productservice.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product extends BaseModel {
    public String title;
    public String description;
    public Long price;
    public String image;
    @ManyToOne
    public Category category;

}
