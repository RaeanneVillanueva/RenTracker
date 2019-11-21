import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class RenTrackingController {

	private MainGUI mainGUI;
	private DetailsGUI detailsGUI;
	public RenTrackingController(MainGUI mainGUI) {

		this.mainGUI = mainGUI;
		detailsGUI = new DetailsGUI();
		
		mainGUI.btnSecondFloorListener(new ListenerForBtnSecondFloor());
		mainGUI.btnThirdFloorListener(new ListenerForBtnThirdFloor());
		mainGUI.btnFourthFloorListener(new ListenerForBtnFourthFloor());
		mainGUI.btnCommercialListener(new ListenerForBtnCommercial());
		mainGUI.btnParkingListener(new ListenerForBtnParking());
		mainGUI.addBtnActionListeners2ndFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListeners3rdFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListeners4thFloor(new ListenerForUnitButtons());
		
		detailsGUI.btnSaveListener(new ListenerForBtnSave());
		detailsGUI.btnCancelListener(new ListenerForBtnCancel());
		
		
	}
	
	
	class ListenerForBtnSecondFloor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainGUI.getLayout().show(mainGUI.getCardContainer(), "Second");
		}
	}
	
	class ListenerForBtnThirdFloor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainGUI.getLayout().show(mainGUI.getCardContainer(), "Third");
		}
	}
	
	class ListenerForBtnFourthFloor implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainGUI.getLayout().show(mainGUI.getCardContainer(), "Fourth");
		}
	}
	
	class ListenerForBtnCommercial implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainGUI.getLayout().show(mainGUI.getCardContainer(), "Commercial");
		}
		
	}
	
	class ListenerForBtnParking implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			mainGUI.getLayout().show(mainGUI.getCardContainer(), "Parking");
		}	
	}
	
	class ListenerForUnitButtons implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			DetailsGUI detailsFrame = new DetailsGUI();
			detailsFrame.setUnitLblText(((JButton)e.getSource()).getText());
			detailsFrame.setVisible(true);
		}
	}
	
	class ListenerForBtnSave implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 
			
		}
	}
	
	class ListenerForBtnCancel implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 
			
		}
	}
}
