package movie.api.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Service annotation is used with classes that provide some business functionalities.
@Service
public class MovieService {
//    Tells the framework to instantiate the class for Us
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
//        findAll() method is defined in the mongoRepository class
        return movieRepository.findAll();
    }
//    let java know that this may return Null using the optional. ie in cases where there is no movie with that id
//    public Optional<Movie> singleMovie(ObjectId id){
//        return movieRepository.findById(id);
//
//    }
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);

    }
}
