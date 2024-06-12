package marcelo._9.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository  extends MongoRepository<Movie, ObjectId> {
}
