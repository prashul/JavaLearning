package io.learning.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogItem {
    private String name;
    private String desc;
    private String rating;
}
