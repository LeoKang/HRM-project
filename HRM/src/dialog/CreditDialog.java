package dialog;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * @brief
 * @author 
 * @version 
 * @see 
 */
public class CreditDialog extends JDialog{
	public CreditDialog(JFrame f, String msg, boolean modal) {
		// TODO Auto-generated constructor stub
		super(f,msg,modal);
		
		setSize(new Dimension(880,660)); //���̾�α� ũ��
		setLocationRelativeTo(null); //��� ��ġ
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //�ݱ�

	}
}