package com.company.chartexample.web.screens.twochart;

import com.company.chartexample.entity.CountrySales;
import com.haulmont.charts.gui.amcharts.model.Guide;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.charts.gui.model.JsFunction;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UiController("chartexample_TwoLevelCategoryChart")
@UiDescriptor("two-level-category-chart.xml")
public class TwoLevelCategoryChart extends Screen {

    @Inject
    private SerialChart serialChart;
    @Inject
    private CollectionContainer<CountrySales> countrySalesDc;

    @Subscribe
    private void onInit(InitEvent event) {
        getScreenData().loadAll();

        Map<String, List<CountrySales>> groupedData = groupDataByGuide(countrySalesDc.getItems());
        List<Guide> guides = new ArrayList<>();

        for (Map.Entry<String, List<CountrySales>> entry : groupedData.entrySet()) {
            List<CountrySales> guideData = entry.getValue();
            guides.add(new Guide()
                    .setCategory(guideData.get(0).getCategory())
                    .setToCategory(guideData.get(guideData.size() - 1).getCategory())
                    .setLabel(entry.getKey())
                    .setExpand(true)
                    .setLabelRotation(0)
                    .setTickLength(120));
        }

        serialChart.getCategoryAxis().addGuides(guides.toArray(new Guide[0]));
        serialChart.getCategoryAxis().setLabelFunction(new JsFunction(
                "function(label, item) { return item.dataContext.product; }"
        ));
    }

    private Map<String, List<CountrySales>> groupDataByGuide(List<CountrySales> dataList) {
        Map<String, List<CountrySales>> result = new HashMap<>();
        for (CountrySales data : dataList) {
            String guideKey = data.getCountry();
            List<CountrySales> guideData = result.computeIfAbsent(guideKey, k -> new ArrayList<>());
            guideData.add(data);
        }
        return result;
    }
}