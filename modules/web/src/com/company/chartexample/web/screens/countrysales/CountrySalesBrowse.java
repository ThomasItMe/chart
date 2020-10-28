package com.company.chartexample.web.screens.countrysales;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.CountrySales;

@UiController("chartexample_CountrySales.browse")
@UiDescriptor("country-sales-browse.xml")
@LookupComponent("countrySalesesTable")
@LoadDataBeforeShow
public class CountrySalesBrowse extends StandardLookup<CountrySales> {
}