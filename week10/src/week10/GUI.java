package week10;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;

import javax.swing.SpringLayout;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;


public class GUI {
	private JFrame polymorphismGui;
	private JTextField tfLoanNumber;
	private JTextField tfLoanAmount;
	private JTextField tfLName;
	private JTextField tfRate;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.polymorphismGui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		polymorphismGui = new JFrame();
		polymorphismGui.setTitle("Polymorphism GUI");
		polymorphismGui.setBounds(100, 100, 550, 700);
		polymorphismGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		polymorphismGui.getContentPane().setLayout(springLayout);

		JLabel tittle = new JLabel("Construction Loan Company");
		springLayout.putConstraint(SpringLayout.NORTH, tittle, 10, SpringLayout.NORTH,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tittle, 160, SpringLayout.WEST,
				polymorphismGui.getContentPane());
		tittle.setFont(new Font("Times New Roman", Font.BOLD, 16));
		polymorphismGui.getContentPane().add(tittle);

		JPanel pAddLoan = new JPanel();
		springLayout.putConstraint(SpringLayout.WEST, pAddLoan, 35, SpringLayout.WEST,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, pAddLoan, -35, SpringLayout.EAST,
				polymorphismGui.getContentPane());
		pAddLoan.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		polymorphismGui.getContentPane().add(pAddLoan);
		SpringLayout sl_pAddLoan = new SpringLayout();
		pAddLoan.setLayout(sl_pAddLoan);

