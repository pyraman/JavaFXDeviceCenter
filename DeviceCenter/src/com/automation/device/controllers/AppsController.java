/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automation.device.controllers;
import java.io.IOException;

import com.automation.device.views.ResourceLoader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author quan.hoang
 */
public class AppsController extends AnchorPane{
    @FXML
    private void handleAction(ActionEvent event) {
    }

    public AppsController(){
    	FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("Apps.fxml"));
    	fxmlLoader.setRoot(this);
    	fxmlLoader.setController(this);
	    try {
	        fxmlLoader.load();
	    } catch (IOException exception) {
	        throw new RuntimeException(exception);
	    }
    }

}