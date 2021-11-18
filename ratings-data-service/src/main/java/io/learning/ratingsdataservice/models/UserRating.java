package io.learning.ratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserRating {
    List<Rating> ratings ;
}
