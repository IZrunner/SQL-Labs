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

public class CharactersForm extends javax.swing.JFrame {
    Connection connectionObj = null;
    PreparedStatement prepparedStatObj = null;
    ResultSet resultSetObj = null;
    JoJoMainClass joJoMainClassOjb = new JoJoMainClass();
    String populateTableSql = "SELECT * FROM Characters";
    
    
    public CharactersForm() 
    {    
        initComponents(); 
        connectionObj = joJoMainClassOjb.connect(); 
        selectNationality();
        selectPart();
        selectFractions();
        selectRace();
        populateTableMethod();
        
    }
    
    private void populateTableMethod()
    {
        String populateTableSql = "SELECT * FROM Characters";
        try 
        {
            prepparedStatObj = connectionObj.prepareStatement(populateTableSql);
            resultSetObj = prepparedStatObj.executeQuery();
            charactersTable.setModel(DbUtils.resultSetToTableModel(resultSetObj));           
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(CharactersForm.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    private void selectNationality()
    {
        try 
        {
            String sql = "SELECT * FROM Counrties";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String raceName = resultSetObj.getString("Country_Name").toString();
                nationalityComboBox.addItem(raceName);          
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
    
    private void selectFractions()
    {
        try 
        {
            String sql = "SELECT * FROM Fractions";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String partNumber = resultSetObj.getString("Fraction_Name").toString();
                fractionsComboBox.addItem(partNumber);          
            }
        } 
        catch (SQLException e) 
        {
            System.out.println("Cannot fill the combobox");
        }
    }
     
    private void selectRace()
    {
        try 
        {
            String sql = "SELECT * FROM Races";
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            while (resultSetObj.next()) 
            {
                String partNumber = resultSetObj.getString("Name").toString();
                racesComboBox.addItem(partNumber);          
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
        setNameLabel = new javax.swing.JLabel();
        setNationalityLabel = new javax.swing.JLabel();
        setAgeLabel = new javax.swing.JLabel();
        protagAntagLabel = new javax.swing.JLabel();
        setNameTextField = new javax.swing.JTextField();
        setAgeTextField = new javax.swing.JTextField();
        acceptChangesButton = new javax.swing.JButton();
        quitAcceptChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        charactersTable = new javax.swing.JTable();
        removeShipButton = new javax.swing.JButton();
        setPartLabel = new javax.swing.JLabel();
        abiliyLabel = new javax.swing.JLabel();
        standLabel = new javax.swing.JLabel();
        fractionLabel = new javax.swing.JLabel();
        raceLabel = new javax.swing.JLabel();
        abilityTextField = new javax.swing.JTextField();
        standTextField = new javax.swing.JTextField();
        protagAntagComboBox = new javax.swing.JComboBox<>();
        nationalityComboBox = new javax.swing.JComboBox<>();
        partComboBox = new javax.swing.JComboBox<>();
        fractionsComboBox = new javax.swing.JComboBox<>();
        racesComboBox = new javax.swing.JComboBox<>();
        setIdTextField = new javax.swing.JTextField();
        setIdLabel = new javax.swing.JLabel();
        sortLabel = new javax.swing.JLabel();
        sortComboBox = new javax.swing.JComboBox<>();
        searchLabel = new javax.swing.JLabel();
        searchFieldTextField = new javax.swing.JTextField();
        sortButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchLabel1 = new javax.swing.JLabel();
        searchPatternTextField = new javax.swing.JTextField();
        repopulateTableButton7 = new javax.swing.JButton();

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

        setNameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setNameLabel.setText("Name");

        setNationalityLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setNationalityLabel.setText("Nationality");

        setAgeLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setAgeLabel.setText("Age");

        protagAntagLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        protagAntagLabel.setText("Protagonist/Antagonist");

        setNameTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setAgeTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

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
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Age", "Protagonist_Antagonist", "Nationality", "Part", "Ability", "Stand", "Fraction", "Race"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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

        removeShipButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        removeShipButton.setText("Remove");
        removeShipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeCharacterButtonActionPerformed(evt);
            }
        });

        setPartLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setPartLabel.setText("Part");

        abiliyLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        abiliyLabel.setText("Ability");

        standLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        standLabel.setText("Stand");

        fractionLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        fractionLabel.setText("Fraction");

        raceLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        raceLabel.setText("Race");

        abilityTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        standTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        protagAntagComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        protagAntagComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Protagonist", "Antagonist" }));

        nationalityComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        partComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        fractionsComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        racesComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setIdTextField.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N

        setIdLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        setIdLabel.setText("ID");

        sortLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        sortLabel.setText("Sort");

        sortComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Age", "Pratagonist_Antagonist", "Nationality", "Part", "Ability", "Stand", "Fraction", "Race" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(raceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(setIdLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setAgeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(protagAntagLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setNationalityLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setPartLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(standLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fractionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(setAgeTextField)
                                    .addComponent(setNameTextField)
                                    .addComponent(protagAntagComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(setIdTextField)
                                    .addComponent(nationalityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(standTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fractionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(racesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(removeShipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(acceptChangesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                            .addComponent(addCharacterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(abiliyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(abilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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
                .addGap(268, 268, 268)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(setIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(setNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchFieldTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(searchPatternTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setAgeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(setAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(repopulateTableButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(protagAntagLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(protagAntagComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(setNationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nationalityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fractionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fractionsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(setPartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(partComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abilityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abiliyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(standLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(standTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(racesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(raceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(addCharacterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(removeShipButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(acceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitAcceptChangesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCharacterActionPerformed

        String characterId = setIdTextField.getText();
        String characterName = setNameTextField.getText();
        int characterAge = Integer.parseInt(setAgeTextField.getText());
        String characterProtagAntag = protagAntagComboBox.getSelectedItem().toString();
        String characterNationality = nationalityComboBox.getSelectedItem().toString();
        int characterPart = Integer.parseInt(partComboBox.getSelectedItem().toString());
        String characterAbility = abilityTextField.getText();
        String characterStand = standTextField.getText();
        String characterFraction = fractionsComboBox.getSelectedItem().toString();
        String characterRace = racesComboBox.getSelectedItem().toString();
        String sqlInsertNewCharacter = "INSERT INTO Characters(ID, Name, Age, Protagonist_Antagonist, Nationality, Part, Ability, Stand, Fraction, Race) VALUES(?,?,?,?,?,?,?,?,?,?)";   
        
        try 
        {
            PreparedStatement pstmt = connectionObj.prepareStatement(sqlInsertNewCharacter); 
            pstmt.setString(1, characterId);
            pstmt.setString(2, characterName);
            pstmt.setInt(3, characterAge);
            pstmt.setString(4, characterProtagAntag);
            pstmt.setString(5, characterNationality);
            pstmt.setInt(6, characterPart);
            pstmt.setString(7, characterAbility);
            pstmt.setString(8, characterStand);
            pstmt.setString(9, characterFraction);
            pstmt.setString(10, characterRace);
            pstmt.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println("addin went wrong");
        }
        
    }//GEN-LAST:event_addCharacterActionPerformed

    private void acceptChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptChangesButtonActionPerformed

        String characterId = setIdTextField.getText();
        String characterName = setNameTextField.getText();
        int characterAge = Integer.parseInt(setAgeTextField.getText());
        String characterProtagAntag = protagAntagComboBox.getSelectedItem().toString();
        String characterNationality = nationalityComboBox.getSelectedItem().toString();
        int characterPart = Integer.parseInt(partComboBox.getSelectedItem().toString());
        String characterAbility = abilityTextField.getText();
        String characterStand = standTextField.getText();
        String characterFraction = fractionsComboBox.getSelectedItem().toString();
        String characterRace = racesComboBox.getSelectedItem().toString();
        
        String sql = "UPDATE Characters SET ID = ? , Name = ? , Age = ? , Protagonist_Antagonist = ? , Nationality = ? ,"
                + "Part = ? ,Ability = ? ,Stand = ? ,Fraction = ? , Race = ? "
                + "WHERE ID = ?";
        try
        {
            prepparedStatObj = connectionObj.prepareStatement(sql);
            prepparedStatObj.setString(1, characterId);
            prepparedStatObj.setString(2, characterName);
            prepparedStatObj.setInt(3, characterAge);
            prepparedStatObj.setString(4, characterProtagAntag);     
            prepparedStatObj.setString(5, characterNationality);
            prepparedStatObj.setInt(6, characterPart);
            prepparedStatObj.setString(7, characterAbility);
            prepparedStatObj.setString(8, characterStand);
            prepparedStatObj.setString(9, characterFraction);
            prepparedStatObj.setString(10, characterRace);
            prepparedStatObj.setString(11, characterId);
            prepparedStatObj.executeUpdate();
            populateTableMethod();
        } 
        catch (SQLException e) 
        {
            System.out.println("updating went wrong");
        }
    }//GEN-LAST:event_acceptChangesButtonActionPerformed

    private void quitShipManagementFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitShipManagementFormActionPerformed

        this.dispose();
    }//GEN-LAST:event_quitShipManagementFormActionPerformed

    private void removeCharacterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeCharacterButtonActionPerformed
   
        String sql = "DELETE FROM Characters WHERE Name = ?";   
        //int selectedRowIndex = shipsInOuterSpaceTable.getSelectedRow();
        String selectedRow = charactersTable.getModel().getValueAt(charactersTable.getSelectedRow(), 1).toString();
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

        try {
            int row = charactersTable.getSelectedRow();
            String tableClick = (charactersTable.getModel().getValueAt(row, 1).toString());
            String sql = "SELECT * FROM Characters WHERE Name = '"+tableClick+"' ";
            
            prepparedStatObj = connectionObj.prepareStatement(sql);
            resultSetObj = prepparedStatObj.executeQuery();
            
            if(resultSetObj.next())
            {
                String characterId = resultSetObj.getString("ID");
                String characterName = resultSetObj.getString("Name");
                String characterAge = resultSetObj.getString("Age");
                String characterAbility = resultSetObj.getString("Ability");
                String characterStand = resultSetObj.getString("Stand");
                
                setIdTextField.setText(characterId);
                setNameTextField.setText(characterName);
                setAgeTextField.setText(characterAge);
                abilityTextField.setText(characterAbility);
                standTextField.setText(characterStand);
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
        String sqlSort = "SELECT * FROM Characters GROUP BY " + selectedColumn;
        
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
        String sqlSearch = "SELECT * FROM Characters WHERE " + searchedColumn + " LIKE ?";
        
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
            java.util.logging.Logger.getLogger(CharactersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharactersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharactersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharactersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CharactersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abilityTextField;
    private javax.swing.JLabel abiliyLabel;
    private javax.swing.JButton acceptChangesButton;
    private javax.swing.JButton addCharacterButton;
    private javax.swing.JTable charactersTable;
    private javax.swing.JLabel fractionLabel;
    private javax.swing.JComboBox<String> fractionsComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nationalityComboBox;
    private javax.swing.JComboBox<Integer> partComboBox;
    private javax.swing.JComboBox<String> protagAntagComboBox;
    private javax.swing.JLabel protagAntagLabel;
    private javax.swing.JButton quitAcceptChangesButton;
    private javax.swing.JLabel raceLabel;
    private javax.swing.JComboBox<String> racesComboBox;
    private javax.swing.JButton removeShipButton;
    private javax.swing.JButton repopulateTableButton7;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchFieldTextField;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel searchLabel1;
    private javax.swing.JTextField searchPatternTextField;
    private javax.swing.JLabel setAgeLabel;
    private javax.swing.JTextField setAgeTextField;
    private javax.swing.JLabel setIdLabel;
    private javax.swing.JTextField setIdTextField;
    private javax.swing.JLabel setNameLabel;
    private javax.swing.JTextField setNameTextField;
    private javax.swing.JLabel setNationalityLabel;
    private javax.swing.JLabel setPartLabel;
    private javax.swing.JButton sortButton;
    private javax.swing.JComboBox<String> sortComboBox;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JLabel standLabel;
    private javax.swing.JTextField standTextField;
    // End of variables declaration//GEN-END:variables
}
