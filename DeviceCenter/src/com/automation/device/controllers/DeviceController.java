/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automation.device.controllers;
import java.io.IOException;
import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TabPane;
/**
 *
 * @author quan.hoang
 */

public class DeviceController extends TabPane{
    @FXML
    private ScreenController screenCtrl;
    @FXML
    private AppsController appsCtrl;
    @FXML
    private LogController logCtrl;

    public DeviceController() {
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("Device.fxml"));
		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
	}
}