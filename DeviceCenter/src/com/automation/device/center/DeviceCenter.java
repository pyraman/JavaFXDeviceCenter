/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.automation.device.center;

import java.io.IOException;

import com.automation.device.views.ResourceLoader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author quan.hoang
 */
public class DeviceCenter extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
    	
    	Parent root = FXMLLoader.load(ResourceLoader.class.getResource("DeviceCenter.fxml"));
    
        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setTitle("Device Center");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
