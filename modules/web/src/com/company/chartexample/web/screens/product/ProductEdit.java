package com.company.chartexample.web.screens.product;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.Product;

@UiController("chartexample_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
@LoadDataBeforeShow
public class ProductEdit extends StandardEditor<Product> {
}