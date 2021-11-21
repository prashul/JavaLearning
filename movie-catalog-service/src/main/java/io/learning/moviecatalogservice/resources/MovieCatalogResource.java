package io.learning.moviecatalogservice.resources;

import io.learning.moviecatalogservice.models.CatalogItem;
import io.learning.moviecatalogservice.models.Movie;
import io.learning.moviecatalogservice.models.Rating;
import io.learning.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClient;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId)
    {
        // Rest call to the ratings service
        UserRating userRating = webClient.build()
                .get()
                .uri("http://ratings-data-service/ratingsdata/" + userId)
                .retrieve()
                .bodyToMono(UserRating.class)
                .block();

        return userRating.getRatings().stream().map(rating -> {
            //final Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
            final Movie movie = webClient.build()
                    .get()
                    .uri("http://movie-info-service/movies/" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class) // asynchronous communication
                    .block();
            return new CatalogItem(movie.getName(), "Test", rating.getRatingId());
        }).collect(Collectors.toList());
    }
}
