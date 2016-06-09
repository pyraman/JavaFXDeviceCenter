package com.automation.device.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.automation.device.constances.MobilePlatform;
import com.automation.device.views.ResourceLoader;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

public class DeviceListController extends AnchorPane implements Initializable {
	@FXML ListView<DeviceItemController> listDevices;
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<DeviceItemController> devices = new ArrayList<DeviceItemController>();
		devices.add(new DeviceItemController(MobilePlatform.ANDROID, "Samsung Galaxy J7"));
		devices.add(new DeviceItemController(MobilePlatform.IOS, "iPhone 5S"));
		
		ObservableList<DeviceItemController> observableItems = FXCollections.observableList(devices);
		listDevices.setItems(observableItems);
	}
}
