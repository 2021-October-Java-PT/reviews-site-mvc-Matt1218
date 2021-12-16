package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review tentOne = new Review(1L, "Catalyst 2P", "/images/Catalyst.jpg", "Entry-Level", "The first tent I would like to review is the Marmot Catalyst 2 person. It is a nice entry-level, freestanding, 3 season tent. It comes in at $183.00 at the time of this review. This is a very attractive price for someone who wants to start backpacking/camping but not wanting to spend a few hundred dollars on something that they will only use a couple times a year. It weighs 5 lbs 3 oz and has an area of 32.4 sq. ft. It has plenty of room for 2 people. It even includes the footprint; so at that price, it is a very good value. My friend owns this tent and it has treated him well. He might upgrade in year or so but only for the reason of cutting some pack weight.");
        Review tentTwo = new Review(2L,"Half Dome 2P", "/images/HalfDome.jpg", "Entry-Level", "The second tent I would like to review is the REI Half Dome 2 person. I would also consider this an entry-level tent. It's freestanding and suitable for 3 season use. It weighs 4 lbs 11.5 oz making this about half a pound lighter than the Catalyst 2P. The floor area is 33.75 sq. ft. One nice thing about this tent is that some of the materials used meet the Bluesign criteria. What this means is that some of the materials used are responsibly sourced and the production process is more environmentally friendly. The footprint is included with this tent. The cost comes in at $279.00. I used this tent for my John Muir Trail thru-hike and I honestly have nothing bad to say about it. If I had to pick one thing it would be the weight but that should be expected at that price point.");
        Review tentThree = new Review(3L,"Quarter Dome 2P", "/images/QuarterDome.jpg", "Mid-Level", "The third tent I would like to review is the REI Quarter Dome 2 person. It is similar to the Half Dome but it comes in at half of the weight. It comes in at 2 lbs 14 oz. To cut some of the weight off, they made the tent semi-freestanding, did not include the footprint, and used lighter weight, lower denier nylon for the materials. The square footage of the floor is 28.7 so they also cut some of the internal dimensions down. This tent comes in at $349.00 making this a more expensive tent but they catered it towards a seasoned backpacker who knows they will be using it a lot. One of my friends used this tent while he thru-hiked the Appalachian Trail. It was still going strong after him using it each night for 6 months straight. ");
        Review tentFour = new Review(4L,"Freelite 2P", "/images/Freelight.jpg", "Mid-Level", "The fourth tent I would like to review is the MSR Freelite 2 person. The weight is 2 lbs 15 oz. It is semi-freestanding just like the Quarter Dome. The floor area is 29 sq. ft. They cut corners to save weight on this tent, literally. I used this tent for two backpacking trips before selling it. The foot and head ends of the tent are cut to a very shallow angle. It was to the point of my face almost touching the side if I used a larger pillow. MSR is a quality manufacturer and I understand cutting weight wherever possible but for me, I need a little more luxury to sleep comfortably. The price is $499.95. ");
        Review tentFive = new Review(5L,"Anjan 3P", "/images/Anjan.jpg", "Top-Level", "The last tent I will review is the Hilleberg Anjan 3 person. This is by far the highest level tent that I have a review on. Hilleberg is a swedish company that is known for making expedition-level tents. I could easily write an essay on the company and their tents but I will try to keep this short. The Anjan is a tunnel design tent. This means that it is not free-standing but it will be significantly stronger in high winds. This is technically a 3 season tent but I have used it in all 4 seasons. The waterproof rating on their materials is about five times as much as the other four tents. It comes in at 4 lbs 3 oz which doesn't make it the lightest of the five tents but it is certainly the strongest. The area is 34.4 sq. ft. This is the tent that I personally use for all of my backpacking trips. It costs $785 but I know that I will be protected from the elements for years to come.");

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
