 /*************************************************************************
 *                                                                        *
 *                   Mureithi David Wachira	                          *
 *                                                                        *
 *                   Mobile: +254 (0) 722 413 699                         *
 *                   Email:  davidwachira90@gmail.com                     *
 *                   Website: davidwachira.com                            *
 *                                                                        *
 *                   Date:   Wednesday 30th April 2014                    *
 *                                                                        *
 *                   KCSE 2013 Results Application                        *
 *                                                                        *
 *************************************************************************/
package kcse_2013_results;

/** Start of Imports (Libraries) *******/

 /*************************************************************************
 *                                                                        *
 *                   The various imports: Libraries used in this file     *
 *                                                                        *
 *************************************************************************/
import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.net.*;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
/** End of Imports (Libraries) *******/


public class KCSE_Results_MDI extends javax.swing.JFrame {
    
    private WindowFocusListener windowFocusListener;
    
    /** Start of Global Variables *******/
    String details_searched_by_user = "";
    int update_display_counter =0;
    int line_number_where_school_is_found;
    String Subject_I;
    String Subject_II;
    String Subject_III;
    String Subject_IV;
    String Subject_V;
    String Subject_VI;
    String Subject_VII;
    String Subject_VIII;
    int max_limit_line_number_where_school_is_found;
    int[] array_school_grades_count = new int[13];
    int[] array_subject_grades_distribution = new int[18];
    /** End of Global Variables *******/
    
    
    public KCSE_Results_MDI() 
    {
        initComponents();
        JTextField_Candidates_Performance_Index_number.setDocument(new JTextFieldLimit(11));
		JTextField_Candidates_Performance_Index_number.setToolTipText("Eg. 11200001001 - Alliance Boys; 20400004001 - Starehe Boys");
		
        JTextField_School_Performance_School_Code.setDocument(new JTextFieldLimit(8));
		JTextField_School_Performance_School_Code.setToolTipText("Eg. 11200003 - Mangu High; 11200001 - Alliance Boys");
		
        JTextField_Candidates_Performance_Index_number.addKeyListener(new KeyAdapterNumbersOnly());
        JTextField_School_Performance_School_Code.addKeyListener(new KeyAdapterNumbersOnly());
		
		
        Disable_and_hide_labels();
        Disable_and_hide_labels_on_School_Performance_Tab(); 
        Disable_and_hide_labels_on_Subject_Analysis_Tab();  
        Disable_and_hide_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_KCSE_2013_Results_MDI_Header = new javax.swing.JPanel();
        JLabel_Image_KCSE_2013_Results_MDI_Header = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Top = new javax.swing.JSeparator();
        JTabbedPane_KCSE_2013_Results_MDI = new javax.swing.JTabbedPane();
        JPanel_Candidates_Performance = new javax.swing.JPanel();
        JLabel_Candidates_Performance_Index_number = new javax.swing.JLabel();
        JTextField_Candidates_Performance_Index_number = new javax.swing.JTextField();
        JButton_Candidates_Performance_Index_number_Show_Results = new javax.swing.JButton();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results = new javax.swing.JSeparator();
        JLabel_School_code = new javax.swing.JLabel();
        JLabel_Retrieved_School_Code = new javax.swing.JLabel();
        JLabel_Name_of_School = new javax.swing.JLabel();
        JLabel_Retrieved_Name_of_School = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results1 = new javax.swing.JSeparator();
        JLabel_Candidates_Name = new javax.swing.JLabel();
        JLabel_Candidates_Name_as_Registered = new javax.swing.JLabel();
        JLabel_Candidates_Gender = new javax.swing.JLabel();
        JLabel_Candidates_Gender_as_Registered = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results2 = new javax.swing.JSeparator();
        JLabel_Candidates_Subject_1 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_2 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_3 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_4 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_5 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_6 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_8 = new javax.swing.JLabel();
        JLabel_Candidates_Subject_7 = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results3 = new javax.swing.JSeparator();
        JLabel_Candidates_Mean_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Mean_Grade_Obtained = new javax.swing.JLabel();
        JLabel_Candidates_Aggregate_Points_Obtained = new javax.swing.JLabel();
        JLabel_Candidates_Aggregate_Points = new javax.swing.JLabel();
        JLabel_Candidates_Subject_1_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_2_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_3_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_4_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_5_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_6_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_7_Grade = new javax.swing.JLabel();
        JLabel_Candidates_Subject_8_Grade = new javax.swing.JLabel();
        JLabel_Bar_Chart_Candidates_Performance = new javax.swing.JLabel();
        JPanel_School_Performance = new javax.swing.JPanel();
        JLabel_Retrieved_School_Code_inside_School_Performance = new javax.swing.JLabel();
        JLabel_Name_of_School_inside_School_Performance = new javax.swing.JLabel();
        JLabel_Retrieved_Name_of_School_inside_School_Performance = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance = new javax.swing.JSeparator();
        jLabel_Number_of_Students_with_Particular_Grade = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_A = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_A_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_A_minus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_A_minus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_plus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_plus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_stand = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_stand_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_minus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_B_minus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_plus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_plus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_stand = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_stand_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_minus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_C_minus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_plus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_plus_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_stand = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_stand_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_minus = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_D_minus_Calculated = new javax.swing.JLabel();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1 = new javax.swing.JSeparator();
        JLabel_Number_of_Students_with_Grade_E = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Grade_E_Calculated = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Irregular_Grade = new javax.swing.JLabel();
        JLabel_Number_of_Students_with_Irregular_Grade_Calculated = new javax.swing.JLabel();
        JButton_Pie_Chart_of_Schools_Performance = new javax.swing.JButton();
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most = new javax.swing.JSeparator();
        School_Performance_School_Code = new javax.swing.JLabel();
        JTextField_School_Performance_School_Code = new javax.swing.JTextField();
        JButton_School_Performance_School_Code_Show_Results = new javax.swing.JButton();
        JSeparator_School_Performance_Subject_Statistics_down_bottom = new javax.swing.JSeparator();
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject = new javax.swing.JComboBox();
        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics = new javax.swing.JButton();
        JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E = new javax.swing.JLabel();
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade = new javax.swing.JLabel();
        JPanel_Subject_Analysis_KCSE_2013 = new javax.swing.JPanel();
        JLabel_Subject_Analysis_Subject_Statistics_on = new javax.swing.JLabel();
        JSeparator_Subject_Analysis_Top = new javax.swing.JSeparator();
        JComboBox_Subject_Analysis_Select_a_Subject = new javax.swing.JComboBox();
        JButton_Subject_Analysis_Go_Show_Statistics = new javax.swing.JButton();
        JSeparator_Subject_Analysis_Bottom = new javax.swing.JSeparator();
        JLabel_Title_Grade_A_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_A_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_A_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_A_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_B_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_B_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_B_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_B_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_B_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_B_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_C_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_C_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_C_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_C_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_C_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_C_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_D_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_D_plus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_D_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_D_plain_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_D_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_D_minus_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_E_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_E_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_P_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_P_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_U_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_U_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_X_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_X_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_Y_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_Y_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_Z_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_Z_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Grade_W_in_Subject = new javax.swing.JLabel();
        JLabel_Actual_Grade_W_in_Subject = new javax.swing.JLabel();
        JLabel_Title_Male_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Actual_Male_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Title_Female_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Actual_Female_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Title_Total_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Actual_Total_Candidates_Taking_Subject = new javax.swing.JLabel();
        JLabel_Pie_Chart_Subject_Analysis = new javax.swing.JLabel();
        JLabel_Image_KCSE_2013_Results_MDI_Header_Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("KCSE 2013 Results");
        setIconImage(new ImageIcon(getClass().getResource("MDI_main_icon.png")).getImage());
        setName("Jframe_KCSE_2013_Results_MDI"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        JLabel_Image_KCSE_2013_Results_MDI_Header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/KCSE_2013_Results_Header.png"))); // NOI18N

        javax.swing.GroupLayout JPanel_KCSE_2013_Results_MDI_HeaderLayout = new javax.swing.GroupLayout(JPanel_KCSE_2013_Results_MDI_Header);
        JPanel_KCSE_2013_Results_MDI_Header.setLayout(JPanel_KCSE_2013_Results_MDI_HeaderLayout);
        JPanel_KCSE_2013_Results_MDI_HeaderLayout.setHorizontalGroup(
            JPanel_KCSE_2013_Results_MDI_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_KCSE_2013_Results_MDI_HeaderLayout.createSequentialGroup()
                .addComponent(JLabel_Image_KCSE_2013_Results_MDI_Header)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        JPanel_KCSE_2013_Results_MDI_HeaderLayout.setVerticalGroup(
            JPanel_KCSE_2013_Results_MDI_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_KCSE_2013_Results_MDI_HeaderLayout.createSequentialGroup()
                .addComponent(JLabel_Image_KCSE_2013_Results_MDI_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        JTabbedPane_KCSE_2013_Results_MDI.setName(""); // NOI18N
        JTabbedPane_KCSE_2013_Results_MDI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTabbedPane_KCSE_2013_Results_MDIMouseClicked(evt);
            }
        });
        JTabbedPane_KCSE_2013_Results_MDI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTabbedPane_KCSE_2013_Results_MDIFocusGained(evt);
            }
        });

        JLabel_Candidates_Performance_Index_number.setText("Please enter the Index Number");

        JTextField_Candidates_Performance_Index_number.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JTextField_Candidates_Performance_Index_numberMouseMoved(evt);
            }
        });
        JTextField_Candidates_Performance_Index_number.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTextField_Candidates_Performance_Index_numberFocusGained(evt);
            }
        });
        JTextField_Candidates_Performance_Index_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextField_Candidates_Performance_Index_numberKeyPressed(evt);
            }
        });

        JButton_Candidates_Performance_Index_number_Show_Results.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/16by16 show_students_results.png"))); // NOI18N
        JButton_Candidates_Performance_Index_number_Show_Results.setText("Show Student's Results");
        JButton_Candidates_Performance_Index_number_Show_Results.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JButton_Candidates_Performance_Index_number_Show_Results.setMaximumSize(new java.awt.Dimension(197, 26));
        JButton_Candidates_Performance_Index_number_Show_Results.setMinimumSize(new java.awt.Dimension(197, 26));
        JButton_Candidates_Performance_Index_number_Show_Results.setPreferredSize(new java.awt.Dimension(197, 26));
        JButton_Candidates_Performance_Index_number_Show_Results.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JButton_Candidates_Performance_Index_number_Show_ResultsMouseMoved(evt);
            }
        });
        JButton_Candidates_Performance_Index_number_Show_Results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_Candidates_Performance_Index_number_Show_ResultsMouseClicked(evt);
            }
        });
        JButton_Candidates_Performance_Index_number_Show_Results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Candidates_Performance_Index_number_Show_ResultsActionPerformed(evt);
            }
        });

        JLabel_School_code.setText("School Code:");

        JLabel_Retrieved_School_Code.setText("00000000");

        JLabel_Name_of_School.setText("Name of School:");

        JLabel_Retrieved_Name_of_School.setText("xxxxxxxxxxxxxxx xxxxxx xxx");

        JLabel_Candidates_Name.setText("Name:");

        JLabel_Candidates_Name_as_Registered.setText("jLabel2");

        JLabel_Candidates_Gender.setText("Gender: ");

        JLabel_Candidates_Gender_as_Registered.setText("jLabel4");

        JLabel_Candidates_Subject_1.setText("Subject 1:");

        JLabel_Candidates_Subject_2.setText("Subject 2:");

        JLabel_Candidates_Subject_3.setText("Subject 3:");

        JLabel_Candidates_Subject_4.setText("Subject 1:");

        JLabel_Candidates_Subject_5.setText("Subject 2:");

        JLabel_Candidates_Subject_6.setText("Subject 3:");

        JLabel_Candidates_Subject_8.setText("Subject 2:");

        JLabel_Candidates_Subject_7.setText("Subject 1:");

        JLabel_Candidates_Mean_Grade.setText("Mean Grade: ");

        JLabel_Candidates_Mean_Grade_Obtained.setText("Mean Grade: ");

        JLabel_Candidates_Aggregate_Points_Obtained.setText("Mean Grade: ");

        JLabel_Candidates_Aggregate_Points.setText("Aggregate Points: ");

        JLabel_Candidates_Subject_1_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_2_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_3_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_4_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_5_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_6_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_7_Grade.setText("jLabel1");

        JLabel_Candidates_Subject_8_Grade.setText("jLabel1");

        JLabel_Bar_Chart_Candidates_Performance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/pools_16.png"))); // NOI18N
        JLabel_Bar_Chart_Candidates_Performance.setText(" Bar Chart");
        JLabel_Bar_Chart_Candidates_Performance.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JLabel_Bar_Chart_Candidates_Performance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_Bar_Chart_Candidates_PerformanceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanel_Candidates_PerformanceLayout = new javax.swing.GroupLayout(JPanel_Candidates_Performance);
        JPanel_Candidates_Performance.setLayout(JPanel_Candidates_PerformanceLayout);
        JPanel_Candidates_PerformanceLayout.setHorizontalGroup(
            JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results)
                    .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results1)
                    .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                        .addComponent(JLabel_School_code)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLabel_Retrieved_School_Code)
                        .addGap(18, 18, 18)
                        .addComponent(JLabel_Name_of_School)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_Retrieved_Name_of_School, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Candidates_Performance_Index_number)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTextField_Candidates_Performance_Index_number, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButton_Candidates_Performance_Index_number_Show_Results, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JLabel_Candidates_Subject_1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                    .addComponent(JLabel_Candidates_Subject_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLabel_Candidates_Subject_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel_Candidates_Subject_1_Grade)
                                    .addComponent(JLabel_Candidates_Subject_2_Grade)
                                    .addComponent(JLabel_Candidates_Subject_3_Grade))
                                .addGap(26, 26, 26)
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JLabel_Candidates_Subject_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLabel_Candidates_Subject_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JLabel_Candidates_Subject_4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel_Candidates_Subject_6_Grade)
                                    .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLabel_Candidates_Subject_4_Grade)
                                            .addComponent(JLabel_Candidates_Subject_5_Grade))
                                        .addGap(18, 18, 18)
                                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JLabel_Candidates_Subject_7, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(JLabel_Candidates_Subject_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLabel_Candidates_Subject_8_Grade, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLabel_Candidates_Subject_7_Grade, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Candidates_Name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLabel_Candidates_Name_as_Registered, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Candidates_Gender)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Candidates_Gender_as_Registered, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(JLabel_Candidates_Mean_Grade)
                                .addGap(28, 28, 28)
                                .addComponent(JLabel_Candidates_Mean_Grade_Obtained, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(JLabel_Candidates_Aggregate_Points)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Candidates_Aggregate_Points_Obtained, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Bar_Chart_Candidates_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanel_Candidates_PerformanceLayout.setVerticalGroup(
            JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Candidates_Performance_Index_number)
                    .addComponent(JTextField_Candidates_Performance_Index_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_Candidates_Performance_Index_number_Show_Results, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_School_code)
                    .addComponent(JLabel_Retrieved_School_Code)
                    .addComponent(JLabel_Name_of_School)
                    .addComponent(JLabel_Retrieved_Name_of_School))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Candidates_Name)
                    .addComponent(JLabel_Candidates_Name_as_Registered)
                    .addComponent(JLabel_Candidates_Gender)
                    .addComponent(JLabel_Candidates_Gender_as_Registered))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Candidates_Subject_1)
                            .addComponent(JLabel_Candidates_Subject_1_Grade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Candidates_Subject_2)
                            .addComponent(JLabel_Candidates_Subject_2_Grade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Candidates_Subject_3)
                            .addComponent(JLabel_Candidates_Subject_3_Grade)))
                    .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel_Candidates_Subject_4)
                                    .addComponent(JLabel_Candidates_Subject_4_Grade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLabel_Candidates_Subject_5)
                                    .addComponent(JLabel_Candidates_Subject_5_Grade)))
                            .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                    .addComponent(JLabel_Candidates_Subject_7_Grade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JLabel_Candidates_Subject_8_Grade))
                                .addGroup(JPanel_Candidates_PerformanceLayout.createSequentialGroup()
                                    .addComponent(JLabel_Candidates_Subject_7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JLabel_Candidates_Subject_8))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Candidates_Subject_6)
                            .addComponent(JLabel_Candidates_Subject_6_Grade))))
                .addGap(23, 23, 23)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_Candidates_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Candidates_Mean_Grade)
                    .addComponent(JLabel_Candidates_Mean_Grade_Obtained)
                    .addComponent(JLabel_Candidates_Aggregate_Points)
                    .addComponent(JLabel_Candidates_Aggregate_Points_Obtained)
                    .addComponent(JLabel_Bar_Chart_Candidates_Performance))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        JTabbedPane_KCSE_2013_Results_MDI.addTab("Candidate's Performance", new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/MDI_Tab_icon_pupil.png")), JPanel_Candidates_Performance); // NOI18N

        JLabel_Retrieved_School_Code_inside_School_Performance.setText("00000000");

        JLabel_Name_of_School_inside_School_Performance.setText(" - ");

        JLabel_Retrieved_Name_of_School_inside_School_Performance.setText("xxxxxxxxxxxxxxx xxxxxx xxx");

        jLabel_Number_of_Students_with_Particular_Grade.setText("Number of Students with Mean Grade:");

        JLabel_Number_of_Students_with_Grade_A.setText("A");
        JLabel_Number_of_Students_with_Grade_A.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_A.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_A.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_A_Calculated.setText("# of A");

        JLabel_Number_of_Students_with_Grade_A_minus.setText("A-");
        JLabel_Number_of_Students_with_Grade_A_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_A_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_A_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setText("# of A-");

        JLabel_Number_of_Students_with_Grade_B_plus.setText("B+");
        JLabel_Number_of_Students_with_Grade_B_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setText("# of B+");

        JLabel_Number_of_Students_with_Grade_B_stand.setText("B");
        JLabel_Number_of_Students_with_Grade_B_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setText("# of B");

        JLabel_Number_of_Students_with_Grade_B_minus.setText("B-");
        JLabel_Number_of_Students_with_Grade_B_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_B_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setText("# of B-");

        JLabel_Number_of_Students_with_Grade_C_plus.setText("C+");
        JLabel_Number_of_Students_with_Grade_C_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setText("# of C+");

        JLabel_Number_of_Students_with_Grade_C_stand.setText("C");
        JLabel_Number_of_Students_with_Grade_C_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setText("# of C");

        JLabel_Number_of_Students_with_Grade_C_minus.setText("C-");
        JLabel_Number_of_Students_with_Grade_C_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_C_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setText("# of C-");

        JLabel_Number_of_Students_with_Grade_D_plus.setText("D+");
        JLabel_Number_of_Students_with_Grade_D_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setText("# of D+");

        JLabel_Number_of_Students_with_Grade_D_stand.setText("D");
        JLabel_Number_of_Students_with_Grade_D_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setText("# of D");

        JLabel_Number_of_Students_with_Grade_D_minus.setText("D-");
        JLabel_Number_of_Students_with_Grade_D_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_D_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setText("# of D-");

        JLabel_Number_of_Students_with_Grade_E.setText("E");
        JLabel_Number_of_Students_with_Grade_E.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_E.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Grade_E.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Grade_E_Calculated.setText("# of E");

        JLabel_Number_of_Students_with_Irregular_Grade.setText("***");
        JLabel_Number_of_Students_with_Irregular_Grade.setMaximumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Irregular_Grade.setMinimumSize(new java.awt.Dimension(34, 14));
        JLabel_Number_of_Students_with_Irregular_Grade.setPreferredSize(new java.awt.Dimension(34, 14));

        JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setText("# of ***");

        JButton_Pie_Chart_of_Schools_Performance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/rsz_pie_chart_24.png"))); // NOI18N
        JButton_Pie_Chart_of_Schools_Performance.setText("Pie Chart");
        JButton_Pie_Chart_of_Schools_Performance.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JButton_Pie_Chart_of_Schools_Performance.setMaximumSize(new java.awt.Dimension(197, 26));
        JButton_Pie_Chart_of_Schools_Performance.setMinimumSize(new java.awt.Dimension(197, 26));
        JButton_Pie_Chart_of_Schools_Performance.setPreferredSize(new java.awt.Dimension(197, 26));
        JButton_Pie_Chart_of_Schools_Performance.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JButton_Pie_Chart_of_Schools_PerformanceFocusLost(evt);
            }
        });
        JButton_Pie_Chart_of_Schools_Performance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_Pie_Chart_of_Schools_PerformanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JButton_Pie_Chart_of_Schools_PerformanceMouseEntered(evt);
            }
        });
        JButton_Pie_Chart_of_Schools_Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Pie_Chart_of_Schools_PerformanceActionPerformed(evt);
            }
        });
        JButton_Pie_Chart_of_Schools_Performance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                JButton_Pie_Chart_of_Schools_PerformanceKeyReleased(evt);
            }
        });

        School_Performance_School_Code.setText("Please enter the School Code:");

        JTextField_School_Performance_School_Code.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                JTextField_School_Performance_School_CodeFocusGained(evt);
            }
        });
        JTextField_School_Performance_School_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextField_School_Performance_School_CodeKeyPressed(evt);
            }
        });

        JButton_School_Performance_School_Code_Show_Results.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/16by16 show_students_results.png"))); // NOI18N
        JButton_School_Performance_School_Code_Show_Results.setText("Show School's Results");
        JButton_School_Performance_School_Code_Show_Results.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JButton_School_Performance_School_Code_Show_Results.setMaximumSize(new java.awt.Dimension(197, 26));
        JButton_School_Performance_School_Code_Show_Results.setMinimumSize(new java.awt.Dimension(197, 26));
        JButton_School_Performance_School_Code_Show_Results.setPreferredSize(new java.awt.Dimension(197, 26));
        JButton_School_Performance_School_Code_Show_Results.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_School_Performance_School_Code_Show_ResultsMouseClicked(evt);
            }
        });
        JButton_School_Performance_School_Code_Show_Results.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_School_Performance_School_Code_Show_ResultsActionPerformed(evt);
            }
        });

        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Subject", "101 - English", "102 - Kiswahili", "121 - Mathematics", "122 - Mathematics Alternative B", "231 - Biology", "232 - Physics", "233 - Chemistry", "236 - Biology for the blind", "237 - General Science for Option B", "311 - History & Government", "312 - Geography", "313 - Christian Religious Education", "314 - Islamic Religious Education", "315 - Hindu Religious Education", "441 - Home Science", "442 - Art and Design", "443 - Agriculture", "444 - Woodwork", "445 - Metalwork", "446 - Building Construction", "447 - Power Mechanics", "448 - Electricity", "449 - Drawing and Design", "450 - Aviation Technology", "451 - Computer Studies", "501 - French", "502 - German", "503 - Arabic", "504 - Kenya Sign Language", "511 - Music", "565 - Business Studies" }));
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setMinimumSize(new java.awt.Dimension(190, 19));
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setOpaque(false);
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setPreferredSize(new java.awt.Dimension(190, 19));
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBox_School_Performance_Subject_Analysis_Select_a_SubjectMouseClicked(evt);
            }
        });

        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/Shape 164.png"))); // NOI18N
        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.setText("Show");
        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsMouseClicked(evt);
            }
        });
        JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsActionPerformed(evt);
            }
        });

        JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on.setText("Subject Statistics on: ");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setText("# of ***");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated.setText("# of E");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setText("# of D-");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setText("# of D");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setText("# of D+");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setText("# of C-");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setText("# of C");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setText("# of C+");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setText("# of B-");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setText("# of B");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setText("# of B+");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setText("# of A-");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated.setText("# of A");

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setText("A");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setText("A-");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setText("B+");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setText("B");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setText("B-");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setText("C+");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setText("C");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setText("C-");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setText("D+");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setText("D");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setText("D-");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setText("E");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setPreferredSize(new java.awt.Dimension(34, 14));

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setText("***");
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setMaximumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setMinimumSize(new java.awt.Dimension(34, 14));
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setPreferredSize(new java.awt.Dimension(34, 14));

        javax.swing.GroupLayout JPanel_School_PerformanceLayout = new javax.swing.GroupLayout(JPanel_School_Performance);
        JPanel_School_Performance.setLayout(JPanel_School_PerformanceLayout);
        JPanel_School_PerformanceLayout.setHorizontalGroup(
            JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addComponent(School_Performance_School_Code)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTextField_School_Performance_School_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButton_School_Performance_School_Code_Show_Results, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_A_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_A_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_A_minus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_plus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_stand_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_B_minus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_plus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_stand_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_C_minus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_plus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_stand_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_minus_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabel_Number_of_Students_with_Grade_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Number_of_Students_with_Grade_E_Calculated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLabel_Number_of_Students_with_Irregular_Grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JLabel_Number_of_Students_with_Irregular_Grade_Calculated, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addComponent(JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on)
                        .addGap(18, 18, 18)
                        .addComponent(JComboBox_School_Performance_Subject_Analysis_Select_a_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButton_School_Performance_Subject_Analysis_Go_Show_Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_Number_of_Students_with_Particular_Grade)
                    .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JSeparator_School_Performance_Subject_Statistics_down_bottom, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addComponent(JLabel_Retrieved_School_Code_inside_School_Performance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_Name_of_School_inside_School_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLabel_Retrieved_Name_of_School_inside_School_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JButton_Pie_Chart_of_Schools_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_School_PerformanceLayout.setVerticalGroup(
            JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(School_Performance_School_Code)
                    .addComponent(JTextField_School_Performance_School_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton_School_Performance_School_Code_Show_Results, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Retrieved_School_Code_inside_School_Performance)
                    .addComponent(JLabel_Name_of_School_inside_School_Performance)
                    .addComponent(JLabel_Retrieved_Name_of_School_inside_School_Performance)
                    .addComponent(JButton_Pie_Chart_of_Schools_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addComponent(jLabel_Number_of_Students_with_Particular_Grade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                        .addComponent(JLabel_Number_of_Students_with_Grade_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLabel_Number_of_Students_with_Grade_A_Calculated))
                                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                        .addComponent(JLabel_Number_of_Students_with_Grade_A_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JLabel_Number_of_Students_with_Grade_A_minus_Calculated)))
                                .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                    .addComponent(JLabel_Number_of_Students_with_Grade_B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JLabel_Number_of_Students_with_Grade_B_plus_Calculated)))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Number_of_Students_with_Grade_B_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Number_of_Students_with_Grade_B_stand_Calculated))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Number_of_Students_with_Grade_B_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Number_of_Students_with_Grade_B_minus_Calculated))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_plus_Calculated))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_stand_Calculated))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Number_of_Students_with_Grade_C_minus_Calculated))))
                    .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_stand_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_plus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JLabel_Number_of_Students_with_Grade_D_minus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Number_of_Students_with_Grade_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Number_of_Students_with_Irregular_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Number_of_Students_with_Grade_E_Calculated)
                                .addComponent(JLabel_Number_of_Students_with_Irregular_Grade_Calculated)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JComboBox_School_Performance_Subject_Analysis_Select_a_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on)))
                    .addComponent(JButton_School_Performance_Subject_Analysis_Go_Show_Statistics, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                    .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated))
                                .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                    .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated)))
                            .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated)))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated)))
                    .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated))
                        .addGroup(JPanel_School_PerformanceLayout.createSequentialGroup()
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(JPanel_School_PerformanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated)
                                .addComponent(School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JSeparator_School_Performance_Subject_Statistics_down_bottom, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        JTabbedPane_KCSE_2013_Results_MDI.addTab("School Performance", new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/MDI_Tab_icon_school.png")), JPanel_School_Performance); // NOI18N

        JPanel_Subject_Analysis_KCSE_2013.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanel_Subject_Analysis_KCSE_2013MouseClicked(evt);
            }
        });

        JLabel_Subject_Analysis_Subject_Statistics_on.setText("National Subject Statistics on: ");

        JComboBox_Subject_Analysis_Select_a_Subject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select a Subject", "101 - English", "102 - Kiswahili", "121 - Mathematics", "122 - Mathematics Alternative B", "231 - Biology", "232 - Physics", "233 - Chemistry", "236 - Biology for the blind", "237 - General Science for Option B", "311 - History & Government", "312 - Geography", "313 - Christian Religious Education", "314 - Islamic Religious Education", "315 - Hindu Religious Education", "441 - Home Science", "442 - Art and Design", "443 - Agriculture", "444 - Woodwork", "445 - Metalwork", "446 - Building Construction", "447 - Power Mechanics", "448 - Electricity", "449 - Drawing and Design", "450 - Aviation Technology", "451 - Computer Studies", "501 - French", "502 - German", "503 - Arabic", "504 - Kenya Sign Language", "511 - Music", "565 - Business Studies" }));
        JComboBox_Subject_Analysis_Select_a_Subject.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        JComboBox_Subject_Analysis_Select_a_Subject.setMinimumSize(new java.awt.Dimension(190, 19));
        JComboBox_Subject_Analysis_Select_a_Subject.setOpaque(false);
        JComboBox_Subject_Analysis_Select_a_Subject.setPreferredSize(new java.awt.Dimension(190, 19));
        JComboBox_Subject_Analysis_Select_a_Subject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBox_Subject_Analysis_Select_a_SubjectMouseClicked(evt);
            }
        });

        JButton_Subject_Analysis_Go_Show_Statistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/Shape 164.png"))); // NOI18N
        JButton_Subject_Analysis_Go_Show_Statistics.setText("Go");
        JButton_Subject_Analysis_Go_Show_Statistics.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JButton_Subject_Analysis_Go_Show_Statistics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButton_Subject_Analysis_Go_Show_StatisticsMouseClicked(evt);
            }
        });
        JButton_Subject_Analysis_Go_Show_Statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_Subject_Analysis_Go_Show_StatisticsActionPerformed(evt);
            }
        });

        JLabel_Title_Grade_A_in_Subject.setText("Grade A");
        JLabel_Title_Grade_A_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_A_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_A_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_A_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_A_in_Subject.setText("Grade A");
        JLabel_Actual_Grade_A_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_A_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_A_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_A_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_A_minus_in_Subject.setText("Grade A-");
        JLabel_Actual_Grade_A_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_A_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_A_minus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_A_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_A_minus_in_Subject.setText("Grade A-");
        JLabel_Title_Grade_A_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_A_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_A_minus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_A_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_B_plus_in_Subject.setText("Grade B+");
        JLabel_Actual_Grade_B_plus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_plus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_plus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_B_plus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_B_plus_in_Subject.setText("Grade B+");
        JLabel_Title_Grade_B_plus_in_Subject.setMaximumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_B_plus_in_Subject.setMinimumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_B_plus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_B_plus_in_Subject.setPreferredSize(new java.awt.Dimension(52, 14));

        JLabel_Actual_Grade_B_plain_in_Subject.setText("Grade B");
        JLabel_Actual_Grade_B_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_plain_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_B_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_B_plain_in_Subject.setText("Grade B");
        JLabel_Title_Grade_B_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_B_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_B_plain_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_B_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_B_minus_in_Subject.setText("Grade B-");
        JLabel_Title_Grade_B_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_B_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_B_minus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_B_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_B_minus_in_Subject.setText("Grade B-");
        JLabel_Actual_Grade_B_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_B_minus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_B_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_C_plus_in_Subject.setText("Grade C+");
        JLabel_Title_Grade_C_plus_in_Subject.setMaximumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_C_plus_in_Subject.setMinimumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_C_plus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_C_plus_in_Subject.setPreferredSize(new java.awt.Dimension(52, 14));

        JLabel_Actual_Grade_C_plus_in_Subject.setText("Grade C+");
        JLabel_Actual_Grade_C_plus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_plus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_plus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_C_plus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_C_plain_in_Subject.setText("Grade C");
        JLabel_Actual_Grade_C_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_plain_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_C_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_C_plain_in_Subject.setText("Grade C");
        JLabel_Title_Grade_C_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_C_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_C_plain_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_C_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_C_minus_in_Subject.setText("Grade C-");
        JLabel_Title_Grade_C_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_C_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_C_minus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_C_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_C_minus_in_Subject.setText("Grade C-");
        JLabel_Actual_Grade_C_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_C_minus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_C_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_D_plus_in_Subject.setText("Grade D+");
        JLabel_Title_Grade_D_plus_in_Subject.setMaximumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_D_plus_in_Subject.setMinimumSize(new java.awt.Dimension(52, 14));
        JLabel_Title_Grade_D_plus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_D_plus_in_Subject.setPreferredSize(new java.awt.Dimension(52, 14));

        JLabel_Actual_Grade_D_plus_in_Subject.setText("Grade D+");
        JLabel_Actual_Grade_D_plus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_plus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_plus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_D_plus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_D_plain_in_Subject.setText("Grade D");
        JLabel_Title_Grade_D_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_D_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_D_plain_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_D_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_D_plain_in_Subject.setText("Grade D");
        JLabel_Actual_Grade_D_plain_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_plain_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_plain_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_D_plain_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_D_minus_in_Subject.setText("Grade D-");
        JLabel_Title_Grade_D_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_D_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_D_minus_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_D_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_D_minus_in_Subject.setText("Grade D-");
        JLabel_Actual_Grade_D_minus_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_minus_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_D_minus_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_D_minus_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_E_in_Subject.setText("Grade E");
        JLabel_Title_Grade_E_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_E_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_E_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_E_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_E_in_Subject.setText("Grade E");
        JLabel_Actual_Grade_E_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_E_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_E_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_E_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_P_in_Subject.setText("Grade P");
        JLabel_Actual_Grade_P_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_P_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_P_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_P_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_P_in_Subject.setText("Grade P");
        JLabel_Title_Grade_P_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_P_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_P_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_P_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_U_in_Subject.setText("Grade U");
        JLabel_Title_Grade_U_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_U_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_U_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_U_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_U_in_Subject.setText("Grade U");
        JLabel_Actual_Grade_U_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_U_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_U_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_U_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_X_in_Subject.setText("Grade X");
        JLabel_Title_Grade_X_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_X_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_X_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_X_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_X_in_Subject.setText("Grade X");
        JLabel_Actual_Grade_X_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_X_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_X_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_X_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_Y_in_Subject.setText("Grade Y");
        JLabel_Title_Grade_Y_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_Y_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_Y_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_Y_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_Y_in_Subject.setText("Grade Y");
        JLabel_Actual_Grade_Y_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_Y_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_Y_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_Y_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_Z_in_Subject.setText("Grade Z");
        JLabel_Title_Grade_Z_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_Z_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_Z_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_Z_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_Z_in_Subject.setText("Grade Z");
        JLabel_Actual_Grade_Z_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_Z_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_Z_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_Z_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Grade_W_in_Subject.setText("Grade W");
        JLabel_Title_Grade_W_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_W_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Title_Grade_W_in_Subject.setName(""); // NOI18N
        JLabel_Title_Grade_W_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Actual_Grade_W_in_Subject.setText("Grade W");
        JLabel_Actual_Grade_W_in_Subject.setMaximumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_W_in_Subject.setMinimumSize(new java.awt.Dimension(50, 14));
        JLabel_Actual_Grade_W_in_Subject.setName(""); // NOI18N
        JLabel_Actual_Grade_W_in_Subject.setPreferredSize(new java.awt.Dimension(50, 14));

        JLabel_Title_Male_Candidates_Taking_Subject.setText("Male Candidates :");

        JLabel_Actual_Male_Candidates_Taking_Subject.setText("Male");

        JLabel_Title_Female_Candidates_Taking_Subject.setText("Female Candidates :");

        JLabel_Actual_Female_Candidates_Taking_Subject.setText("Female");

        JLabel_Title_Total_Candidates_Taking_Subject.setText("Total Candidates :");

        JLabel_Actual_Total_Candidates_Taking_Subject.setText("Total");

        JLabel_Pie_Chart_Subject_Analysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/pools_16.png"))); // NOI18N
        JLabel_Pie_Chart_Subject_Analysis.setText(" Pie Chart");
        JLabel_Pie_Chart_Subject_Analysis.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        JLabel_Pie_Chart_Subject_Analysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLabel_Pie_Chart_Subject_AnalysisMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JPanel_Subject_Analysis_KCSE_2013Layout = new javax.swing.GroupLayout(JPanel_Subject_Analysis_KCSE_2013);
        JPanel_Subject_Analysis_KCSE_2013.setLayout(JPanel_Subject_Analysis_KCSE_2013Layout);
        JPanel_Subject_Analysis_KCSE_2013Layout.setHorizontalGroup(
            JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JSeparator_Subject_Analysis_Top, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_B_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_B_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_B_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_B_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_A_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_A_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_A_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_A_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_B_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_B_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_C_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_C_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_D_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_D_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_D_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_D_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_C_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_C_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_C_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_C_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_D_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_D_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_E_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_E_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JLabel_Pie_Chart_Subject_Analysis, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_X_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_X_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_Y_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_Y_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_P_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_P_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_U_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_U_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_Z_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_Z_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Grade_W_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Actual_Grade_W_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addComponent(JSeparator_Subject_Analysis_Bottom)
                    .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Subject_Analysis_Subject_Statistics_on)
                                .addGap(18, 18, 18)
                                .addComponent(JComboBox_Subject_Analysis_Select_a_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JButton_Subject_Analysis_Go_Show_Statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                                .addComponent(JLabel_Title_Male_Candidates_Taking_Subject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLabel_Actual_Male_Candidates_Taking_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JLabel_Title_Female_Candidates_Taking_Subject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLabel_Actual_Female_Candidates_Taking_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Title_Total_Candidates_Taking_Subject)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLabel_Actual_Total_Candidates_Taking_Subject)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPanel_Subject_Analysis_KCSE_2013Layout.setVerticalGroup(
            JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JComboBox_Subject_Analysis_Select_a_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Subject_Analysis_Subject_Statistics_on)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JButton_Subject_Analysis_Go_Show_Statistics)))
                .addGap(18, 18, 18)
                .addComponent(JSeparator_Subject_Analysis_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_A_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_A_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_A_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_A_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_B_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_B_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_B_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_B_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_B_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_B_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_C_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_C_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_P_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_P_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_U_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_U_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_X_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_X_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_Y_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_Y_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_Z_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_Z_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(11, 11, 11)
                            .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLabel_Title_Grade_W_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(JLabel_Actual_Grade_W_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createSequentialGroup()
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_C_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_C_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_C_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_C_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_D_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_D_plus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_D_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_D_plain_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_D_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_D_minus_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLabel_Title_Grade_E_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_Actual_Grade_E_in_Subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabel_Pie_Chart_Subject_Analysis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(JSeparator_Subject_Analysis_Bottom, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanel_Subject_Analysis_KCSE_2013Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel_Title_Male_Candidates_Taking_Subject)
                    .addComponent(JLabel_Actual_Male_Candidates_Taking_Subject)
                    .addComponent(JLabel_Title_Female_Candidates_Taking_Subject)
                    .addComponent(JLabel_Actual_Female_Candidates_Taking_Subject)
                    .addComponent(JLabel_Title_Total_Candidates_Taking_Subject)
                    .addComponent(JLabel_Actual_Total_Candidates_Taking_Subject))
                .addContainerGap())
        );

        JTabbedPane_KCSE_2013_Results_MDI.addTab("Subject Analysis", new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/Shape 21.png")), JPanel_Subject_Analysis_KCSE_2013); // NOI18N

        JLabel_Image_KCSE_2013_Results_MDI_Header_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kcse_2013_results/Images/MDI_main_icon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTabbedPane_KCSE_2013_Results_MDI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSeparator_KCSE_2013_Results_MDI_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLabel_Image_KCSE_2013_Results_MDI_Header_Logo)
                                .addGap(18, 18, 18)
                                .addComponent(JPanel_KCSE_2013_Results_MDI_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_KCSE_2013_Results_MDI_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_Image_KCSE_2013_Results_MDI_Header_Logo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSeparator_KCSE_2013_Results_MDI_Top, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTabbedPane_KCSE_2013_Results_MDI)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_Candidates_Performance_Index_number_Show_ResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Candidates_Performance_Index_number_Show_ResultsActionPerformed
 if (evt.getSource() == JButton_Candidates_Performance_Index_number_Show_Results) 
 {
    if (JTextField_Candidates_Performance_Index_number.getText() == null || JTextField_Candidates_Performance_Index_number.getText().equals("")) {
       JOptionPane.showMessageDialog(null, "Please enter a valid index number", "Missing field", JOptionPane.ERROR_MESSAGE);
    }
    
    
    if ((JTextField_Candidates_Performance_Index_number.getText().length() > 0) && (JTextField_Candidates_Performance_Index_number.getText().length() < 11))
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid index number. It constists of 11 digits.\nFor example, the top student KING'ORI TOM WANDERI of \nALLIANCE HIGH SCHOOL had the Index Number 11200001007", "Invalid Index Number", JOptionPane.ERROR_MESSAGE);
    
    }
    JTextField_Candidates_Performance_Index_number.requestFocus();
    return;
 }  
