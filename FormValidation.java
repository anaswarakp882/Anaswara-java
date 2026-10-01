import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Pattern;


public class FormValidation extends JFrame implements ActionListener {


    JLabel lblName, lblEmail, lblPhone, lblPassword, lblGender;
    JTextField txtName, txtEmail, txtPhone;
    JPasswordField txtPassword;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JButton btnSubmit, btnClear;


    public FormValidation() {


        setTitle("Form Validation");
        setSize(450, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        lblName = new JLabel("Name:");
        lblName.setBounds(50, 40, 100, 25);


        txtName = new JTextField();
        txtName.setBounds(170, 40, 180, 25);


        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 80, 100, 25);


        txtEmail = new JTextField();
        txtEmail.setBounds(170, 80, 180, 25);


        lblPhone = new JLabel("Phone:");
        lblPhone.setBounds(50, 120, 100, 25);


        txtPhone = new JTextField();
        txtPhone.setBounds(170, 120, 180, 25);


        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 160, 100, 25);


        txtPassword = new JPasswordField();
        txtPassword.setBounds(170, 160, 180, 25);


        lblGender = new JLabel("Gender:");
        lblGender.setBounds(50, 200, 100, 25);


        male = new JRadioButton("Male");
        male.setBounds(170, 200, 80, 25);


        female = new JRadioButton("Female");
        female.setBounds(250, 200, 100, 25);


        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(100, 270, 100, 30);
        btnSubmit.addActionListener(this);


        btnClear = new JButton("Clear");
        btnClear.setBounds(230, 270, 100, 30);
        btnClear.addActionListener(this);


        add(lblName);
        add(txtName);
        add(lblEmail);
        add(txtEmail);
        add(lblPhone);
        add(txtPhone);
        add(lblPassword);
        add(txtPassword);
        add(lblGender);
        add(male);
        add(female);
        add(btnSubmit);
        add(btnClear);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == btnSubmit) {


            String name = txtName.getText().trim();
            String email = txtEmail.getText().trim();
            String phone = txtPhone.getText().trim();
            String password = new String(txtPassword.getPassword());


            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Name cannot be empty");
                txtName.requestFocus();
                return;
            }


            String emailPattern =
                    "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";


            if (!Pattern.matches(emailPattern, email)) {
                JOptionPane.showMessageDialog(this,
                        "Enter a valid email address");
                txtEmail.requestFocus();
                return;
            }


            if (!phone.matches("\\d{10}")) {
                JOptionPane.showMessageDialog(this,
                        "Phone number must contain exactly 10 digits");
                txtPhone.requestFocus();
                return;
            }


            if (password.length() < 6) {
                JOptionPane.showMessageDialog(this,
                        "Password must contain at least 6 characters");
                txtPassword.requestFocus();
                return;
            }


            if (!male.isSelected() && !female.isSelected()) {
                JOptionPane.showMessageDialog(this,
                        "Please select your gender");
                return;
            }


            JOptionPane.showMessageDialog(this,
                    "Form submitted successfully!");


        } else if (e.getSource() == btnClear) {


            txtName.setText("");
            txtEmail.setText("");
            txtPhone.setText("");
            txtPassword.setText("");
            genderGroup.clearSelection();


            txtName.requestFocus();
        }
    }


    public static void main(String[] args) {
        new FormValidation();
    }
}