package com.automation.device.controllers;

import java.io.IOException;
import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class DeviceListController extends AnchorPane  {
	
	public DeviceListController() {
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("DeviceList.fxml"));
    	fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
	}
}