// TODO add your handling code here:
    }//GEN-LAST:event_JButton_Candidates_Performance_Index_number_Show_ResultsActionPerformed

    private void JButton_Candidates_Performance_Index_number_Show_ResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_Candidates_Performance_Index_number_Show_ResultsMouseClicked
    
        
    line_number_where_school_is_found = 0;
    String candidate_index_number = JTextField_Candidates_Performance_Index_number.getText();
    String school_code = candidate_index_number.substring(0, 8);   
 
    JLabel_Retrieved_School_Code.setText(school_code);
    Find_Out_Name_of_School(school_code);
    
    if (JLabel_Retrieved_Name_of_School.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, " The system is not able to manipulate the index number given.\n Please check if it is correct and try again." , "Questionable Index Number ", JOptionPane.PLAIN_MESSAGE);
    }
    
    else
    {    
        Find_Out_Performance_of_Student(candidate_index_number);
        Find_Out_Schools_Performance();
        details_searched_by_user = candidate_index_number + "; " +details_searched_by_user ;
        
    }
// TODO add your handling code here:
    }//GEN-LAST:event_JButton_Candidates_Performance_Index_number_Show_ResultsMouseClicked

    private void JTabbedPane_KCSE_2013_Results_MDIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTabbedPane_KCSE_2013_Results_MDIFocusGained
    
    //Disable_and_hide_labels();
    //Disable_and_hide_labels_on_School_Performance_Tab();
