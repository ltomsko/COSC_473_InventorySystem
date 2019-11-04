import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AdminLandingPage extends JFrame {
	private JPanel north;
	private JPanel center;

	private JLabel title;

	private JButton productview;
	private JButton add;
	private JButton remove;
	private JButton order;
	private JButton search;

	private BorderLayout layout;

	public AdminLandingPage() {
		super("Admin");
		layout = new BorderLayout(5, 5);
		setLayout(layout);

		north = new JPanel();
		north.setLayout(new GridLayout(1, 1, 10, 10));
		title = new JLabel("Administrator Options");
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
		order = new JButton("Order Products");
		center.add(add);
		center.add(remove);
		center.add(productview);
		center.add(search);
		center.add(order);
		center.setBackground(Color.gray);
		add.setForeground(Color.WHITE);
		remove.setForeground(Color.WHITE);
		productview.setForeground(Color.WHITE);
		search.setForeground(Color.WHITE);
		order.setForeground(Color.white);
		add.setBackground(Color.LIGHT_GRAY);
		remove.setBackground(Color.LIGHT_GRAY);                              
		search.setBackground(Color.LIGHT_GRAY);
		productview.setBackground(Color.LIGHT_GRAY);
		order.setBackground(Color.LIGHT_GRAY);
		add(center, BorderLayout.CENTER);

		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductListView list = new ProductListView();
				list.Window();
			}
		});

		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProductInsert list = new ProductInsert();
				list.Product();
			}
		});
		
//		productview.addActionListener( new ActionListener() {
//			public void actionPerformed(ActionEvent arg0 ) {
//				ProductListGUI list = new ProductListGUI();
//				list.ProductListGUI();
//			}
//		});
	}
}
