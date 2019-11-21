import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	JPanel nav_bar, card_container;
	JButton second_floor, third_floor, fourth_floor, commercial, parking;
	JPanel card2, card3, card4, card_comm, card_parking;
	JLabel two, three, four, comm, park;
	private JButton btn_2J, btn_2I, btn_2H, btn_2G, btn_2F, btn_2E, btn_2D, btn_2C, btn_2B, btn_2A;
	private JButton btn_3J, btn_3I, btn_3H, btn_3G, btn_3F, btn_3E, btn_3D, btn_3C, btn_3B, btn_3A;
	private JButton btn_4J, btn_4I, btn_4H, btn_4G, btn_4F, btn_4E, btn_4D, btn_4C, btn_4B, btn_4A;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					MainGUI frame = new MainGUI();
					RenTrackingController controller = new RenTrackingController(frame); 
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainGUI() {
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //making the UI look better
       }
		catch (Exception e) {}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 837, 452);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nav_bar = new JPanel();
		nav_bar.setBorder(new LineBorder(new Color(0, 0, 0)));
		nav_bar.setBounds(10, 37, 152, 338);
		contentPane.add(nav_bar);
		nav_bar.setLayout(null);
		
		commercial = new JButton("Commercial");
		commercial.setBounds(10, 85, 132, 33);
		nav_bar.add(commercial);
		
		
		parking = new JButton("Parking");
		parking.setBounds(10, 129, 132, 33);
		nav_bar.add(parking);
		
		second_floor = new JButton("2nd Floor");
		second_floor.setBounds(10, 173, 132, 33);
		
		nav_bar.add(second_floor);
		
		third_floor = new JButton("3rd Floor");
		third_floor.setBounds(10, 217, 132, 33);
		nav_bar.add(third_floor);
		
		fourth_floor = new JButton("4th Floor");
		fourth_floor.setBounds(10, 261, 132, 33);
		nav_bar.add(fourth_floor);
		
		JLabel lblNewLabel = new JLabel("RenTracker");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 132, 47);
		nav_bar.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 45, 152, 2);
		nav_bar.add(separator);
		
		card_container = new JPanel();
		card_container.setBounds(172, 11, 641, 387);
		card_container.setLayout(new CardLayout());
		contentPane.add(card_container);
		
		two = new JLabel("Second Floor");
		two.setHorizontalAlignment(SwingConstants.CENTER);
		two.setFont(new Font("Tahoma", Font.PLAIN, 20));
		two.setBounds(243, 11, 152, 45);
		
		three = new JLabel("Third Floor");
		three.setBounds(270, 22, 97, 25);
		three.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		four = new JLabel("Fourth Floor");
		four.setBounds(270, 22, 108, 25);
		four.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		card2 = new JPanel();
		card2.setLayout(null);
		card2.add(two);
		
		card3 = new JPanel();
		card3.setLayout(null);
		card3.add(three);
		
		card4 = new JPanel();
		card4.setLayout(null);
		card4.add(four);
		
		comm = new JLabel("Commercial");
		comm.setBounds(270, 22, 108, 25);
		comm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		card_comm = new JPanel();
		card_comm.setLayout(null);
		card_comm.add(comm);
		card_container.add(card_comm, "Commercial");
		
		park = new JLabel("Parking");
		park.setBounds(270, 22, 97, 25);
		park.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		card_parking = new JPanel();
		card_parking.setLayout(null);
		card_parking.add(park);
		card_container.add(card_parking, "Parking");
		
		card_container.add(card2, "Second");
		
		btn_2J = new JButton("2J");
		btn_2J.setBounds(85, 76, 57, 45);
		card2.add(btn_2J);
		
		btn_2I = new JButton("2I");
		btn_2I.setBounds(217, 76, 57, 45);
		card2.add(btn_2I);
		
		btn_2H = new JButton("2H");
		btn_2H.setBounds(359, 76, 57, 45);
		card2.add(btn_2H);
		
		btn_2G = new JButton("2G");
		btn_2G.setBounds(500, 76, 57, 45);
		card2.add(btn_2G);
		
		btn_2D = new JButton("2D");
		btn_2D.setBounds(85, 279, 57, 45);
		card2.add(btn_2D);
		
		btn_2C = new JButton("2C");
		btn_2C.setBounds(217, 279, 57, 45);
		card2.add(btn_2C);
		
		btn_2B = new JButton("2B");
		btn_2B.setBounds(359, 279, 57, 45);
		card2.add(btn_2B);
		
		btn_2A = new JButton("2A");
		btn_2A.setBounds(500, 279, 57, 45);
		card2.add(btn_2A);
		
		btn_2F = new JButton("2F");
		btn_2F.setBounds(217, 176, 57, 45);
		card2.add(btn_2F);
		
		btn_2E = new JButton("2E");
		btn_2E.setBounds(359, 176, 57, 45);
		card2.add(btn_2E);
		
		card_container.add(card3, "Third");
		
		btn_3J = new JButton("3J");
		btn_3J.setBounds(85, 76, 57, 45);
		card3.add(btn_3J);
		
		btn_3I = new JButton("3I");
		btn_3I.setBounds(217, 76, 57, 45);
		card3.add(btn_3I);
		
		btn_3H = new JButton("3H");
		btn_3H.setBounds(359, 76, 57, 45);
		card3.add(btn_3H);
		
		btn_3G = new JButton("3G");
		btn_3G.setBounds(500, 76, 57, 45);
		card3.add(btn_3G);
		
		btn_3D = new JButton("3D");
		btn_3D.setBounds(85, 279, 57, 45);
		card3.add(btn_3D);
		
		btn_3C = new JButton("3C");
		btn_3C.setBounds(217, 279, 57, 45);
		card3.add(btn_3C);
		
		btn_3B = new JButton("3B");
		btn_3B.setBounds(359, 279, 57, 45);
		card3.add(btn_3B);
		
		btn_3A = new JButton("3A");
		btn_3A.setBounds(500, 279, 57, 45);
		card3.add(btn_3A);
		
		btn_3F = new JButton("3F");
		btn_3F.setBounds(217, 176, 57, 45);
		card3.add(btn_3F);
		
		btn_3E = new JButton("3E");
		btn_3E.setBounds(359, 176, 57, 45);
		card3.add(btn_3E);
		
		
		card_container.add(card4, "Fourth");
		
		btn_4J = new JButton("4J");
		btn_4J.setBounds(85, 76, 57, 45);
		card4.add(btn_4J);
		
		btn_4I = new JButton("4I");
		btn_4I.setBounds(217, 76, 57, 45);
		card4.add(btn_4I);
		
		btn_4H = new JButton("4H");
		btn_4H.setBounds(359, 76, 57, 45);
		card4.add(btn_4H);
		
		btn_4G = new JButton("4G");
		btn_4G.setBounds(500, 76, 57, 45);
		card4.add(btn_4G);
		
		btn_4D = new JButton("4D");
		btn_4D.setBounds(85, 279, 57, 45);
		card4.add(btn_4D);
		
		btn_4C = new JButton("4C");
		btn_4C.setBounds(217, 279, 57, 45);
		card4.add(btn_4C);
		
		btn_4B = new JButton("4B");
		btn_4B.setBounds(359, 279, 57, 45);
		card4.add(btn_4B);
		
		btn_4A = new JButton("4A");
		btn_4A.setBounds(500, 279, 57, 45);
		card4.add(btn_4A);
		
		btn_4F = new JButton("4F");
		btn_4F.setBounds(217, 176, 57, 45);
		card4.add(btn_4F);
		
		btn_4E = new JButton("4E");
		btn_4E.setBounds(359, 176, 57, 45);
		card4.add(btn_4E);

	}
	
	
	public void btnSecondFloorListener(ActionListener listenerForBtnSecondFloor) {
		second_floor.addActionListener(listenerForBtnSecondFloor);
	}
	
	public void btnThirdFloorListener(ActionListener listenerForBtnThirdFloor) {
		third_floor.addActionListener(listenerForBtnThirdFloor);
	}
	
	public void btnFourthFloorListener(ActionListener listenerForBtnFourthFloor) {
		fourth_floor.addActionListener(listenerForBtnFourthFloor);
	}
	
	public void btnCommercialListener(ActionListener listenerForBtnCommercial) {
		commercial.addActionListener(listenerForBtnCommercial);
	}
	
	public void btnParkingListener(ActionListener listenerForBtnParking) {
		parking.addActionListener(listenerForBtnParking);
	}
	
	public CardLayout getLayout() {
		return (CardLayout) card_container.getLayout();
	}
	
	public JPanel getCardContainer() {
		return card_container;
	}
	
	
	public void addBtnActionListeners2ndFloor (ActionListener listenerForUnitButtons) {
		Component[] buttons = card2.getComponents();
		
		for(Component component: buttons) {
			
			if(component instanceof JButton) {
				JButton button = (JButton) component;
				button.addActionListener(listenerForUnitButtons);
			}
		}
	}
	
	public void addBtnActionListeners3rdFloor (ActionListener listenerForUnitButtons) {
		Component[] buttons = card3.getComponents();
		
		for(Component component: buttons) {
			
			if(component instanceof JButton) {
				JButton button = (JButton) component;
				button.addActionListener(listenerForUnitButtons);
			}
		}
	}
	
	public void addBtnActionListeners4thFloor (ActionListener listenerForUnitButtons) {
		Component[] buttons = card4.getComponents();
		
		for(Component component: buttons) {
			
			if(component instanceof JButton) {
				JButton button = (JButton) component;
				button.addActionListener(listenerForUnitButtons);
			}
		}
	}
}
