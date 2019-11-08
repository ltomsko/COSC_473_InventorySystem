
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.NumberFormatter;

public class ProductInsert {
	public static void main(String[] args) {
		final JFrame frame = new JFrame("Product Edit");

		JLabel namelbl = new JLabel("Product Name:");
		JTextField name = new JTextField(25);

		JLabel upclbl = new JLabel("UPC:");
		JTextField upc = new JTextField(5);

		JLabel pricelbl = new JLabel("Price:");
		JTextField price = new JTextField(10);

		JLabel loclbl = new JLabel("Location:");
		JTextField loc = new JTextField(10);

		JLabel qtylbl = new JLabel("Quantity:");

		JSpinner qty = new JSpinner();
		Integer value = new Integer(0);
		Integer min = new Integer(0);
		Integer max = new Integer(100);
		Integer step = new Integer(1);
		qty.setModel(new SpinnerNumberModel(value, min, max, step));
		JFormattedTextField txt = ((JSpinner.NumberEditor) qty.getEditor()).getTextField();
		((NumberFormatter) txt.getFormatter()).setAllowsInvalid(false);

		JButton add = new JButton("ADD");
		JButton remove = new JButton("REMOVE");
		JButton search = new JButton("SEARCH");

		JPanel panel = new JPanel();
		JPanel pan2 = new JPanel();
		Box box = Box.createVerticalBox();
		Box box2 = Box.createHorizontalBox();

		box.add(namelbl);
		box.add(name);
		box.add(upclbl);
		box.add(upc);
		box.add(pricelbl);
		box.add(price);
		box.add(loclbl);
		box.add(loc);
		box.add(qtylbl);
		box.add(qty);

		box2.add(search);
		box2.add(add);
		box2.add(remove);

		panel.add(box);
		pan2.add(box2);

		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.getContentPane().add(pan2, BorderLayout.SOUTH);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 350);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}