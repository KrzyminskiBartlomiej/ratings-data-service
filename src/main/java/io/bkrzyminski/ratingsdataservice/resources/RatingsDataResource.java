package io.bkrzyminski.ratingsdataservice.resources;

import io.bkrzyminski.ratingsdataservice.models.Rating;
import io.bkrzyminski.ratingsdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
        return new Rating(movieId, 101);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable String userId) {
        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("22", 21)
        );

        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);
        return userRating;
    }

}
