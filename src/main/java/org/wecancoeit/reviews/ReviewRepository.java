package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review tentOne = new Review(1L, "PlaceholderTitle", "/imageURL", "reviewCategory", "content");
        Review tentTwo = new Review(2L,"PlaceholderTitle", "/imageURL", "reviewCategory", "content");
        Review tentThree = new Review(3L,"PlaceholderTitle", "/imageURL", "reviewCategory", "content");
        Review tentFour = new Review(4L,"PlaceholderTitle", "/imageURL", "reviewCategory", "content");
        Review tentFive = new Review(5L,"PlaceholderTitle", "/imageURL", "reviewCategory", "content");

        reviewsList.put(tentOne.getId(),tentOne);
        reviewsList.put(tentTwo.getId(),tentTwo);
        reviewsList.put(tentThree.getId(),tentThree);
        reviewsList.put(tentFour.getId(),tentFour);
        reviewsList.put(tentFive.getId(),tentFive);
    }

    public Review findOne(long id){
        return reviewsList.get(id);
    }

    public Collection<Review> findAll(){
        return reviewsList.values();
    }



}
