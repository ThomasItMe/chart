package com.company.chartexample.web.screens.incomeexpenses;

import com.haulmont.cuba.gui.screen.*;
import com.company.chartexample.entity.IncomeExpenses;

@UiController("chartexample_IncomeExpenses.edit")
@UiDescriptor("income-expenses-edit.xml")
@EditedEntityContainer("incomeExpensesDc")
@LoadDataBeforeShow
public class IncomeExpensesEdit extends StandardEditor<IncomeExpenses> {
}