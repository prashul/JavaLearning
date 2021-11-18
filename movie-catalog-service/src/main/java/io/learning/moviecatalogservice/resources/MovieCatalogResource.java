package io.learning.moviecatalogservice.resources;

import io.learning.moviecatalogservice.models.CatalogItem;
import io.learning.moviecatalogservice.models.Movie;
import io.learning.moviecatalogservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
    {
        // Rest call to the ratings service
        List<Rating> ratings = Arrays.asList(
                new Rating("4","1234" ),
                new Rating("3","5678" )
        );

        return ratings.stream().map(rating -> {
            final Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
            return new CatalogItem(movie.getName(), "Test", rating.getRatingId());
        }).collect(Collectors.toList());
    }
}