// TODO add your handling code here:
    }//GEN-LAST:event_JTabbedPane_KCSE_2013_Results_MDIFocusGained

    private void JTextField_Candidates_Performance_Index_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_Candidates_Performance_Index_numberKeyPressed
    Disable_and_hide_labels();
    Disable_and_hide_labels_on_School_Performance_Tab();
    
    Subject_I = "";
    Subject_II = "";
    Subject_III = "";
    Subject_IV = "";
    Subject_V = "";
    Subject_VI = "";
    Subject_VII = "";
    Subject_VIII = "";

    char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9'))){ //||
         //(c == KeyEvent.VK_BACK_SPACE) ||
         //(c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        //JOptionPane.showMessageDialog(null, " * Please enter only numeric digits (0-9)", "Non Numeric Character Entered ", JOptionPane.ERROR_MESSAGE);
        //evt.consume();
      }
      
// TODO add your handling code here:
    }//GEN-LAST:event_JTextField_Candidates_Performance_Index_numberKeyPressed

    private void JTabbedPane_KCSE_2013_Results_MDIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTabbedPane_KCSE_2013_Results_MDIMouseClicked
        JComboBox_Subject_Analysis_Select_a_Subject.setSelectedIndex(0);
        Disable_and_hide_labels_on_Subject_Analysis_Tab();
        Disable_and_hide_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab();
// TODO add your handling code here:
    }//GEN-LAST:event_JTabbedPane_KCSE_2013_Results_MDIMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
    try 
      {
           new Create_Directory_in_My_Documents ();
      } 
    catch (Exception ex) 
      {
          System.out.println("Error in Creating Directory() ---> "+ex);
      }
    
    
    JTextField_Candidates_Performance_Index_number.requestFocus();
    

        //Getting current date and adding 5 seconds to it
        Calendar calendar_time_variable = Calendar.getInstance();
        calendar_time_variable.add(Calendar.SECOND, 10);
        
        //Creating timer which executes once after five seconds
        java.util.Timer timer = new java.util.Timer();
        timer.schedule(new Task_Display_Update_Message_if_Any(), calendar_time_variable.getTime());
// TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null, 
                    "Are you sure you want to exit?", "KCSE 2013 Results", 
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, 
                    ObjButtons,ObjButtons[1]);
                if(PromptResult==0)
                {
                  try {
                        String url = "http://www.davidwachira.com";

                        if (Desktop.isDesktopSupported()) {
                            // Windows
                            Desktop.getDesktop().browse(new URI(url));
                        } else {
                            // Ubuntu
                            Runtime runtime = Runtime.getRuntime();
                            runtime.exec("/usr/bin/firefox -new-window " + url);
                        }
                      } 
                    catch (Exception ex) 
                    {
                      System.out.print("Error inside formWindowClosing () ------>"+ ex);  
                    }
                  this.hide();
                  if(details_searched_by_user.equals(""))
                  {}
                  else
                  {
                  new Program_Usage_Statistics().logAccess(details_searched_by_user);
                  } 
                  System.exit(0);          
                }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void JPanel_Subject_Analysis_KCSE_2013MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel_Subject_Analysis_KCSE_2013MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JPanel_Subject_Analysis_KCSE_2013MouseClicked

    private void JTextField_Candidates_Performance_Index_numberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextField_Candidates_Performance_Index_numberFocusGained
