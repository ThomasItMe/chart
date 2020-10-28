package com.company.chartexample.service;

import com.company.chartexample.entity.Product;
import com.company.chartexample.entity.RowLabels;

import java.util.List;

public interface ProductService {
    String NAME = "chartexample_ProductService";

    List<Product> getAll();

    List<Product> getProductByRowLabels();


}