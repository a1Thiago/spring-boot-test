package a1th.dev.springboottest.model.repositories;

import org.springframework.data.repository.CrudRepository;

import a1th.dev.springboottest.model.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