// TODO add your handling code here:
    }//GEN-LAST:event_JTextField_Candidates_Performance_Index_numberFocusGained

    private void JTextField_School_Performance_School_CodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextField_School_Performance_School_CodeKeyPressed
    Disable_and_hide_labels();
    Disable_and_hide_labels_on_School_Performance_Tab();
    Disable_and_hide_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab();    
    
    Subject_I = "";
    Subject_II = "";
    Subject_III = "";
    Subject_IV = "";
    Subject_V = "";
    Subject_VI = "";
    Subject_VII = "";
    Subject_VIII = "";
    
    
    char c = evt.getKeyChar();
      if (!((c >= '0') && (c <= '9'))){ //||
         //(c == KeyEvent.VK_BACK_SPACE) ||
         //(c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        //JOptionPane.showMessageDialog(null, " * Please enter only numeric digits (0-9)", "Non Numeric Character Entered ", JOptionPane.ERROR_MESSAGE);
        //evt.consume();
      }        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_School_Performance_School_CodeKeyPressed

    private void JTextField_School_Performance_School_CodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTextField_School_Performance_School_CodeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_School_Performance_School_CodeFocusGained

    private void JButton_Pie_Chart_of_Schools_PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Pie_Chart_of_Schools_PerformanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Pie_Chart_of_Schools_PerformanceActionPerformed

    private void JButton_Pie_Chart_of_Schools_PerformanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_Pie_Chart_of_Schools_PerformanceMouseEntered
 // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Pie_Chart_of_Schools_PerformanceMouseEntered

    private void JButton_Pie_Chart_of_Schools_PerformanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_Pie_Chart_of_Schools_PerformanceMouseClicked
        /* -------------------------------------------------------------------------------------------------------------------------------
        * Inserting a Pie Chart to show school's performance
        */   details_searched_by_user = "Pie Chart - "+ JLabel_Retrieved_School_Code_inside_School_Performance.getText() + "; " + details_searched_by_user ;
        final String title_pie_chart = "School's Performance - " + JLabel_Retrieved_Name_of_School_inside_School_Performance.getText();
        Pie_Chart_KCSE_School_Performance KCSE_pie_chart = new Pie_Chart_KCSE_School_Performance(title_pie_chart);
        
        windowFocusListener = new WindowFocusListener()
        {
            public void windowGainedFocus(WindowEvent we)
            {
                 System.out.println("KCSE_pie_chart - windowGainedFocus()");
                
                 Create_Directory_in_My_Documents create_dir = new Create_Directory_in_My_Documents ();
                 
                 String fileName = create_dir.Create_Directory_in_My_Documents()+"\\";
                 String date_time_of_screenshot = "" + Calendar.getInstance().getTime();
                 date_time_of_screenshot = date_time_of_screenshot.replaceAll(":","-");
                 
                 fileName = fileName + title_pie_chart + " - " + date_time_of_screenshot +" by David Wachira.png";
                 
                 
                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                 Rectangle screenRectangle = new Rectangle(screenSize);
                 Robot robot;
                 try 
                 {
                   robot = new Robot();
                   BufferedImage image = robot.createScreenCapture(screenRectangle);
                   ImageIO.write(image, "png", new File(fileName));
                 } 
                 catch (Exception ex) {
                     System.out.println("Error --->"+ex);
                 }
                 
                 
/* **************************************************************************************************************** */
                File sourceImageFile = new File(fileName); 
                String fileName_image_watermarked = fileName.replaceAll(".png","-II.png");
                File destImageFile = new File(fileName_image_watermarked); 
                Watermark_an_Image img_watermark = new Watermark_an_Image();
                img_watermark.addTextWatermark("www.davidwachira.com", sourceImageFile, destImageFile);
/* **************************************************************************************************************** */
            }

            public void windowLostFocus(WindowEvent we)
            {
                System.out.println("KCSE_pie_chart - windowLostFocus()");
            }
        };

        
        KCSE_pie_chart.addWindowFocusListener(windowFocusListener);
        KCSE_pie_chart.pack();
        //KCSE_pie_chart.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        //RefineryUtilities.centerFrameOnScreen(KCSE_pie_chart);
        
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = screenSize.width;
        final int height = screenSize.height;
        KCSE_pie_chart.setSize(width/2,height/2);
        
        //KCSE_pie_chart.setMinimumSize(new Dimension(400, 400));
        KCSE_pie_chart.Get_Grades_Count_to_be_set_in_dataset(array_school_grades_count);
        KCSE_pie_chart.setIconImage(new ImageIcon(getClass().getResource("MDI_main_icon.png")).getImage());
        KCSE_pie_chart.setLocationRelativeTo(null);
        KCSE_pie_chart.setVisible(true);
         
        
        //this.setState(Frame.ICONIFIED);
        //KCSE_pie_chart.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        /*
        * End of Pie Chart to show school's performance
        * -------------------------------------------------------------------------------------------------------------------------------
        */
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Pie_Chart_of_Schools_PerformanceMouseClicked

    private void JButton_Pie_Chart_of_Schools_PerformanceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JButton_Pie_Chart_of_Schools_PerformanceFocusLost
 // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Pie_Chart_of_Schools_PerformanceFocusLost

    private void JButton_Pie_Chart_of_Schools_PerformanceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JButton_Pie_Chart_of_Schools_PerformanceKeyReleased
 // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Pie_Chart_of_Schools_PerformanceKeyReleased

    //Changed from private to public
	private void JLabel_Bar_Chart_Candidates_PerformanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_Bar_Chart_Candidates_PerformanceMouseClicked
        details_searched_by_user = "Bar Chart - "+ JTextField_Candidates_Performance_Index_number.getText() + "; " + details_searched_by_user ;
        
        String[ ][ ] ary_dataset_bar_chart = new String[8][2];
       
        ary_dataset_bar_chart[0][0] = JLabel_Candidates_Subject_1.getText();
        ary_dataset_bar_chart[1][0] = JLabel_Candidates_Subject_2.getText();
        ary_dataset_bar_chart[2][0] = JLabel_Candidates_Subject_3.getText();
        ary_dataset_bar_chart[3][0] = JLabel_Candidates_Subject_4.getText();
        ary_dataset_bar_chart[4][0] = JLabel_Candidates_Subject_5.getText();
        ary_dataset_bar_chart[5][0] = JLabel_Candidates_Subject_6.getText();
        ary_dataset_bar_chart[6][0] = JLabel_Candidates_Subject_7.getText();
        ary_dataset_bar_chart[7][0] = JLabel_Candidates_Subject_8.getText();
        
        ary_dataset_bar_chart[0][1] = JLabel_Candidates_Subject_1_Grade.getText();
        ary_dataset_bar_chart[1][1] = JLabel_Candidates_Subject_2_Grade.getText();
        ary_dataset_bar_chart[2][1] = JLabel_Candidates_Subject_3_Grade.getText();
        ary_dataset_bar_chart[3][1] = JLabel_Candidates_Subject_4_Grade.getText();
        ary_dataset_bar_chart[4][1] = JLabel_Candidates_Subject_5_Grade.getText();
        ary_dataset_bar_chart[5][1] = JLabel_Candidates_Subject_6_Grade.getText();
        ary_dataset_bar_chart[6][1] = JLabel_Candidates_Subject_7_Grade.getText();
        ary_dataset_bar_chart[7][1] = JLabel_Candidates_Subject_8_Grade.getText();
        
        
        
      KCSE_2013_Bar_Chart KCSE_2013_bar_chart = new KCSE_2013_Bar_Chart("KCSE 2013 Results - "+ JLabel_Candidates_Name_as_Registered.getText(), "KCSE 2013 Results - "+ JLabel_Candidates_Name_as_Registered.getText()+"("+ JTextField_Candidates_Performance_Index_number.getText() +")", ary_dataset_bar_chart);
      
      
      
        windowFocusListener = new WindowFocusListener()
        {
            public void windowGainedFocus(WindowEvent we)
            {
                 System.out.println("Bar_Chart_KCSE_pie_chart - windowGainedFocus()");
                
                 Create_Directory_in_My_Documents create_dir_in_docs = new Create_Directory_in_My_Documents ();
                 
                 String Bar_Chart_fileName = create_dir_in_docs.Create_Directory_in_My_Documents()+"\\";
                 String Bar_Chart_date_time_of_screenshot = "" + Calendar.getInstance().getTime();
                 Bar_Chart_date_time_of_screenshot = Bar_Chart_date_time_of_screenshot.replaceAll(":","-");
                 
                 Bar_Chart_fileName = Bar_Chart_fileName + "Candidate's KCSE 2013 Results - "+ JLabel_Candidates_Name_as_Registered.getText()+"("+ JTextField_Candidates_Performance_Index_number.getText() +")" + " - " + Bar_Chart_date_time_of_screenshot +" by David Wachira.png";
                 
                 
                 Dimension Bar_Chart_screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                 Rectangle Bar_Chart_screenRectangle = new Rectangle(Bar_Chart_screenSize);
                 Robot Bar_Chart_robot;
                 try 
                 {
                   Bar_Chart_robot = new Robot();
                   BufferedImage Bar_Chart_image = Bar_Chart_robot.createScreenCapture(Bar_Chart_screenRectangle);
                   ImageIO.write(Bar_Chart_image, "png", new File(Bar_Chart_fileName));
                 } 
                 catch (Exception ex) {
                     System.out.println("Error --->"+ex);
                 }
                 
                 
/* **************************************************************************************************************** */
                File Bar_Chart_sourceImageFile = new File(Bar_Chart_fileName); 
                String Bar_Chart_fileName_image_watermarked = Bar_Chart_fileName.replaceAll(".png","-II.png");
                File Bar_Chart_destImageFile = new File(Bar_Chart_fileName_image_watermarked); 
                Watermark_an_Image Bar_Chart_img_watermark = new Watermark_an_Image();
                Bar_Chart_img_watermark.addTextWatermark("www.davidwachira.com", Bar_Chart_sourceImageFile, Bar_Chart_destImageFile);
/* **************************************************************************************************************** */
            }

            public void windowLostFocus(WindowEvent we)
            {
                System.out.println("Bar_Chart_KCSE_pie_chart - windowLostFocus()");
            }
        };
        
        
        KCSE_2013_bar_chart.addWindowFocusListener(windowFocusListener);
        KCSE_2013_bar_chart.pack();
        
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = screenSize.width;
        final int height = screenSize.height;
        KCSE_2013_bar_chart.setSize(width/2,height/2);
        
        
        KCSE_2013_bar_chart.setIconImage(new ImageIcon(getClass().getResource("MDI_main_icon.png")).getImage());
        KCSE_2013_bar_chart.setLocationRelativeTo(null);
        KCSE_2013_bar_chart.setVisible(true);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_JLabel_Bar_Chart_Candidates_PerformanceMouseClicked

    private void JButton_Subject_Analysis_Go_Show_StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_Subject_Analysis_Go_Show_StatisticsActionPerformed
        if (evt.getSource() == JButton_Subject_Analysis_Go_Show_Statistics) 
         {
            if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedItem()== null || JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==0) 
            {
               JOptionPane.showMessageDialog(null, "Select a subject to view the statistics", "Missing field", JOptionPane.DEFAULT_OPTION);
            }  
         }       
        

// TODO add your handling code here:
    }//GEN-LAST:event_JButton_Subject_Analysis_Go_Show_StatisticsActionPerformed

    private void JButton_Subject_Analysis_Go_Show_StatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_Subject_Analysis_Go_Show_StatisticsMouseClicked
    
    National_Analysis_of_Results  subject_stats = new National_Analysis_of_Results();
        
        
    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==1)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (101, "English");
    }
        
    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==2)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (102, "Kiswahili");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==3)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (121, "Mathematics");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==4)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (122, "Mathematics Alternative B");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==5)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (231, "Biology");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==6)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (232, "Physics");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==7)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (233, "Chemistry");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==8)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (236, "Biology for the blind");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==9)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (237, "General Science for Option B");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==10)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (311, "History & Government");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==11)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (312, "Geography");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==12)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (313, "Christian Religious Education");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==13)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (314, "Islamic Religious Education");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==14)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (315, "Hindu Religious Education");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==15)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (441, "Home Science");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==16)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (442, "Art and Design");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==17)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (443, "Agriculture");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==18)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (444, "Woodwork");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==19)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (445, "Metalwork");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==20)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (446, "Building Construction");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==21)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (447, "Power Mechanics");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==22)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (448, "Electricity");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==23)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (449, "Drawing and Design");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==24)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (450, "Aviation Technology");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==25)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (451, "Computer Studies");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==26)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (501, "French");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==27)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (502, "German");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==28)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (503, "Arabic");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==29)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (504, "Kenya Sign Language");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==30)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (511, "Music");
    }

    if (JComboBox_Subject_Analysis_Select_a_Subject.getSelectedIndex()==31)
    {
        
        subject_stats.Analyze_Particular_Subject_Performance (565, "Business Studies");
    }
    
    
	JLabel_Actual_Grade_A_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_A_plain_in_particular_subject);
	JLabel_Actual_Grade_A_minus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_A_minus_in_particular_subject);
	JLabel_Actual_Grade_B_plus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_B_plus_in_particular_subject);
	JLabel_Actual_Grade_B_plain_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_B_plain_in_particular_subject);
	JLabel_Actual_Grade_B_minus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_B_minus_in_particular_subject);
	JLabel_Actual_Grade_C_plus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_C_plus_in_particular_subject);
	JLabel_Actual_Grade_C_plain_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_C_plain_in_particular_subject);
	JLabel_Actual_Grade_C_minus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_C_minus_in_particular_subject);
	JLabel_Actual_Grade_D_plus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_D_plus_in_particular_subject);
	JLabel_Actual_Grade_D_plain_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_D_plain_in_particular_subject);
	JLabel_Actual_Grade_D_minus_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_D_minus_in_particular_subject);
	JLabel_Actual_Grade_E_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_E_in_particular_subject);
	JLabel_Actual_Grade_U_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_U_in_particular_subject);
	JLabel_Actual_Grade_P_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_P_in_particular_subject);
	JLabel_Actual_Grade_X_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_X_in_particular_subject);
	JLabel_Actual_Grade_Y_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_Y_in_particular_subject);
	JLabel_Actual_Grade_Z_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_Z_in_particular_subject);
	JLabel_Actual_Grade_W_in_Subject.setText("" + subject_stats.calculated_number_of_candidates_with_W_in_particular_subject);
	JLabel_Actual_Male_Candidates_Taking_Subject.setText("" + subject_stats.calculated_male_candidates_taking_particular_subject);
	JLabel_Actual_Female_Candidates_Taking_Subject.setText("" + subject_stats.calculated_female_candidates_taking_particular_subject); 
	JLabel_Actual_Total_Candidates_Taking_Subject.setText("" + (subject_stats.calculated_number_of_candidates_with_A_plain_in_particular_subject + subject_stats.calculated_number_of_candidates_with_A_minus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_B_plus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_B_plain_in_particular_subject + subject_stats.calculated_number_of_candidates_with_B_minus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_C_plus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_C_plain_in_particular_subject + subject_stats.calculated_number_of_candidates_with_C_minus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_D_plus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_D_plain_in_particular_subject + subject_stats.calculated_number_of_candidates_with_D_minus_in_particular_subject + subject_stats.calculated_number_of_candidates_with_E_in_particular_subject + subject_stats.calculated_number_of_candidates_with_U_in_particular_subject + subject_stats.calculated_number_of_candidates_with_W_in_particular_subject + subject_stats.calculated_number_of_candidates_with_X_in_particular_subject + subject_stats.calculated_number_of_candidates_with_Y_in_particular_subject + subject_stats.calculated_number_of_candidates_with_Z_in_particular_subject + subject_stats.calculated_number_of_candidates_with_P_in_particular_subject));
    
        array_subject_grades_distribution[0]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_A_plain_in_particular_subject);
        array_subject_grades_distribution[1]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_A_minus_in_particular_subject);
        array_subject_grades_distribution[2]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_B_plus_in_particular_subject);
        array_subject_grades_distribution[3]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_B_plain_in_particular_subject);
        array_subject_grades_distribution[4]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_B_minus_in_particular_subject);
        array_subject_grades_distribution[5]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_C_plus_in_particular_subject);
        array_subject_grades_distribution[6]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_C_plain_in_particular_subject);
        array_subject_grades_distribution[7]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_C_minus_in_particular_subject);
        array_subject_grades_distribution[8]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_D_plus_in_particular_subject);
        array_subject_grades_distribution[9]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_D_plain_in_particular_subject);
        array_subject_grades_distribution[10]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_D_minus_in_particular_subject);
        array_subject_grades_distribution[11]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_E_in_particular_subject);
        array_subject_grades_distribution[12]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_P_in_particular_subject);
        array_subject_grades_distribution[13]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_U_in_particular_subject);
        array_subject_grades_distribution[14]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_W_in_particular_subject);
        array_subject_grades_distribution[15]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_X_in_particular_subject);
        array_subject_grades_distribution[16]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_Y_in_particular_subject);
        array_subject_grades_distribution[17]  = Integer.parseInt("" + subject_stats.calculated_number_of_candidates_with_Z_in_particular_subject);

        Enable_and_show_labels_on_Subject_Analysis_Tab() ;
