package marcelo._9.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository  extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
