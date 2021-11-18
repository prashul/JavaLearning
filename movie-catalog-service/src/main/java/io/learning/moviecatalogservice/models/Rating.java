package io.learning.moviecatalogservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rating {
    private String ratingId;
    private String movieId;
}
