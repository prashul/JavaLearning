package io.learning.moviecatalogservice.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserRating {
    List<Rating> ratings ;
}
