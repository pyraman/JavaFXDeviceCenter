package com.automation.device.controllers;

import java.io.IOException;
import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class ScreenController extends AnchorPane{

	public ScreenController(){
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("Screen.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
	}

}
