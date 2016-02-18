package JtableView;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import JtableController.ArrayController;

public class ArrayPanel extends JPanel
{
	private ArrayController baseController;
	private JTable stringTable;
	private SpringLayout baseLayout;

	String[] columnNames = { "0", "1", "2", "3" };
	Object[][] data = { { 0, 0, 0 }, { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

	public ArrayPanel(ArrayController baseController)
	{
		stringTable = new JTable();

		this.baseController = baseController;
		baseLayout = new SpringLayout();

		setupPanel();
		setupTable();
		setupLayout();
		SetupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(Color.GREEN);

		this.add(stringTable);

	}

	private void setupTable()
	{
		DefaultTableModel myTableModel = new DefaultTableModel(data, columnNames);
		stringTable.setModel(myTableModel);
	}

	private void setupLayout()
	{

	}

	private void SetupListeners()
	{
		// TODO Auto-generated method stub

	}

}
