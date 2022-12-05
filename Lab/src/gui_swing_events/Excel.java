package gui_swing_events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;

public class Excel {
  ArrayList<Double> numbers = new ArrayList<Double>();
  public Excel(String numString) {
    String[] numArray = numString.split(" ");
    for (String num : numArray) {
      numbers.add(Double.parseDouble(num));
    }
  }
  
  public double findTotal() {
    double total = 0;
    for (double num : numbers) {
      total += num;
    }
    return total;
  }

  public double findAverage() {
    double total = 0;
    for (double num : numbers) {
      total += num;
    }
    return total / numbers.size();
  }

  public double findMin() {
    double min = numbers.get(0);
    for (double num : numbers) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }

  public double findMax() {
    double max = numbers.get(0);
    for (double num : numbers) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }
}
