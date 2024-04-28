package movie.api.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//Repository contains the APIs for basic CRUD operations, the APIS for pagination, and the APIs for sorting.
//this is where we connect to our mongoDB
//@Repository
//public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
//}




@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    //    optional because value may be null,
//    the default above return movies by id but we have overridden the default to get movies by imdbid
//    the framework automatically knows
//    you can form these based on any properties of your class so long as they are unique
    Optional<Movie>findMovieByImdbId(String imdbId);
}
