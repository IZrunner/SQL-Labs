package JoJosDatabaseApp;

public class MainMenuForm extends javax.swing.JFrame {
    
    public MainMenuForm() 
    {         
        initComponents();              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        charactersButton = new javax.swing.JButton();
        standstButton = new javax.swing.JButton();
        exitApplicationButton = new javax.swing.JButton();
        fractionsButton = new javax.swing.JButton();
        abilitiesButton = new javax.swing.JButton();
        musicReferencesStandsButton = new javax.swing.JButton();
        musicReferencesCharactersButton = new javax.swing.JButton();
        musicReferencesAbilitiesButton = new javax.swing.JButton();
        countriesButton = new javax.swing.JButton();
        taroCardsButton = new javax.swing.JButton();
        taroStandsReferencesButton = new javax.swing.JButton();
        partsButton = new javax.swing.JButton();
        racesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 320));
        setName("mainWindowFrame"); // NOI18N

        charactersButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        charactersButton.setText("Characters");
        charactersButton.setMaximumSize(new java.awt.Dimension(200, 50));
        charactersButton.setMinimumSize(new java.awt.Dimension(200, 50));
        charactersButton.setPreferredSize(new java.awt.Dimension(200, 50));
        charactersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                charactersButtonActionPerformed(evt);
            }
        });

        standstButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        standstButton.setText("Stands");
        standstButton.setMaximumSize(new java.awt.Dimension(220, 50));
        standstButton.setMinimumSize(new java.awt.Dimension(220, 50));
        standstButton.setPreferredSize(new java.awt.Dimension(400, 500));
        standstButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                standsActionPerformed(evt);
            }
        });

        exitApplicationButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        exitApplicationButton.setText("Exit");
        exitApplicationButton.setMaximumSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.setMinimumSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.setPreferredSize(new java.awt.Dimension(220, 50));
        exitApplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitApplicationButtonshipsManagementActionPerformed(evt);
            }
        });

        fractionsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        fractionsButton.setText("Fractions");
        fractionsButton.setMaximumSize(new java.awt.Dimension(220, 50));
        fractionsButton.setMinimumSize(new java.awt.Dimension(220, 50));
        fractionsButton.setPreferredSize(new java.awt.Dimension(400, 500));
        fractionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fractionsButtonshipsManagementActionPerformed(evt);
            }
        });

        abilitiesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        abilitiesButton.setText("Abilities");
        abilitiesButton.setMaximumSize(new java.awt.Dimension(220, 50));
        abilitiesButton.setMinimumSize(new java.awt.Dimension(220, 50));
        abilitiesButton.setPreferredSize(new java.awt.Dimension(400, 500));
        abilitiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abilitiesButtonshipsManagementActionPerformed(evt);
            }
        });

        musicReferencesStandsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        musicReferencesStandsButton.setText("Music References (Stands)");
        musicReferencesStandsButton.setMaximumSize(new java.awt.Dimension(220, 50));
        musicReferencesStandsButton.setMinimumSize(new java.awt.Dimension(220, 50));
        musicReferencesStandsButton.setPreferredSize(new java.awt.Dimension(400, 500));
        musicReferencesStandsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicReferencesStandsButtonshipsManagementActionPerformed(evt);
            }
        });

        musicReferencesCharactersButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        musicReferencesCharactersButton.setText("Music References (Characters)");
        musicReferencesCharactersButton.setMaximumSize(new java.awt.Dimension(220, 50));
        musicReferencesCharactersButton.setMinimumSize(new java.awt.Dimension(220, 50));
        musicReferencesCharactersButton.setPreferredSize(new java.awt.Dimension(400, 500));
        musicReferencesCharactersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicReferencesCharactersActionPerformed(evt);
            }
        });

        musicReferencesAbilitiesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        musicReferencesAbilitiesButton.setText("Music References (Abilities)");
        musicReferencesAbilitiesButton.setMaximumSize(new java.awt.Dimension(220, 50));
        musicReferencesAbilitiesButton.setMinimumSize(new java.awt.Dimension(220, 50));
        musicReferencesAbilitiesButton.setPreferredSize(new java.awt.Dimension(400, 500));
        musicReferencesAbilitiesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicReferencesAbilitiesButtonshipsManagementActionPerformed(evt);
            }
        });

        countriesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        countriesButton.setText("Countries");
        countriesButton.setMaximumSize(new java.awt.Dimension(220, 50));
        countriesButton.setMinimumSize(new java.awt.Dimension(220, 50));
        countriesButton.setPreferredSize(new java.awt.Dimension(400, 500));
        countriesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countriesButtonshipsManagementActionPerformed(evt);
            }
        });

        taroCardsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        taroCardsButton.setText("Taro Cards");
        taroCardsButton.setMaximumSize(new java.awt.Dimension(220, 50));
        taroCardsButton.setMinimumSize(new java.awt.Dimension(220, 50));
        taroCardsButton.setPreferredSize(new java.awt.Dimension(400, 500));
        taroCardsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taroCardsButtonshipsManagementActionPerformed(evt);
            }
        });

        taroStandsReferencesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        taroStandsReferencesButton.setText("Taro Stands References");
        taroStandsReferencesButton.setMaximumSize(new java.awt.Dimension(220, 50));
        taroStandsReferencesButton.setMinimumSize(new java.awt.Dimension(220, 50));
        taroStandsReferencesButton.setPreferredSize(new java.awt.Dimension(400, 500));
        taroStandsReferencesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taroStandsReferencesButtonshipsManagementActionPerformed(evt);
            }
        });

        partsButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        partsButton.setText("Parts");
        partsButton.setMaximumSize(new java.awt.Dimension(220, 50));
        partsButton.setMinimumSize(new java.awt.Dimension(220, 50));
        partsButton.setPreferredSize(new java.awt.Dimension(400, 500));
        partsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partsButtonshipsManagementActionPerformed(evt);
            }
        });

        racesButton.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        racesButton.setText("Races");
        racesButton.setMaximumSize(new java.awt.Dimension(220, 50));
        racesButton.setMinimumSize(new java.awt.Dimension(220, 50));
        racesButton.setPreferredSize(new java.awt.Dimension(400, 500));
        racesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racesButtonshipsManagementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(charactersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(fractionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(standstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(musicReferencesCharactersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(musicReferencesStandsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(abilitiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(musicReferencesAbilitiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(taroCardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(taroStandsReferencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(partsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(racesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(exitApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 165, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(charactersButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicReferencesAbilitiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taroCardsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(standstButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(taroStandsReferencesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fractionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(partsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abilitiesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(racesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicReferencesStandsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(countriesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musicReferencesCharactersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(exitApplicationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void standsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_standsActionPerformed
        StandsForm form = new StandsForm();
        form.setVisible(true);
    }//GEN-LAST:event_standsActionPerformed

    private void exitApplicationButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitApplicationButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitApplicationButtonshipsManagementActionPerformed

    private void fractionsButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fractionsButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        FractionsForm form = new FractionsForm();
        form.setVisible(true);
    }//GEN-LAST:event_fractionsButtonshipsManagementActionPerformed

    private void abilitiesButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abilitiesButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        AbilitiesForm form = new AbilitiesForm();
        form.setVisible(true);
    }//GEN-LAST:event_abilitiesButtonshipsManagementActionPerformed

    private void musicReferencesStandsButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicReferencesStandsButtonshipsManagementActionPerformed
        MusicReferencesStandsForm form = new MusicReferencesStandsForm();
        form.setVisible(true);
    }//GEN-LAST:event_musicReferencesStandsButtonshipsManagementActionPerformed

    private void musicReferencesCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicReferencesCharactersActionPerformed
        // TODO add your handling code here:
        MusicReferencesCharactersForm form = new MusicReferencesCharactersForm();
        form.setVisible(true);
    }//GEN-LAST:event_musicReferencesCharactersActionPerformed

    private void musicReferencesAbilitiesButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicReferencesAbilitiesButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        MusicReferencesAbilitiesForm form = new MusicReferencesAbilitiesForm();
        form.setVisible(true);
    }//GEN-LAST:event_musicReferencesAbilitiesButtonshipsManagementActionPerformed

    private void countriesButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countriesButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        CountriesForm form = new CountriesForm();
        form.setVisible(true);
    }//GEN-LAST:event_countriesButtonshipsManagementActionPerformed

    private void charactersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_charactersButtonActionPerformed
        // TODO add your handling code here:
        CharactersForm form = new CharactersForm();
        form.setVisible(true);
    }//GEN-LAST:event_charactersButtonActionPerformed

    private void taroCardsButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taroCardsButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        TaroCardsForm form = new TaroCardsForm();
        form.setVisible(true);
    }//GEN-LAST:event_taroCardsButtonshipsManagementActionPerformed

    private void taroStandsReferencesButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taroStandsReferencesButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        TaroStandsReferencesForm form = new TaroStandsReferencesForm();
        form.setVisible(true);
    }//GEN-LAST:event_taroStandsReferencesButtonshipsManagementActionPerformed

    private void partsButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partsButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        PartsForm form = new PartsForm();
        form.setVisible(true);
    }//GEN-LAST:event_partsButtonshipsManagementActionPerformed

    private void racesButtonshipsManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racesButtonshipsManagementActionPerformed
        // TODO add your handling code here:
        RacesForm form = new RacesForm();
        form.setVisible(true);
    }//GEN-LAST:event_racesButtonshipsManagementActionPerformed

    
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
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abilitiesButton;
    private javax.swing.JButton charactersButton;
    private javax.swing.JButton countriesButton;
    private javax.swing.JButton exitApplicationButton;
    private javax.swing.JButton fractionsButton;
    private javax.swing.JButton musicReferencesAbilitiesButton;
    private javax.swing.JButton musicReferencesCharactersButton;
    private javax.swing.JButton musicReferencesStandsButton;
    private javax.swing.JButton partsButton;
    private javax.swing.JButton racesButton;
    private javax.swing.JButton standstButton;
    private javax.swing.JButton taroCardsButton;
    private javax.swing.JButton taroStandsReferencesButton;
    // End of variables declaration//GEN-END:variables
}
