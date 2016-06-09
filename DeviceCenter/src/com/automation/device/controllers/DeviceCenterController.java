package com.automation.device.controllers;

import java.io.IOException;
import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

public class DeviceCenterController extends BorderPane{
	@FXML private CenterStatusController centerStatusCtrl;
	@FXML private DeviceListController deviceListCtrl;
	@FXML private DeviceController deviceCtrl;
	
	private Parent root = null;
	
	public DeviceCenterController() {
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("DeviceCenter.fxml"));

		fxmlLoader.setController(this);
	    try {
	    	root = fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
	}
	
	public Parent getRoot(){
		return root;
	}
}
