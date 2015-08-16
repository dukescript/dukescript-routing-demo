package com.dukescript.demo.routing.js;

import net.java.html.js.JavaScriptBody;
import net.java.html.js.JavaScriptResource;

@JavaScriptResource(value = "registerRouter.js")
public final class Router {

    private Router() {
    }

    @JavaScriptBody(
            args = {}, body
            = ""
    )
    public static native String registerBinding();
}
