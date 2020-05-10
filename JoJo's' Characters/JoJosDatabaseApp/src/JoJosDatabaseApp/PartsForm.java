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

public class PartsForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    JoJoMainClass joJoMainClassOjb = new JoJoMainClass();
    String populateTableSql = "SELECT * FROM Parts";
    
    
    public PartsForm() 
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
            charactersTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(PartsForm.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPartButton = new javax.swing.JButton();
        setTitleLabel = new javax.swing.JLabel();
        setYearOfStartLabel = new javax.swing.JLabel();
        setTitleTextField = new javax.swing.JTextField();
        setYearOfStartTextField = new javax.swing.JTextField();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        charactersTable = new javax.swing.JTable();
        removePartButton = new javax.swing.JButton();
        YearOfEndLabel = new javax.swing.JLabel();
        amountOfChaptersLabel = new javax.swing.JLabel();
        mainGenreLabel = new javax.swing.JLabel();
        setYearOfEndTextField = new javax.swing.JTextField();
        amountOfChaptersTextField = new javax.swing.JTextField();
        setNumberTextField = new javax.swing.JTextField();
        numberLabel = new javax.swing.JLabel();
        mainGenreTextField = new javax.swing.JTextField();
        sortLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchFieldTextField = new javax.swing.JTextField();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        sortButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setName(""); // NOI18N

        addPartButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        addPartButton.setText("Add new");
        addPartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCharacterActionPerformed(evt);
            }
        });

        setTitleLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setTitleLabel.setText("Title");

        setYearOfStartLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setYearOfStartLabel.setText("Year Of Start");

        setTitleTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setYearOfStartTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        charactersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, ""},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Title", "Year_Of_Start", "Year_Of_End", "Amount_Of_Chapters", "Main_Genre", "Author"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        charactersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                charactersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(charactersTable);

        removePartButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removePartButton.setText("Remove");
        removePartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCharacterButtonActionPerformed(evt);
            }
        });

        YearOfEndLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        YearOfEndLabel.setText("Year Of End");

        amountOfChaptersLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        amountOfChaptersLabel.setText("Amount Of Chapters");

        mainGenreLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        mainGenreLabel.setText("Main Genre");

        setYearOfEndTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        amountOfChaptersTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setNumberTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        numberLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        numberLabel.setText("Number");

        mainGenreTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        sortLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        sortLabel.setText("Sort");

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Number", "Title", "Year_Of_Start", "Year_Of_End", "Amount_Of_Chapters", "Main_Genre", "Author" }));

        searchLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel.setText("Search Field");

        searchFieldTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        searchLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        searchLabel1.setText("Search Pattern");

        searchPatternTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numberLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(setYearOfStartLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(YearOfEndLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(mainGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mainGenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(amountOfChaptersLabel)
                                            .addGap(31, 31, 31)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(setYearOfEndTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(amountOfChaptersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(setYearOfStartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(setTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(setNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addPartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(removePartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(284, 284, 284)
                                .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setYearOfStartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setYearOfStartTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(YearOfEndLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setYearOfEndTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountOfChaptersLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountOfChaptersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainGenreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainGenreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removePartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCharacterActionPerformed
        // TODO add your handling code here:
        int partNumber = Integer.parseInt(setNumberTextField.getText());
        String partTitle = setTitleTextField.getText();
        int partYOS = Integer.parseInt(setYearOfStartTextField.getText());
        int partYOE = Integer.parseInt(setYearOfEndTextField.getText());
        int partChaptersAmount = Integer.parseInt(amountOfChaptersTextField.getText());      
        String partMainGenre = mainGenreTextField.getText();     
        String sqlInsertNewCharacter = "INSERT INTO Parts(Number, Title, Year_Of_Start, "
                + "Year_Of_End, Amount_Of_Chapters, Main_Genre, Author) VALUES(?,?,?,?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewCharacter); 
            pstmt.setInt(1, partNumber);
            pstmt.setString(2, partTitle);
            pstmt.setInt(3, partYOS);
            pstmt.setInt(4, partYOE);
            pstmt.setInt(5, partChaptersAmount);
            pstmt.setString(6, partMainGenre);
            pstmt.setString(7, "Araki Hirohiko");    
            pstmt.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_addCharacterActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed
        // TODO add your handling code here:  
        int partNumber = Integer.parseInt(setNumberTextField.getText());
        String partTitle = setTitleTextField.getText();
        int partYOS = Integer.parseInt(setYearOfStartTextField.getText());
        int partYOE = Integer.parseInt(setYearOfEndTextField.getText());
        int partChaptersAmount = Integer.parseInt(amountOfChaptersTextField.getText());      
        String partMainGenre = mainGenreTextField.getText();            
        String sql = "UPDATE Parts SET Number = ? , Title = ? , Year_Of_Start = ? , Year_Of_End = ? , Amount_Of_Chapters = ? ,"
                + "Main_Genre = ? ,Author = ? "
                + "WHERE Number = ?";
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setInt(1, partNumber);
            prepparedStatObj.setString(2, partTitle);
            prepparedStatObj.setInt(3, partYOS);
            prepparedStatObj.setInt(4, partYOE);     
            prepparedStatObj.setInt(5, partChaptersAmount);
            prepparedStatObj.setString(6, partMainGenre);
            prepparedStatObj.setString(7, "Araki Hirohiko");
            prepparedStatObj.setInt(8, partNumber);
            prepparedStatObj.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_acceptChangesButtonActionPerformed

    private void quitShipManagementFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitShipManagementFormActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quitShipManagementFormActionPerformed

    private void removeCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCharacterButtonActionPerformed
        // TODO add your handling code here:       
        String sql = "DELETE FROM Parts WHERE Number = ?";   
        //int selectedRowIndex = shipsInOuterSpaceTable.getSelectedRow();
        String selectedRow = charactersTable.getModel().getValueAt(charactersTable.getSelectedRow(), 0).toString();
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

    private void charactersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_charactersTableMouseClicked
        // TODO add your handling code here:
        try {
            int row = charactersTable.getSelectedRow();
            String tableClick = (charactersTable.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM Parts WHERE Number = '"+tableClick+"' ";
            
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            if(resultSetObj.next())
            {
                String partNumber = resultSetObj.getString("Number");
                String partTitle = resultSetObj.getString("Title");
                String partYOS = resultSetObj.getString("Year_Of_Start");
                String partYOE = resultSetObj.getString("Year_Of_End");
                String partChaptersAmount = resultSetObj.getString("Amount_Of_Chapters");
                String partMainGenre = resultSetObj.getString("Main_Genre");     
                
                setNumberTextField.setText(partNumber);
                setTitleTextField.setText(partTitle);
                setYearOfStartTextField.setText(partYOS);
                setYearOfEndTextField.setText(partYOE);
                amountOfChaptersTextField.setText(partChaptersAmount);
                mainGenreTextField.setText(partMainGenre);
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("table fill went wrong");
        }
    }//GEN-LAST:event_charactersTableMouseClicked

    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        // TODO add your handling code here:
        String selectedColumn = sortComboBox.getSelectedItem().toString();
        String sqlSort = "SELECT * FROM Parts GROUP BY " + selectedColumn;

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSort);
            resultSetObj = prepparedStatObj.executeQuery();
            charactersTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
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
        String sqlSearch = "SELECT * FROM Parts WHERE " + searchedColumn + " LIKE ?";

        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sqlSearch);
            //prepparedStatObj.setString(1, searchedColumn);
            prepparedStatObj.setString(1, "%" + searchPattern + "%");
            resultSetObj = prepparedStatObj.executeQuery();
            charactersTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));
        }
        catch (Exception e)
        {
            System.out.println("seraching went wrong");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PartsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new PartsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel YearOfEndLabel;
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JButton addPartButton;
    private javax.swing.JLabel amountOfChaptersLabel;
    private javax.swing.JTextField amountOfChaptersTextField;
    private javax.swing.JTable charactersTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mainGenreLabel;
    private javax.swing.JTextField mainGenreTextField;
    private javax.swing.JLabel numberLabel;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JButton removePartButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchFieldTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JTextField setNumberTextField;
    private javax.swing.JLabel setTitleLabel;
    private javax.swing.JTextField setTitleTextField;
    private javax.swing.JTextField setYearOfEndTextField;
    private javax.swing.JLabel setYearOfStartLabel;
    private javax.swing.JTextField setYearOfStartTextField;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    // End of variables declaration//GEN-END:variables
}
