package com.company.chartexample.web.screens.chartproduct;

import com.company.chartexample.entity.Product;
import com.company.chartexample.entity.RowLabels;
import com.company.chartexample.service.ProductService;
import com.haulmont.charts.gui.amcharts.model.Guide;
import com.haulmont.charts.gui.components.charts.SerialChart;
import com.haulmont.charts.gui.model.JsFunction;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.screen.*;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UiController("chartexample_ProductChart")
@UiDescriptor("product-chart.xml")
public class ProductChart extends Screen {

    @Inject
    private SerialChart serialChart;
    @Inject
    private CollectionContainer<Product> countrySalesDc;
    @Inject
    private ProductService productService;

    @Subscribe
    public void onInit(InitEvent event) {
        getScreenData().loadAll();
        countrySalesDc.setItems(productService.getProductByRowLabels());

        Map<String, List<Product> > groupedData = groupDataByGuide(countrySalesDc.getItems());
        List<Guide> guides = new ArrayList<>();

        for (Map.Entry<String, List<Product>> entry : groupedData.entrySet()) {
            List<Product> guideData = entry.getValue();
            guides.add(new Guide()
                     .setCategory(guideData.get(0).getRowLabels().name())
                     .setToCategory(guideData.get(guideData.size() - 1).getRowLabels().name())
                     .setLabel(entry.getKey())
                     .setExpand(true)
                    .setLabelRotation(0)
                    .setTickLength(120));
        }
        serialChart.getCategoryAxis().addGuides(guides.toArray(new Guide[0]));
        serialChart.getCategoryAxis().setLabelFunction(new JsFunction(
                "function(label, item) { return item.dataContext.rowLabels; }"
        ));
    }

    private Map<String, List<Product>> groupDataByGuide(List<Product> dataList) {
        Map<String, List<Product>> result = new HashMap<>();
        for (Product data : dataList) {
            String guideKey = data.getRowLabels().name();
            List<Product> guideData = result.computeIfAbsent(guideKey, k -> new ArrayList<>());
            guideData.add(data);
        }
        return result;
    }

}