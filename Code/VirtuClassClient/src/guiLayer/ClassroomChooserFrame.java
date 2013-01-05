package guiLayer;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClassroomChooserFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassroomChooserFrame frame = new ClassroomChooserFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClassroomChooserFrame() {
		initFrame();
		initFramePanel();
		
		JPanel panel = initOpenClassroomsPanel();	
		initOpenClassroomsList(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Currently Online", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(564, 85, 130, 339);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(16, 439, 201, 30);
		contentPane.add(btnConnect);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(219, 439, 230, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(461, 439, 233, 30);
		contentPane.add(btnNewButton_1);
	}

	/**
	 * @param panel
	 */
	private void initOpenClassroomsList(JPanel panel) {
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Automation ", "Calculus 1", "Calculus 2", "Discreat Math", "Linear Algebra"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(list);
	}

	/**
	 * @return
	 */
	private JPanel initOpenClassroomsPanel() {
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 1, true), "Open Rooms", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(6, 83, 551, 344);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		return panel;
	}

	/**
	 * 
	 */
	private void initFramePanel() {
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	/**
	 * 
	 */
	private void initFrame() {
		setTitle("Open Rooms");
		setAlwaysOnTop(true);
		setBackground(new Color(153, 204, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 515);
	}
}
