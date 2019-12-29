package io.bkrzyminski.ratingsdataservice.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Model class
 *
 * @author bkrzyminski
 */
@Data
@NoArgsConstructor
public class UserRating {
    private List<Rating> ratings;
}
