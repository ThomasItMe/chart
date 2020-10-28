package com.company.chartexample.web.screens;

import com.company.chartexample.entity.*;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@UiController("chartexample_PivotSampleScreen")
@UiDescriptor("pivot-sample-screen.xml")
public class PivotSampleScreen extends Screen {
    @Inject
    private CollectionContainer<PivotTable> tipsDc;

    @Subscribe
    protected void onInit(InitEvent event) {
        List<PivotTable> items = new ArrayList<>();
        items.add(pivotTables(1, 10000000, 10, Sex.FEMALE, Smoker.NO, Day.FRI, Time.DINNER, 30));
        items.add(pivotTables(1, 10000000, 10, Sex.FEMALE, Smoker.NO, Day.FRI, Time.DINNER, 30));
        items.add(pivotTables(2, 20000000, 20, Sex.FEMALE, Smoker.YES, Day.THU, Time.LUNCH, 23));
        items.add(pivotTables(3, 5000000, 305, Sex.MALE, Smoker.YES, Day.FRI, Time.LUNCH, 35));
        items.add(pivotTables(4, 3000000, 40, Sex.FEMALE, Smoker.NO, Day.MON, Time.DINNER, 34));
        items.add(pivotTables(5, 1000333, 50, Sex.MALE, Smoker.NO, Day.TUE, Time.LUNCH, 43));
        tipsDc.setItems(items);
    }

    private PivotTable pivotTables(int row, double totalBill, double tip, Sex sex, Smoker smoker, Day day, Time time, int size) {
        PivotTable pivotTable = new PivotTable();
        pivotTable.setRow(row);
        pivotTable.setTotalBill(totalBill);
        pivotTable.setTip(tip);
        pivotTable.setSex(sex);
        pivotTable.setSmoker(smoker);
        pivotTable.setDay(day);
        pivotTable.setTime(time);
        pivotTable.setSize(size);
        return pivotTable;
    }
}