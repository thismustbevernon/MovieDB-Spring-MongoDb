package movie.api.movies;

//tells us that this applies for every review in the DB
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

//    Since ids are autogenerated we create a review with just the body of the review
    public Review(String body) {
        this.body = body;
    }
}