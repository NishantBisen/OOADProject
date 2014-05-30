package com.project.views;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author gyanpatra
 */
public class ViewerProjectDetailsForm extends javax.swing.JFrame {

    /**
     * Creates new form ProjectDetailsForm
     */
    public ViewerProjectDetailsForm() {
        initComponents();
        //initComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        panelProject = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblTheme = new javax.swing.JLabel();
        lblStartDate = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        txtTheme = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        jTabbedPaneTeam = new javax.swing.JTabbedPane();
        panelAdvisor = new javax.swing.JPanel();
        scrollPaneAdvisor = new javax.swing.JScrollPane();
        tableAdvisor = new javax.swing.JTable();
        panelStudent = new javax.swing.JPanel();
        scrollPaneStudent = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        panelPartners = new javax.swing.JPanel();
        scrollPanePartner = new javax.swing.JScrollPane();
        tablePartner = new javax.swing.JTable();
        jTabbedPaneTimeline = new javax.swing.JTabbedPane();
        panelTimeline = new javax.swing.JPanel();
        txtTimeline = new javax.swing.JTextField();
        panelScope = new javax.swing.JPanel();
        txtScope = new javax.swing.JTextField();
        panelLocation = new javax.swing.JPanel();
        txtLocation = new javax.swing.JTextField();
        panelOutcome = new javax.swing.JPanel();
        txtOutcome = new javax.swing.JTextField();
        jTabbedPaneMedia = new javax.swing.JTabbedPane();
        panelAssociated = new javax.swing.JPanel();
        scrollPaneAssociated = new javax.swing.JScrollPane();
        tableAssociated = new javax.swing.JTable();
        panelDirect = new javax.swing.JPanel();
        scrollPaneDirect = new javax.swing.JScrollPane();
        tableDirect = new javax.swing.JTable();
        panelMedia = new javax.swing.JPanel();
        scrollPaneMedia = new javax.swing.JScrollPane();
        tableMedia = new javax.swing.JTable();
        panelLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROJECT DETAILS");
        setBounds(new java.awt.Rectangle(0, 0, 600, 400));
        setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        mainPanel.setFont(new java.awt.Font("Helvetica Neue", 0, 13)); // NOI18N

        panelProject.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Project", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont()));
        panelProject.setFont(getFont());

        lblName.setFont(getFont());
        lblName.setText("Name:");

        lblStatus.setFont(getFont());
        lblStatus.setText("Status:");

        lblTheme.setFont(getFont());
        lblTheme.setText("Theme:");

        lblStartDate.setFont(getFont());
        lblStartDate.setText("Start Date:");
        lblStartDate.setPreferredSize(new java.awt.Dimension(62, 16));

        lblEndDate.setFont(getFont());
        lblEndDate.setText("End Date:");

        txtName.setEditable(false);
        txtName.setFont(getFont());
        txtName.setText("Name");
        txtName.setFocusable(false);

        txtStatus.setEditable(false);
        txtStatus.setFont(getFont());
        txtStatus.setText("Status");
        txtStatus.setFocusable(false);
        txtStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusActionPerformed(evt);
            }
        });

        txtTheme.setEditable(false);
        txtTheme.setFont(getFont());
        txtTheme.setText("Theme");
        txtTheme.setFocusable(false);

        txtStartDate.setEditable(false);
        txtStartDate.setFont(getFont());
        txtStartDate.setText("Start Date");
        txtStartDate.setFocusable(false);

        txtEndDate.setEditable(false);
        txtEndDate.setFont(getFont());
        txtEndDate.setText("End Date");
        txtEndDate.setFocusable(false);

        javax.swing.GroupLayout panelProjectLayout = new javax.swing.GroupLayout(panelProject);
        panelProject.setLayout(panelProjectLayout);
        panelProjectLayout.setHorizontalGroup(
            panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(lblStatus)
                    .addComponent(lblTheme)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtStatus)
                    .addComponent(txtName)
                    .addComponent(txtTheme)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(txtEndDate))
                .addContainerGap())
        );
        panelProjectLayout.setVerticalGroup(
            panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProjectLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTheme)
                    .addComponent(txtTheme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneTeam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Team", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont()));
        jTabbedPaneTeam.setFont(getFont());

        panelAdvisor.setFont(getFont());

        scrollPaneAdvisor.setFont(getFont());

        tableAdvisor.setFont(getFont());
        tableAdvisor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneAdvisor.setViewportView(tableAdvisor);

        javax.swing.GroupLayout panelAdvisorLayout = new javax.swing.GroupLayout(panelAdvisor);
        panelAdvisor.setLayout(panelAdvisorLayout);
        panelAdvisorLayout.setHorizontalGroup(
            panelAdvisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdvisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAdvisor, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAdvisorLayout.setVerticalGroup(
            panelAdvisorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAdvisorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAdvisor, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTeam.addTab("Advisors", panelAdvisor);

        panelStudent.setFont(getFont());

        scrollPaneStudent.setFont(getFont());

        tableStudent.setFont(getFont());
        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneStudent.setViewportView(tableStudent);

        javax.swing.GroupLayout panelStudentLayout = new javax.swing.GroupLayout(panelStudent);
        panelStudent.setLayout(panelStudentLayout);
        panelStudentLayout.setHorizontalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelStudentLayout.setVerticalGroup(
            panelStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTeam.addTab("Students", panelStudent);

        panelPartners.setFont(getFont());

        scrollPanePartner.setFont(getFont());

        tablePartner.setFont(getFont());
        tablePartner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPanePartner.setViewportView(tablePartner);

        javax.swing.GroupLayout panelPartnersLayout = new javax.swing.GroupLayout(panelPartners);
        panelPartners.setLayout(panelPartnersLayout);
        panelPartnersLayout.setHorizontalGroup(
            panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartnersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanePartner, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPartnersLayout.setVerticalGroup(
            panelPartnersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPartnersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanePartner, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTeam.addTab("Partners", panelPartners);

        jTabbedPaneTimeline.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Timeline & Scope of Work", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont()));
        jTabbedPaneTimeline.setFont(getFont());

        txtTimeline.setFont(getFont());
        txtTimeline.setText("Timeline");

        javax.swing.GroupLayout panelTimelineLayout = new javax.swing.GroupLayout(panelTimeline);
        panelTimeline.setLayout(panelTimelineLayout);
        panelTimelineLayout.setHorizontalGroup(
            panelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimelineLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTimelineLayout.setVerticalGroup(
            panelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimelineLayout.createSequentialGroup()
                .addComponent(txtTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTimeline.addTab("Timeline", panelTimeline);

        txtScope.setFont(getFont());
        txtScope.setText("Scope");

        javax.swing.GroupLayout panelScopeLayout = new javax.swing.GroupLayout(panelScope);
        panelScope.setLayout(panelScopeLayout);
        panelScopeLayout.setHorizontalGroup(
            panelScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScopeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtScope, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelScopeLayout.setVerticalGroup(
            panelScopeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScopeLayout.createSequentialGroup()
                .addComponent(txtScope, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTimeline.addTab("Scope of Work", panelScope);

        txtLocation.setFont(getFont());
        txtLocation.setText("Location");

        javax.swing.GroupLayout panelLocationLayout = new javax.swing.GroupLayout(panelLocation);
        panelLocation.setLayout(panelLocationLayout);
        panelLocationLayout.setHorizontalGroup(
            panelLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelLocationLayout.setVerticalGroup(
            panelLocationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLocationLayout.createSequentialGroup()
                .addComponent(txtLocation, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTimeline.addTab("Location of Prototype", panelLocation);

        txtOutcome.setFont(getFont());
        txtOutcome.setText("Outcome");

        javax.swing.GroupLayout panelOutcomeLayout = new javax.swing.GroupLayout(panelOutcome);
        panelOutcome.setLayout(panelOutcomeLayout);
        panelOutcomeLayout.setHorizontalGroup(
            panelOutcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutcomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOutcome, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelOutcomeLayout.setVerticalGroup(
            panelOutcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOutcomeLayout.createSequentialGroup()
                .addComponent(txtOutcome, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTimeline.addTab("Outcome", panelOutcome);

        jTabbedPaneMedia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hyperlinks & Media", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, getFont()));
        jTabbedPaneMedia.setFont(getFont());

        panelAssociated.setFont(getFont());

        scrollPaneAssociated.setFont(getFont());

        tableAssociated.setFont(getFont());
        tableAssociated.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneAssociated.setViewportView(tableAssociated);

        javax.swing.GroupLayout panelAssociatedLayout = new javax.swing.GroupLayout(panelAssociated);
        panelAssociated.setLayout(panelAssociatedLayout);
        panelAssociatedLayout.setHorizontalGroup(
            panelAssociatedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAssociatedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAssociated, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAssociatedLayout.setVerticalGroup(
            panelAssociatedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAssociatedLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneAssociated, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMedia.addTab("Associated", panelAssociated);

        panelDirect.setFont(getFont());

        scrollPaneDirect.setFont(getFont());

        tableDirect.setFont(getFont());
        tableDirect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneDirect.setViewportView(tableDirect);

        javax.swing.GroupLayout panelDirectLayout = new javax.swing.GroupLayout(panelDirect);
        panelDirect.setLayout(panelDirectLayout);
        panelDirectLayout.setHorizontalGroup(
            panelDirectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneDirect, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDirectLayout.setVerticalGroup(
            panelDirectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDirectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneDirect, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMedia.addTab("Direct", panelDirect);

        panelMedia.setFont(getFont());

        scrollPaneMedia.setFont(getFont());

        tableMedia.setFont(getFont());
        tableMedia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMedia.setPreferredSize(new java.awt.Dimension(300, 70));
        scrollPaneMedia.setViewportView(tableMedia);

        javax.swing.GroupLayout panelMediaLayout = new javax.swing.GroupLayout(panelMedia);
        panelMedia.setLayout(panelMediaLayout);
        panelMediaLayout.setHorizontalGroup(
            panelMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneMedia, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMediaLayout.setVerticalGroup(
            panelMediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneMedia.addTab("Media", panelMedia);

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Frugal_Blk_BriteRed_72dpi.jpg"))); // NOI18N

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addComponent(lblLogo)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPaneMedia)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(panelProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPaneTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPaneTimeline))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneTeam)
                    .addComponent(panelProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPaneMedia.getAccessibleContext().setAccessibleName("associatedPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusActionPerformed

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
            java.util.logging.Logger.getLogger(ViewerProjectDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewerProjectDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewerProjectDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewerProjectDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewerProjectDetailsForm().setVisible(true);
            }
        });
    }
    
   /* public void initComboBox(){
        String[] status = { "Active", "Completed", "Suspended", "Aborted"};


        jComboBox1.addItem(jComboBox1);
        jComboBox1.setSelectedIndex(4);
        //jComboBox1.addActionListener(this);
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPaneMedia;
    private javax.swing.JTabbedPane jTabbedPaneTeam;
    private javax.swing.JTabbedPane jTabbedPaneTimeline;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTheme;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel panelAdvisor;
    private javax.swing.JPanel panelAssociated;
    private javax.swing.JPanel panelDirect;
    private javax.swing.JPanel panelLocation;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelMedia;
    private javax.swing.JPanel panelOutcome;
    private javax.swing.JPanel panelPartners;
    private javax.swing.JPanel panelProject;
    private javax.swing.JPanel panelScope;
    private javax.swing.JPanel panelStudent;
    private javax.swing.JPanel panelTimeline;
    private javax.swing.JScrollPane scrollPaneAdvisor;
    private javax.swing.JScrollPane scrollPaneAssociated;
    private javax.swing.JScrollPane scrollPaneDirect;
    private javax.swing.JScrollPane scrollPaneMedia;
    private javax.swing.JScrollPane scrollPanePartner;
    private javax.swing.JScrollPane scrollPaneStudent;
    private javax.swing.JTable tableAdvisor;
    private javax.swing.JTable tableAssociated;
    private javax.swing.JTable tableDirect;
    private javax.swing.JTable tableMedia;
    private javax.swing.JTable tablePartner;
    private javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOutcome;
    private javax.swing.JTextField txtScope;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTheme;
    private javax.swing.JTextField txtTimeline;
    // End of variables declaration//GEN-END:variables
}
