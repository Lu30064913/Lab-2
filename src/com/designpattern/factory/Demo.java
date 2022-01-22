package com.designpattern.factory;

public class Demo {
	 private static Application configureApplication() {
	        Application app;
	        GUIFactory factory;
	        String osName = System.getProperty("os.name").toLowerCase();
	        if (osName.contains("mac")) {
	            factory = new ColorFactory();
	            app = new Application(factory);
	        } else {
	            factory = new BasicFactory();
	            app = new Application(factory);
	        }
	        return app;
	    }

	    public static void main(String[] args) {
	        Application app = configureApplication();
	        app.paint();
	    }
}
