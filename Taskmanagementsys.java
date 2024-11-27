import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.*;

public class Taskmanagementsys extends javax.swing.JDialog {
       //member variable of class taskmanagement
      private DefaultTableModel taskTableModel;
    private JTable jTable1;
    private Stack<Object[]> undoStack; // Stack to store tasks for undo
       

    public Taskmanagementsys(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        
      //These three lines of code are declarations for member variables in your Taskmanagementsys class.
        
       // Initialize the table model, table, and undo stack
        taskTableModel = new DefaultTableModel();
        jTable1 = new JTable(taskTableModel);
        undoStack = new Stack<>();
        
        // Add columns to the table model
        taskTableModel.addColumn("Task");
        taskTableModel.addColumn("Due Date");
        taskTableModel.addColumn("Difficulty");

        // Add the JTable to a JScrollPane
        JScrollPane jScrollPane = new JScrollPane(jTable1);

        // Add JScrollPane to the tab in jTabbedPane3
        JPanel panel = new JPanel();
        panel.add(jScrollPane);
        jTabbedPane3.addTab("Tasks", panel);  // Add the panel to the tabbed
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Task Mangment System");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 176, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TaskName:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Due Date:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 176, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hard", "Normal", "Easy" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 412, 176, 30));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Difficulty:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButton2.setText("Add task");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 100, 30));

        jButton1.setText("Undo task");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 100, 30));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 100, 30));

        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 100, 30));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTabbedPane3.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jScrollPane1.setViewportView(jTabbedPane3);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 510, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Delete selected task from the JTable
        int selectedRow = jTable1.getSelectedRow();//This line retrieves the index of the currently selected row in jTable1. If no row is selected, selectedRow will be -1.
        if (selectedRow != -1) {//The if statement checks if a row is selected. If selectedRow is not -1, it means a row is selected and can be deleted.
            // Store the task before deletion to undo stack
            Object[] deletedTask = new Object[]{
                taskTableModel.getValueAt(selectedRow, 0),  //gets the task name.
                taskTableModel.getValueAt(selectedRow, 1), //gets the due date.
                taskTableModel.getValueAt(selectedRow, 2) // gets the difficulty level.
            };

            // Push the deleted task to undo stack
            undoStack.push(deletedTask);

            // Remove the row from the table
            taskTableModel.removeRow(selectedRow);

            // Sort tasks after deletion
            sortTasks();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to delete.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Undo the last action (either delete or add)
        if (!undoStack.isEmpty()) {
            Object[] lastAction = undoStack.pop();

            // Add the last action back to the table (if it was a deletion)
            taskTableModel.addRow(lastAction);

            // Sort tasks after undo
            sortTasks();
        } else {
            JOptionPane.showMessageDialog(this, "No actions to undo.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Add a task to the table
        String taskName = jTextField1.getText();    // Task name from jTextField1
        String dueDate = jTextField2.getText();     // Due date from jTextField2
        String priority = jComboBox1.getSelectedItem().toString(); // Priority from jComboBox1

        // Check if the task name and description are not empty
        if (!taskName.isEmpty() && !dueDate.isEmpty()) {
            // Add new row to the table
            Object[] newRow = {taskName, dueDate, priority};
            taskTableModel.addRow(newRow);

            // Add the new task to the undo stack for undo functionality
            undoStack.push(newRow);

            // Sort tasks after adding
            sortTasks();

            // Clear fields
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill out all fields before adding a task.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // Get the text from the JTextField
        String inputText = jTextField1.getText();

        // Create an array with the input text to add as a new row in JTable
        Object[] newRow = { inputText };

        // Clear the JTextField after the input is added to the table
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Get the selected row in the JTable
    int selectedRow = jTable1.getSelectedRow();
    
    // Check if a row is selected
    if (selectedRow != -1) {
        // Get the new values from the input fields
        String updatedTaskName = jTextField1.getText();
        String updatedDueDate = jTextField2.getText();
        String updatedPriority = jComboBox1.getSelectedItem().toString();
        
        // Validate the input fields to ensure they are not empty
        if (!updatedTaskName.isEmpty() && !updatedDueDate.isEmpty()) {
            // Update the table model with the new values
            taskTableModel.setValueAt(updatedTaskName, selectedRow, 0);
            taskTableModel.setValueAt(updatedDueDate, selectedRow, 1);
            taskTableModel.setValueAt(updatedPriority, selectedRow, 2);
            
            // Optionally, you can also clear the input fields after updating
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill out all fields before updating a task.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please select a task to update.");
    }
    }//GEN-LAST:event_jButton4ActionPerformed
       private void sortTasks() {
        // Create a list of all tasks from the table model
    List<Object[]> tasks = new ArrayList<>();
    for (int i = 0; i < taskTableModel.getRowCount(); i++) {
        tasks.add(new Object[]{
            taskTableModel.getValueAt(i, 0),
            taskTableModel.getValueAt(i, 1),
            taskTableModel.getValueAt(i, 2)
        });
    }

    // Bubble sort algorithm to sort the list by the "Difficulty" column (task[2])
    for (int i = 0; i < tasks.size() - 1; i++) {
        for (int j = 0; j < tasks.size() - 1 - i; j++) {
            String priority1 = (String) tasks.get(j)[2];
            String priority2 = (String) tasks.get(j + 1)[2];

            // Compare two adjacent tasks and swap if they are out of order
            if (priority1.compareTo(priority2) > 0) {
                // Swap tasks[j] and tasks[j + 1]
                Object[] temp = tasks.get(j);
                tasks.set(j, tasks.get(j + 1));
                tasks.set(j + 1, temp);
            }
        }
    }

    // Clear the table and re-add the sorted tasks
    taskTableModel.setRowCount(0);
    for (Object[] task : tasks) {
        taskTableModel.addRow(task);
    }
    }    
    
    
     private void addTask(ActionEvent evt) {
        // Add task to the JTable
        String taskName = jTextField1.getText();
        String taskDescription = jTextField2.getText();
        String priority = jComboBox1.getSelectedItem().toString();

        if (!taskName.isEmpty() && !taskDescription.isEmpty()) {
            taskTableModel.addRow(new Object[]{taskName, taskDescription, priority});
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Please fill out all fields.");
        }
    }

    private void deleteTask(ActionEvent evt) {
        // Delete selected task from the JTable
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            taskTableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a task to delete.");
        }
    }

    private void clearFields() {
        // Clear input fields
        jTextField1.setText("");
        jTextField2.setText("");
        jComboBox1.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Taskmanagementsys dialog = new Taskmanagementsys(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
}
