package a1th.dev.springboottest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import a1th.dev.springboottest.model.entities.Product;
import a1th.dev.springboottest.model.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @PostMapping
  public @ResponseBody Product newProduct(@RequestParam String name) {
    Product product = new Product(name);

    productRepository.save(product);

    return product;
  }
};
