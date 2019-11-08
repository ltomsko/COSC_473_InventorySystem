import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;

public class EmployeeLandingPage extends JFrame {
	private JPanel north;
	private JPanel center;

	private JLabel title;

	private JButton productview;
	private JButton add;
	private JButton remove;
	private JButton search;

	private BorderLayout layout;

	public EmployeeLandingPage() {
		super("Emp");
		layout = new BorderLayout(5, 5);
		setLayout(layout);

		north = new JPanel();
		north.setLayout(new GridLayout(1, 1, 10, 10));
		title = new JLabel("Employee Options");
		title.setForeground(Color.white);
		title.setFont(new Font("Times New Roman", Font.BOLD, 28));
		getContentPane().setBackground(Color.gray);
		title.setHorizontalAlignment(JLabel.CENTER);
		add(title, BorderLayout.NORTH);

		center = new JPanel();
		center.setLayout(new GridLayout(7, 7, 7, 7));
		add = new JButton("Add Product");
		remove = new JButton("Remove Product");
		search = new JButton("Search Product");
		productview = new JButton("View Product Inventory");
		center.add(add);
		center.add(remove);
		center.add(productview);
		center.add(search);
		center.setBackground(Color.gray);
		add.setForeground(Color.WHITE);
		remove.setForeground(Color.WHITE);
		productview.setForeground(Color.WHITE);
		search.setForeground(Color.WHITE);
		add.setBackground(Color.LIGHT_GRAY);
		remove.setBackground(Color.LIGHT_GRAY);
		search.setBackground(Color.LIGHT_GRAY);
		productview.setBackground(Color.LIGHT_GRAY);
		add(center, BorderLayout.CENTER);
	}
}