// TODO add your handling code here:
    }//GEN-LAST:event_JButton_Subject_Analysis_Go_Show_StatisticsMouseClicked

    private void JComboBox_Subject_Analysis_Select_a_SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBox_Subject_Analysis_Select_a_SubjectMouseClicked
    Disable_and_hide_labels_on_Subject_Analysis_Tab() ;        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBox_Subject_Analysis_Select_a_SubjectMouseClicked

    private void JLabel_Pie_Chart_Subject_AnalysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLabel_Pie_Chart_Subject_AnalysisMouseClicked

        
        /* -------------------------------------------------------------------------------------------------------------------------------
        * Inserting a Pie Chart to show subject performance analysis
        */
        details_searched_by_user = "Pie Chart - "+ JComboBox_Subject_Analysis_Select_a_Subject.getSelectedItem().toString() + "; " + details_searched_by_user ;
        final String title_subjects_pie_chart = "Subject Analysis - " + JComboBox_Subject_Analysis_Select_a_Subject.getSelectedItem().toString();
        
        Pie_Chart_KCSE_Subject_Analysis subject_pie_chart = new Pie_Chart_KCSE_Subject_Analysis(title_subjects_pie_chart);
        
        windowFocusListener = new WindowFocusListener()
        {
            public void windowGainedFocus(WindowEvent we)
            {
                 System.out.println("subject_pie_chart - windowGainedFocus()");
                
                 Create_Directory_in_My_Documents create_dir = new Create_Directory_in_My_Documents ();
                 
                 String fileName = create_dir.Create_Directory_in_My_Documents()+"\\";
                 String date_time_of_screenshot = "" + Calendar.getInstance().getTime();
                 date_time_of_screenshot = date_time_of_screenshot.replaceAll(":","-");
                 
                 fileName = fileName + title_subjects_pie_chart + " - " + date_time_of_screenshot +" by David Wachira.png";
                 
                 
                 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                 Rectangle screenRectangle = new Rectangle(screenSize);
                 Robot robot;
                 try 
                 {
                   robot = new Robot();
                   BufferedImage image = robot.createScreenCapture(screenRectangle);
                   ImageIO.write(image, "png", new File(fileName));
                 } 
                 catch (Exception ex) {
                     System.out.println("Error --->"+ex);
                 }
                 
                 
/* **************************************************************************************************************** */
                File sourceImageFile = new File(fileName); 
                String fileName_image_watermarked = fileName.replaceAll(".png","-II.png");
                File destImageFile = new File(fileName_image_watermarked); 
                Watermark_an_Image img_watermark = new Watermark_an_Image();
                img_watermark.addTextWatermark("www.davidwachira.com", sourceImageFile, destImageFile);
/* **************************************************************************************************************** */
            }

            public void windowLostFocus(WindowEvent we)
            {
                System.out.println("subject_pie_chart - windowLostFocus()");
            }
        };

        
        subject_pie_chart.addWindowFocusListener(windowFocusListener);
        subject_pie_chart.pack();
        
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        final int width = screenSize.width;
        final int height = screenSize.height;
        subject_pie_chart.setSize(width/2,height/2);
        
        subject_pie_chart.Get_Grades_Count_to_be_set_in_dataset(array_subject_grades_distribution);
        subject_pie_chart.setIconImage(new ImageIcon(getClass().getResource("MDI_main_icon.png")).getImage());
        subject_pie_chart.setLocationRelativeTo(null);
        subject_pie_chart.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_JLabel_Pie_Chart_Subject_AnalysisMouseClicked

    private void JButton_School_Performance_School_Code_Show_ResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_School_Performance_School_Code_Show_ResultsMouseClicked
            
    line_number_where_school_is_found = 0;
    String candidate_index_number = JTextField_School_Performance_School_Code.getText()+"001";
    String school_code = candidate_index_number.substring(0, 8);   
 
    JLabel_Retrieved_School_Code.setText(school_code);
    JTextField_Candidates_Performance_Index_number.setText(candidate_index_number);
    Find_Out_Name_of_School(school_code);
    
    if (JLabel_Retrieved_Name_of_School.getText().equals(""))
    {
        JOptionPane.showMessageDialog(null, " The system is not able to manipulate the school code given.\n Please check if it is correct and try again." , "Questionable School Code ", JOptionPane.ERROR_MESSAGE);
    }
    
    else
    {    
        Find_Out_Performance_of_Student(candidate_index_number);
        Find_Out_Schools_Performance();
        details_searched_by_user = school_code + "; " +details_searched_by_user ;
        
    }        
    
    JButton_Pie_Chart_of_Schools_Performance.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_JButton_School_Performance_School_Code_Show_ResultsMouseClicked

    private void JButton_School_Performance_School_Code_Show_ResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_School_Performance_School_Code_Show_ResultsActionPerformed
 if (evt.getSource() == JButton_School_Performance_School_Code_Show_Results) 
 {
    if (JTextField_School_Performance_School_Code.getText() == null || JTextField_School_Performance_School_Code.getText().equals("")) {
       JOptionPane.showMessageDialog(null, "Please enter a valid school code", "Missing field", JOptionPane.DEFAULT_OPTION);
    }
    
    
    if ((JTextField_School_Performance_School_Code.getText().length() > 0) && (JTextField_School_Performance_School_Code.getText().length() < 8))
    {
      JOptionPane.showMessageDialog(null, "Please enter a valid school code number. It constists of 8 digits.\nFor example, ALLIANCE HIGH SCHOOL had the School Code 11200001\n\n Visit www.education.go.ke/formone/natschools.html to see school codes", "Invalid School Code", JOptionPane.ERROR_MESSAGE);
   
    }
    JTextField_School_Performance_School_Code.requestFocus();
    return;
 }         // TODO add your handling code here:
    }//GEN-LAST:event_JButton_School_Performance_School_Code_Show_ResultsActionPerformed

    private void JComboBox_School_Performance_Subject_Analysis_Select_a_SubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBox_School_Performance_Subject_Analysis_Select_a_SubjectMouseClicked
        JButton_Pie_Chart_of_Schools_Performance.setVisible(false);
        Disable_and_hide_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab();        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBox_School_Performance_Subject_Analysis_Select_a_SubjectMouseClicked

    private void JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsMouseClicked
        
        int Header_for_School = line_number_where_school_is_found;
        
        School_Performance_in_Particular_Subjects  school_subject_stats = new School_Performance_in_Particular_Subjects();
      
    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==1)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 101, "English");
    }
        
    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==2)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 102, "Kiswahili");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==3)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 121, "Mathematics");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==4)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 122, "Mathematics Alternative B");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==5)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 231, "Biology");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==6)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 232, "Physics");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==7)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 233, "Chemistry");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==8)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 236, "Biology for the blind");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==9)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 237, "General Science for Option B");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==10)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 311, "History & Government");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==11)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 312, "Geography");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==12)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 313, "Christian Religious Education");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==13)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 314, "Islamic Religious Education");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==14)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 315, "Hindu Religious Education");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==15)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 441, "Home Science");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==16)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 442, "Art and Design");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==17)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 443, "Agriculture");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==18)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 444, "Woodwork");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==19)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 445, "Metalwork");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==20)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 446, "Building Construction");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==21)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 447, "Power Mechanics");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==22)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 448, "Electricity");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==23)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 449, "Drawing and Design");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==24)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 450, "Aviation Technology");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==25)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 451, "Computer Studies");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==26)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 501, "French");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==27)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 502, "German");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==28)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 503, "Arabic");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==29)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 504, "Kenya Sign Language");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==30)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 511, "Music");
    }

    if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==31)
    {
        
        school_subject_stats.School_Performance_in_Particular_Subjects (Header_for_School, 565, "Business Studies");
    }
        
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_A_plain_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_A_minus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_B_plus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_B_plain_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_B_minus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_C_plus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_C_plain_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_C_minus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_D_plus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_D_plain_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_D_minus_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated.setText("" + school_subject_stats.Subject_analysis_candidates_with_E_in_particular_subject);
    School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setText("" + (school_subject_stats.Subject_analysis_candidates_with_U_in_particular_subject + school_subject_stats.Subject_analysis_candidates_with_W_in_particular_subject + school_subject_stats.Subject_analysis_candidates_with_X_in_particular_subject + school_subject_stats.Subject_analysis_candidates_with_Y_in_particular_subject + school_subject_stats.Subject_analysis_candidates_with_Z_in_particular_subject + school_subject_stats.Subject_analysis_candidates_with_P_in_particular_subject));

    Enable_and_show_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab();
    JButton_Pie_Chart_of_Schools_Performance.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsMouseClicked

    private void JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsActionPerformed
        if (evt.getSource() == JButton_School_Performance_Subject_Analysis_Go_Show_Statistics) 
         {
            if (JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedItem()== null || JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.getSelectedIndex()==0) 
            {
               JOptionPane.showMessageDialog(null, "Select a subject to view the statistics", "Missing field", JOptionPane.DEFAULT_OPTION);
            }  
         }       
                // TODO add your handling code here:
    }//GEN-LAST:event_JButton_School_Performance_Subject_Analysis_Go_Show_StatisticsActionPerformed

    private void JTextField_Candidates_Performance_Index_numberMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTextField_Candidates_Performance_Index_numberMouseMoved
        
