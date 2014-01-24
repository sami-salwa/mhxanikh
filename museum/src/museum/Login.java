package museum;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.util.Random;
import javax.swing.JOptionPane;
public class Login extends javax.swing.JFrame 
{   
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Διευθυντής", "Διαχειριστής" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, 20));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 50, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, 20));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 111, -1));

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 111, -1));

        jButton2.setText("Πίσω");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/museum/images/museum-of-arts.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -3, 390, 280));

        setSize(new java.awt.Dimension(399, 316));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        String Message = "Please Enter Valid Information";
        
        if (username.equals("adm") && password.equals("1234"))
        {
            new Home().setVisible(true);
            setVisible(false);
            dispose();
        }
        else
        {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,Message);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        String Message = "Please Enter Valid Information";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER)
        {
           if (username.equals("adm") && password.equals("1234")) 
           {
            new Home().setVisible(true);
            setVisible(false);
            dispose();
           }
           else
           {
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(null,Message);
           }
        } 
    }//GEN-LAST:event_jButton1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        String Message = "Please Enter Valid Information";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER)
        {
           if (username.equals("adm") && password.equals("1234")) 
           {
            new Home().setVisible(true);
            setVisible(false);
            dispose();
           }
           else
           {
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(null,Message);
           }
        } 
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        String Message = "Please Enter Valid Information";
        int key = evt.getKeyCode();
        if (key == KeyEvent.VK_ENTER)
        {
           if (username.equals("root") && password.equals("anik")) 
           {
            new Home().setVisible(true);
            setVisible(false);
            dispose();
           }
           else
           {
               Toolkit.getDefaultToolkit().beep();
               JOptionPane.showMessageDialog(null,Message);
           }
        } 
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Home().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

public Login() 
 {
        super();
        create();
        this.setVisible(true);
        initComponents();
 }
     
private void create()
     {
         jLabel1 = new javax.swing.JLabel();
         jLabel2 = new javax.swing.JLabel();
         jTextField1 = new javax.swing.JTextField();
         jPasswordField1 = new javax.swing.JPasswordField();
         jButton1 = new javax.swing.JButton();
        
     }
 }