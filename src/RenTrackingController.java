import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class RenTrackingController {

	private MainGUI mainGUI;
	private DetailsGUI detailsGUI;
	private ArrayList<Room> rooms;
	
	public RenTrackingController(MainGUI mainGUI, ArrayList<Room> rooms) {

		this.mainGUI = mainGUI;
		this.rooms = rooms;
		
		detailsGUI = new DetailsGUI();
		
		mainGUI.btnSecondFloorListener(new ListenerForBtnSecondFloor());
		mainGUI.btnThirdFloorListener(new ListenerForBtnThirdFloor());
		mainGUI.btnFourthFloorListener(new ListenerForBtnFourthFloor());
		mainGUI.btnCommercialListener(new ListenerForBtnCommercial());
		mainGUI.btnParkingListener(new ListenerForBtnParking());
		
		mainGUI.addBtnActionListenersCOMMFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListenersParkingFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListeners2ndFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListeners3rdFloor(new ListenerForUnitButtons());
		mainGUI.addBtnActionListeners4thFloor(new ListenerForUnitButtons());
		
		detailsGUI.btnSaveListener(new ListenerForBtnSave());
		detailsGUI.btnDeleteListener(new ListenerForBtnDelete());
		detailsGUI.addTxtFieldDocumentListeners(new ListenerForTxtFields());
		
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
			
			String unit = ((JButton)e.getSource()).getText();
			int index = getRoomIndex(unit);
			detailsGUI.setUnitLbl(unit);
			
			if(index < 0) {
				detailsGUI.clearAllTextFields();
				detailsGUI.getDeleteButton().setEnabled(false);
				detailsGUI.getSaveBtn().setEnabled(false);
				
				detailsGUI.setVisible(true);
			}else {
				detailsGUI.clearAllTextFields();
				detailsGUI.getDeleteButton().setEnabled(true);
				detailsGUI.getSaveBtn().setEnabled(false);
				
				detailsGUI.setName(rooms.get(index).getTenantName());
				detailsGUI.setContractStrt(rooms.get(index).getContracStrt());
				detailsGUI.setRentAmt(rooms.get(index).getRentAmt());
				detailsGUI.setRentDue(rooms.get(index).getRentDue());
				detailsGUI.setParking(rooms.get(index).getParking());
				detailsGUI.setVisible(true);
			}

		}
	}
	
	class ListenerForBtnSave implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {	
			
			String unit = detailsGUI.getUnitLbl();
			String tenantName = detailsGUI.getName();
			String contractStrt = detailsGUI.getContractStrt();
			String rentAmt = detailsGUI.getRentAmt();
			String rentDue = detailsGUI.getRentDue();
			String parking = detailsGUI.getParking();
			int index = getRoomIndex(unit);
			
			
			if(index < 0) {
				Room room = new Room(unit,tenantName, contractStrt, rentAmt, rentDue, parking);
				rooms.add(room);
				mainGUI.btnTaken(unit);
				detailsGUI.setVisible(false);
				
			}else {
				rooms.get(index).setContracStrt(contractStrt);
				rooms.get(index).setTenantName(tenantName);
				rooms.get(index).setRentAmt(rentAmt);
				rooms.get(index).setRentDue(rentDue);
				rooms.get(index).setParking(parking);
				detailsGUI.setVisible(false);
			}
			
			printRooms();
			
		}
	}
	
	class ListenerForBtnDelete implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String unit = detailsGUI.getUnitLbl();
			int index = getRoomIndex(unit);
			
			
			rooms.remove(index);
			detailsGUI.clearAllTextFields();
			mainGUI.btnAvailable(unit);
			detailsGUI.setVisible(false);
			
			printRooms();

		}
	}
	
	class ListenerForTxtFields implements DocumentListener {

		@Override
		public void insertUpdate(DocumentEvent e) {
			detailsGUI.getSaveBtn().setEnabled(true);
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			detailsGUI.getSaveBtn().setEnabled(true);
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			detailsGUI.getSaveBtn().setEnabled(true);
			
		}
		
	}
	
	public int getRoomIndex(String unit) {
		
		int index = -1;
		
		for(int i=0; i< rooms.size(); i++) {
			if(unit.equalsIgnoreCase(rooms.get(i).getRoomNum())){
				index= i;
			}
		}
		
		return index;
	}
	
	public void printRooms() {
		for(int i=0; i< rooms.size(); i++) {
			System.out.println(rooms.get(i));
		}
		
		System.out.println("---------------");
	}
}
