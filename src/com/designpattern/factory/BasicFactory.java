package com.designpattern.factory;

public class BasicFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new BasicPrinterButton();
	}

	@Override
	public CheckColor createCheckbox() {
		  return new BasicPrinterColor();
	}

}
