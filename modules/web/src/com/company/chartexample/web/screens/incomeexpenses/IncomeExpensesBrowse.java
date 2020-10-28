package com.company.chartexample.web.screens.incomeexpenses;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.IncomeExpenses;

@UiController("chartexample_IncomeExpenses.browse")
@UiDescriptor("income-expenses-browse.xml")
@LookupComponent("incomeExpensesesTable")
@LoadDataBeforeShow
public class IncomeExpensesBrowse extends StandardLookup<IncomeExpenses> {
}