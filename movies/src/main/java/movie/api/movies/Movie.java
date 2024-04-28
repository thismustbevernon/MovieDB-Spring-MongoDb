package movie.api.movies;

//tells us that this class represent each document in the movies collection
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
//data is an annotation from the lombok pluggin that takes care of the getters, setters and  to string
//so that we will not have to define all for the properties one by one
@Data
//constructor for all arguments
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
//    add an Id annotation to let the framework know that it acts as a unique identifier for each movie in the database
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
//    Manual reference relationship - stores only ids of the reviews and the reviews will be in another collection
    @DocumentReference
    private List<Review> reviewIds;

}