// TODO add your handling code here:
    }//GEN-LAST:event_JTextField_Candidates_Performance_Index_numberMouseMoved

    private void JButton_Candidates_Performance_Index_number_Show_ResultsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButton_Candidates_Performance_Index_number_Show_ResultsMouseMoved
        //JButton_Candidates_Performance_Index_number_Show_Results.setText("20400002  - Nairobi school \n20400001  - Lenana\n20400003  - Kenya High ");
        // TODO add your handling code here:
    }//GEN-LAST:event_JButton_Candidates_Performance_Index_number_Show_ResultsMouseMoved

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
            java.util.logging.Logger.getLogger(KCSE_Results_MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KCSE_Results_MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KCSE_Results_MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KCSE_Results_MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KCSE_Results_MDI().setVisible(true);
                
                    
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Candidates_Performance_Index_number_Show_Results;
    private javax.swing.JButton JButton_Pie_Chart_of_Schools_Performance;
    private javax.swing.JButton JButton_School_Performance_School_Code_Show_Results;
    private javax.swing.JButton JButton_School_Performance_Subject_Analysis_Go_Show_Statistics;
    private javax.swing.JButton JButton_Subject_Analysis_Go_Show_Statistics;
    private javax.swing.JComboBox JComboBox_School_Performance_Subject_Analysis_Select_a_Subject;
    private javax.swing.JComboBox JComboBox_Subject_Analysis_Select_a_Subject;
    private javax.swing.JLabel JLabel_Actual_Female_Candidates_Taking_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_A_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_A_minus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_B_minus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_B_plain_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_B_plus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_C_minus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_C_plain_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_C_plus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_D_minus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_D_plain_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_D_plus_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_E_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_P_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_U_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_W_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_X_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_Y_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Grade_Z_in_Subject;
    private javax.swing.JLabel JLabel_Actual_Male_Candidates_Taking_Subject;
    private javax.swing.JLabel JLabel_Actual_Total_Candidates_Taking_Subject;
    private javax.swing.JLabel JLabel_Bar_Chart_Candidates_Performance;
    private javax.swing.JLabel JLabel_Candidates_Aggregate_Points;
    private javax.swing.JLabel JLabel_Candidates_Aggregate_Points_Obtained;
    private javax.swing.JLabel JLabel_Candidates_Gender;
    private javax.swing.JLabel JLabel_Candidates_Gender_as_Registered;
    private javax.swing.JLabel JLabel_Candidates_Mean_Grade;
    private javax.swing.JLabel JLabel_Candidates_Mean_Grade_Obtained;
    private javax.swing.JLabel JLabel_Candidates_Name;
    private javax.swing.JLabel JLabel_Candidates_Name_as_Registered;
    private javax.swing.JLabel JLabel_Candidates_Performance_Index_number;
    private javax.swing.JLabel JLabel_Candidates_Subject_1;
    private javax.swing.JLabel JLabel_Candidates_Subject_1_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_2;
    private javax.swing.JLabel JLabel_Candidates_Subject_2_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_3;
    private javax.swing.JLabel JLabel_Candidates_Subject_3_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_4;
    private javax.swing.JLabel JLabel_Candidates_Subject_4_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_5;
    private javax.swing.JLabel JLabel_Candidates_Subject_5_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_6;
    private javax.swing.JLabel JLabel_Candidates_Subject_6_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_7;
    private javax.swing.JLabel JLabel_Candidates_Subject_7_Grade;
    private javax.swing.JLabel JLabel_Candidates_Subject_8;
    private javax.swing.JLabel JLabel_Candidates_Subject_8_Grade;
    private javax.swing.JLabel JLabel_Image_KCSE_2013_Results_MDI_Header;
    private javax.swing.JLabel JLabel_Image_KCSE_2013_Results_MDI_Header_Logo;
    private javax.swing.JLabel JLabel_Name_of_School;
    private javax.swing.JLabel JLabel_Name_of_School_inside_School_Performance;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_A;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_A_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_A_minus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_A_minus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_minus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_minus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_plus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_plus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_stand;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_B_stand_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_minus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_minus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_plus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_plus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_stand;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_C_stand_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_minus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_minus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_plus;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_plus_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_stand;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_D_stand_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_E;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Grade_E_Calculated;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Irregular_Grade;
    private javax.swing.JLabel JLabel_Number_of_Students_with_Irregular_Grade_Calculated;
    private javax.swing.JLabel JLabel_Pie_Chart_Subject_Analysis;
    private javax.swing.JLabel JLabel_Retrieved_Name_of_School;
    private javax.swing.JLabel JLabel_Retrieved_Name_of_School_inside_School_Performance;
    private javax.swing.JLabel JLabel_Retrieved_School_Code;
    private javax.swing.JLabel JLabel_Retrieved_School_Code_inside_School_Performance;
    private javax.swing.JLabel JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on;
    private javax.swing.JLabel JLabel_School_code;
    private javax.swing.JLabel JLabel_Subject_Analysis_Subject_Statistics_on;
    private javax.swing.JLabel JLabel_Title_Female_Candidates_Taking_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_A_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_A_minus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_B_minus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_B_plain_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_B_plus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_C_minus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_C_plain_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_C_plus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_D_minus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_D_plain_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_D_plus_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_E_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_P_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_U_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_W_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_X_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_Y_in_Subject;
    private javax.swing.JLabel JLabel_Title_Grade_Z_in_Subject;
    private javax.swing.JLabel JLabel_Title_Male_Candidates_Taking_Subject;
    private javax.swing.JLabel JLabel_Title_Total_Candidates_Taking_Subject;
    private javax.swing.JPanel JPanel_Candidates_Performance;
    private javax.swing.JPanel JPanel_KCSE_2013_Results_MDI_Header;
    private javax.swing.JPanel JPanel_School_Performance;
    private javax.swing.JPanel JPanel_Subject_Analysis_KCSE_2013;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results1;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results2;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results3;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most;
    private javax.swing.JSeparator JSeparator_KCSE_2013_Results_MDI_Top;
    private javax.swing.JSeparator JSeparator_School_Performance_Subject_Statistics_down_bottom;
    private javax.swing.JSeparator JSeparator_Subject_Analysis_Bottom;
    private javax.swing.JSeparator JSeparator_Subject_Analysis_Top;
    private javax.swing.JTabbedPane JTabbedPane_KCSE_2013_Results_MDI;
    private javax.swing.JTextField JTextField_Candidates_Performance_Index_number;
    private javax.swing.JTextField JTextField_School_Performance_School_Code;
    private javax.swing.JLabel School_Performance_School_Code;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade;
    private javax.swing.JLabel School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated;
    private javax.swing.JLabel jLabel_Number_of_Students_with_Particular_Grade;
    // End of variables declaration//GEN-END:variables


    
    private void Find_Out_Name_of_School(String KNEC_school_code) 
    { 
    try 
       {
        int Token_count = 0;
        int Line_count = 0;
    
        String KNEC_examination_center_code = KNEC_school_code;
        String KNEC_examination_center_name = "";
        
        FileReader KCSE_Results_FileReader = new FileReader("DB@254.txt");
        
        BufferedReader KCSE_Results_Buffered_Reader = new BufferedReader(KCSE_Results_FileReader);
        String Retrieved_Line;
        
        String KCSE_Results_Line;
        String Strings_of_Words[]=new String[500];
			   
          while ((Retrieved_Line = KCSE_Results_Buffered_Reader.readLine())!=null)
	   {
	     Line_count++;
	     int Index_Found=Retrieved_Line.indexOf(KNEC_examination_center_code);
	     if (Index_Found>-1)
	      {
		 line_number_where_school_is_found = Line_count;
                 max_limit_line_number_where_school_is_found = line_number_where_school_is_found + 500;
                 KCSE_Results_Line=Retrieved_Line;
		 int Index_of_token=0;
		 StringTokenizer st= new StringTokenizer(KCSE_Results_Line);
		 Token_count= st.countTokens();	
       		 for (Index_of_token=0;Index_of_token<Token_count;Index_of_token++)
		  {
		   Strings_of_Words[Index_of_token]=st.nextToken();
                                                                                         
                   if (Index_of_token>0)
                    {
                      KNEC_examination_center_name = KNEC_examination_center_name + " " + Strings_of_Words[Index_of_token];
                    }
		  }
                 break;
	        }

	      }
        KCSE_Results_FileReader.close();
        JLabel_Retrieved_Name_of_School.setText(KNEC_examination_center_name);
      } 
        catch (Exception ex_school_name) 
         {  
             System.out.println("Error on finding name of the school" + ex_school_name); 
         } 

         }
    
            
    private void Find_Out_Performance_of_Student(String KNEC_candidate_index_number) 
    { 
    try 
       {    
            String School_Name_Gotten = JLabel_Retrieved_Name_of_School.getText();
            String Candidate_number = KNEC_candidate_index_number.substring(8, 11);
            String Student_Details_In_Brief = "";
            
            FileReader KCSE_Results_Student_Details_FileReader = new FileReader("DB@254.txt");

            BufferedReader Students_Result_Buffered_Reader = new BufferedReader(KCSE_Results_Student_Details_FileReader);
            String Retrieved_Students_Line;

            int Students_of_particular_school_Line_count = 0;
            int student_details_Token_count = 0;

            String KCSE_Results_Retrieved_Students_Line;
            String Array_of_Words[] = new String[500];
            int Array_of_Footers_to_assist_in_marking_end_of_school[] = new int[10];
            int Counter_Array_of_Footers = 0;

            
              while (((Retrieved_Students_Line = Students_Result_Buffered_Reader.readLine())!=null) )
                    {
                       Students_of_particular_school_Line_count++;

                       if (Students_of_particular_school_Line_count > line_number_where_school_is_found && Students_of_particular_school_Line_count <= max_limit_line_number_where_school_is_found)
                            {
                                     boolean Index_of_student_Found = Retrieved_Students_Line.startsWith(Candidate_number);
                                     
                                     int KNEC_header_index_found=Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
                                     if (KNEC_header_index_found>-1)
					  {
                                              System.out.println("Header was found at position:: " + KNEC_header_index_found + " ::on line "+ Students_of_particular_school_Line_count);
                                              JOptionPane.showMessageDialog(null, "There is no candidate registered by the index number "+ KNEC_candidate_index_number +"\nin "+ School_Name_Gotten+ " ("+ KNEC_candidate_index_number.substring(0, 8)+"). Please check \nand try again" , "Index Number Error", JOptionPane.ERROR_MESSAGE);
                                              Array_of_Footers_to_assist_in_marking_end_of_school[Counter_Array_of_Footers] = Students_of_particular_school_Line_count;
                                              Counter_Array_of_Footers++;
                                              max_limit_line_number_where_school_is_found = Array_of_Footers_to_assist_in_marking_end_of_school[Counter_Array_of_Footers] - 2;
                                          }
                                     
                                     if  (Index_of_student_Found == true)
                                      {
                                             KCSE_Results_Retrieved_Students_Line = Retrieved_Students_Line;
                                             int Index_of_student_details_token=0;
                                             StringTokenizer st_student_details= new StringTokenizer(KCSE_Results_Retrieved_Students_Line);
                                             student_details_Token_count= st_student_details.countTokens();
                                             
                                                  
                                                  
                                                  for (Index_of_student_details_token=0;Index_of_student_details_token<student_details_Token_count;Index_of_student_details_token++)
                                                    {  
                                                          Array_of_Words[Index_of_student_details_token]=st_student_details.nextToken();
                                                           
                                                           JLabel_Candidates_Gender_as_Registered.setText(Array_of_Words[1]);
                                                           JLabel_Candidates_Mean_Grade_Obtained.setText(Array_of_Words[2]); 
                                                           JLabel_Candidates_Aggregate_Points_Obtained.setText(Array_of_Words[3]); 
                                                           
                                                           if (student_details_Token_count==22)
                                                           {   
                                                             
                                                            Enable_and_show_labels(); 
                                                            Enable_and_show_labels_on_School_Performance_Tab();
                                                            JLabel_Candidates_Name_as_Registered.setText(Array_of_Words[4] + " " + Array_of_Words[5]);
                                                              
                                                            Subject_I = Array_of_Words[6];
                                                            Subject_II = Array_of_Words[8];
                                                            Subject_III = Array_of_Words[10];
                                                            Subject_IV = Array_of_Words[12];
                                                            Subject_V = Array_of_Words[14];
                                                            Subject_VI = Array_of_Words[16];
                                                            Subject_VII = Array_of_Words[18];
                                                            Subject_VIII = Array_of_Words[20];
                                                            
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[7]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[9]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[11]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[13]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[15]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[17]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[19]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[21]); 
                                                            
                                                           }
                                                           
                                                           else if (student_details_Token_count==23)
                                                           {   
                                                            Enable_and_show_labels(); 
                                                            Enable_and_show_labels_on_School_Performance_Tab();
                                                            JLabel_Candidates_Name_as_Registered.setText(Array_of_Words[4] + " " + Array_of_Words[5] + " " + Array_of_Words[6]);
                                                            
                                                            Subject_I = Array_of_Words[7];
                                                            Subject_II = Array_of_Words[9];
                                                            Subject_III = Array_of_Words[11];
                                                            Subject_IV = Array_of_Words[13];
                                                            Subject_V = Array_of_Words[15];
                                                            Subject_VI = Array_of_Words[17];
                                                            Subject_VII = Array_of_Words[19];
                                                            Subject_VIII = Array_of_Words[21];
                                                            
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[8]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[10]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[12]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[14]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[16]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[18]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[20]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[22]); 
                                                            
                                                           }
                                                           
                                                           else if (student_details_Token_count==24)
                                                           {   
                                                             Enable_and_show_labels(); 
                                                             Enable_and_show_labels_on_School_Performance_Tab();
                                                             JLabel_Candidates_Name_as_Registered.setText(Array_of_Words[4] + " " + Array_of_Words[5] + " " + Array_of_Words[6] + " " + Array_of_Words[7]);
                                                             
                                                            Subject_I = Array_of_Words[8];
                                                            Subject_II = Array_of_Words[10];
                                                            Subject_III = Array_of_Words[12];
                                                            Subject_IV = Array_of_Words[14];
                                                            Subject_V = Array_of_Words[16];
                                                            Subject_VI = Array_of_Words[18];
                                                            Subject_VII = Array_of_Words[20];
                                                            Subject_VIII = Array_of_Words[22];
                                                            
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[9]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[11]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[13]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[15]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[17]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[19]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[21]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[23]); 
                                                            
                                                           }
                                                           else if (student_details_Token_count<22 || student_details_Token_count>24)
         
                                                           {   Student_Details_In_Brief = Student_Details_In_Brief + " " + Array_of_Words[Index_of_student_details_token];
                                                           }
                                                    }
                                                  
                                                  if (student_details_Token_count>=22 && student_details_Token_count<=24)
                                                     {  
                                                        JLabel_Candidates_Subject_1.setText(Find_Out_Subject_Titles_From_Codes(Subject_I));
                                                        JLabel_Candidates_Subject_2.setText(Find_Out_Subject_Titles_From_Codes(Subject_II));
                                                        JLabel_Candidates_Subject_3.setText(Find_Out_Subject_Titles_From_Codes(Subject_III));
                                                        JLabel_Candidates_Subject_4.setText(Find_Out_Subject_Titles_From_Codes(Subject_IV));
                                                        JLabel_Candidates_Subject_5.setText(Find_Out_Subject_Titles_From_Codes(Subject_V));
                                                        JLabel_Candidates_Subject_6.setText(Find_Out_Subject_Titles_From_Codes(Subject_VI));
                                                        JLabel_Candidates_Subject_7.setText(Find_Out_Subject_Titles_From_Codes(Subject_VII));
                                                        JLabel_Candidates_Subject_8.setText(Find_Out_Subject_Titles_From_Codes(Subject_VIII));
                                                    }
                                         break;          
                                      }
                            }
                    }
                 
                 KCSE_Results_Student_Details_FileReader.close();
        if ((student_details_Token_count>0) && (student_details_Token_count<22 || student_details_Token_count>24))
         {
             //JOptionPane.showMessageDialog(null, " " + Student_Details_In_Brief + "\n\n *** It is possible that the Candidate sat for the Minumum 7 papers *** \n               The system is optimized for 8 Papers", "Student's Performance ", JOptionPane.PLAIN_MESSAGE);
           
             Student_Details_In_Brief = Retrieved_Students_Line;
             String gender_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(6, 7);
             String mean_grade_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(9, 11);
             String name_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(18, Student_Details_In_Brief.indexOf(" 101", 18));//Student_Details_In_Brief.substring(14, 16);
             String aggregate_points_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(14, 16); 
             String scores_for_the_student = Student_Details_In_Brief.substring(Student_Details_In_Brief.indexOf(" 101 "));
             
             
             
             StringTokenizer st_candidate= new StringTokenizer(scores_for_the_student);
             int st_candidate_Token_count= st_candidate.countTokens();
             int index_st;
             String searchWord;
             String replacement_for_searchWord = "";
             int counter_for_grade_output =0;
             String Array_of_grade_output[] = new String[500];
             
             while (counter_for_grade_output<7)
             {
             for (index_st=0;index_st<st_candidate_Token_count;index_st++)
               {   searchWord = st_candidate.nextToken();  
                   //System.out.println("Search word --->" + searchWord+"\n");
                  if (searchWord.length()==3)
                  {
                   if (scores_for_the_student.indexOf(searchWord)!=-1)
                      {
                           scores_for_the_student = scores_for_the_student.replace(searchWord, "\n" + Find_Out_Subject_Titles_From_Codes(searchWord.substring(0, 3)));
                           replacement_for_searchWord = Find_Out_Subject_Titles_From_Codes(searchWord.substring(0, 3));
                      }   
                  }
                  else
                  {
                           
/* ********************************************************************************************************************************************** */
                        while (replacement_for_searchWord.length() < 30) 
                        {
                        
                          replacement_for_searchWord = replacement_for_searchWord + " ";
                        
                        }

                            scores_for_the_student = scores_for_the_student.replace(searchWord, replacement_for_searchWord );
                            //System.out.println("Final String    --->" + replacement_for_searchWord + " " + searchWord +"\n");
                            Array_of_grade_output[counter_for_grade_output] = replacement_for_searchWord + searchWord;
                            //System.out.println("String in Array --->" + replacement_for_searchWord + " - "+searchWord +"\n");
                            counter_for_grade_output++;
/* ********************************************************************************************************************************************** */
                  }
               }
             }
                //System.out.println("Original String ---> " + scores_for_the_student);
         
                JLabel_Candidates_Name_as_Registered.setText(name_student_case_token_count_equal_to_22);
                JLabel_Candidates_Gender_as_Registered.setText(gender_student_case_token_count_equal_to_22);
                JLabel_Candidates_Mean_Grade_Obtained.setText(mean_grade_student_case_token_count_equal_to_22);
                JLabel_Candidates_Aggregate_Points_Obtained.setText(aggregate_points_student_case_token_count_equal_to_22);
                JLabel_Candidates_Subject_8.setText("        ");
                JLabel_Candidates_Subject_8_Grade.setText("  "); 
                
                StringTokenizer st_subject_1 = new StringTokenizer(Array_of_grade_output[0]);
                if (st_subject_1.countTokens()==2)
                {
                JLabel_Candidates_Subject_1.setText(st_subject_1.nextToken());  
                JLabel_Candidates_Subject_1_Grade.setText(st_subject_1.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_1.setText(Array_of_grade_output[0].substring(0,Array_of_grade_output[0].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_1_Grade.setText(Array_of_grade_output[0].substring(Array_of_grade_output[0].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_2 = new StringTokenizer(Array_of_grade_output[1]);
                if (st_subject_2.countTokens()==2)
                {
                JLabel_Candidates_Subject_2.setText(st_subject_2.nextToken());  
                JLabel_Candidates_Subject_2_Grade.setText(st_subject_2.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_2.setText(Array_of_grade_output[1].substring(0,Array_of_grade_output[1].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_2_Grade.setText(Array_of_grade_output[1].substring(Array_of_grade_output[1].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_3 = new StringTokenizer(Array_of_grade_output[2]);
                if (st_subject_3.countTokens()==2)
                {
                JLabel_Candidates_Subject_3.setText(st_subject_3.nextToken());  
                JLabel_Candidates_Subject_3_Grade.setText(st_subject_3.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_3.setText(Array_of_grade_output[2].substring(0,Array_of_grade_output[2].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_3_Grade.setText(Array_of_grade_output[2].substring(Array_of_grade_output[2].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_4 = new StringTokenizer(Array_of_grade_output[3]);
                if (st_subject_4.countTokens()==2)
                {
                JLabel_Candidates_Subject_4.setText(st_subject_4.nextToken());  
                JLabel_Candidates_Subject_4_Grade.setText(st_subject_4.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_4.setText(Array_of_grade_output[3].substring(0,Array_of_grade_output[3].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_4_Grade.setText(Array_of_grade_output[3].substring(Array_of_grade_output[3].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_5 = new StringTokenizer(Array_of_grade_output[4]);
                if (st_subject_5.countTokens()==2)
                {
                JLabel_Candidates_Subject_5.setText(st_subject_5.nextToken());  
                JLabel_Candidates_Subject_5_Grade.setText(st_subject_5.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_5.setText(Array_of_grade_output[4].substring(0,Array_of_grade_output[4].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_5_Grade.setText(Array_of_grade_output[4].substring(Array_of_grade_output[4].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_6 = new StringTokenizer(Array_of_grade_output[5]);
                if (st_subject_6.countTokens()==2)
                {
                JLabel_Candidates_Subject_6.setText(st_subject_6.nextToken());  
                JLabel_Candidates_Subject_6_Grade.setText(st_subject_6.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_6.setText(Array_of_grade_output[5].substring(0,Array_of_grade_output[5].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_6_Grade.setText(Array_of_grade_output[5].substring(Array_of_grade_output[5].lastIndexOf(" ")));  
                }
                
                StringTokenizer st_subject_7 = new StringTokenizer(Array_of_grade_output[6]);
                if (st_subject_7.countTokens()==2)
                {
                JLabel_Candidates_Subject_7.setText(st_subject_7.nextToken());  
                JLabel_Candidates_Subject_7_Grade.setText(st_subject_7.nextToken()); 
                }
                else
                {
                JLabel_Candidates_Subject_7.setText(Array_of_grade_output[6].substring(0,Array_of_grade_output[6].lastIndexOf(" ")));  
                JLabel_Candidates_Subject_7_Grade.setText(Array_of_grade_output[6].substring(Array_of_grade_output[6].lastIndexOf(" ")));  
                }
                
/*         
                
               JOptionPane.showMessageDialog(null,  
                     " Candidate's Name :  "+name_student_case_token_count_equal_to_22 + "\n"+
                     " Index Number:           "+JTextField_Candidates_Performance_Index_number.getText() + "\n"+
                     " Gender:                        "+gender_student_case_token_count_equal_to_22 + "\n"+
                     " Mean Grade:   "+mean_grade_student_case_token_count_equal_to_22 + "        "+
                     " Aggregate :   "+aggregate_points_student_case_token_count_equal_to_22 + " \n\n"+"" 
                    + Array_of_grade_output[0]+" \n"
                    + Array_of_grade_output[1]+" \n"
                    + Array_of_grade_output[2]+" \n"
		    + Array_of_grade_output[3]+" \n"
                    + Array_of_grade_output[4]+" \n"
                    + Array_of_grade_output[5]+" \n"
                    + Array_of_grade_output[6]+" \n"
                    + "\n\n *** It is possible that the Candidate sat for the Minumum 7 papers *** \n               The system is optimized for 8 Papers", "Student's Performance ", JOptionPane.PLAIN_MESSAGE);
                                        
*/
                 Enable_and_show_labels(); 
                 Enable_and_show_labels_on_School_Performance_Tab();
             
      }

       } 
    catch (Exception ex_performance_of_student) 
       {  
           System.out.println("Error on finding performance of student ----> " + ex_performance_of_student); 
       } 

    }
    
    
    
    
    private String Find_Out_Subject_Titles_From_Codes(String KNEC_subject_code) 
    { String KNEC_subject_name = "";
      int KNEC_subject_code_as_integer = Integer.parseInt(KNEC_subject_code);
      try 
      {
        switch (KNEC_subject_code_as_integer) 
        {
            case 101:
                KNEC_subject_name = "English";
                break;
            case 102:
                KNEC_subject_name = "Kiswahili";
                break;
            case 121:
                KNEC_subject_name = "Mathematics";
                break;
            case 122:
                KNEC_subject_name = "Mathematics Alternative 'B' ";
                break;
            case 231:
                KNEC_subject_name = "Biology";
                break;
            case 232:
                KNEC_subject_name = "Physics";
                break;
            case 233:
                KNEC_subject_name = "Chemistry";
                break;
            case 237:
                KNEC_subject_name = "General Science";
                break;
            case 311:
                KNEC_subject_name = "History & Government";
                break;
            case 312:
                KNEC_subject_name = "Geography";
                break;
            case 313:
                KNEC_subject_name = "Christian Rel. Education";
                break;
            case 314:
                KNEC_subject_name = "Islamic Religious Education";
                break;
            case 315:
                KNEC_subject_name = "Hindu Rel. Education";
                break;
            case 441:
                KNEC_subject_name = "Home Science";
                break;
            case 442:
                KNEC_subject_name = "Art and Design";
                break;
            case 443:
                KNEC_subject_name = "Agriculture";
                break;
            case 444:
                KNEC_subject_name = "Woodwork";
                break;
            case 445:
                KNEC_subject_name = "Metalwork";
                break;
            case 446:
                KNEC_subject_name = "Building Construction";
                break;
            case 447:
                KNEC_subject_name = "Power Mechanics";
                break;
            case 448:
                KNEC_subject_name = "Electricity";
                break;
            case 449:
                KNEC_subject_name = "Drawing and Design";
                break;
            case 450:
                KNEC_subject_name = "Aviation Technology";
                break;
            case 451:
                KNEC_subject_name = "Computer Studies";
                break;
            case 501:
                KNEC_subject_name = "French";
                break;
            case 502:
                KNEC_subject_name = "German";
                break;
            case 503:
                KNEC_subject_name = "Arabic";
                break;
            case 504:
                KNEC_subject_name = "Kenya Sign Language";
                break;
            case 511:
                KNEC_subject_name = "Music";
                break;
            case 565:
                KNEC_subject_name = "Business Studies";
                break;
            default:
                KNEC_subject_name = "";
                                
               
        }
      }  
      catch (Exception ex_Subject_Titles_From_Codes) 
       {  
           System.out.println("Error on finding subject name from code ---> " + ex_Subject_Titles_From_Codes); 
       }
      return KNEC_subject_name;
    }
    
private void Disable_and_hide_labels() 
    { 
        /* ************************************************************************ */  
        JLabel_School_code.setVisible(false);
        JLabel_Retrieved_School_Code.setVisible(false);
        JLabel_Name_of_School.setVisible(false);
        JLabel_Retrieved_Name_of_School.setVisible(false);

        JLabel_Candidates_Subject_1_Grade.setVisible(false);
        JLabel_Candidates_Subject_2_Grade.setVisible(false);
        JLabel_Candidates_Subject_3_Grade.setVisible(false);
        JLabel_Candidates_Subject_4_Grade.setVisible(false);
        JLabel_Candidates_Subject_5_Grade.setVisible(false);
        JLabel_Candidates_Subject_6_Grade.setVisible(false);
        JLabel_Candidates_Subject_7_Grade.setVisible(false);
        JLabel_Candidates_Subject_8_Grade.setVisible(false);
        JLabel_Bar_Chart_Candidates_Performance.setVisible(false);

        JLabel_Candidates_Subject_1.setVisible(false);
        JLabel_Candidates_Subject_2.setVisible(false);
        JLabel_Candidates_Subject_3.setVisible(false);
        JLabel_Candidates_Subject_4.setVisible(false);
        JLabel_Candidates_Subject_5.setVisible(false);
        JLabel_Candidates_Subject_6.setVisible(false);
        JLabel_Candidates_Subject_7.setVisible(false);
        JLabel_Candidates_Subject_8.setVisible(false);

        JLabel_Candidates_Mean_Grade.setVisible(false);
        JLabel_Candidates_Mean_Grade_Obtained.setVisible(false);
        JLabel_Candidates_Aggregate_Points.setVisible(false);
        JLabel_Candidates_Aggregate_Points_Obtained.setVisible(false);

        JSeparator_KCSE_2013_Results_MDI_Candidates_Results1.setVisible(false);
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results2.setVisible(false);
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results3.setVisible(false);

        JLabel_Candidates_Name.setVisible(false);
        JLabel_Candidates_Name_as_Registered.setVisible(false);
        JLabel_Candidates_Gender.setVisible(false);
   
        JLabel_Candidates_Gender_as_Registered.setVisible(false);
        /* ************************************************************************ */     
    }

private void Enable_and_show_labels() 
    {         

        /* ************************************************************************ */  
        JLabel_School_code.setVisible(true);
        JLabel_Retrieved_School_Code.setVisible(true);
        JLabel_Name_of_School.setVisible(true);
        JLabel_Retrieved_Name_of_School.setVisible(true);


        JLabel_Candidates_Subject_1_Grade.setVisible(true);
        JLabel_Candidates_Subject_2_Grade.setVisible(true);
        JLabel_Candidates_Subject_3_Grade.setVisible(true);
        JLabel_Candidates_Subject_4_Grade.setVisible(true);
        JLabel_Candidates_Subject_5_Grade.setVisible(true);
        JLabel_Candidates_Subject_6_Grade.setVisible(true);
        JLabel_Candidates_Subject_7_Grade.setVisible(true);
        JLabel_Candidates_Subject_8_Grade.setVisible(true);
        JLabel_Bar_Chart_Candidates_Performance.setVisible(true);


        JLabel_Candidates_Subject_1.setVisible(true);
        JLabel_Candidates_Subject_2.setVisible(true);
        JLabel_Candidates_Subject_3.setVisible(true);
        JLabel_Candidates_Subject_4.setVisible(true);
        JLabel_Candidates_Subject_5.setVisible(true);
        JLabel_Candidates_Subject_6.setVisible(true);
        JLabel_Candidates_Subject_7.setVisible(true);
        JLabel_Candidates_Subject_8.setVisible(true);

        JLabel_Candidates_Mean_Grade.setVisible(true);
        JLabel_Candidates_Mean_Grade_Obtained.setVisible(true);
        JLabel_Candidates_Aggregate_Points.setVisible(true);
        JLabel_Candidates_Aggregate_Points_Obtained.setVisible(true);

        JSeparator_KCSE_2013_Results_MDI_Candidates_Results1.setVisible(true);
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results2.setVisible(true);
        JSeparator_KCSE_2013_Results_MDI_Candidates_Results3.setVisible(true);

        JLabel_Candidates_Name.setVisible(true);
        JLabel_Candidates_Name_as_Registered.setVisible(true);
        JLabel_Candidates_Gender.setVisible(true);
        JLabel_Candidates_Gender_as_Registered.setVisible(true);
        /* ************************************************************************ */   
    }

public class JTextFieldLimit extends PlainDocument 
{
    private int limit;
    // optional uppercase conversion
    private boolean toUppercase = false;
     
    JTextFieldLimit(int limit) 
    {
        super();
        this.limit = limit;
    }
     
    JTextFieldLimit(int limit, boolean upper) 
    {
        super();
        this.limit = limit;
        toUppercase = upper;
    }
     
    public void insertString (int offset, String  str, AttributeSet attr) throws BadLocationException 
    {
        if (str == null) return;
         
        if ((getLength() + str.length()) <= limit) {
            if (toUppercase) str = str.toUpperCase();
            super.insertString(offset, str, attr);
        }
    }
}


public class KeyAdapterNumbersOnly extends KeyAdapter 
{    /**
     * Regular expression which defines the allowed characters.
     */
    private String allowedRegex = "[^0-9]";

    /**
     * Key released on field.
     */
    public void keyReleased(KeyEvent e) {
        String curText = ((JTextComponent) e.getSource()).getText();
        curText = curText.replaceAll(allowedRegex, "");

        ((JTextComponent) e.getSource()).setText(curText);
    }
}

    /**
     *
     * @param line_retrieved
     */
  /*  public void Results_of_students_that_dont_fall_within_norm (String line_containing_students_details_retrieved_from_file)  
    {           
                String Array_of_Student_Details[] = new String[500];
                int Counter_Array_of_Student_Details = 0;
                
		StringTokenizer st = new StringTokenizer(line_containing_students_details_retrieved_from_file);
		while (st.hasMoreElements()) 
                {
                        Array_of_Student_Details[Counter_Array_of_Student_Details] = ""+st.nextElement();
                        System.out.println(""+Array_of_Student_Details[Counter_Array_of_Student_Details]);
                        Counter_Array_of_Student_Details++;        
		}
                
                int idx;
                int indx_of_English_subject = 0;
                for (idx=0;idx<=Counter_Array_of_Student_Details;idx++)
		 {
                  //System.out.println(Array_of_Student_Details[idx]);
                  if (Array_of_Student_Details[idx].equals("101"))
                  {
                     indx_of_English_subject = idx;
                  }
                 }
                 System.out.println(Array_of_Student_Details[4]);
                 System.out.println(Array_of_Student_Details[5]);
                 System.out.println(Array_of_Student_Details[6]);
                 
                 
                 
                  JLabel_Candidates_Gender_as_Registered.setText(Array_of_Student_Details[1]);
                  JLabel_Candidates_Mean_Grade_Obtained.setText(Array_of_Student_Details[2]);
                  JLabel_Candidates_Aggregate_Points_Obtained.setText(Array_of_Student_Details[3]);
                   
                  System.out.println("\n English Index: " + indx_of_English_subject);
                  String students_that_dont_fall_within_norm_full_name = line_containing_students_details_retrieved_from_file.substring(line_containing_students_details_retrieved_from_file.indexOf(Array_of_Student_Details[4]), line_containing_students_details_retrieved_from_file.indexOf(" 101"));
                  System.out.println("Full Name: " + students_that_dont_fall_within_norm_full_name);  
                  
                  JLabel_Candidates_Subject_1.setText(""+Array_of_Student_Details[indx_of_English_subject]);
                  JLabel_Candidates_Subject_1_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 1]);  
                  JLabel_Candidates_Subject_2.setText(""+Array_of_Student_Details[indx_of_English_subject + 2]);
                  JLabel_Candidates_Subject_2_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 3]);
                  JLabel_Candidates_Subject_3.setText(""+Array_of_Student_Details[indx_of_English_subject + 4]);
                  JLabel_Candidates_Subject_3_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 5]);
                  JLabel_Candidates_Subject_4.setText(""+Array_of_Student_Details[indx_of_English_subject + 6]);
                  JLabel_Candidates_Subject_4_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 7]);                   
                  JLabel_Candidates_Subject_5.setText(""+Array_of_Student_Details[indx_of_English_subject + 8]);
                  JLabel_Candidates_Subject_5_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 9]);                      
                  JLabel_Candidates_Subject_6.setText(""+Array_of_Student_Details[indx_of_English_subject + 10]);
                  JLabel_Candidates_Subject_6_Grade.setText(""+Array_of_Student_Details[indx_of_English_subject + 11]);                      
                  JLabel_Candidates_Subject_7.setText(""+Array_of_Student_Details[indx_of_English_subject + 12]);
                  JLabel_Candidates_Subject_7_Grade.setText(Array_of_Student_Details[indx_of_English_subject + 13]);
                  
                  if (Array_of_Student_Details[indx_of_English_subject + 14] == null)
                  {
                  JLabel_Candidates_Subject_8.setText("");
                  JLabel_Candidates_Subject_8_Grade.setText("");
                  }
                  else 
                  {
                  JLabel_Candidates_Subject_8.setText(Array_of_Student_Details[indx_of_English_subject + 14]);
                  JLabel_Candidates_Subject_8_Grade.setText(Array_of_Student_Details[indx_of_English_subject + 15]); 
                  }        
		 
    }

*/
private void Disable_and_hide_labels_on_School_Performance_Tab() 
    {


//JLabel_School_code_inside_School_Performance.setVisible(false);
JLabel_Retrieved_School_Code_inside_School_Performance.setVisible(false);
JLabel_Name_of_School_inside_School_Performance.setVisible(false);
JLabel_Retrieved_Name_of_School_inside_School_Performance.setVisible(false);
JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance.setVisible(false);
/*
School_Performance_School_Code.setVisible(false);
JTextField_School_Performance_School_Code.setVisible(false);
JButton_School_Performance_School_Code_Show_Results.setVisible(false);
JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most.setVisible(false);
*/
jLabel_Number_of_Students_with_Particular_Grade.setVisible(false);

JLabel_Number_of_Students_with_Grade_A.setVisible(false);
JLabel_Number_of_Students_with_Grade_A_minus.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_plus.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_stand.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_minus.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_plus.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_stand.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_minus.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_plus.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_stand.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_minus.setVisible(false);
JLabel_Number_of_Students_with_Grade_E.setVisible(false);

JLabel_Number_of_Students_with_Grade_A_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Grade_E_Calculated.setVisible(false);
JLabel_Number_of_Students_with_Irregular_Grade.setVisible(false);
JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setVisible(false);

JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1.setVisible(false); 
JSeparator_School_Performance_Subject_Statistics_down_bottom.setVisible(false); 
JButton_Pie_Chart_of_Schools_Performance.setVisible(false); 

JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on.setVisible(false); 
JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setVisible(false); 
JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.setVisible(false); 
    }


private void Enable_and_show_labels_on_School_Performance_Tab() 
    {


//JLabel_School_code_inside_School_Performance.setVisible(true);
JLabel_Retrieved_School_Code_inside_School_Performance.setVisible(true);
JLabel_Name_of_School_inside_School_Performance.setVisible(true);
JLabel_Retrieved_Name_of_School_inside_School_Performance.setVisible(true);
JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance.setVisible(true);
/*
School_Performance_School_Code.setVisible(true);
JTextField_School_Performance_School_Code.setVisible(true);
JButton_School_Performance_School_Code_Show_Results.setVisible(true);
JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance_Top_Most.setVisible(true);
*/
jLabel_Number_of_Students_with_Particular_Grade.setVisible(true);


JLabel_Number_of_Students_with_Grade_A.setVisible(true);
JLabel_Number_of_Students_with_Grade_A_minus.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_plus.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_stand.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_minus.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_plus.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_stand.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_minus.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_plus.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_stand.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_minus.setVisible(true);
JLabel_Number_of_Students_with_Grade_E.setVisible(true);


JLabel_Number_of_Students_with_Grade_A_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Grade_E_Calculated.setVisible(true);
JLabel_Number_of_Students_with_Irregular_Grade.setVisible(true);
JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setVisible(true);
        
JSeparator_KCSE_2013_Results_MDI_Candidates_Results_inside_School_Performance1.setVisible(true);    
JButton_Pie_Chart_of_Schools_Performance.setVisible(true);

JSeparator_School_Performance_Subject_Statistics_down_bottom.setVisible(true); 
JLabel_School_Performance_Subject_Analysis_Subject_Statistics_on.setVisible(true); 
JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setVisible(true); 
JButton_School_Performance_Subject_Analysis_Go_Show_Statistics.setVisible(true); 
    }


private void Find_Out_Schools_Performance()
{
    try 
       {    
            FileReader SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader = new FileReader("DB@254.txt");

            BufferedReader SCHOOL_PERFORMANCE_Students_Result_Buffered_Reader = new BufferedReader(SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader);
            String SCHOOL_PERFORMANCE_Retrieved_Students_Line;

            int SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count = 0;
	    String SCHOOL_PERFORMANCE_Array_for_Grades[] = new String[500];
            int Counter_Array_for_Grades =0;
            int SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[] = new int[10];
            int SCHOOL_PERFORMANCE_Counter_Array_of_Footers = 0;
            int SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found = line_number_where_school_is_found + 500;

              while ((SCHOOL_PERFORMANCE_Retrieved_Students_Line = SCHOOL_PERFORMANCE_Students_Result_Buffered_Reader.readLine())!=null) 
                    {
                       SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count++;

                       if (SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count > line_number_where_school_is_found && SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count <= SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found)
                            {
                                     int SCHOOL_PERFORMANCE_KNEC_header_index_found=SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
                                     if (SCHOOL_PERFORMANCE_KNEC_header_index_found>-1)
					  {
                                              System.out.println("Header was found at position:: " + SCHOOL_PERFORMANCE_KNEC_header_index_found + " ::on line "+ SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count);
                                              SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[SCHOOL_PERFORMANCE_Counter_Array_of_Footers] = SCHOOL_PERFORMANCE_Students_of_particular_school_Line_count;
                                              SCHOOL_PERFORMANCE_Counter_Array_of_Footers++;
                                              SCHOOL_PERFORMANCE_max_limit_line_number_where_school_is_found = SCHOOL_PERFORMANCE_Array_of_Footers_to_assist_in_marking_end_of_school[SCHOOL_PERFORMANCE_Counter_Array_of_Footers] - 2;
                                          } 
                                     int SCHOOL_PERFORMANCE_KNEC_index_found = SCHOOL_PERFORMANCE_Retrieved_Students_Line.indexOf(" 101 ");
                                     if (SCHOOL_PERFORMANCE_KNEC_index_found>-1)
					{
                                             SCHOOL_PERFORMANCE_Array_for_Grades[Counter_Array_for_Grades] = SCHOOL_PERFORMANCE_Retrieved_Students_Line.substring(9, 11);
                                             //System.out.println((Counter_Array_for_Grades+1) + " ---> " + SCHOOL_PERFORMANCE_Array_for_Grades[Counter_Array_for_Grades]);
                                             Counter_Array_for_Grades++;
                                             
                                             
                                        }
			   }
		      }
                 int counter_grade_A=0;
                 int counter_grade_A_minus=0;
                 int counter_grade_B_plus=0;
                 int counter_grade_B=0;
                 int counter_grade_B_minus=0;
                 int counter_grade_C_plus=0;
                 int counter_grade_C=0;
                 int counter_grade_C_minus=0;
                 int counter_grade_D_plus=0;
                 int counter_grade_D=0;
                 int counter_grade_D_minus=0;
                 int counter_grade_E=0;
                 int counter_grade_W=0;
                 int counter_grade_X=0;
                 int counter_grade_Y=0;
                 int counter_grade_Z=0;
                 int counter_grade_U=0;
                 int counter_grade_P = 0;
                 int counter_to_loop_all_students = 0;
                 
                 for (counter_to_loop_all_students = 0; counter_to_loop_all_students < Counter_Array_for_Grades; counter_to_loop_all_students++)
                 {   //System.out.println("Determining ---> "+ SCHOOL_PERFORMANCE_Array_for_Grades[counter_to_loop_all_students]);
                     switch (SCHOOL_PERFORMANCE_Array_for_Grades[counter_to_loop_all_students]) 
                        {   
                            case "A ":
                                counter_grade_A++;
                                break;
                            case "A-":
                                counter_grade_A_minus++;
                                break;
                            case "B+":
                                counter_grade_B_plus++;
                                break;
                            case "B ":
                                counter_grade_B++;
                                break;
                            case "B-":
                                counter_grade_B_minus++;
                                break;
                            case "C+":
                                counter_grade_C_plus++;
                                break;
                            case "C ":
                                counter_grade_C++;
                                break;
                            case "C-":
                                counter_grade_C_minus++;
                                break;
                            case "D+":
                                counter_grade_D_plus++;
                                break;
                            case "D ":
                                counter_grade_D++;
                                break;
                            case "D-":
                                counter_grade_D_minus++;
                                break;  
                            case "E ":
                                counter_grade_E++;
                                break; 
                            case "W ":
                                counter_grade_W++;
                                break;
                            case "X ":
                                counter_grade_X++;
                                break; 
                            case "Y ":
                                counter_grade_Y++;
                                break;
                            case "Z ":
                                counter_grade_Z++;
                                break; 
                            case "U ":
                                counter_grade_U++;
                                break;
                            case "P ":
                                counter_grade_P++;
                                break;
                            default:
                                System.out.println("Difficulty with ---> "+ SCHOOL_PERFORMANCE_Array_for_Grades[counter_to_loop_all_students]);
                        }        
                 }/*
                    System.out.println(""+ counter_grade_A);
                    System.out.println(""+ counter_grade_A_minus);
                    System.out.println(""+ counter_grade_B_plus);
                    System.out.println(""+ counter_grade_B);
                    System.out.println(""+ counter_grade_B_minus);
                    System.out.println(""+ counter_grade_C_plus);
                    System.out.println(""+ counter_grade_C);
                    System.out.println(""+ counter_grade_C_minus);
                    System.out.println(""+ counter_grade_D_plus);
                    System.out.println(""+ counter_grade_D);
                    System.out.println(""+ counter_grade_D_minus);
                    System.out.println(""+ counter_grade_E);
                    System.out.println(""+ (counter_grade_W + counter_grade_X + counter_grade_Y + counter_grade_Z + counter_grade_U + counter_grade_P));
                 */
                    array_school_grades_count[0] =  Integer.parseInt(""+ counter_grade_A);
                    array_school_grades_count[1] =  Integer.parseInt(""+ counter_grade_A_minus);
                    array_school_grades_count[2] =  Integer.parseInt(""+ counter_grade_B_plus);
                    array_school_grades_count[3] =  Integer.parseInt(""+ counter_grade_B);
                    array_school_grades_count[4] =  Integer.parseInt(""+ counter_grade_B_minus);
                    array_school_grades_count[5] =  Integer.parseInt(""+ counter_grade_C_plus);
                    array_school_grades_count[6] =  Integer.parseInt(""+ counter_grade_C);
                    array_school_grades_count[7] =  Integer.parseInt(""+ counter_grade_C_minus);
                    array_school_grades_count[8] =  Integer.parseInt(""+ counter_grade_D_plus);
                    array_school_grades_count[9] =  Integer.parseInt(""+ counter_grade_D);
                    array_school_grades_count[10] =  Integer.parseInt(""+ counter_grade_D_minus);
                    array_school_grades_count[11] =  Integer.parseInt(""+ counter_grade_E);
                    array_school_grades_count[12] =  Integer.parseInt(""+ (counter_grade_W + counter_grade_X + counter_grade_Y + counter_grade_Z + counter_grade_U + counter_grade_P));
                 
                    JLabel_Number_of_Students_with_Grade_A_Calculated.setText(""+ counter_grade_A);
                    JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setText(""+ counter_grade_A_minus);
                    JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setText(""+ counter_grade_B_plus);
                    JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setText(""+ counter_grade_B);
                    JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setText(""+ counter_grade_B_minus);
                    JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setText(""+ counter_grade_C_plus);
                    JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setText(""+ counter_grade_C);
                    JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setText(""+ counter_grade_C_minus);
                    JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setText(""+ counter_grade_D_plus);
                    JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setText(""+ counter_grade_D);
                    JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setText(""+ counter_grade_D_minus);
                    JLabel_Number_of_Students_with_Grade_E_Calculated.setText(""+ counter_grade_E);
                    JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setText(""+ (counter_grade_W + counter_grade_X + counter_grade_Y + counter_grade_Z + counter_grade_U + counter_grade_P));
                 
                    JLabel_Retrieved_School_Code_inside_School_Performance.setText("" + JLabel_Retrieved_School_Code.getText());
                    JTextField_School_Performance_School_Code.setText("" + JLabel_Retrieved_School_Code.getText());
                    JLabel_Retrieved_Name_of_School_inside_School_Performance.setText("" + JLabel_Retrieved_Name_of_School.getText() + " ("+Counter_Array_for_Grades+")");
                 
                 SCHOOL_PERFORMANCE_KCSE_Results_Student_Details_FileReader.close();

		   } 
		   catch (Exception SCHOOL_PERFORMANCE_ex_performance_of_student) 
		   {  
			   System.out.println("Error on finding performance of school ----> " + SCHOOL_PERFORMANCE_ex_performance_of_student); 
		   } 
    
    
}


public boolean update_to_KCSE_Results_2013_Program_exists(String URLName)
{

  try {
    HttpURLConnection.setFollowRedirects(false);
    // note : you may also need
    //        HttpURLConnection.setInstanceFollowRedirects(false)
    HttpURLConnection con =
       (HttpURLConnection) new URL(URLName).openConnection();
    con.setRequestMethod("HEAD");
    return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
    }
  catch (Exception ex_I) {
       System.out.println("Exception handled at update_to_KCSE_Results_2013_Program_exists ----> "+ ex_I);
       return false;
       }
  }
/*
  public String CurrentDate()
  {
    //System.out.println("Inside the CurrentDate() Method");
    Calendar cal = new GregorianCalendar();
    int month =cal.get(Calendar.MONTH);
    int year =cal.get(Calendar.YEAR);
    int day =cal.get(Calendar.DAY_OF_MONTH);
    String month_and_year = "" + month + "-" + year;
    return month_and_year;
  }
*/
class Task_Display_Update_Message_if_Any extends TimerTask
{
    //This task will execute just once after seven seconds of starting the program
    public void run()
    {
    try {
     if ((update_to_KCSE_Results_2013_Program_exists("http://www.davidwachira.com/update-available.html")) == true)
      {
            //System.out.println("An updated version of this software is available for free on http://www.davidwachira.com");
            JOptionPane.showMessageDialog(null,"An updated version of this software is available \nfor free at www.davidwachira.com" , "New Updated Version ", JOptionPane.INFORMATION_MESSAGE);
    
      }
     
     }
      catch (Exception exception_update_available) 
      {
       System.out.println("Exception handled at Task_Display_Update_Message_if_Any ---->"+ exception_update_available);
      }
    }
}

private void Disable_and_hide_labels_on_Subject_Analysis_Tab() 
    {
	JLabel_Title_Grade_A_in_Subject.setVisible(false);
	JLabel_Title_Grade_A_minus_in_Subject.setVisible(false);
	JLabel_Title_Grade_B_plus_in_Subject.setVisible(false);
	JLabel_Title_Grade_B_plain_in_Subject.setVisible(false);
	JLabel_Title_Grade_B_minus_in_Subject.setVisible(false);
	JLabel_Title_Grade_C_plus_in_Subject.setVisible(false);
	JLabel_Title_Grade_C_plain_in_Subject.setVisible(false);
	JLabel_Title_Grade_C_minus_in_Subject.setVisible(false);
	JLabel_Title_Grade_D_plus_in_Subject.setVisible(false);
	JLabel_Title_Grade_D_plain_in_Subject.setVisible(false);
	JLabel_Title_Grade_D_minus_in_Subject.setVisible(false);
	JLabel_Title_Grade_E_in_Subject.setVisible(false);
	JLabel_Title_Grade_P_in_Subject.setVisible(false);
	JLabel_Title_Grade_U_in_Subject.setVisible(false);
	JLabel_Title_Grade_X_in_Subject.setVisible(false);
	JLabel_Title_Grade_Y_in_Subject.setVisible(false);
	JLabel_Title_Grade_Z_in_Subject.setVisible(false);
	JLabel_Title_Grade_W_in_Subject.setVisible(false);
	JLabel_Title_Male_Candidates_Taking_Subject.setVisible(false);
	JLabel_Title_Female_Candidates_Taking_Subject.setVisible(false);
	JLabel_Title_Total_Candidates_Taking_Subject.setVisible(false);
        
        JSeparator_Subject_Analysis_Bottom.setVisible(false);
        //JSeparator_Subject_Analysis_Top.setVisible(false);
        JLabel_Pie_Chart_Subject_Analysis.setVisible(false);
	
	JLabel_Actual_Grade_A_in_Subject.setVisible(false);
	JLabel_Actual_Grade_A_minus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_B_plus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_B_plain_in_Subject.setVisible(false);
	JLabel_Actual_Grade_B_minus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_C_plus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_C_plain_in_Subject.setVisible(false);
	JLabel_Actual_Grade_C_minus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_D_plus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_D_plain_in_Subject.setVisible(false);
	JLabel_Actual_Grade_D_minus_in_Subject.setVisible(false);
	JLabel_Actual_Grade_E_in_Subject.setVisible(false);
	JLabel_Actual_Grade_P_in_Subject.setVisible(false);
	JLabel_Actual_Grade_U_in_Subject.setVisible(false);
	JLabel_Actual_Grade_X_in_Subject.setVisible(false);
	JLabel_Actual_Grade_Y_in_Subject.setVisible(false);
	JLabel_Actual_Grade_Z_in_Subject.setVisible(false);
	JLabel_Actual_Grade_W_in_Subject.setVisible(false);
	JLabel_Actual_Male_Candidates_Taking_Subject.setVisible(false);
	JLabel_Actual_Female_Candidates_Taking_Subject.setVisible(false);
	JLabel_Actual_Total_Candidates_Taking_Subject.setVisible(false);    
    }
private void Enable_and_show_labels_on_Subject_Analysis_Tab() 
    {
	JLabel_Title_Grade_A_in_Subject.setVisible(true);
	JLabel_Title_Grade_A_minus_in_Subject.setVisible(true);
	JLabel_Title_Grade_B_plus_in_Subject.setVisible(true);
	JLabel_Title_Grade_B_plain_in_Subject.setVisible(true);
	JLabel_Title_Grade_B_minus_in_Subject.setVisible(true);
	JLabel_Title_Grade_C_plus_in_Subject.setVisible(true);
	JLabel_Title_Grade_C_plain_in_Subject.setVisible(true);
	JLabel_Title_Grade_C_minus_in_Subject.setVisible(true);
	JLabel_Title_Grade_D_plus_in_Subject.setVisible(true);
	JLabel_Title_Grade_D_plain_in_Subject.setVisible(true);
	JLabel_Title_Grade_D_minus_in_Subject.setVisible(true);
	JLabel_Title_Grade_E_in_Subject.setVisible(true);
	JLabel_Title_Grade_P_in_Subject.setVisible(true);
	JLabel_Title_Grade_U_in_Subject.setVisible(true);
	JLabel_Title_Grade_X_in_Subject.setVisible(true);
	JLabel_Title_Grade_Y_in_Subject.setVisible(true);
	JLabel_Title_Grade_Z_in_Subject.setVisible(true);
	JLabel_Title_Grade_W_in_Subject.setVisible(true);
	JLabel_Title_Male_Candidates_Taking_Subject.setVisible(true);
	JLabel_Title_Female_Candidates_Taking_Subject.setVisible(true);
	JLabel_Title_Total_Candidates_Taking_Subject.setVisible(true);
        
        JSeparator_Subject_Analysis_Bottom.setVisible(true);
        //JSeparator_Subject_Analysis_Top.setVisible(true);
	JLabel_Pie_Chart_Subject_Analysis.setVisible(true);
                
	JLabel_Actual_Grade_A_in_Subject.setVisible(true);
	JLabel_Actual_Grade_A_minus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_B_plus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_B_plain_in_Subject.setVisible(true);
	JLabel_Actual_Grade_B_minus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_C_plus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_C_plain_in_Subject.setVisible(true);
	JLabel_Actual_Grade_C_minus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_D_plus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_D_plain_in_Subject.setVisible(true);
	JLabel_Actual_Grade_D_minus_in_Subject.setVisible(true);
	JLabel_Actual_Grade_E_in_Subject.setVisible(true);
	JLabel_Actual_Grade_P_in_Subject.setVisible(true);
	JLabel_Actual_Grade_U_in_Subject.setVisible(true);
	JLabel_Actual_Grade_X_in_Subject.setVisible(true);
	JLabel_Actual_Grade_Y_in_Subject.setVisible(true);
	JLabel_Actual_Grade_Z_in_Subject.setVisible(true);
	JLabel_Actual_Grade_W_in_Subject.setVisible(true);
	JLabel_Actual_Male_Candidates_Taking_Subject.setVisible(true);
	JLabel_Actual_Female_Candidates_Taking_Subject.setVisible(true);
	JLabel_Actual_Total_Candidates_Taking_Subject.setVisible(true); 
    }

private void Enable_and_show_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab() 
    {
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setVisible(true);

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated.setVisible(true);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setVisible(true); 
        
        //JSeparator_School_Performance_Subject_Statistics_down_bottom.setVisible(true);
    }
private void Disable_and_hide_labels_on_Subject_Statistics_School_Performance_and_Analysis_Tab() 
    {
        JComboBox_School_Performance_Subject_Analysis_Select_a_Subject.setSelectedIndex(0);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade.setVisible(false);

        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_A_minus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_plus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_stand_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_B_minus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_plus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_stand_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_C_minus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_plus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_stand_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_D_minus_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Grade_E_Calculated.setVisible(false);
        School_Performance_Subject_Statistics_JLabel_Number_of_Students_with_Irregular_Grade_Calculated.setVisible(false);   
        
        //JSeparator_School_Performance_Subject_Statistics_down_bottom.setVisible(false);
    }
}


