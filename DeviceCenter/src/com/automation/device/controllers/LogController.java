/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automation.device.controllers;

import java.io.IOException;

import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author quan.hoang
 */
public class LogController extends AnchorPane  {

    public LogController(){
    	FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("Log.fxml"));
    	fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
    }
}
