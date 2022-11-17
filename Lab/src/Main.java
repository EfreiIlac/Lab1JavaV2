import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Main extends JFrame implements ActionListener  {
    JPanel panel = new JPanel();
    JPanel inputPanel = new JPanel();
    JPanel outputPanel = new JPanel();
    JPanel buttonPanel = new JPanel();

    JLabel nameLabel = new JLabel("Name");
    JTextField name = new JTextField("");
    JLabel firstnameLabel = new JLabel("Firstname");
    JTextField firstname = new JTextField("");
    JLabel addressLabel = new JLabel("address");
    JTextField address = new JTextField("");
    JLabel cityLabel = new JLabel("City");
    JTextField city = new JTextField("");
    JLabel provinceLabel = new JLabel("Province");
    JTextField province = new JTextField("");
    JLabel mailLabel = new JLabel("e-mail");
    JTextField mail = new JTextField("");
    JLabel output = new JLabel();
    JButton enter = new JButton("Enter");
    JButton reset = new JButton("Reset");
    
    public Main() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(500, 500);
        add(panel);
        panel.add(inputPanel);
        panel.add(buttonPanel);
        panel.add(outputPanel);
        name.setPreferredSize(new DimensionUIResource(100, 20));
        firstname.setPreferredSize(new DimensionUIResource(100, 20));
        address.setPreferredSize(new DimensionUIResource(100, 20));
        city.setPreferredSize(new DimensionUIResource(100, 20));
        mail.setPreferredSize(new DimensionUIResource(100, 20));

        inputPanel.add(nameLabel);
        inputPanel.add(name);
        inputPanel.add(firstnameLabel);
        inputPanel.add(firstname);
        inputPanel.add(addressLabel);
        inputPanel.add(address);
        inputPanel.add(cityLabel);
        inputPanel.add(city);
        inputPanel.add(province);
        inputPanel.add(mailLabel);
        inputPanel.add(mail);
        buttonPanel.add(enter);
        buttonPanel.add(reset);
        outputPanel.add(output);

        enter.addActionListener(this);
        reset.addActionListener(this);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enter) {
          output.setText("Name: " + name.getText() + " " + firstname.getText() + " Address: " + address.getText() + " " + city.getText() +", " + province.getText() + " e-mail: " + mail.getText());
        } else if(e.getSource() == reset) {
          name.setText("");
          firstname.setText("");
          address.setText("");
          city.setText("");
          mail.setText("");
          output.setText("");
        }
      }
}