import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class DetailsGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txt_name, parking_txt, rentDue_txt, rentAmt_txt, contractStrt_txt;
	private JLabel unit_lbl;
	private JButton btnSave, btnDelete;

	/**
	 * Launch the application.
	 */

	public DetailsGUI() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 387, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tenant Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(34, 92, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblContractStart = new JLabel("Contract Start");
		lblContractStart.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContractStart.setBounds(34, 126, 102, 14);
		contentPane.add(lblContractStart);
		
		JLabel lblRentAmount = new JLabel("Rent Amount");
		lblRentAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRentAmount.setBounds(34, 163, 91, 14);
		contentPane.add(lblRentAmount);
		
		JLabel lblRentDue = new JLabel("Rent Due");
		lblRentDue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRentDue.setBounds(34, 199, 91, 14);
		contentPane.add(lblRentDue);
		
		JLabel lblParking = new JLabel("Parking");
		lblParking.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblParking.setBounds(34, 234, 91, 19);
		contentPane.add(lblParking);
		
		txt_name = new JTextField();
		txt_name.setBounds(135, 91, 185, 20);
		contentPane.add(txt_name);
		txt_name.setColumns(10);
		
		contractStrt_txt = new JTextField();
		contractStrt_txt.setColumns(10);
		contractStrt_txt.setBounds(135, 125, 185, 20);
		contentPane.add(contractStrt_txt);
		
		rentAmt_txt = new JTextField();
		rentAmt_txt.setColumns(10);
		rentAmt_txt.setBounds(135, 162, 185, 20);
		contentPane.add(rentAmt_txt);
		
		rentDue_txt = new JTextField();
		rentDue_txt.setColumns(10);
		rentDue_txt.setBounds(135, 198, 185, 20);
		contentPane.add(rentDue_txt);
		
		parking_txt = new JTextField();
		parking_txt.setColumns(10);
		parking_txt.setBounds(135, 235, 185, 20);
		contentPane.add(parking_txt);
		
		unit_lbl = new JLabel("New label");
		unit_lbl.setFont(new Font("Tahoma", Font.PLAIN, 20));
		unit_lbl.setBounds(34, 29, 254, 42);
		contentPane.add(unit_lbl);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(67, 290, 89, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("Delete Details");
		btnDelete.setBounds(191, 290, 116, 23);
		contentPane.add(btnDelete);
	}
	
	public String getName() {
		return txt_name.getText();
	}

	public void setName(String txt_name) {
		this.txt_name.setText(txt_name);
	}

	public String getParking() {
		return parking_txt.getText();
	}

	public void setParking(String parking_txt) {
		this.parking_txt.setText(parking_txt);
	}

	public String getRentDue() {
		return rentDue_txt.getText();
	}

	public void setRentDue(String rentDue_txt) {
		this.rentDue_txt.setText(rentDue_txt);
	}

	public String getRentAmt() {
		return rentAmt_txt.getText();
	}

	public void setRentAmt(String rentAmt_txt) {
		this.rentAmt_txt.setText(rentAmt_txt);
	}

	public String getContractStrt() {
		return contractStrt_txt.getText();
	}

	public void setContractStrt(String contractStrt_txt) {
		this.contractStrt_txt.setText(contractStrt_txt);
	}
	
	public void clearAllTextFields() {
		this.txt_name.setText("");
		this.contractStrt_txt.setText("");
		this.rentAmt_txt.setText("");
		this.rentDue_txt.setText("");
		this.parking_txt.setText("");
		
	}

	public String getUnitLbl() {
		return unit_lbl.getText();
	}

	public void setUnitLbl(String unit_lbl) {
		this.unit_lbl.setText(unit_lbl);;
	}
	
	public JButton getDeleteButton() {
		return this.btnDelete;
	}

	public void btnSaveListener(ActionListener listenerForBtnSave) {
		btnSave.addActionListener(listenerForBtnSave);
	}
	
	public void btnDeleteListener(ActionListener listenerForBtnDelete) {
		btnDelete.addActionListener(listenerForBtnDelete);
	}
}
