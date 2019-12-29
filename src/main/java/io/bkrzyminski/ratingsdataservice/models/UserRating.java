package io.bkrzyminski.ratingsdataservice.models;

import java.util.List;

public class UserRating {

    public UserRating() {}

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    private List<Rating> ratings;
}
