package com.automation.device.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.automation.device.constances.MobilePlatform;
import com.automation.device.views.ResourceLoader;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DeviceItemController extends SplitPane implements Initializable{
	
	@FXML private ImageView imgPlatformLogo;
	@FXML private Label lblDeviceId;
	private String platform = "";
	private String deviceName = "";
	
	public DeviceItemController(String szPlatform, String szDeviceName) {
		platform = szPlatform;
		deviceName = szDeviceName;
		
		FXMLLoader fxmlLoader = new FXMLLoader(ResourceLoader.class.getResource("DeviceItem.fxml"));
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
		lblDeviceId.setText(deviceName);
		
		if(platform.equals(MobilePlatform.ANDROID)){
			imgPlatformLogo.setImage(new Image(ResourceLoader.class.getResourceAsStream("android-logo.png")));
		}
		else{
			imgPlatformLogo.setImage(new Image(ResourceLoader.class.getResourceAsStream("ios-logo.png")));
		}
	}
}
