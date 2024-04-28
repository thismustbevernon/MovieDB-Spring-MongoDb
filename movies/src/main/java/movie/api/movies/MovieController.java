package movie.api.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//controller - java classes responsible for handling incoming HTTP requests and returning an appropriate response
@RestController
//'@RequestMapping' is more general and versatile, allowing you to map methods to various HTTP methods,
// while '@GetMappling' is a specific shortcut for handling GET requests

@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
//    Return a response entity
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
//      HttpStatus.Ok means success
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

//    get single movie
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Movie>>getSingleMovie(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(id),HttpStatus.OK);
//
//    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>>getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId),HttpStatus.OK);

    }
}
