package SimpleCalculator;// CalcView.java - View component
//    Presentation only.  No user actions.
// Fred Swartz -- December 2004

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class CalcView extends JFrame {
    //... Components
    private JTextField multiplyUserInput = new JTextField(5);
    private JTextField subtractUserInput = new JTextField(5);
    private JTextField multiplyResult = new JTextField(20);
    private JTextField subtractResult = new JTextField(20);
    private JButton multiplyBtn = new JButton("Multiply");
    private JButton clearMultiplyBtn = new JButton("Clear Multiply Result");
    private JButton subtractBtn = new JButton("Subtract");
    private JButton clearSubtractBtn = new JButton("Clear Subtract Result");
    private JButton clearAllBtn = new JButton("Clear All");

    private CalcModel m_model;
    
    //======================================================= constructor
    /** Constructor */
    CalcView(CalcModel model) {
        //... Set up the logic
        m_model = model;
        m_model.setMultiplyTotal(CalcModel.INITIAL_MULTIPLY_VALUE);
        m_model.setSubtractTotal(CalcModel.INITIAL_SUBTRACT_VALUE);
        
        //... Initialize components
        multiplyResult.setText(m_model.getMultiplyTotal());
        multiplyResult.setEditable(false);
        subtractResult.setText(m_model.getSubtractTotal());
        subtractResult.setEditable(false);
        
        //... Layout the components.      
        JPanel multiplyPanel = new JPanel();
        multiplyPanel.setLayout(new FlowLayout());
        multiplyPanel.add(new JLabel("Input"));
        multiplyPanel.add(multiplyUserInput);
        multiplyPanel.add(multiplyBtn);
        multiplyPanel.add(new JLabel("Total"));
        multiplyPanel.add(multiplyResult);
        multiplyPanel.add(clearMultiplyBtn);

        JPanel subtractPanel = new JPanel();
        subtractPanel.setLayout(new FlowLayout());
        subtractPanel.add(new JLabel("Input"));
        subtractPanel.add(subtractUserInput);
        subtractPanel.add(subtractBtn);
        subtractPanel.add(new JLabel("Total"));
        subtractPanel.add(subtractResult);
        subtractPanel.add(clearSubtractBtn);

        JPanel clearPanel = new JPanel();
        clearPanel.add(clearAllBtn);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel,BoxLayout.PAGE_AXIS));
        contentPanel.add(multiplyPanel);
        contentPanel.add(subtractPanel);
        contentPanel.add(clearPanel);

        //... finalize layout
        this.setContentPane(contentPanel);
        this.pack();
        
        this.setTitle("My Calculator - MVC");
        // The window closing event should probably be passed to the 
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void resetMultiplyResult() {
        multiplyResult.setText(CalcModel.INITIAL_MULTIPLY_VALUE);
    }

    void resetSubtractResult(){
        subtractResult.setText(CalcModel.INITIAL_SUBTRACT_VALUE);
    }

    void resetAllResults(){
        resetMultiplyResult();
        resetSubtractResult();
        multiplyUserInput.setText("");
        subtractUserInput.setText("");
    }
    
    String getMultiplyUserInput() {
        return multiplyUserInput.getText();
    }

    String getSubtractUserInput(){
        return subtractUserInput.getText();
    }
    
    void setMultiplyTotal(String newTotal) {
        multiplyResult.setText(newTotal);
    }

    void setSubtractTotal(String newTotal){
        subtractResult.setText(newTotal);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);

          // there are multiple message dialogs such as confirmDialog, messageDialog, optionDialog
//        JOptionPane.showConfirmDialog(this, errMessage);
//        String[] options = { "rock", "paper", "scissors" };
//        JOptionPane.showOptionDialog(this, "Select one:", "Let's play a game!",
//                0, 3, null, options, options[0]);
    }

    void addMultiplyListener(ActionListener mal) {
        multiplyBtn.addActionListener(mal);
    }

    void addSubtractListener(ActionListener sub) {
        subtractBtn.addActionListener(sub);
    }
    
    void addMultiplyClearListener(ActionListener cal) {
        clearMultiplyBtn.addActionListener(cal);
    }

    void addSubtractClearListener(ActionListener sub) {
        clearSubtractBtn.addActionListener(sub);
    }

    void addClearAllListener(ActionListener clearAll){
        clearAllBtn.addActionListener(clearAll);
    }


}
