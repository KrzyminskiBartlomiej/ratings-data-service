package io.bkrzyminski.ratingsdataservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Model class
 *
 * @author bkrzyminski
 */
@Data
@AllArgsConstructor
public class Rating {
    private String movieId;
    private int rating;
}
