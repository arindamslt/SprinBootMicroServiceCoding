package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Product;
import com.arindam.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
@Autowired
private ProductService pservice;
@PostMapping("/add")
public ResponseEntity<String> addData(@RequestBody Product ps )
{
	String msg="PRODUCT ADDED SUCCESSFULLY";
	pservice.addData(ps);
	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}
@GetMapping("/fetch")
public ResponseEntity<List<Product>> getData()
{
	List<Product> plist=pservice.getData();
	return new ResponseEntity<List<Product>>(plist,HttpStatus.OK);
}
@DeleteMapping("/del/{id}")
public ResponseEntity<String> deleteData(@PathVariable Long id )
{
	String msg="PRODUCT DELETED SUCCESSFULLY";
	pservice.deleteData(id);
	return new ResponseEntity<String>(msg,HttpStatus.OK);
}
@GetMapping("/fetch/{id}")
public ResponseEntity<Product> getById(@PathVariable Long id) {
	System.out.println("FETCHING FROM DB");
    Product product = pservice.findByPid(id); // This is cached
    return ResponseEntity.ok(product);                    // This is NOT cached
}
}
