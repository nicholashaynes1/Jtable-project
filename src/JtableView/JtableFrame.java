package JtableView;
import javax.swing.*;
import JtableController.ArrayController;

public class JtableFrame extends JFrame
{
	private ArrayController baseController;
	private ArrayPanel basePanel;
	
	public JtableFrame(ArrayController baseController)
	{
		this.baseController = baseController;
		basePanel = new ArrayPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(500, 500);
		this.setVisible(true);
	}

}
