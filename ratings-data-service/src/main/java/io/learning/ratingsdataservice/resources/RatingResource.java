package io.learning.ratingsdataservice.resources;

import io.learning.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Mapping("/ratingsdata")
public class RatingResource {
    @GetMapping("/{userId}")
    public Rating getRatings(@PathVariable("userId") String userId ) {
        return new Rating(300, "200");
    }
}
