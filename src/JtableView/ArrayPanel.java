package JtableView;

import javax.swing.JPanel;
import javax.swing.JTable;
import JtableController.ArrayController;

public class ArrayPanel extends JPanel
{
	private ArrayController baseController;
	private JTable stringTable;
	
	String [] columnNames = {"0","1","2","3"};
	Object[][] data = {{0,0,0}, {1,1,1}, {2,2,2}, {3,3,3}};
	
	public ArrayPanel( ArrayController baseController)
	{	
		JTable stringTable = new JTable(data, columnNames);
		
		this.baseController = baseController;
		
		setupPanel();
		setupLayout();
		SetupListeners();
	}



	private void setupPanel()
	{
		this.add(stringTable);
		
		
	}


	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}



	private void SetupListeners()
	{
		// TODO Auto-generated method stub
		
	}



}
