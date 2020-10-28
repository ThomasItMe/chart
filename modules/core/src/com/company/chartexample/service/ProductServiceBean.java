package com.company.chartexample.service;

import com.company.chartexample.entity.Product;
import com.company.chartexample.entity.RowLabels;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service(ProductService.NAME)
public class ProductServiceBean implements ProductService {

    @Inject
    private DataManager dataManager;

    @Override
    public List<Product> getAll() {
        List<Product> products =  dataManager.loadValue("select e from chartexample_Product e", Product.class).list();
        return products;
    }

    @Override
    public List<Product> getProductByRowLabels() {
        List<Product> products =  dataManager.loadValue("select e from chartexample_Product e order by e.rowLabels", Product.class).list();
        return products;
    }
}