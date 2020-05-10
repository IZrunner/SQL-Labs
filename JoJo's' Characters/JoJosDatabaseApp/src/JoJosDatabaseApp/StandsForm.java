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

public class StandsForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    JoJoMainClass joJoMainClassOjb = new JoJoMainClass();
    String populateTableSql = "SELECT * FROM Stands";
    
    
    public StandsForm() 
    {    
        initComponents(); 
        connectionObj = joJoMainClassOjb.connect(); 
        populateTableMethod();
        
    }
    
    private void populateTableMethod()
    {
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(populateTableSql);
            resultSetObj = prepparedStatObj.executeQuery();
            standsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(StandsForm.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addStandButton = new javax.swing.JButton();
        standNameLabel = new javax.swing.JLabel();
        setPowerLabel = new javax.swing.JLabel();
        naturSynthLabel = new javax.swing.JLabel();
        standNameTextField = new javax.swing.JTextField();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        standsTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();
        setSpeedLabel = new javax.swing.JLabel();
        rangeLabel = new javax.swing.JLabel();
        vitalityLabel = new javax.swing.JLabel();
        precisionLabel = new javax.swing.JLabel();
        developLabel = new javax.swing.JLabel();
        naturSynthComboBox = new javax.swing.JComboBox<>();
        rangeComboBox = new javax.swing.JComboBox<>();
        powerComboBox = new javax.swing.JComboBox<>();
        speedComboBox = new javax.swing.JComboBox<>();
        vitalityComboBox = new javax.swing.JComboBox<>();
        sortLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchFieldTextField = new javax.swing.JTextField();
        sortButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        repopulateTableButton7 = new javax.swing.JButton();
        precisionComboBox = new javax.swing.JComboBox<>();
        developComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setName(""); // NOI18N

        addStandButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        addStandButton.setText("Add new");
        addStandButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCharacterActionPerformed(evt);
            }
        });

        standNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        standNameLabel.setText("Stand Name");

        setPowerLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setPowerLabel.setText("Power");

        naturSynthLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        naturSynthLabel.setText("Natural/Synthetic");

        standNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        standsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stand_Name", "Natural_Synthetic", "Power", "Speed", "Range", "Vitality", "Precision", "Develop"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        standsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                standsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(standsTable);

        removeShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removeShipButton.setText("Remove");
        removeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCharacterButtonActionPerformed(evt);
            }
        });

        setSpeedLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setSpeedLabel.setText("Speed");

        rangeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        rangeLabel.setText("Range");

        vitalityLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        vitalityLabel.setText("Vitality");

        precisionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        precisionLabel.setText("Precision");

        developLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        developLabel.setText("Develop");

        naturSynthComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        naturSynthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Natural", "Synthetic" }));

        rangeComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rangeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        powerComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        powerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        speedComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        speedComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        vitalityComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vitalityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        sortLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        sortLabel.setText("Sort");

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Stand_Name", "Natural_Synthetic", "Power", "Speed", "Range", "Vitality", "Precision", "Develop" }));

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

        precisionComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        precisionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        developComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        developComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(standNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naturSynthLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setPowerLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setSpeedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rangeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vitalityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precisionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(developLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(standNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(naturSynthComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rangeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(powerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(speedComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vitalityComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precisionComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(developComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(removeShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                            .addComponent(addStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naturSynthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(naturSynthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(powerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setPowerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setSpeedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rangeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vitalityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vitalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precisionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precisionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(developComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(developLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(addStandButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCharacterActionPerformed
        // TODO add your handling code here:
        String standName = standNameTextField.getText();
        String standNatSynth = naturSynthComboBox.getSelectedItem().toString();
        String standPower = powerComboBox.getSelectedItem().toString();
        String standSpeed = speedComboBox.getSelectedItem().toString();
        String standRange = rangeComboBox.getSelectedItem().toString();
        String standVitality = vitalityComboBox.getSelectedItem().toString();
        String standPrecision = precisionComboBox.getSelectedItem().toString();
        String standDevelop = developComboBox.getSelectedItem().toString();
        String sqlInsertNewCharacter = "INSERT INTO Stands(Stand_Name, Natural_Synthetic, Power, Speed, Range, Vitality, Precision, Develop) VALUES(?,?,?,?,?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewCharacter); 
            pstmt.setString(1, standName);
            pstmt.setString(2, standNatSynth);           
            pstmt.setString(3, standPower);
            pstmt.setString(4, standSpeed);
            pstmt.setString(5, standRange);
            pstmt.setString(6, standVitality);
            pstmt.setString(7, standPrecision);
            pstmt.setString(8, standDevelop);
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
        String standName = standNameTextField.getText();
        String standNatSynth = naturSynthComboBox.getSelectedItem().toString();
        String standPower = powerComboBox.getSelectedItem().toString();
        String standSpeed = speedComboBox.getSelectedItem().toString();
        String standRange = rangeComboBox.getSelectedItem().toString();
        String standVitality = vitalityComboBox.getSelectedItem().toString();
        String standPrecision = precisionComboBox.getSelectedItem().toString();
        String standDevelop = developComboBox.getSelectedItem().toString();
        
        String sql = "UPDATE Stands SET Stand_Name = ? , Natural_Synthetic = ? , Power = ? , Speed = ? , Range = ? ,"
                + "Vitality = ? ,Precision = ? ,Develop = ? "
                + "WHERE Stand_Name = ?";
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setString(1, standName);
            prepparedStatObj.setString(2, standNatSynth);           
            prepparedStatObj.setString(3, standPower);
            prepparedStatObj.setString(4, standSpeed);
            prepparedStatObj.setString(5, standRange);
            prepparedStatObj.setString(6, standVitality);
            prepparedStatObj.setString(7, standPrecision);
            prepparedStatObj.setString(8, standDevelop);
            prepparedStatObj.setString(9, standName);
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
        String sql = "DELETE FROM Stands WHERE Stand_Name = ?";   
        //int selectedRowIndex = shipsInOuterSpaceTable.getSelectedRow();
        String selectedRow = standsTable.getModel().getValueAt(standsTable.getSelectedRow(), 1).toString();
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

    private void standsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_standsTableMouseClicked
        // TODO add your handling code here:
        try {
            int row = standsTable.getSelectedRow();
            String tableClick = (standsTable.getModel().getValueAt(row, 1).toString());
            String sql = "SELECT * FROM Stands WHERE Stand_Name = '"+tableClick+"' ";
            
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            if(resultSetObj.next())
            {
                String standName = resultSetObj.getString("Stand_Name");
                standNameTextField.setText(standName);
                
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("table fill went wrong");
        }
    }//GEN-LAST:event_standsTableMouseClicked

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        String selectedColumn = sortComboBox.getSelectedItem().toString();
        String sqlSort = "SELECT * FROM Stands GROUP BY " + selectedColumn;
        
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSort);
            resultSetObj = prepparedStatObj.executeQuery();
            standsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj)); 
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
        String sqlSearch = "SELECT * FROM Stands WHERE " + searchedColumn + " LIKE ?";
        
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSearch);
            //prepparedStatObj.setString(1, searchedColumn);
            prepparedStatObj.setString(1, "%" + searchPattern + "%");
            resultSetObj = prepparedStatObj.executeQuery();
            standsTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));         
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
            java.util.logging.Logger.getLogger(StandsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StandsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JButton addStandButton;
    private javax.swing.JComboBox<String> developComboBox;
    private javax.swing.JLabel developLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> naturSynthComboBox;
    private javax.swing.JLabel naturSynthLabel;
    private javax.swing.JComboBox<String> powerComboBox;
    private javax.swing.JComboBox<String> precisionComboBox;
    private javax.swing.JLabel precisionLabel;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JComboBox<String> rangeComboBox;
    private javax.swing.JLabel rangeLabel;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JButton repopulateTableButton7;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchFieldTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JLabel setPowerLabel;
    private javax.swing.JLabel setSpeedLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JComboBox<String> speedComboBox;
    private javax.swing.JLabel standNameLabel;
    private javax.swing.JTextField standNameTextField;
    private javax.swing.JTable standsTable;
    private javax.swing.JComboBox<String> vitalityComboBox;
    private javax.swing.JLabel vitalityLabel;
    // End of variables declaration//GEN-END:variables
}
