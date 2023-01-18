package com.boots.AbstractComponents;

import java.time.Duration;
import java.util.ResourceBundle;

import lombok.Getter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.testng.AssertJUnit.assertTrue;

public class AbstractComponent {

	WebDriver driver;
	private static long DRIVER_WAIT_TIME = 10;
	protected static final Logger LOG = LoggerFactory.getLogger(AbstractComponent.class);

	public AbstractComponent(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}



}
