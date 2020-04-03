package com.payou;

public class Test {

	public static void main(String[] args) {
		Model model = new Model();
		Controller controller = new Controller(model);
		Vue frame = new Vue(controller,model);
	
		frame.getBtn().addActionListener(frame);
		frame.setVisible(true);
		model.addObserver(frame);

	}

}
