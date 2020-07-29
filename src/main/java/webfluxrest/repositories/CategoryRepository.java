package webfluxrest.repositories;

import webfluxrest.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 12/23/17.
 */
public interface CategoryRepository extends ReactiveMongoRepository <Category, String>{
}
