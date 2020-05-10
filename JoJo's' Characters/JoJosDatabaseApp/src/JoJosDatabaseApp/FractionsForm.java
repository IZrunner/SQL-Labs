package JoJosDatabaseApp;

import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FractionsForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    JoJoMainClass joJoMainClassOjb = new JoJoMainClass();
    String populateTableSql = "SELECT * FROM Fractions";
    
    
    public FractionsForm() 
    {    
        initComponents(); 
        connectionObj = joJoMainClassOjb.connect(); 
        selectCountry();
        selectPart();
        populateTableMethod();
        
    }
    
    private void populateTableMethod()
    {
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(populateTableSql);
            resultSetObj = prepparedStatObj.executeQuery();
            fractionsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(FractionsForm.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    private void selectCountry()
    {
        try 
        {
            String sql = "SELECT * FROM Counrties";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String raceName = resultSetObj.getString("Country_Name").toString();
                countryComboBox.addItem(raceName);          
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Cannot fill the combobox");
        }
    }
    
    private void selectPart()
    {
        try 
        {
            String sql = "SELECT * FROM Parts";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                int partNumber = resultSetObj.getInt(1);
                partComboBox.addItem(partNumber);          
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Cannot fill the combobox");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCharacterButton = new javax.swing.JButton();
        setFractionNameLabel = new javax.swing.JLabel();
        setNationalityLabel = new javax.swing.JLabel();
        setCountryLabel = new javax.swing.JLabel();
        protagAntagLabel = new javax.swing.JLabel();
        setFractionNameTextField = new javax.swing.JTextField();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fractionsTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();
        setPartLabel = new javax.swing.JLabel();
        leaderTextField = new javax.swing.JTextField();
        protagAntagComboBox = new javax.swing.JComboBox<>();
        partComboBox = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchFieldTextField = new javax.swing.JTextField();
        sortButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        repopulateTableButton7 = new javax.swing.JButton();
        countryComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setName(""); // NOI18N

        addCharacterButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        addCharacterButton.setText("Add new");
        addCharacterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCharacterActionPerformed(evt);
            }
        });

        setFractionNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setFractionNameLabel.setText("Fraction Name");

        setNationalityLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setNationalityLabel.setText("Leader");

        setCountryLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setCountryLabel.setText("Country");

        protagAntagLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        protagAntagLabel.setText("Protagonist/Antagonist");

        setFractionNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        acceptChangesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        acceptChangesButton.setText("Accept changes");
        acceptChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptChangesButtonActionPerformed(evt);
            }
        });

        quitAcceptChangesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        quitAcceptChangesButton.setText("Quit");
        quitAcceptChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitShipManagementFormActionPerformed(evt);
            }
        });

        fractionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fraction_Name ", "Protagonist_Antagonist", "Country", "Part", "Ability", "Leader"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        fractionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fractionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(fractionsTable);

        removeShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removeShipButton.setText("Remove");
        removeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCharacterButtonActionPerformed(evt);
            }
        });

        setPartLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setPartLabel.setText("Part");

        leaderTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        protagAntagComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        protagAntagComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Protagonist", "Antagonist" }));

        partComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sortLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        sortLabel.setText("Sort");

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fraction_Name", "Protagonist_Antagonist", "Country", "Part", "Leader" }));

        searchLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel.setText("Search Field");

        searchFieldTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        sortButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        searchButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        searchLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel1.setText("Search Pattern");

        searchPatternTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        repopulateTableButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        repopulateTableButton7.setText("Repopulate Table");
        repopulateTableButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repopulateTableButton7ActionPerformed(evt);
            }
        });

        countryComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(setFractionNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protagAntagLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPartLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setNationalityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setCountryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(protagAntagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setFractionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(addCharacterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPatternTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchFieldTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setFractionNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setFractionNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(repopulateTableButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(protagAntagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(protagAntagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(setCountryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setPartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setNationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(leaderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addCharacterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCharacterActionPerformed
        // TODO add your handling code here:       
        String fractionName = setFractionNameTextField.getText();       
        String fractionProtagAntag = protagAntagComboBox.getSelectedItem().toString();
        String fractionCountry = countryComboBox.getSelectedItem().toString();   
        String fractionPart = partComboBox.getSelectedItem().toString();
        String fractionLeader = leaderTextField.getText();
        
        String sqlInsertNewCharacter = "INSERT INTO Fractions(Fraction_Name, Protagonist_Antagonist, Country, Part, Leader) VALUES(?,?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewCharacter); 
            pstmt.setString(1, fractionName);
            pstmt.setString(2, fractionProtagAntag);
            pstmt.setString(3, fractionCountry);
            pstmt.setString(4, fractionPart);
            pstmt.setString(5, fractionLeader);           
            pstmt.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println("addin went wrong");
        }
        
    }//GEN-LAST:event_addCharacterActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed
        // TODO add your handling code here:  
        String fractionName = setFractionNameTextField.getText();       
        String fractionProtagAntag = protagAntagComboBox.getSelectedItem().toString();
        String fractionCountry = countryComboBox.getSelectedItem().toString();   
        String fractionPart = partComboBox.getSelectedItem().toString();
        String fractionLeader = leaderTextField.getText();
        
        String sql = "UPDATE Fractions SET Fraction_Name = ? , Protagonist_Antagonist = ? , Country = ? ,"
                + "Part = ? ,Leader = ? "
                + "WHERE Fraction_Name = ?";
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setString(1, fractionName);
            prepparedStatObj.setString(2, fractionProtagAntag);
            prepparedStatObj.setString(3, fractionCountry);
            prepparedStatObj.setString(4, fractionPart);
            prepparedStatObj.setString(5, fractionLeader);  
            prepparedStatObj.setString(6, fractionName);          
            prepparedStatObj.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println("updating went wrong");
        }
    }//GEN-LAST:event_acceptChangesButtonActionPerformed

    private void quitShipManagementFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitShipManagementFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitShipManagementFormActionPerformed

    private void removeCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCharacterButtonActionPerformed
        // TODO add your handling code here:       
        String sql = "DELETE FROM Fractions WHERE Fraction_Name = ?";   
        //int selectedRowIndex = shipsInOuterSpaceTable.getSelectedRow();
        String selectedRow = fractionsTable.getModel().getValueAt(fractionsTable.getSelectedRow(), 1).toString();
        try
        {
                prepparedStatObj = connectionObj.prepareStatement(sql);
                prepparedStatObj.setString(1, selectedRow);
                prepparedStatObj.executeUpdate();     
                populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }       
    }//GEN-LAST:event_removeCharacterButtonActionPerformed

    private void fractionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fractionsTableMouseClicked
        // TODO add your handling code here:
        try {
            int row = fractionsTable.getSelectedRow();
            String tableClick = (fractionsTable.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM Fractions WHERE Fraction_Name = '"+tableClick+"' ";
            
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            if(resultSetObj.next())
            {
                String fractionName = resultSetObj.getString("Fraction_Name");
                String fractionLeader = resultSetObj.getString("Leader");
                
                setFractionNameTextField.setText(fractionName);
                leaderTextField.setText(fractionLeader);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("table fill went wrong");
        }
    }//GEN-LAST:event_fractionsTableMouseClicked

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        String selectedColumn = sortComboBox.getSelectedItem().toString();
        String sqlSort = "SELECT * FROM Fractions GROUP BY " + selectedColumn;
        
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSort);
            resultSetObj = prepparedStatObj.executeQuery();
            fractionsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj)); 
        } 
        catch (Exception e) 
        {
            System.out.println("sorting went wrong");
        }
    }//GEN-LAST:event_sortButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String searchedColumn = searchFieldTextField.getText();
        String searchPattern = searchPatternTextField.getText();
        //String sqlSearch = "SELECT * FROM Characters WHERE '" + searchedColumn + "' LIKE ?";
        String sqlSearch = "SELECT * FROM Fractions WHERE " + searchedColumn + " LIKE ?";
        
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSearch);
            //prepparedStatObj.setString(1, searchedColumn);
            prepparedStatObj.setString(1, "%" + searchPattern + "%");
            resultSetObj = prepparedStatObj.executeQuery();
            fractionsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));         
        } 
        catch (Exception e) 
        {
            System.out.println("seraching went wrong");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void repopulateTableButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repopulateTableButton7ActionPerformed
        // TODO add your handling code here:
        populateTableMethod();
    }//GEN-LAST:event_repopulateTableButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FractionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FractionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FractionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FractionsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FractionsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JButton addCharacterButton;
    private javax.swing.JComboBox<String> countryComboBox;
    private javax.swing.JTable fractionsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField leaderTextField;
    private javax.swing.JComboBox<Integer> partComboBox;
    private javax.swing.JComboBox<String> protagAntagComboBox;
    private javax.swing.JLabel protagAntagLabel;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JButton repopulateTableButton7;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchFieldTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JLabel setCountryLabel;
    private javax.swing.JLabel setFractionNameLabel;
    private javax.swing.JTextField setFractionNameTextField;
    private javax.swing.JLabel setNationalityLabel;
    private javax.swing.JLabel setPartLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
}
