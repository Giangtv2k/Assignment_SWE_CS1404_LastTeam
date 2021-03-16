
import java.awt.*;        // Using AWT's layouts
import java.awt.event.*;  // Using AWT's event classes and listener interfaces
import javax.swing.*;     // Using Swing's components and container

// A Swing application extends from javax.swing.JFrame
public class SwingArithmetics extends JFrame {

    private JTextField tfNumber1, tfNumber2, tfResult;
    private JButton btnAdd, btnClear, btnMinus, btnMul, btnDe, btnMod;
    private int number1, number2, result;

    // Constructor to set up UI components and event handlers
    public SwingArithmetics() {
        // Swing components should be added to the content-pane of the JFrame.
        Container cp = getContentPane();
        // Set this Container to grid layout of 4 rows and 2 columns
        cp.setLayout(new GridLayout(6, 2, 10, 3));

        // Components are added from left-to-right, top-to-bottom
        cp.add(new JLabel("First Number "));     // at (1, 1)
        tfNumber1 = new JTextField(10);
        tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber1);                       // at (1, 2)

        cp.add(new JLabel("Second Number "));   //(2,1)
        tfNumber2 = new JTextField(10);
        tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfNumber2);                      //(2,2)
        cp.add(new JLabel("Result "));          //(3,1)
        tfResult = new JTextField(10);
        tfResult.setBackground(Color.lightGray);
        tfResult.setHorizontalAlignment(JTextField.RIGHT);
        cp.add(tfResult);                       //(3,2)

        btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1+number2;
                Integer resurt = new Integer(result);
                tfResult.setText(resurt.toString());
            }
        });
        cp.add(btnAdd);                         // at (4, 1)
        
        btnMinus = new JButton("-");
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1-number2;
                Integer resurt = new Integer(result);
                tfResult.setText(resurt.toString());
            }
        });
        cp.add(btnMinus);                       //(4,2)
        
        btnMul = new JButton("*");
        btnMul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1*number2;
                Integer resurt = new Integer(result);
                tfResult.setText(resurt.toString());
            }
        });
        cp.add(btnMul);                         //(5,1)
        
        btnDe = new JButton("/");
        btnDe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1/number2;
                Integer resurt = new Integer(result);
                tfResult.setText(resurt.toString());
            }
        });
        cp.add(btnDe);                          //(5,2)
        
        btnMod = new JButton("%");
        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                number1 = Integer.parseInt(tfNumber1.getText());
                number2 = Integer.parseInt(tfNumber2.getText());
                result = number1-(number1/number2)*number2;
                Integer resurt = new Integer(result);
                tfResult.setText(resurt.toString());
            }
        });
        cp.add(btnMod);                         //(6,1)

        btnClear = new JButton("CLEAR");
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                tfNumber1.setText(null);
                tfNumber2.setText(null);
                tfResult.setText(null);
            }
        });
        cp.add(btnClear);                       //(6,2)

        setDefaultCloseOperation(EXIT_ON_CLOSE); // for the "window-close" button
        setTitle("Swing Adder");
        setBounds(250, 250, 400, 300);
        setVisible(true);
    }

    // The entry main() method
    public static void main(String[] args) {
        // For thread safety, use the event-dispatching thread to construct UI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingArithmetics(); // Let the constructor does the job
            }
        });
    }
}
