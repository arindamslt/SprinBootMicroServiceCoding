package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.arindam.model.Product;
import com.arindam.repo.ProductRepo;

@Service
public class ProductService {
	@Autowired
private ProductRepo prepo;
	public void addData(Product p)
	{
		prepo.save(p);
	}
	public List<Product> getData()
	{
		return prepo.findAll();
	}
	@CacheEvict(value = "product", key = "#id")
    public void deleteData(Long id)
    {
    	Product p=prepo.findById(id).orElse(null);
    	if(p!=null)
    	{
    		prepo.delete(p);
    	}
    }
    @Cacheable(value = "product",key="#id")
    public Product findByPid(Long id)
    {
    	System.out.println("Fetching from DB for ID: " + id);
    	return prepo.findById(id).orElse(null);
    }
}
