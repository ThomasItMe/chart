package com.company.chartexample.web.screens.countrysales;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.CountrySales;

@UiController("chartexample_CountrySales.edit")
@UiDescriptor("country-sales-edit.xml")
@EditedEntityContainer("countrySalesDc")
@LoadDataBeforeShow
public class CountrySalesEdit extends StandardEditor<CountrySales> {
}