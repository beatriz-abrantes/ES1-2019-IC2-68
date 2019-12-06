package engsoft;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTree;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;

public class ES {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ES window = new ES();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ES() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBackground(new Color(255, 255, 255));
		frame.setBounds(200, 200, 467, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{20, 131, 176, 118, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 58, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);

		JLabel lblAvaliaoDaQualidade = new JLabel("Avalia\u00E7\u00E3o da Qualidade na Dete\u00E7\u00E3o de Erros");
		lblAvaliaoDaQualidade.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_lblAvaliaoDaQualidade = new GridBagConstraints();
		gbc_lblAvaliaoDaQualidade.insets = new Insets(0, 0, 5, 5);
		gbc_lblAvaliaoDaQualidade.gridx = 2;
		gbc_lblAvaliaoDaQualidade.gridy = 2;
		frame.getContentPane().add(lblAvaliaoDaQualidade, gbc_lblAvaliaoDaQualidade);

		JButton btnMostrarExcel = new JButton("Mostrar Excel");
		btnMostrarExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File excel;
				FileInputStream excelfis = null;
				BufferedInputStream excelbis = null;
				XSSFWorkbook excelJPanelImport = null;

				String path = "C:\\Users\\beaab\\OneDrive\\Ambiente de Trabalho\\excel";
				JFileChooser jf = new JFileChooser(path);
				int excelchooser = jf.showOpenDialog(null);


				if (excelchooser == JFileChooser.APPROVE_OPTION) {

					excel = jf.getSelectedFile();

					try {
						excelfis = new FileInputStream(excel);
						excelbis = new BufferedInputStream(excelfis);

						excelJPanelImport = new XSSFWorkbook(excelbis);
						XSSFSheet sheet = excelJPanelImport.getSheetAt(0);

						for (int linha = 0; linha < sheet.getLastRowNum(); linha++) {
							XSSFRow excellinha = sheet.getRow(linha);
							for (int coluna = 0; coluna < excellinha.getLastCellNum(); coluna++) {
								XSSFCell excelcell = excellinha.getCell(coluna);
								System.out.println(excelcell.getStringCellValue());
							}
						}
					} catch (FileNotFoundException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
				}
			}
		});
		btnMostrarExcel.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_btnMostrarExcel = new GridBagConstraints();
		gbc_btnMostrarExcel.insets = new Insets(0, 0, 5, 5);
		gbc_btnMostrarExcel.gridx = 2;
		gbc_btnMostrarExcel.gridy = 3;
		frame.getContentPane().add(btnMostrarExcel, gbc_btnMostrarExcel);

		JLabel lblMtrica = new JLabel("M\u00E9trica");
		lblMtrica.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblMtrica = new GridBagConstraints();
		gbc_lblMtrica.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtrica.gridx = 1;
		gbc_lblMtrica.gridy = 6;
		frame.getContentPane().add(lblMtrica, gbc_lblMtrica);

		JLabel lblComparador = new JLabel("Comparador");
		lblComparador.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblComparador = new GridBagConstraints();
		gbc_lblComparador.insets = new Insets(0, 0, 5, 5);
		gbc_lblComparador.gridx = 2;
		gbc_lblComparador.gridy = 6;
		frame.getContentPane().add(lblComparador, gbc_lblComparador);

		JLabel lblValor = new JLabel("Valor");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblValor = new GridBagConstraints();
		gbc_lblValor.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor.gridx = 3;
		gbc_lblValor.gridy = 6;
		frame.getContentPane().add(lblValor, gbc_lblValor);

		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 7;
		frame.getContentPane().add(comboBox, gbc_comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 7;
		frame.getContentPane().add(comboBox_1, gbc_comboBox_1);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 7;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"v", "\u028C"}));
		GridBagConstraints gbc_comboBox_3 = new GridBagConstraints();
		gbc_comboBox_3.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_3.gridx = 1;
		gbc_comboBox_3.gridy = 9;
		frame.getContentPane().add(comboBox_3, gbc_comboBox_3);

		JLabel lblMtrica_1 = new JLabel("M\u00E9trica");
		lblMtrica_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblMtrica_1 = new GridBagConstraints();
		gbc_lblMtrica_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMtrica_1.gridx = 1;
		gbc_lblMtrica_1.gridy = 11;
		frame.getContentPane().add(lblMtrica_1, gbc_lblMtrica_1);

		JLabel lblComparador_1 = new JLabel("Comparador");
		lblComparador_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblComparador_1 = new GridBagConstraints();
		gbc_lblComparador_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblComparador_1.gridx = 2;
		gbc_lblComparador_1.gridy = 11;
		frame.getContentPane().add(lblComparador_1, gbc_lblComparador_1);

		JLabel lblValor_1 = new JLabel("Valor");
		lblValor_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		GridBagConstraints gbc_lblValor_1 = new GridBagConstraints();
		gbc_lblValor_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblValor_1.gridx = 3;
		gbc_lblValor_1.gridy = 11;
		frame.getContentPane().add(lblValor_1, gbc_lblValor_1);

		JComboBox comboBox_4 = new JComboBox();
		GridBagConstraints gbc_comboBox_4 = new GridBagConstraints();
		gbc_comboBox_4.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_4.gridx = 1;
		gbc_comboBox_4.gridy = 12;
		frame.getContentPane().add(comboBox_4, gbc_comboBox_4);

		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"<", ">", "<=", ">="}));
		GridBagConstraints gbc_comboBox_5 = new GridBagConstraints();
		gbc_comboBox_5.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_5.gridx = 2;
		gbc_comboBox_5.gridy = 12;
		frame.getContentPane().add(comboBox_5, gbc_comboBox_5);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 12;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JButton btnAvaliarQualidade = new JButton("Avaliar Qualidade");
		btnAvaliarQualidade.setForeground(new Color(0, 0, 255));
		GridBagConstraints gbc_btnAvaliarQualidade = new GridBagConstraints();
		gbc_btnAvaliarQualidade.insets = new Insets(0, 0, 5, 5);
		gbc_btnAvaliarQualidade.gridx = 2;
		gbc_btnAvaliarQualidade.gridy = 13;
		frame.getContentPane().add(btnAvaliarQualidade, gbc_btnAvaliarQualidade);
	}

}
