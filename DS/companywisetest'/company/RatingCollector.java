package company;
//Wiseen Technology
 public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }