
package shha;


import java.util.Enumeration;
import javax.swing.*;
import java.util.regex.*;
/**
 *
 * @author Sheldon
 */
public class mainGUI2 extends javax.swing.JFrame {

    //Build Main GUI
    public mainGUI2() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        empGenderButtonGroup = new javax.swing.ButtonGroup();
        logoLabel = new javax.swing.JLabel();
        patientsButton = new javax.swing.JButton();
        apptButton = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        billButton = new javax.swing.JButton();
        empButton = new javax.swing.JButton();
        adminButton = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();
        patientsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        adminPanel = new javax.swing.JPanel();
        adminContainerPanel = new javax.swing.JPanel();
        defaultAdminPanel = new javax.swing.JPanel();
        addUserPanel = new javax.swing.JPanel();
        firstNameText = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        middleIntText = new javax.swing.JTextField();
        middleIntLabel = new javax.swing.JLabel();
        ssnLabel = new javax.swing.JLabel();
        ssnText = new javax.swing.JTextField();
        address1Text = new javax.swing.JTextField();
        address1Label = new javax.swing.JLabel();
        cityText = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        zipText = new javax.swing.JTextField();
        zipLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        dobLabel = new javax.swing.JLabel();
        address2Label = new javax.swing.JLabel();
        address2Text = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        positionComboBox = new javax.swing.JComboBox();
        positionLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        stateComboBox = new javax.swing.JComboBox();
        positionLabel1 = new javax.swing.JLabel();
        accessLevelComboBox = new javax.swing.JComboBox();
        monthComboBox = new javax.swing.JComboBox();
        dayComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        addNewUserButton = new javax.swing.JButton();
        empPanel = new javax.swing.JPanel();
        empContainerPanel = new javax.swing.JPanel();
        defaultEmpPanel = new javax.swing.JPanel();
        viewEmpPanel = new javax.swing.JPanel();
        empFirstNameText = new javax.swing.JTextField();
        empFirstNameLabel = new javax.swing.JLabel();
        empLastNameText = new javax.swing.JTextField();
        empLastNameLabel = new javax.swing.JLabel();
        empMiddleIntText = new javax.swing.JTextField();
        empMiddleIntLabel = new javax.swing.JLabel();
        empSSNLabel = new javax.swing.JLabel();
        empSSNText = new javax.swing.JTextField();
        empAddress1Text = new javax.swing.JTextField();
        empAddress1Label = new javax.swing.JLabel();
        empCityText = new javax.swing.JTextField();
        empCityLabel = new javax.swing.JLabel();
        empStateText = new javax.swing.JTextField();
        empStateLabel = new javax.swing.JLabel();
        empZipText = new javax.swing.JTextField();
        empZipLabel = new javax.swing.JLabel();
        empMaleRadioButton = new javax.swing.JRadioButton();
        empFemaleRadioButton = new javax.swing.JRadioButton();
        empGenderLabel = new javax.swing.JLabel();
        empDOBLabel = new javax.swing.JLabel();
        empDOBText = new javax.swing.JTextField();
        empEmailLabel = new javax.swing.JLabel();
        empEmailText = new javax.swing.JTextField();
        empAddress2Label = new javax.swing.JLabel();
        empAddress2Text = new javax.swing.JTextField();
        empCountryText = new javax.swing.JTextField();
        empCountryLabel = new javax.swing.JLabel();
        empPhoneLabel = new javax.swing.JLabel();
        empPhoneText = new javax.swing.JTextField();
        viewEmpIDLabel = new javax.swing.JLabel();
        viewEmpIDText = new javax.swing.JTextField();
        empPositionComboBox = new javax.swing.JComboBox();
        empPositionLabel = new javax.swing.JLabel();
        empSaveButton = new javax.swing.JButton();
        empCancelButton = new javax.swing.JButton();
        empEditButton = new javax.swing.JButton();
        viewEmpButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(1200, 800));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        patientsButton.setText("Patients");
        patientsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientsButtonActionPerformed(evt);
            }
        });

        apptButton.setText("Appointments");
        apptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        reportsButton.setText("Reports");
        reportsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        billButton.setText("Billing");
        billButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        empButton.setText("Employees");
        empButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empButtonActionPerformed(evt);
            }
        });

        adminButton.setText("Admin");
        adminButton.setToolTipText("");
        adminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminButtonActionPerformed(evt);
            }
        });

        containerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        containerPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        containerPanel.setLayout(new java.awt.CardLayout());

        patientsPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        patientsPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextPane1.setText("Sorry nothing here yet! Make your way over to the Employee or Admin Tab! \n\n-- GreyTek Inc.");
        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout patientsPanelLayout = new javax.swing.GroupLayout(patientsPanel);
        patientsPanel.setLayout(patientsPanelLayout);
        patientsPanelLayout.setHorizontalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientsPanelLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(382, Short.MAX_VALUE))
        );
        patientsPanelLayout.setVerticalGroup(
            patientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
        );

        containerPanel.add(patientsPanel, "card2");

        adminPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setMinimumSize(new java.awt.Dimension(1170, 613));
        adminPanel.setPreferredSize(new java.awt.Dimension(1170, 613));

        adminContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adminContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
        adminContainerPanel.setLayout(new java.awt.CardLayout());

        defaultAdminPanel.setMaximumSize(new java.awt.Dimension(995, 577));
        defaultAdminPanel.setMinimumSize(new java.awt.Dimension(995, 577));

        javax.swing.GroupLayout defaultAdminPanelLayout = new javax.swing.GroupLayout(defaultAdminPanel);
        defaultAdminPanel.setLayout(defaultAdminPanelLayout);
        defaultAdminPanelLayout.setHorizontalGroup(
            defaultAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 995, Short.MAX_VALUE)
        );
        defaultAdminPanelLayout.setVerticalGroup(
            defaultAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        adminContainerPanel.add(defaultAdminPanel, "card3");

        addUserPanel.setMaximumSize(new java.awt.Dimension(991, 573));
        addUserPanel.setMinimumSize(new java.awt.Dimension(991, 573));

        firstNameLabel.setLabelFor(firstNameText);
        firstNameLabel.setText(" First Name");

        lastNameLabel.setLabelFor(lastNameText);
        lastNameLabel.setText(" Last Name");

        middleIntLabel.setLabelFor(middleIntText);
        middleIntLabel.setText("Middle Int.");

        ssnLabel.setLabelFor(ssnText);
        ssnLabel.setText(" Social Security #");

        ssnText.setText("###-##-####");
        ssnText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ssnTextFocusGained(evt);
            }
        });
        ssnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ssnTextMouseClicked(evt);
            }
        });

        address1Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address1TextMouseClicked(evt);
            }
        });

        address1Label.setLabelFor(address1Text);
        address1Label.setText(" Address 1");

        cityText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cityTextMouseClicked(evt);
            }
        });

        cityLabel.setLabelFor(cityText);
        cityLabel.setText(" City");

        stateLabel.setText(" State");

        zipText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zipTextMouseClicked(evt);
            }
        });

        zipLabel.setText(" Zip Code");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderLabel.setText(" Sex");

        dobLabel.setText(" Date of Birth");

        address2Label.setLabelFor(address2Text);
        address2Label.setText(" Address 2");

        address2Text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                address2TextMouseClicked(evt);
            }
        });

        phoneLabel.setText(" Phone");

        phoneText.setText("###-###-####");
        phoneText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneTextFocusGained(evt);
            }
        });
        phoneText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phoneTextMouseClicked(evt);
            }
        });

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
        positionComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionComboBoxActionPerformed(evt);
            }
        });

        positionLabel.setLabelFor(positionComboBox);
        positionLabel.setText("Position");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alabama", "Alaska", "Arizona", "Arkansas",
            "California", "Colorado", "Connecticut",
            "Delaware", "Dist. of Columbia","Florida","Georgia",
            "Hawaii","Idaho","Illinois","Indiana", "Iowa",
            "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland",
            "Massachusetts", "Michigan", "Minnesota", "Mississippi",
            "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire",
            "New Jersey", "New Mexico", "New York", "North Carolina",
            "North Dakota", "Ohio", "Oklahoma","Oregon","Pennsylvania",
            "Rhode Island","South Carolina","South Dakota","Tennessee",
            "Texas","Utah","Vermont","Virginia","Washington","West Virginia",
            "Wyoming"}));
stateComboBox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        stateComboBoxActionPerformed(evt);
    }
    });

    positionLabel1.setLabelFor(positionComboBox);
    positionLabel1.setText("Access Level");

    accessLevelComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
    accessLevelComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            accessLevelComboBoxActionPerformed(evt);
        }
    });

    monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month:", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    monthComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            monthComboBoxActionPerformed(evt);
        }
    });

    dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
        "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
dayComboBox.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    dayComboBoxActionPerformed(evt);
    }
    });

    yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year:", "1900","1901","1902","1903","1904",
        "1905","1906","1907","1908","1909","1910","1911",
        "1912","1913","1914","1915","1916","1917","1918",
        "1919","1920","1921","1922","1923","1924","1925",
        "1926","1927","1928","1929","1930","1931","1932",
        "1933","1934","1935","1936","1937","1938","1939",
        "1940","1941","1942","1943","1944","1945","1946",
        "1947","1948","1949","1950","1951","1952","1953",
        "1954","1955","1956","1957","1958","1959","1960",
        "1961","1962","1963","1964","1965","1966","1967",
        "1968","1969","1970","1971","1972","1973","1974",
        "1975","1976","1977","1978","1979","1980","1981",
        "1982","1983","1984","1985","1986","1987","1988",
        "1989","1990","1991","1992","1993","1994","1995",
        "1996","1997","1998","1999","2000","2001","2002",
        "2003","2004","2005","2006","2007","2008","2009",
        "2010","2011","2012","2013","2014","2015"}));
yearComboBox.addActionListener(new java.awt.event.ActionListener() {
public void actionPerformed(java.awt.event.ActionEvent evt) {
    yearComboBoxActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
    addUserPanel.setLayout(addUserPanelLayout);
    addUserPanelLayout.setHorizontalGroup(
        addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(addUserPanelLayout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address1Text)
                    .addComponent(address2Text)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(middleIntText)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addComponent(middleIntLabel)
                                .addGap(0, 145, Short.MAX_VALUE))))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(address2Label)
                            .addComponent(address1Label)
                            .addGroup(addUserPanelLayout.createSequentialGroup()
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dobLabel)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addComponent(cancelButton)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(zipText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityText)
                                    .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(zipLabel)
                                .addComponent(phoneLabel))
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39)
                                    .addComponent(accessLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(23, 23, 23)
                                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(stateLabel)
                                                .addComponent(ssnLabel)
                                                .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(positionLabel)))
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(femaleRadioButton)
                                                .addComponent(maleRadioButton)
                                                .addComponent(genderLabel)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(positionLabel1)
                                            .addGap(8, 8, 8))))))
                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(43, Short.MAX_VALUE))))
    );

    addUserPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, saveButton});

    addUserPanelLayout.setVerticalGroup(
        addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(addUserPanelLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(ssnLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ssnText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addUserPanelLayout.createSequentialGroup()
                                        .addComponent(middleIntLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(middleIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addComponent(lastNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(addUserPanelLayout.createSequentialGroup()
                                            .addComponent(firstNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(32, 32, Short.MAX_VALUE)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(address1Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(address1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addUserPanelLayout.createSequentialGroup()
                                    .addComponent(stateLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserPanelLayout.createSequentialGroup()
                            .addComponent(cityLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addComponent(address2Label)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(address2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zipLabel)
                                .addComponent(positionLabel)
                                .addComponent(positionLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(zipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(accessLevelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(dobLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(addUserPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(phoneLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(88, 88, 88))
                .addGroup(addUserPanelLayout.createSequentialGroup()
                    .addComponent(genderLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(maleRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(femaleRadioButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cancelButton)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(142, Short.MAX_VALUE))
    );

    addUserPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cancelButton, saveButton});

    adminContainerPanel.add(addUserPanel, "card3");

    addNewUserButton.setText("Add User");
    addNewUserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    addNewUserButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addNewUserButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
    adminPanel.setLayout(adminPanelLayout);
    adminPanelLayout.setHorizontalGroup(
        adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(addNewUserButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(25, 25, 25)
            .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
    );
    adminPanelLayout.setVerticalGroup(
        adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(adminPanelLayout.createSequentialGroup()
            .addGroup(adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(addNewUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(adminPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(adminContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
    );

    containerPanel.add(adminPanel, "card2");

    empPanel.setMaximumSize(new java.awt.Dimension(1170, 613));
    empPanel.setMinimumSize(new java.awt.Dimension(1170, 613));

    empContainerPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    empContainerPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    empContainerPanel.setPreferredSize(new java.awt.Dimension(995, 577));
    empContainerPanel.setLayout(new java.awt.CardLayout());

    defaultEmpPanel.setMaximumSize(new java.awt.Dimension(995, 577));
    defaultEmpPanel.setMinimumSize(new java.awt.Dimension(995, 577));

    javax.swing.GroupLayout defaultEmpPanelLayout = new javax.swing.GroupLayout(defaultEmpPanel);
    defaultEmpPanel.setLayout(defaultEmpPanelLayout);
    defaultEmpPanelLayout.setHorizontalGroup(
        defaultEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 995, Short.MAX_VALUE)
    );
    defaultEmpPanelLayout.setVerticalGroup(
        defaultEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, 577, Short.MAX_VALUE)
    );

    empContainerPanel.add(defaultEmpPanel, "card3");

    viewEmpPanel.setMaximumSize(new java.awt.Dimension(991, 573));
    viewEmpPanel.setMinimumSize(new java.awt.Dimension(991, 573));

    empFirstNameText.setEnabled(false);

    empFirstNameLabel.setLabelFor(firstNameText);
    empFirstNameLabel.setText(" First Name");

    empLastNameText.setEnabled(false);

    empLastNameLabel.setLabelFor(lastNameText);
    empLastNameLabel.setText(" Last Name");

    empMiddleIntText.setEnabled(false);

    empMiddleIntLabel.setLabelFor(middleIntText);
    empMiddleIntLabel.setText(" Middle Name");

    empSSNLabel.setLabelFor(ssnText);
    empSSNLabel.setText(" Social Security #");

    empSSNText.setEnabled(false);
    empSSNText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empSSNTextFocusGained(evt);
        }
    });
    empSSNText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empSSNTextMouseClicked(evt);
        }
    });

    empAddress1Text.setEnabled(false);
    empAddress1Text.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empAddress1TextMouseClicked(evt);
        }
    });

    empAddress1Label.setLabelFor(address1Text);
    empAddress1Label.setText(" Address 1");

    empCityText.setEnabled(false);
    empCityText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empCityTextMouseClicked(evt);
        }
    });

    empCityLabel.setLabelFor(cityText);
    empCityLabel.setText(" City");

    empStateText.setEnabled(false);
    empStateText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empStateTextMouseClicked(evt);
        }
    });

    empStateLabel.setText(" State");

    empZipText.setEnabled(false);
    empZipText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empZipTextMouseClicked(evt);
        }
    });

    empZipLabel.setText(" Zip Code");

    empGenderButtonGroup.add(empMaleRadioButton);
    empMaleRadioButton.setText("Male");
    empMaleRadioButton.setEnabled(false);

    empGenderButtonGroup.add(empFemaleRadioButton);
    empFemaleRadioButton.setText("Female");
    empFemaleRadioButton.setEnabled(false);

    empGenderLabel.setText(" Sex");

    empDOBLabel.setText(" Date of Birth");

    empDOBText.setEnabled(false);
    empDOBText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empDOBTextFocusGained(evt);
        }
    });
    empDOBText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empDOBTextMouseClicked(evt);
        }
    });

    empEmailLabel.setText(" Email");

    empEmailText.setEnabled(false);
    empEmailText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empEmailTextFocusGained(evt);
        }
    });
    empEmailText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empEmailTextMouseClicked(evt);
        }
    });

    empAddress2Label.setLabelFor(address2Text);
    empAddress2Label.setText(" Address 2");

    empAddress2Text.setEnabled(false);
    empAddress2Text.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empAddress2TextMouseClicked(evt);
        }
    });

    empCountryText.setEnabled(false);
    empCountryText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empCountryTextMouseClicked(evt);
        }
    });

    empCountryLabel.setText(" Country");

    empPhoneLabel.setText(" Phone");

    empPhoneText.setEnabled(false);
    empPhoneText.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            empPhoneTextFocusGained(evt);
        }
    });
    empPhoneText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            empPhoneTextMouseClicked(evt);
        }
    });

    viewEmpIDLabel.setText(" Employee ID");

    viewEmpIDText.setEnabled(false);
    viewEmpIDText.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            viewEmpIDTextMouseClicked(evt);
        }
    });

    empPositionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrator", "Doctor", "Nurse", "Receptionist", "IT", "Janitorial", "Maintenance", "Other" }));
    empPositionComboBox.setEnabled(false);
    empPositionComboBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empPositionComboBoxActionPerformed(evt);
        }
    });

    empPositionLabel.setLabelFor(positionComboBox);
    empPositionLabel.setText("Position");

    empSaveButton.setText("Save");
    empSaveButton.setEnabled(false);
    empSaveButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empSaveButtonActionPerformed(evt);
        }
    });

    empCancelButton.setText("Cancel");
    empCancelButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empCancelButtonActionPerformed(evt);
        }
    });

    empEditButton.setText("Edit");
    empEditButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            empEditButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout viewEmpPanelLayout = new javax.swing.GroupLayout(viewEmpPanel);
    viewEmpPanel.setLayout(viewEmpPanelLayout);
    viewEmpPanelLayout.setHorizontalGroup(
        viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(viewEmpPanelLayout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empDOBLabel)
                            .addComponent(empDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empPhoneText, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                .addComponent(empPhoneLabel)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(empAddress2Label)
                    .addComponent(empAddress1Text)
                    .addComponent(empAddress1Label)
                    .addComponent(empAddress2Text)
                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empFirstNameLabel)
                            .addComponent(empFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empMiddleIntText)
                            .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                .addComponent(empMiddleIntLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addComponent(empSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empZipText, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(empLastNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCityLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCityText)
                            .addComponent(empLastNameText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addComponent(empZipLabel)
                        .addComponent(empEmailLabel)
                        .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(23, 23, 23)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(empStateLabel)
                        .addComponent(empSSNLabel)
                        .addComponent(empCountryLabel)
                        .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(empSSNText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empStateText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empCountryText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createSequentialGroup()
                                .addComponent(viewEmpIDLabel)
                                .addGap(39, 39, 39))
                            .addComponent(viewEmpIDText, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGap(18, 18, 18)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(empGenderLabel)
                        .addComponent(empFemaleRadioButton)
                        .addComponent(empMaleRadioButton)
                        .addComponent(empPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addComponent(empPositionLabel))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewEmpPanelLayout.createSequentialGroup()
                    .addComponent(empEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(empCancelButton)))
            .addContainerGap(57, Short.MAX_VALUE))
    );

    viewEmpPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {empCancelButton, empSaveButton});

    viewEmpPanelLayout.setVerticalGroup(
        viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(viewEmpPanelLayout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addComponent(empSSNLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empSSNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                        .addComponent(empMiddleIntLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(empMiddleIntText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                            .addComponent(empLastNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(empLastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                            .addComponent(empFirstNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(empFirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(empAddress1Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empAddress1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(empStateLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empStateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                            .addComponent(empCityLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addComponent(empAddress2Label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empAddress2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(empZipLabel)
                                        .addComponent(empCountryLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(empZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(empCountryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                                    .addGap(35, 35, 35)
                                    .addComponent(empDOBLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(empDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                                            .addComponent(empPhoneLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(empPhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewEmpPanelLayout.createSequentialGroup()
                                            .addComponent(viewEmpIDLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(viewEmpIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(viewEmpPanelLayout.createSequentialGroup()
                            .addComponent(empEmailLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(empEmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(viewEmpPanelLayout.createSequentialGroup()
                    .addComponent(empGenderLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(empMaleRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(empFemaleRadioButton)
                    .addGap(18, 18, 18)
                    .addComponent(empPositionLabel)
                    .addGap(18, 18, 18)
                    .addComponent(empPositionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(51, 51, 51)
            .addGroup(viewEmpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(empCancelButton)
                .addComponent(empSaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(empEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(148, Short.MAX_VALUE))
    );

    viewEmpPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {empCancelButton, empSaveButton});

    empContainerPanel.add(viewEmpPanel, "card2");

    viewEmpButton.setText("View");
    viewEmpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    viewEmpButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            viewEmpButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout empPanelLayout = new javax.swing.GroupLayout(empPanel);
    empPanel.setLayout(empPanelLayout);
    empPanelLayout.setHorizontalGroup(
        empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empPanelLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(viewEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(25, 25, 25)
            .addComponent(empContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 978, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
    );
    empPanelLayout.setVerticalGroup(
        empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(empPanelLayout.createSequentialGroup()
            .addGroup(empPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(empPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(viewEmpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(empPanelLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(empContainerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(133, 133, 133))
    );

    containerPanel.add(empPanel, "card2");

    jMenu1.setText("File");
    jMenuBar1.add(jMenu1);

    jMenu2.setText("Edit");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(logoLabel)))
                    .addGap(0, 122, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
            .addGap(23, 23, 23))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(patientsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(apptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(reportsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(billButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(empButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(adminButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminButtonActionPerformed
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(adminPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_adminButtonActionPerformed

    private void patientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientsButtonActionPerformed
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();

        containerPanel.add(patientsPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_patientsButtonActionPerformed

    private void addNewUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewUserButtonActionPerformed
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();

        adminContainerPanel.add(addUserPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        maleRadioButton.doClick(); //set default value to male radio button
    }//GEN-LAST:event_addNewUserButtonActionPerformed

    private void zipTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zipTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_zipTextMouseClicked

    private void cityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextMouseClicked

    private void address1TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address1TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address1TextMouseClicked

    private void ssnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ssnTextMouseClicked
        ssnText.setText("");
    }//GEN-LAST:event_ssnTextMouseClicked

    private void address2TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_address2TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_address2TextMouseClicked

    private void phoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneTextMouseClicked
        phoneText.setText("");
    }//GEN-LAST:event_phoneTextMouseClicked

    private void ssnTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ssnTextFocusGained
        ssnText.selectAll();
    }//GEN-LAST:event_ssnTextFocusGained

    private void phoneTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneTextFocusGained
        phoneText.selectAll();
    }//GEN-LAST:event_phoneTextFocusGained

    private void positionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionComboBoxActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        //Add DB Calls before this method
        if(formValidation()) {
            createUserName();
            addUserToDB();
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        clearAddUserPanel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void empSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empSaveButtonActionPerformed
        //Method Call to Clear Fields in the Add User Panel
        //Add DB Calls before this method
        //clearViewEmpPanel();
    }//GEN-LAST:event_empSaveButtonActionPerformed

    private void empCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empCancelButtonActionPerformed
        //Disable Save Button
        empSaveButton.setEnabled(false);
        //Clear the employee view panel
       // clearViewEmpPanel();
    }//GEN-LAST:event_empCancelButtonActionPerformed

    private void viewEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEmpButtonActionPerformed
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();

        empContainerPanel.add(viewEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
    }//GEN-LAST:event_viewEmpButtonActionPerformed

    private void empPositionComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empPositionComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empPositionComboBoxActionPerformed

    private void empDOBTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empDOBTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empDOBTextMouseClicked

    private void empDOBTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empDOBTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empDOBTextFocusGained

    private void empPhoneTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empPhoneTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneTextMouseClicked

    private void empPhoneTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empPhoneTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empPhoneTextFocusGained

    private void empEmailTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empEmailTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailTextMouseClicked

    private void empEmailTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empEmailTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empEmailTextFocusGained

    private void viewEmpIDTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEmpIDTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewEmpIDTextMouseClicked

    private void empCountryTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empCountryTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empCountryTextMouseClicked

    private void empStateTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empStateTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empStateTextMouseClicked

    private void empZipTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empZipTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empZipTextMouseClicked

    private void empCityTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empCityTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empCityTextMouseClicked

    private void empAddress2TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empAddress2TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empAddress2TextMouseClicked

    private void empAddress1TextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empAddress1TextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empAddress1TextMouseClicked

    private void empSSNTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empSSNTextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_empSSNTextMouseClicked

    private void empSSNTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_empSSNTextFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_empSSNTextFocusGained

    private void empEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empEditButtonActionPerformed
        //Method call to allow the employee's inforamtion to be edited.
        editEmpInfo(true);
    }//GEN-LAST:event_empEditButtonActionPerformed

    private void empButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empButtonActionPerformed
        containerPanel.removeAll();
        containerPanel.repaint();
        containerPanel.revalidate();
       
        containerPanel.add(empPanel);
        containerPanel.repaint();
        containerPanel.revalidate();
    }//GEN-LAST:event_empButtonActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void accessLevelComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accessLevelComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accessLevelComboBoxActionPerformed

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthComboBoxActionPerformed

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayComboBoxActionPerformed

    private void yearComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBoxActionPerformed
     
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        //Run Main GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox accessLevelComboBox;
    private javax.swing.JButton addNewUserButton;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JLabel address1Label;
    private javax.swing.JTextField address1Text;
    private javax.swing.JLabel address2Label;
    private javax.swing.JTextField address2Text;
    private javax.swing.JButton adminButton;
    private javax.swing.JPanel adminContainerPanel;
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton apptButton;
    private javax.swing.JButton billButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityText;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JPanel defaultAdminPanel;
    private javax.swing.JPanel defaultEmpPanel;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel empAddress1Label;
    private javax.swing.JTextField empAddress1Text;
    private javax.swing.JLabel empAddress2Label;
    private javax.swing.JTextField empAddress2Text;
    private javax.swing.JButton empButton;
    private javax.swing.JButton empCancelButton;
    private javax.swing.JLabel empCityLabel;
    private javax.swing.JTextField empCityText;
    private javax.swing.JPanel empContainerPanel;
    private javax.swing.JLabel empCountryLabel;
    private javax.swing.JTextField empCountryText;
    private javax.swing.JLabel empDOBLabel;
    private javax.swing.JTextField empDOBText;
    private javax.swing.JButton empEditButton;
    private javax.swing.JLabel empEmailLabel;
    private javax.swing.JTextField empEmailText;
    private javax.swing.JRadioButton empFemaleRadioButton;
    private javax.swing.JLabel empFirstNameLabel;
    private javax.swing.JTextField empFirstNameText;
    private javax.swing.ButtonGroup empGenderButtonGroup;
    private javax.swing.JLabel empGenderLabel;
    private javax.swing.JLabel empLastNameLabel;
    private javax.swing.JTextField empLastNameText;
    private javax.swing.JRadioButton empMaleRadioButton;
    private javax.swing.JLabel empMiddleIntLabel;
    private javax.swing.JTextField empMiddleIntText;
    private javax.swing.JPanel empPanel;
    private javax.swing.JLabel empPhoneLabel;
    private javax.swing.JTextField empPhoneText;
    private javax.swing.JComboBox empPositionComboBox;
    private javax.swing.JLabel empPositionLabel;
    private javax.swing.JLabel empSSNLabel;
    private javax.swing.JTextField empSSNText;
    private javax.swing.JButton empSaveButton;
    private javax.swing.JLabel empStateLabel;
    private javax.swing.JTextField empStateText;
    private javax.swing.JLabel empZipLabel;
    private javax.swing.JTextField empZipText;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel middleIntLabel;
    private javax.swing.JTextField middleIntText;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JButton patientsButton;
    private javax.swing.JPanel patientsPanel;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JComboBox positionComboBox;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JLabel positionLabel1;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JTextField ssnText;
    private javax.swing.JComboBox stateComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JButton viewEmpButton;
    private javax.swing.JLabel viewEmpIDLabel;
    private javax.swing.JTextField viewEmpIDText;
    private javax.swing.JPanel viewEmpPanel;
    private javax.swing.JComboBox yearComboBox;
    private javax.swing.JLabel zipLabel;
    private javax.swing.JTextField zipText;
    // End of variables declaration//GEN-END:variables

    //Method to clear Add User Panel
    private void clearAddUserPanel(){
        //Clear Panel
        adminContainerPanel.removeAll();
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        adminContainerPanel.add(defaultAdminPanel);
        adminContainerPanel.repaint();
        adminContainerPanel.revalidate();
        
        //Reset text field values
        firstNameText.setText("");
        middleIntText.setText("");
        lastNameText.setText("");
        ssnText.setText("###-##-####");
        genderButtonGroup.clearSelection();
        address1Text.setText("");
        address2Text.setText("");
        cityText.setText("");
        zipText.setText("");
        phoneText.setText("###-###-####");
        positionComboBox.setSelectedIndex(0);
    }
    
    //Address 2 and Address1 need a regex pattern
    private boolean formValidation() {
        
        //User names need to be 1-20 upper and lower case numbers
        Pattern namePattern = Pattern.compile("[a-zA-Z]{1,20}");
        Matcher nameMatcher = namePattern.matcher(firstNameText.getText());
        
        //check if first name does not matche pattern
        if(!nameMatcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "First name can only contain " +
                                           "letters and must be 1-20 characthers long"); 
            return false;
        } 
            
        //check if middle int matches pattern, if present
        if(!middleIntText.getText().isEmpty()) {
            Pattern middleIntPattern = Pattern.compile("[A-Z]\\.{1}");
            Matcher middleIntMatch = middleIntPattern.matcher(middleIntText.getText());
        
            if(!nameMatcher.matches()) {
                 JOptionPane.showMessageDialog(rootPane, "Middle nint be must be a capital " +
                                               "letter followed by a period. (Ex: M."); 
                 return false;
            } 
        }
           
        //check if last name matches pattern
        nameMatcher = namePattern.matcher(lastNameText.getText());
        
        if(!nameMatcher.matches()) {
           JOptionPane.showMessageDialog(rootPane, "Last name can only contain " +
                                           "letters and must be 1-20 characthers long");
           return false;
        } 
           
      
        //check if ssn matches
        Pattern ssnPattern = Pattern.compile("\\d{3}[-]\\d{2}[-]\\d{4}");
        Matcher ssnMatcher = ssnPattern.matcher(ssnText.getText());
        
        if(!ssnMatcher.matches()) {
              JOptionPane.showMessageDialog(rootPane, "SSN must be of the format " +
                                            "###-##-## where # is a digit");
              return false;
        } 
        
        /*
        //check if address1 matches
        //*****Come back to ****
        Pattern address1 = Pattern.compile("\\d{1,5}\\s\\w.\\s(\\b\\w*\\b\\s){1,2}\\w*\\.");
        Matcher address1Matcher = address1.matcher(address1Text.getText());
        
        if(address1Matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Address 1 matches");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Address 1 does not match");
        } */
           
        
        //check if city is valid
        //can only be 1-3 words each a max of 20 characthers
        Pattern cityPattern = Pattern.compile("[a-zA-Z]{1,20}\\s?[a-zA-Z]{1,20}?\\s?[a-zA-Z]{1,20}?");
        Matcher cityMatcher = cityPattern.matcher(cityText.getText());
        
        if(!cityMatcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "City can only be 1-3 words " +
                                         "and a max of 20 characthers including spaces");
            return false;
        }
        
        //****for state we might want to change this to a combo box*******
      
        /*
         //check if address2 matches
        //*****Come back to ****
        Pattern address2 = Pattern.compile("\\d{1,5}\\s\\w.\\s(\\b\\w*\\b\\s){1,2}\\w*\\.");
        Matcher address2Matcher = address2.matcher(address1Text.getText());
        
        if(address2Matcher.matches()) {
            JOptionPane.showMessageDialog(rootPane, "Address 1 matches");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Address 1 does not match");
        }*/
        /*
        if(address2Text.getText().equals("")) {
            String address2 = "N/A";
        } else {
            String address = address2Text.getText();
        } */
       
        //check to see if zipcode is correct
        Pattern zipPattern = Pattern.compile("\\d{5}");
        Matcher zipMatcher = zipPattern.matcher(zipText.getText());
        
        if(!zipMatcher.matches()) {
             JOptionPane.showMessageDialog(rootPane, "Zip must be a 5 digit number" +
                                            " (Ex: 30303");
             return false;
        } 
        
      
        //check if month is selected
      if(monthComboBox.getSelectedItem().toString().equals("Month:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a month");
          return false;
      }
      
      if(dayComboBox.getSelectedItem().toString().equals("Day:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a day");
          return false;
      }
      
      if(yearComboBox.getSelectedItem().toString().equals("Year:")) {
          JOptionPane.showMessageDialog(rootPane, "Please select a year");
          return false;
      }
      
      
        //check if phone is correct
        Pattern phonePattern = Pattern.compile("\\d{3}[-]\\d{3}[-]\\d{4}");
        Matcher phoneMatcher = phonePattern.matcher(phoneText.getText());
        
        if(!phoneMatcher.matches()) {
             JOptionPane.showMessageDialog(rootPane, "Phone does not match");
             return false;
        }
       
        //if we get down here we're fine
        return true;
       
    }
    
    //Precondition: The add user form has been filled out and the user clicks
    //              save
    //Postcondition: A user name and password is created for the user by grabbing
    //              the first letter of the first name and followed by the last name.
    
    //              Ex: John Doe --> jdoe
    
    //If jdoe exists in the database we will grab the first 2 letters of the first
    //name
    //              Ex: John Doe --> jodoe
    //We will repeat until we get a unique user name for the new employee
    String userName;
    void createUserName() {
        int i = 1;
        //grab the first letter in the first name:
        String firstLetter = firstNameText.getText().substring(0,1).toLowerCase();
        String lastName = lastNameText.getText().toLowerCase();
        
        //put them together
        userName = firstLetter + lastName;
        //JOptionPane.showMessageDialog(rootPane, userName);
        
  
        Database db = new Database("SMSDB");
  
        if(db.validateUserName(userName) == false) {
            Boolean match = false;
            
            while(match == false) {
                userName = userName + String.valueOf(i);
                i++;
                match = db.validateUserName(userName);
                if (match == true) {
                    String email = userName + "@SMS.com";
                    stateComboBox.getSelectedItem().toString();
                    
                    break;
                }
            }
        }
        
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    
    public int parseInt(String str) {
        int x = 0;
        
        try {
            x = Integer.parseInt(str);
        } catch (Exception e) {
            
        }
     return x;
    }
     
   
    //if valid form
    void addUserToDB() {
        String gender = getSelectedButtonText(genderButtonGroup);
        int accessLevel = parseInt(accessLevelComboBox.getSelectedItem().toString());
        int day = parseInt(dayComboBox.getSelectedItem().toString());
        int year = parseInt(yearComboBox.getSelectedItem().toString());
        String email = userName + "@sms.com";
        String values = "VALUES ( '"+ firstNameText.getText() +
                "', '" + middleIntText.getText() + 
                "', '" + lastNameText.getText() +
                "', '" + userName + "', 'Password1"  +  
                "', '" + positionComboBox.getSelectedItem().toString() +
                "', "  + accessLevel  +
                ", '" + ssnText.getText()+
                "', '" + gender +
                "', '" + address1Text.getText() +
                "', '" + address2Text.getText() +
                "', '" + cityText.getText() +
                "', '" + stateComboBox.getSelectedItem().toString() + 
                "', '" + zipText.getText() + 
                "', '" + monthComboBox.getSelectedItem().toString() +
                "', " + day + 
                ", " + year +
                ", '" + phoneText.getText() + "', '" + email + "')";
        System.out.println(values);
        Database db = new Database("SMSDB");
        
        
        db.addDataToTable("employees", values);
        JOptionPane.showMessageDialog(rootPane, "Employee Added");
        clearAddUserPanel();
        
     
    } 
    
    //we need a method to generate the employee id
    //we can start with a 2 digit num followed by 3 zeros
    //and then the employee's index
    //that is 35 000 00
    //Does that mean we have to make a call to the database
    //to determine the employee's index?
    String createEmployeedID() {
        String empID = null;
        empID = "3500";
        return empID;
    }
    
    
    void viewCreatedEmployee(String ... setOfStrings) {
        
    }
    //Method to edit Employee Info
    private void editEmpInfo(Boolean str){
        empSaveButton.setEnabled(str);
        empFirstNameText.setEnabled(str);
        empMiddleIntText.setEnabled(str);
        empLastNameText.setEnabled(str);
        empSSNText.setEnabled(str);
        empMaleRadioButton.setEnabled(str);
        empFemaleRadioButton.setEnabled(str);
        empAddress1Text.setEnabled(str);
        empAddress2Text.setEnabled(str);
        empCityText.setEnabled(str);
        empStateText.setEnabled(str);
        empZipText.setEnabled(str);
        empCountryText.setEnabled(str);
        empPositionComboBox.setEnabled(str);
        empDOBText.setEnabled(str);
        empPhoneText.setEnabled(str);
        empEmailText.setEnabled(str);
        viewEmpIDText.setEnabled(str);
        
    }
    
    //Method to clear View Employee Panel
    private void clearViewEmpPanel(){
        //Clear Panel
        empContainerPanel.removeAll();
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        empContainerPanel.add(defaultEmpPanel);
        empContainerPanel.repaint();
        empContainerPanel.revalidate();
        
        //Reset Textfield values
        empFirstNameText.setText("");
        empMiddleIntText.setText("");
        empLastNameText.setText("");
        empSSNText.setText("");
        empMaleRadioButton.setSelected(false);
        empFemaleRadioButton.setSelected(false);
        empAddress1Text.setText("");
        empAddress2Text.setText("");
        empCityText.setText("");
        empStateText.setText("");
        empZipText.setText("");
        empCountryText.setText("");
        empPositionComboBox.setSelectedIndex(0);
        empDOBText.setText("");
        empPhoneText.setText("");
        empEmailText.setText("");
        viewEmpIDText.setText("");
        monthComboBox.setSelectedIndex(0);
        dayComboBox.setSelectedIndex(0);
        yearComboBox.setSelectedIndex(0);
        stateComboBox.setSelectedIndex(0);
        accessLevelComboBox.setSelectedIndex(0);
        
        //Disable fields
        editEmpInfo(false);
    }
    
    
}
