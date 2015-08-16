package com.dukescript.demo.routing;

import com.dukescript.demo.routing.js.Router;
import net.java.html.json.Model;
import net.java.html.json.Models;
import net.java.html.json.Property;

@Model(className = "Data", targetId="", properties = {
    @Property (name = "page", type = String.class)
})
final class DataModel {
    private static Data ui;
    /**
     * Called when the page is ready.
     */
    static void onPageLoad() throws Exception {
        ui = new Data("page1");
        Models.toRaw(ui);
        Router.registerBinding();
        ui.applyBindings();
    }
}
