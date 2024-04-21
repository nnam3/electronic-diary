package com.fmondaca.electronicdiary.gui;

import java.awt.Color;



public class Window extends javax.swing.JFrame {
    

    
    String run[] = new String [10];
    String nombres[] = new String [10];
    String apellidos[] = new String [10];
    String direccion[] = new String [10];
    String telefono[] = new String [10];
    String fechanac[] = new String [10];
    String notas[] = new String[10];
    int xMouse, yMouse;
    public Window() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        minimizePanel = new javax.swing.JPanel();
        minimizeLabel = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        backButton1 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        indiceTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        runPanel = new javax.swing.JPanel();
        runTxt = new javax.swing.JTextField();
        runLabel = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        nameTxt = new javax.swing.JTextField();
        runLabel1 = new javax.swing.JLabel();
        lastPanel = new javax.swing.JPanel();
        lastTxt = new javax.swing.JTextField();
        runLabel2 = new javax.swing.JLabel();
        addressPanel = new javax.swing.JPanel();
        addressTxt = new javax.swing.JTextField();
        runLabel5 = new javax.swing.JLabel();
        phonePanel = new javax.swing.JPanel();
        phoneTxt = new javax.swing.JTextField();
        runLabel3 = new javax.swing.JLabel();
        birthPanel = new javax.swing.JPanel();
        birthTxt = new javax.swing.JTextField();
        runLabel4 = new javax.swing.JLabel();
        notesPanel = new javax.swing.JPanel();
        runLabel6 = new javax.swing.JLabel();
        notesTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electronic Diary");
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(java.awt.Color.darkGray);
        headerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerPanelMouseDragged(evt);
            }
        });
        headerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerPanelMousePressed(evt);
            }
        });
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizePanel.setBackground(java.awt.Color.darkGray);
        minimizePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizePanel.setPreferredSize(new java.awt.Dimension(40, 40));

        minimizeLabel.setBackground(java.awt.Color.darkGray);
        minimizeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minimizeLabel.setForeground(java.awt.Color.lightGray);
        minimizeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLabel.setText("—");
        minimizeLabel.setToolTipText("");
        minimizeLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        minimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizePanelLayout = new javax.swing.GroupLayout(minimizePanel);
        minimizePanel.setLayout(minimizePanelLayout);
        minimizePanelLayout.setHorizontalGroup(
            minimizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizePanelLayout.createSequentialGroup()
                .addComponent(minimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        minimizePanelLayout.setVerticalGroup(
            minimizePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizePanelLayout.createSequentialGroup()
                .addComponent(minimizeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        headerPanel.add(minimizePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 0, -1, -1));

        exitPanel.setBackground(java.awt.Color.darkGray);
        exitPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPanel.setPreferredSize(new java.awt.Dimension(40, 40));

        exitLabel.setBackground(java.awt.Color.darkGray);
        exitLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        exitLabel.setForeground(java.awt.Color.lightGray);
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.setPreferredSize(new java.awt.Dimension(40, 40));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addComponent(exitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        headerPanel.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        headerLabel.setBackground(java.awt.Color.darkGray);
        headerLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        headerLabel.setForeground(java.awt.Color.lightGray);
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Welcome To Electronic Diary");
        headerPanel.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        bg.add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        titlePanel.setBackground(new java.awt.Color(204, 255, 255));

        titleLabel.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 51, 51));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Electronic Diary");
        titleLabel.setToolTipText("");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        bg.add(titlePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 660, 90));

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        buttonsPanel.setBackground(new java.awt.Color(102, 102, 102));

        backButton1.setBackground(new java.awt.Color(0, 102, 102));
        backButton1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        backButton1.setForeground(new java.awt.Color(204, 255, 255));
        backButton1.setText("<<");
        backButton1.setBorder(null);
        backButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButton1MouseClicked(evt);
            }
        });
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 102, 102));
        saveButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        saveButton.setForeground(new java.awt.Color(204, 255, 255));
        saveButton.setText("Save");
        saveButton.setBorder(null);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        forwardButton.setBackground(new java.awt.Color(0, 102, 102));
        forwardButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 14)); // NOI18N
        forwardButton.setForeground(new java.awt.Color(204, 255, 255));
        forwardButton.setText(">>");
        forwardButton.setBorder(null);
        forwardButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forwardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forwardButtonMouseClicked(evt);
            }
        });
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pageLabel.setForeground(new java.awt.Color(204, 255, 255));
        pageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageLabel.setText("Page : ");

        indiceTxt.setEditable(false);
        indiceTxt.setBackground(new java.awt.Color(102, 102, 102));
        indiceTxt.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        indiceTxt.setForeground(new java.awt.Color(204, 255, 255));
        indiceTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        indiceTxt.setText("0");

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Made by Franco Mondaca");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonsPanelLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(207, 207, 207))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(pageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indiceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256))))
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forwardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageLabel)
                    .addComponent(indiceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        runPanel.setBackground(new java.awt.Color(204, 204, 204));

        runTxt.setBackground(new java.awt.Color(204, 204, 204));
        runTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        runTxt.setForeground(new java.awt.Color(51, 51, 51));
        runTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        runTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        runTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel.setForeground(new java.awt.Color(0, 0, 0));
        runLabel.setText("RUN/DNI");

        javax.swing.GroupLayout runPanelLayout = new javax.swing.GroupLayout(runPanel);
        runPanel.setLayout(runPanelLayout);
        runPanelLayout.setHorizontalGroup(
            runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(runPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(runPanelLayout.createSequentialGroup()
                        .addComponent(runLabel)
                        .addGap(210, 210, 210))
                    .addGroup(runPanelLayout.createSequentialGroup()
                        .addComponent(runTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        runPanelLayout.setVerticalGroup(
            runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(runPanelLayout.createSequentialGroup()
                .addComponent(runLabel)
                .addGap(4, 4, 4)
                .addComponent(runTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        namePanel.setBackground(new java.awt.Color(204, 204, 204));

        nameTxt.setBackground(new java.awt.Color(204, 204, 204));
        nameTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        nameTxt.setForeground(new java.awt.Color(51, 51, 51));
        nameTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nameTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        nameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel1.setForeground(new java.awt.Color(0, 0, 0));
        runLabel1.setText("Name");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(namePanelLayout.createSequentialGroup()
                        .addComponent(runLabel1)
                        .addGap(210, 210, 210))
                    .addGroup(namePanelLayout.createSequentialGroup()
                        .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addComponent(runLabel1)
                .addGap(4, 4, 4)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lastPanel.setBackground(new java.awt.Color(204, 204, 204));

        lastTxt.setBackground(new java.awt.Color(204, 204, 204));
        lastTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lastTxt.setForeground(new java.awt.Color(51, 51, 51));
        lastTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        lastTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lastTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel2.setForeground(new java.awt.Color(0, 0, 0));
        runLabel2.setText("Last Name");

        javax.swing.GroupLayout lastPanelLayout = new javax.swing.GroupLayout(lastPanel);
        lastPanel.setLayout(lastPanelLayout);
        lastPanelLayout.setHorizontalGroup(
            lastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lastPanelLayout.createSequentialGroup()
                        .addComponent(runLabel2)
                        .addGap(210, 210, 210))
                    .addGroup(lastPanelLayout.createSequentialGroup()
                        .addComponent(lastTxt)
                        .addContainerGap())))
        );
        lastPanelLayout.setVerticalGroup(
            lastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lastPanelLayout.createSequentialGroup()
                .addComponent(runLabel2)
                .addGap(4, 4, 4)
                .addComponent(lastTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
        );

        addressPanel.setBackground(new java.awt.Color(204, 204, 204));

        addressTxt.setBackground(new java.awt.Color(204, 204, 204));
        addressTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        addressTxt.setForeground(new java.awt.Color(51, 51, 51));
        addressTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        addressTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        addressTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel5.setForeground(new java.awt.Color(0, 0, 0));
        runLabel5.setText("Address");

        javax.swing.GroupLayout addressPanelLayout = new javax.swing.GroupLayout(addressPanel);
        addressPanel.setLayout(addressPanelLayout);
        addressPanelLayout.setHorizontalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(addressPanelLayout.createSequentialGroup()
                        .addComponent(runLabel5)
                        .addGap(0, 216, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addressPanelLayout.setVerticalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addComponent(runLabel5)
                .addGap(4, 4, 4)
                .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        phonePanel.setBackground(new java.awt.Color(204, 204, 204));

        phoneTxt.setBackground(new java.awt.Color(204, 204, 204));
        phoneTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        phoneTxt.setForeground(new java.awt.Color(51, 51, 51));
        phoneTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        phoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel3.setForeground(new java.awt.Color(0, 0, 0));
        runLabel3.setText("Phone Number");

        javax.swing.GroupLayout phonePanelLayout = new javax.swing.GroupLayout(phonePanel);
        phonePanel.setLayout(phonePanelLayout);
        phonePanelLayout.setHorizontalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(phonePanelLayout.createSequentialGroup()
                        .addComponent(runLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(phoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                .addContainerGap())
        );
        phonePanelLayout.setVerticalGroup(
            phonePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(phonePanelLayout.createSequentialGroup()
                .addComponent(runLabel3)
                .addGap(4, 4, 4)
                .addComponent(phoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        birthPanel.setBackground(new java.awt.Color(204, 204, 204));

        birthTxt.setBackground(new java.awt.Color(204, 204, 204));
        birthTxt.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        birthTxt.setForeground(new java.awt.Color(51, 51, 51));
        birthTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        birthTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        birthTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        runLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel4.setForeground(new java.awt.Color(0, 0, 0));
        runLabel4.setText("Birthdate");

        javax.swing.GroupLayout birthPanelLayout = new javax.swing.GroupLayout(birthPanel);
        birthPanel.setLayout(birthPanelLayout);
        birthPanelLayout.setHorizontalGroup(
            birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(birthTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addGroup(birthPanelLayout.createSequentialGroup()
                        .addComponent(runLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        birthPanelLayout.setVerticalGroup(
            birthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(birthPanelLayout.createSequentialGroup()
                .addComponent(runLabel4)
                .addGap(4, 4, 4)
                .addComponent(birthTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        notesPanel.setBackground(new java.awt.Color(204, 204, 204));
        notesPanel.setForeground(new java.awt.Color(0, 0, 0));

        runLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        runLabel6.setForeground(new java.awt.Color(0, 0, 0));
        runLabel6.setText("Notes");

        notesTxt.setBackground(new java.awt.Color(204, 204, 204));
        notesTxt.setColumns(1);
        notesTxt.setForeground(new java.awt.Color(51, 51, 51));
        notesTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        notesTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout notesPanelLayout = new javax.swing.GroupLayout(notesPanel);
        notesPanel.setLayout(notesPanelLayout);
        notesPanelLayout.setHorizontalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notesPanelLayout.createSequentialGroup()
                        .addComponent(runLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(notesTxt))
                .addContainerGap())
        );
        notesPanelLayout.setVerticalGroup(
            notesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notesPanelLayout.createSequentialGroup()
                .addComponent(runLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(notesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(runPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(phonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(birthPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(runPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(notesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 660, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerPanelMousePressed

    private void headerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerPanelMouseDragged

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void exitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseEntered
        // TODO add your handling code here:
        exitPanel.setBackground(Color.red);
        exitLabel.setForeground(Color.white);
    }//GEN-LAST:event_exitLabelMouseEntered

    private void exitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseExited
        // TODO add your handling code here:
        exitPanel.setBackground(Color.DARK_GRAY);
        exitLabel.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_exitLabelMouseExited

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        int indi; int aux;
        String indice = indiceTxt.getText();
        indi = Integer.parseInt(indice);
        
        if(indi > 0){
            aux = indi-1;
            indi = aux;
            indice = String.valueOf(indi);
            indiceTxt.setText(indice);
            
            runTxt.setText(run[indi]);
            nameTxt.setText(nombres[indi]);
            lastTxt.setText(apellidos[indi]);
            addressTxt.setText(direccion[indi]);
            phoneTxt.setText(telefono[indi]);
            birthTxt.setText(fechanac[indi]);
            notesTxt.setText(notas[indi]);
        }
    }//GEN-LAST:event_backButton1ActionPerformed

    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed
        int indi; int aux;
        String indice = indiceTxt.getText();
        indi = Integer.parseInt(indice);
        
        if(indi < 9){
            aux = indi+1;
            indi = aux;

            indice = String.valueOf(indi);
            indiceTxt.setText(indice);
            
            runTxt.setText(run[indi]);
            nameTxt.setText(nombres[indi]);
            lastTxt.setText(apellidos[indi]);
            addressTxt.setText(direccion[indi]);
            phoneTxt.setText(telefono[indi]);
            birthTxt.setText(fechanac[indi]);
            notesTxt.setText(notas[indi]);
        }
    }//GEN-LAST:event_forwardButtonActionPerformed

    private void backButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton1MouseClicked

    }//GEN-LAST:event_backButton1MouseClicked

    private void forwardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwardButtonMouseClicked

    }//GEN-LAST:event_forwardButtonMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        int indi;
        String indice = indiceTxt.getText();
        indi = Integer.parseInt(indice);
        
        run[indi] = runTxt.getText();
        nombres[indi] = nameTxt.getText();
        apellidos[indi] = lastTxt.getText();
        direccion[indi] = addressTxt.getText();
        telefono[indi] = phoneTxt.getText();
        fechanac[indi] = birthTxt.getText();
        notas[indi] = notesTxt.getText();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void minimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeLabelMouseClicked

    private void minimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseEntered
        // TODO add your handling code here:
        minimizePanel.setBackground(Color.LIGHT_GRAY);
        minimizeLabel.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_minimizeLabelMouseEntered

    private void minimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLabelMouseExited
        minimizePanel.setBackground(Color.DARK_GRAY);
        minimizeLabel.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_minimizeLabelMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addressPanel;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton backButton1;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel birthPanel;
    private javax.swing.JTextField birthTxt;
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JButton forwardButton;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField indiceTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lastPanel;
    private javax.swing.JTextField lastTxt;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel minimizeLabel;
    private javax.swing.JPanel minimizePanel;
    private javax.swing.JPanel namePanel;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPanel notesPanel;
    private javax.swing.JTextField notesTxt;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel runLabel;
    private javax.swing.JLabel runLabel1;
    private javax.swing.JLabel runLabel2;
    private javax.swing.JLabel runLabel3;
    private javax.swing.JLabel runLabel4;
    private javax.swing.JLabel runLabel5;
    private javax.swing.JLabel runLabel6;
    private javax.swing.JPanel runPanel;
    private javax.swing.JTextField runTxt;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables


}