		JLabel lbAdd = new JLabel("Add New Loan");
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbAdd, 5, SpringLayout.NORTH, pAddLoan);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbAdd, 160, SpringLayout.WEST, pAddLoan);
		lbAdd.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		pAddLoan.add(lbAdd);

		JLabel lbLoanNumber = new JLabel("Loan number");
		lbLoanNumber.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pAddLoan.add(lbLoanNumber);

		tfLoanNumber = new JTextField();
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, tfLoanNumber, -2, SpringLayout.NORTH, lbLoanNumber);
		pAddLoan.add(tfLoanNumber);
		tfLoanNumber.setColumns(10);

		JLabel lbLoanAmount = new JLabel("Loan amount");
		pAddLoan.add(lbLoanAmount);
		lbLoanAmount.setFont(new Font("Times New Roman", Font.PLAIN, 12));

		tfLoanAmount = new JTextField();
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, tfLoanAmount, -2, SpringLayout.NORTH, lbLoanAmount);
		sl_pAddLoan.putConstraint(SpringLayout.EAST, tfLoanAmount, 0, SpringLayout.EAST, tfLoanNumber);
		tfLoanAmount.setColumns(10);
		pAddLoan.add(tfLoanAmount);

		JLabel lbLoanType = new JLabel("Loan Type");
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbLoanAmount, 0, SpringLayout.WEST, lbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbLoanNumber, 20, SpringLayout.SOUTH, lbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbLoanNumber, 0, SpringLayout.WEST, lbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbLoanType, 40, SpringLayout.NORTH, pAddLoan);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbLoanType, 25, SpringLayout.WEST, pAddLoan);
		lbLoanType.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pAddLoan.add(lbLoanType);

		JComboBox cbLoanType = new JComboBox();
		sl_pAddLoan.putConstraint(SpringLayout.EAST, tfLoanNumber, 75, SpringLayout.EAST, cbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, tfLoanAmount, 0, SpringLayout.WEST, cbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, tfLoanNumber, 0, SpringLayout.WEST, cbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.EAST, cbLoanType, 140, SpringLayout.EAST, lbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, cbLoanType, -2, SpringLayout.NORTH, lbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, cbLoanType, 40, SpringLayout.EAST, lbLoanType);
		cbLoanType.setModel(new DefaultComboBoxModel(new String[] { "Business", "Personal" }));
		pAddLoan.add(cbLoanType);

		JPanel pOut = new JPanel();
		springLayout.putConstraint(SpringLayout.SOUTH, pOut, -15, SpringLayout.SOUTH,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, pAddLoan, -29, SpringLayout.NORTH, pOut);
		springLayout.putConstraint(SpringLayout.NORTH, pOut, 373, SpringLayout.NORTH,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, pOut, 0, SpringLayout.WEST, pAddLoan);
		springLayout.putConstraint(SpringLayout.EAST, pOut, -33, SpringLayout.EAST,
				polymorphismGui.getContentPane());

		JLabel lbLoanTerm = new JLabel("Loan Term");
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbLoanTerm, 20, SpringLayout.SOUTH, lbLoanAmount);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbLoanTerm, 0, SpringLayout.WEST, lbLoanType);
		lbLoanTerm.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pAddLoan.add(lbLoanTerm);

		JComboBox cbLoanTerm = new JComboBox();
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, cbLoanTerm, -2, SpringLayout.NORTH, lbLoanTerm);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, cbLoanTerm, 0, SpringLayout.WEST, cbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.EAST, cbLoanTerm, 0, SpringLayout.EAST, cbLoanType);
		cbLoanTerm.setModel(new DefaultComboBoxModel(new String[] { "Short-term", "Medium-term", "Long-term" }));
		pAddLoan.add(cbLoanTerm);

		JButton btnAddLoan = new JButton("Add Loan");
		btnAddLoan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					int loanType = cbLoanType.getSelectedIndex();
					int term = (cbLoanTerm.getSelectedIndex() * 2) + 1;
					int loanNum = Integer.parseInt(tfLoanNumber.getText());

					double primeInterestRate = Double.parseDouble(tfRate.getText());
					double loanAmount = Double.parseDouble(tfLoanAmount.getText());
					String customerLastName = tfLName.getText();

					if (loanType == 0) {
						Loan loan = new BusinessLoan(loanNum, customerLastName, loanAmount, term, primeInterestRate);

						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(loan.toArray());
					} else if (loanType == 1) {
						Loan loan = new PersonalLoan(loanNum, customerLastName, loanAmount, term, primeInterestRate);

						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.addRow(loan.toArray());
					}
					
					//Clearing fields
					tfLoanNumber.setText("");
					tfLoanAmount.setText("");
					tfLName.setText("");
				} catch (Exception ex) {
					 JOptionPane.showMessageDialog(polymorphismGui, ex.getMessage(),"Error", 2);
					 return;
				}
			}
		});
		sl_pAddLoan.putConstraint(SpringLayout.SOUTH, btnAddLoan, -10, SpringLayout.SOUTH, pAddLoan);
		sl_pAddLoan.putConstraint(SpringLayout.EAST, btnAddLoan, -10, SpringLayout.EAST, pAddLoan);
		pAddLoan.add(btnAddLoan);

		JLabel lbLName = new JLabel("<html>Customer's <br>Last Name</html>");
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbLoanAmount, 20, SpringLayout.SOUTH, lbLName);
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, lbLName, 20, SpringLayout.SOUTH, lbLoanNumber);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, lbLName, 0, SpringLayout.WEST, lbLoanType);
		lbLName.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pAddLoan.add(lbLName);

		tfLName = new JTextField();
		sl_pAddLoan.putConstraint(SpringLayout.NORTH, tfLName, 5, SpringLayout.NORTH, lbLName);
		sl_pAddLoan.putConstraint(SpringLayout.WEST, tfLName, 0, SpringLayout.WEST, cbLoanType);
		sl_pAddLoan.putConstraint(SpringLayout.EAST, tfLName, 0, SpringLayout.EAST, tfLoanNumber);
		tfLName.setColumns(10);
		pAddLoan.add(tfLName);
		pOut.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		polymorphismGui.getContentPane().add(pOut);
		SpringLayout sl_pOut = new SpringLayout();
		pOut.setLayout(sl_pOut);

		JLabel lbDetails = new JLabel("Loan Details");
		sl_pOut.putConstraint(SpringLayout.NORTH, lbDetails, 10, SpringLayout.NORTH, pOut);
		sl_pOut.putConstraint(SpringLayout.WEST, lbDetails, 25, SpringLayout.WEST, pOut);
		lbDetails.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lbDetails.setVerticalAlignment(SwingConstants.TOP);
		lbDetails.setHorizontalAlignment(SwingConstants.CENTER);
		pOut.add(lbDetails);

		JScrollPane scrollPane = new JScrollPane();
		sl_pOut.putConstraint(SpringLayout.NORTH, scrollPane, 5, SpringLayout.SOUTH, lbDetails);
		sl_pOut.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, pOut);
		sl_pOut.putConstraint(SpringLayout.SOUTH, scrollPane, -5, SpringLayout.SOUTH, pOut);
		sl_pOut.putConstraint(SpringLayout.EAST, scrollPane, -5, SpringLayout.EAST, pOut);
		pOut.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Loan Type", "Loan Number", "Last Name",
				"Loan Amount", "Interest Rate", "Term", "Total Amount" }));
		scrollPane.setViewportView(table);

		JLabel lbRate = new JLabel("Prime Interest Rate");
		springLayout.putConstraint(SpringLayout.WEST, lbRate, 35, SpringLayout.WEST,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lbRate, -588, SpringLayout.SOUTH,
				polymorphismGui.getContentPane());
		lbRate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		polymorphismGui.getContentPane().add(lbRate);

		tfRate = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, pAddLoan, 23, SpringLayout.SOUTH, tfRate);
		springLayout.putConstraint(SpringLayout.NORTH, tfRate, 55, SpringLayout.NORTH,
				polymorphismGui.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tfRate, 40, SpringLayout.EAST, lbRate);
		tfRate.setColumns(10);
		polymorphismGui.getContentPane().add(tfRate);

		JLabel infoRate = new JLabel("percentage");
		springLayout.putConstraint(SpringLayout.NORTH, infoRate, 0, SpringLayout.NORTH, lbRate);
		springLayout.putConstraint(SpringLayout.WEST, infoRate, 5, SpringLayout.EAST, tfRate);
		polymorphismGui.getContentPane().add(infoRate);

	}
}

	


