package io.learning.ratingsdataservice.resources;

import io.learning.ratingsdataservice.models.Rating;
import io.learning.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {
    @GetMapping("/{userId}")
    public UserRating getRatings(@PathVariable("userId") String userId ) {
        List<Rating> ratings = Arrays.asList(
                new Rating("4","1234" ),
                new Rating("3","5678" )
        );
        return new UserRating(ratings);
    }
}
