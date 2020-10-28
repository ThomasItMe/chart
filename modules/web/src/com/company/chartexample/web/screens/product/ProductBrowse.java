package com.company.chartexample.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.Product;

@UiController("chartexample_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
@LoadDataBeforeShow
public class ProductBrowse extends StandardLookup<Product> {
}