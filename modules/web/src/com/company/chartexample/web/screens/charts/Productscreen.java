package com.company.chartexample.web.screens.charts;

import com.company.chartexample.entity.Product;
import com.company.chartexample.entity.RowLabels;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("chartexample_Productscreen")
@UiDescriptor("productScreen.xml")
public class Productscreen extends Screen {

    @Inject
    private DataManager dataManager;

    @Inject
    private CollectionContainer<Product> tipsDc;

    @Subscribe
    public void onInit(InitEvent event) {
        List<Product> products = new ArrayList<>();
        products.add(products(1, RowLabels.CIMB, 2, 3));
        products.add(products(2, RowLabels.DBS, 2, 4));
        products.add(products(3, RowLabels.HKVB, 3, 4));
        products.add(products(4, RowLabels.OCBC, 3, 2));
        products.add(products(5, RowLabels.RHB, 3, 3));
        products.add(products(6, RowLabels.TPBANK, 3, 3));
        products.add(products(7, RowLabels.UOB, 2, 2));
        tipsDc.setItems(products);

    }


    private Product products(int row, RowLabels rowLabels, int revolving, int termLoan) {
        Product product = dataManager.create(Product.class);
        product.setRowLabels(rowLabels);
        product.setRevolving(revolving);
        product.setTermLoan(termLoan);
        return product;
    }
}