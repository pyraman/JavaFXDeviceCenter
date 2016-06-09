package com.automation.device.controllers;

import java.io.IOException;

import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class CenterStatusController extends AnchorPane{
	public CenterStatusController() {
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("CenterStatus.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
	}
}
