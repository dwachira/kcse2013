/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kcse_2013_results;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author © Mureithi David Wachira
 */
public class Robot_to_convert_text_file_to_MySQL 
{   private Connection  con_robot;
    String KNEC_School_or_Center_Code;
    String KNEC_Candidate_s_index_number;
    String Retrieved_Name_of_School;
    String Retrieved_Gender;
    String Retrieved_Mean_Grade;
    String Retrieved_Aggregate_Points;
    
    int line_number_where_school_is_found;
    String Subject_I;
    String Subject_II;
    String Subject_III;
    String Subject_IV;
    String Subject_V;
    String Subject_VI;
    String Subject_VII;
    String Subject_VIII;
    
    String Subject_I_Grade;
    String Subject_II_Grade;
    String Subject_III_Grade;
    String Subject_IV_Grade;
    String Subject_V_Grade;
    String Subject_VI_Grade;
    String Subject_VII_Grade;
    String Subject_VIII_Grade;
    
    String Student_full_name;
    int max_limit_line_number_where_school_is_found;
    
public void Robot_to_convert_text_file_to_MySQL() 
{
      try
      {
            FileReader KCSE_FileReader = new FileReader("DB@254.txt");

            BufferedReader KCSE_Buffered_Reader = new BufferedReader(KCSE_FileReader);
            String Retrieved_Line = null;
            int test_candidates_samples_number = 1;
            
            Create_Directory_With_Non_Existent_Parent_Directory ();
                    
            while (((Retrieved_Line = KCSE_Buffered_Reader.readLine())!= null))
            {
                Subject_I = "";
                Subject_II = "";
                Subject_III = "";
                Subject_IV = "";
                Subject_V = "";
                Subject_VI = "";
                Subject_VII = "";
                Subject_VIII = "";

                Subject_I_Grade = "";
                Subject_II_Grade = "";
                Subject_III_Grade = "";
                Subject_IV_Grade = "";
                Subject_V_Grade = "";
                Subject_VI_Grade = "";
                Subject_VII_Grade = "";
                Subject_VIII_Grade = "";
                
                //System.out.println("Retrieved Line ---> " + Retrieved_Line + " - "+ Retrieved_Line.length());
                if (Retrieved_Line.length() > 0 )
                {
                    if ( Character.isDigit(Retrieved_Line.charAt(0)) &&  Character.isDigit(Retrieved_Line.charAt(1)) &&  Character.isDigit(Retrieved_Line.charAt(2)) &&  Character.isDigit(Retrieved_Line.charAt(3)) &&  Character.isDigit(Retrieved_Line.charAt(4)) &&  Character.isDigit(Retrieved_Line.charAt(5)) &&  Character.isDigit(Retrieved_Line.charAt(6)) &&  Character.isDigit(Retrieved_Line.charAt(7)) &&  (Retrieved_Line.charAt(8) == ' '))
                    {
                        KNEC_School_or_Center_Code = Retrieved_Line.substring(0, 8);
                    }
                    else if ( Character.isDigit(Retrieved_Line.charAt(0)) &&  Character.isDigit(Retrieved_Line.charAt(1)) &&  Character.isDigit(Retrieved_Line.charAt(2)) &&  (Retrieved_Line.charAt(3) == ' '))
                    {
                        KNEC_Candidate_s_index_number = KNEC_School_or_Center_Code + Retrieved_Line.substring(0, 3);
                        //System.out.println("Written Line ---> " + test_candidates_samples_number + " - " + KNEC_Candidate_s_index_number);    
                        //Write_into_Text_File (test_candidates_samples_number + " - " + KNEC_Candidate_s_index_number);
                        //KCSE_Results_MDI kcse_MDI = new KCSE_Results_MDI();
                        //kcse_MDI.Find_Out_Performance_of_Student(KNEC_Candidate_s_index_number);
                        //kcse_MDI.JLabel_Bar_Chart_Candidates_PerformanceMouseClicked(null);
                        
                        Robot_Find_Out_Performance_of_Student(KNEC_Candidate_s_index_number) ;
                        
                        //Bar_Chart_Candidates_Performance();
                        
                        String Information_to_be_written = "";
                        Information_to_be_written = " INSERT INTO kcse_2013_results_table (results_id, kcse_index_no, name_of_school, "
                                                    + "candidate_name, gender, mean_grade, aggregate_points, subject_1, subject_1_grade,subject_2, "
                                                    + "subject_2_grade, subject_3, subject_3_grade, subject_4, subject_4_grade, subject_5, subject_5_grade, "
                                                    + "subject_6, subject_6_grade, subject_7, subject_7_grade, subject_8, subject_8_grade)"
                                                    + " VALUES ('" + test_candidates_samples_number + "', " 
                                                    + " '" +KNEC_Candidate_s_index_number + "',"  
                                                    + " '" +Retrieved_Name_of_School /* .replaceAll("'", "\\\\'") */ + "'," 
                                                    + " '" +Student_full_name /* .replaceAll("'", "\u2019") */ + "',"  
                                                    + " '" +Retrieved_Gender + "'," 
                                                    + " '" +Retrieved_Mean_Grade + "',"  
                                                    + " '" +Retrieved_Aggregate_Points + "',"  
                                                    + " '" +Subject_I + "'," 
                                                    + " '" +Subject_I_Grade + "',"  
                                                    + " '" +Subject_II + "'," 
                                                    + " '" +Subject_II_Grade + "',"  
                                                    + " '" +Subject_III + "'," 
                                                    + " '" +Subject_III_Grade + "',"  
                                                    + " '" +Subject_IV + "'," 
                                                    + " '" +Subject_IV_Grade + "',"  
                                                    + " '" +Subject_V + "'," 
                                                    + " '" +Subject_V_Grade + "',"  
                                                    + " '" +Subject_VI + "'," 
                                                    + " '" +Subject_VI_Grade + "',"  
                                                    + " '" +Subject_VII + "'," 
                                                    + " '" +Subject_VII_Grade + "',"  
                                                    + " '" +Subject_VIII + "'," 
                                                    + " '" + Subject_VIII_Grade + "');";
                                
                       Write_into_Text_File (Information_to_be_written);
                       /*System.out.println("" + Information_to_be_written);    
                    try
                    {
                        con_robot = Robot_Connection_to_Localhost.getDBConnection();
                        if (con_robot == null) 
                            {
                            JOptionPane.showMessageDialog(null, "Error on establishing database connection", "Error", JOptionPane.ERROR_MESSAGE);
                            System.out.println("Error on establishing database connection");
                            }
  	          	 Statement stmt_robot = con_robot.createStatement();
                         stmt_robot.executeUpdate(Information_to_be_written);
                    }                  
                    catch(SQLException sql_add_to_blacklist)
                    {
                          System.err.println(sql_add_to_blacklist);
                    }*/
                        test_candidates_samples_number++;
                    }
                   
                }
               //Thread.sleep(3 * 1000); 
            }
            KCSE_FileReader.close();
      }  
      catch (Exception ex_robot) 
       {  
           System.out.println("Error inside Robot_to_convert_text_file_to_MySQL() ---> " + ex_robot); 
       }  
}

public void Create_Directory_With_Non_Existent_Parent_Directory ()
  {
        File file = new File("./MySQL-Conversion");
        boolean b = false;
        if (!file.exists()) 
        {
            b = file.mkdirs();
        }
        if (b)
            System.out.println("Directory ---> " + "./MySQL-Conversion" + " <---- successfully created");
        else
            System.out.println("Failed to create directory  ---> "+ "./MySQL-Conversion" + " <---- ");
  }


/**
 *
 *
 */
    private void Robot_Find_Out_Performance_of_Student(String KNEC_candidate_index_number) 
    { 
    try 
       {    
            String School_Name_Gotten = Find_Out_Name_of_School(""+KNEC_candidate_index_number.substring(0, 8));
            String Candidate_number = KNEC_candidate_index_number.substring(8, 11);
            
            //System.out.println("Name of School  ---> "+ School_Name_Gotten);
            //System.out.println("Candidate Number  ---> "+ Candidate_number);
            
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
                       //System.out.println("Retrieved Line inside Robot_Find_Out_Performance_of_Student(" + KNEC_candidate_index_number + ") ---> "+ Retrieved_Students_Line); 
                       
                       Students_of_particular_school_Line_count++;

                       if (Students_of_particular_school_Line_count > line_number_where_school_is_found && Students_of_particular_school_Line_count <= max_limit_line_number_where_school_is_found)
                            {
                                     boolean Index_of_student_Found = Retrieved_Students_Line.startsWith(Candidate_number);
                                     
                                     int KNEC_header_index_found=Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
                                     if (KNEC_header_index_found>-1)
					  {
                                              //System.out.println("Header was found at position:: " + KNEC_header_index_found + " ::on line "+ Students_of_particular_school_Line_count);
                                              //JOptionPane.showMessageDialog(null, "There is no candidate registered by the index number "+ KNEC_candidate_index_number +"\nin "+ School_Name_Gotten+ " ("+ KNEC_candidate_index_number.substring(0, 8)+"). Please check \nand try again" , "Index Number Error", JOptionPane.ERROR_MESSAGE);
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
                                                           
                                                          	    Retrieved_Gender = Array_of_Words[1];
                                                                    Retrieved_Mean_Grade = Array_of_Words[2];
                                                                    Retrieved_Aggregate_Points = Array_of_Words[3];
                                                           //JLabel_Candidates_Gender_as_Registered.setText(Array_of_Words[1]);
                                                           //JLabel_Candidates_Mean_Grade_Obtained.setText(Array_of_Words[2]); 
                                                           //JLabel_Candidates_Aggregate_Points_Obtained.setText(Array_of_Words[3]); 
                                                           
                                                           if (student_details_Token_count==22)
                                                           {   
                                                             
                                                            //Enable_and_show_labels(); 
                                                            //Enable_and_show_labels_on_School_Performance_Tab();
                                                            Student_full_name= Array_of_Words[4] + " " + Array_of_Words[5];
                                                              
                                                            Subject_I = Array_of_Words[6];
                                                            Subject_II = Array_of_Words[8];
                                                            Subject_III = Array_of_Words[10];
                                                            Subject_IV = Array_of_Words[12];
                                                            Subject_V = Array_of_Words[14];
                                                            Subject_VI = Array_of_Words[16];
                                                            Subject_VII = Array_of_Words[18];
                                                            Subject_VIII = Array_of_Words[20];
                                                            
                                                                Subject_I_Grade = Array_of_Words[7];
                                                                Subject_II_Grade = Array_of_Words[9];
                                                                Subject_III_Grade = Array_of_Words[11];
                                                                Subject_IV_Grade = Array_of_Words[13];
                                                                Subject_V_Grade = Array_of_Words[15];
                                                                Subject_VI_Grade = Array_of_Words[17];
                                                                Subject_VII_Grade = Array_of_Words[19];
                                                                Subject_VIII_Grade = Array_of_Words[21];
                                                            /*
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[7]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[9]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[11]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[13]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[15]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[17]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[19]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[21]); 
                                                            */
                                                           }
                                                           
                                                           else if (student_details_Token_count==23)
                                                           { /*  
                                                            Enable_and_show_labels(); 
                                                            Enable_and_show_labels_on_School_Performance_Tab();
                                                            */
                                                            Student_full_name = Array_of_Words[4] + " " + Array_of_Words[5] + " " + Array_of_Words[6];
                                                            
                                                            Subject_I = Array_of_Words[7];
                                                            Subject_II = Array_of_Words[9];
                                                            Subject_III = Array_of_Words[11];
                                                            Subject_IV = Array_of_Words[13];
                                                            Subject_V = Array_of_Words[15];
                                                            Subject_VI = Array_of_Words[17];
                                                            Subject_VII = Array_of_Words[19];
                                                            Subject_VIII = Array_of_Words[21];
                                                            
                                                                Subject_I_Grade = Array_of_Words[8];
                                                                Subject_II_Grade = Array_of_Words[10];
                                                                Subject_III_Grade = Array_of_Words[12];
                                                                Subject_IV_Grade = Array_of_Words[14];
                                                                Subject_V_Grade = Array_of_Words[16];
                                                                Subject_VI_Grade = Array_of_Words[18];
                                                                Subject_VII_Grade = Array_of_Words[20];
                                                                Subject_VIII_Grade = Array_of_Words[22];
                                                            /*
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[8]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[10]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[12]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[14]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[16]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[18]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[20]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[22]); 
                                                            */
                                                           }
                                                           
                                                           else if (student_details_Token_count==24)
                                                           { /*  
                                                             Enable_and_show_labels(); 
                                                             Enable_and_show_labels_on_School_Performance_Tab();
                                                             */
                                                             Student_full_name = Array_of_Words[4] + " " + Array_of_Words[5] + " " + Array_of_Words[6] + " " + Array_of_Words[7];
                                                             
                                                            Subject_I = Array_of_Words[8];
                                                            Subject_II = Array_of_Words[10];
                                                            Subject_III = Array_of_Words[12];
                                                            Subject_IV = Array_of_Words[14];
                                                            Subject_V = Array_of_Words[16];
                                                            Subject_VI = Array_of_Words[18];
                                                            Subject_VII = Array_of_Words[20];
                                                            Subject_VIII = Array_of_Words[22];
                                                            
                                                                Subject_I_Grade = Array_of_Words[9];
                                                                Subject_II_Grade = Array_of_Words[11];
                                                                Subject_III_Grade = Array_of_Words[13];
                                                                Subject_IV_Grade = Array_of_Words[15];
                                                                Subject_V_Grade = Array_of_Words[17];
                                                                Subject_VI_Grade = Array_of_Words[19];
                                                                Subject_VII_Grade = Array_of_Words[21];
                                                                Subject_VIII_Grade = Array_of_Words[23];
                                                            /*
                                                            JLabel_Candidates_Subject_1_Grade.setText(Array_of_Words[9]);
                                                            JLabel_Candidates_Subject_2_Grade.setText(Array_of_Words[11]);
                                                            JLabel_Candidates_Subject_3_Grade.setText(Array_of_Words[13]);
                                                            JLabel_Candidates_Subject_4_Grade.setText(Array_of_Words[15]);
                                                            JLabel_Candidates_Subject_5_Grade.setText(Array_of_Words[17]);
                                                            JLabel_Candidates_Subject_6_Grade.setText(Array_of_Words[19]);
                                                            JLabel_Candidates_Subject_7_Grade.setText(Array_of_Words[21]);
                                                            JLabel_Candidates_Subject_8_Grade.setText(Array_of_Words[23]); 
                                                            */
                                                           }
                                                           else if (student_details_Token_count<22 || student_details_Token_count>24)
         
                                                           {   Student_Details_In_Brief = Student_Details_In_Brief + " " + Array_of_Words[Index_of_student_details_token];
                                                           }
                                                    }
                                                  
                                                  if (student_details_Token_count>=22 && student_details_Token_count<=24)
                                                     {  /*
                                                        JLabel_Candidates_Subject_1.setText(Find_Out_Subject_Titles_From_Codes(Subject_I));
                                                        JLabel_Candidates_Subject_2.setText(Find_Out_Subject_Titles_From_Codes(Subject_II));
                                                        JLabel_Candidates_Subject_3.setText(Find_Out_Subject_Titles_From_Codes(Subject_III));
                                                        JLabel_Candidates_Subject_4.setText(Find_Out_Subject_Titles_From_Codes(Subject_IV));
                                                        JLabel_Candidates_Subject_5.setText(Find_Out_Subject_Titles_From_Codes(Subject_V));
                                                        JLabel_Candidates_Subject_6.setText(Find_Out_Subject_Titles_From_Codes(Subject_VI));
                                                        JLabel_Candidates_Subject_7.setText(Find_Out_Subject_Titles_From_Codes(Subject_VII));
                                                        JLabel_Candidates_Subject_8.setText(Find_Out_Subject_Titles_From_Codes(Subject_VIII));
                                                         */
                                                        Subject_I= Find_Out_Subject_Titles_From_Codes(Subject_I);
                                                        Subject_II= Find_Out_Subject_Titles_From_Codes(Subject_II);
                                                        Subject_III= Find_Out_Subject_Titles_From_Codes(Subject_III);
                                                        Subject_IV= Find_Out_Subject_Titles_From_Codes(Subject_IV);
                                                        Subject_V= Find_Out_Subject_Titles_From_Codes(Subject_V);
                                                        Subject_VI= Find_Out_Subject_Titles_From_Codes(Subject_VI);
                                                        Subject_VII= Find_Out_Subject_Titles_From_Codes(Subject_VII);
                                                        Subject_VIII= Find_Out_Subject_Titles_From_Codes(Subject_VIII);
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
             
                                                           
             Retrieved_Gender = Student_Details_In_Brief.substring(6, 7);
             Retrieved_Mean_Grade = Student_Details_In_Brief.substring(9, 11);
             Retrieved_Aggregate_Points = Student_Details_In_Brief.substring(14, 16);
             
            //String gender_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(6, 7);
            // String mean_grade_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(9, 11);
             Student_full_name =  Student_Details_In_Brief.substring(18, Student_Details_In_Brief.indexOf(" 101", 18));//Student_Details_In_Brief.substring(14, 16);
             //String aggregate_points_student_case_token_count_equal_to_22 = Student_Details_In_Brief.substring(14, 16); 
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
                        while (replacement_for_searchWord.length() < 25) 
                        {
                        
                          replacement_for_searchWord = replacement_for_searchWord + " ";
                        
                        }

                            scores_for_the_student = scores_for_the_student.replace(searchWord, replacement_for_searchWord );
                            //System.out.println("Final String    --->" + replacement_for_searchWord + space + searchWord +"\n");
                            Array_of_grade_output[counter_for_grade_output] = replacement_for_searchWord + searchWord;
                            //System.out.println("String in Array --->" + replacement_for_searchWord + " - "+searchWord +"\n");
                            counter_for_grade_output++;
/* ********************************************************************************************************************************************** */
                  }
               }
             }
                //System.out.println("Original String ---> " + scores_for_the_student);
         
                //Student_full_name = name_student_case_token_count_equal_to_22;
                /*JLabel_Candidates_Gender_as_Registered.setText(gender_student_case_token_count_equal_to_22);
                JLabel_Candidates_Mean_Grade_Obtained.setText(mean_grade_student_case_token_count_equal_to_22);
                JLabel_Candidates_Aggregate_Points_Obtained.setText(aggregate_points_student_case_token_count_equal_to_22);
            */  Subject_VIII = "";
                Subject_VIII_Grade = ""; 
                
                StringTokenizer st_subject_1 = new StringTokenizer(Array_of_grade_output[0]);
                if (st_subject_1.countTokens()==2)
                {
                Subject_I = st_subject_1.nextToken();  
                Subject_I_Grade = st_subject_1.nextToken(); 
                }
                else
                {
                Subject_I = Array_of_grade_output[0].substring(0,Array_of_grade_output[0].lastIndexOf(" "));  
                Subject_I_Grade = Array_of_grade_output[0].substring(Array_of_grade_output[0].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_2 = new StringTokenizer(Array_of_grade_output[1]);
                if (st_subject_2.countTokens()==2)
                {
                Subject_II = st_subject_2.nextToken();  
                Subject_II_Grade = st_subject_2.nextToken(); 
                }
                else
                {
                Subject_II = Array_of_grade_output[1].substring(0,Array_of_grade_output[1].lastIndexOf(" "));  
                Subject_II_Grade = Array_of_grade_output[1].substring(Array_of_grade_output[1].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_3 = new StringTokenizer(Array_of_grade_output[2]);
                if (st_subject_3.countTokens()==2)
                {
                Subject_III = st_subject_3.nextToken();  
                Subject_III_Grade = st_subject_3.nextToken(); 
                }
                else
                {
                Subject_III = Array_of_grade_output[2].substring(0,Array_of_grade_output[2].lastIndexOf(" "));  
                Subject_III = Array_of_grade_output[2].substring(Array_of_grade_output[2].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_4 = new StringTokenizer(Array_of_grade_output[3]);
                if (st_subject_4.countTokens()==2)
                {
                Subject_IV = st_subject_4.nextToken();  
                Subject_IV_Grade = st_subject_4.nextToken(); 
                }
                else
                {
                Subject_IV = Array_of_grade_output[3].substring(0,Array_of_grade_output[3].lastIndexOf(" "));  
                Subject_IV_Grade = Array_of_grade_output[3].substring(Array_of_grade_output[3].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_5 = new StringTokenizer(Array_of_grade_output[4]);
                if (st_subject_5.countTokens()==2)
                {
                Subject_V = st_subject_5.nextToken();  
                Subject_V_Grade = st_subject_5.nextToken(); 
                }
                else
                {
                Subject_V = Array_of_grade_output[4].substring(0,Array_of_grade_output[4].lastIndexOf(" "));  
                Subject_V_Grade = Array_of_grade_output[4].substring(Array_of_grade_output[4].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_6 = new StringTokenizer(Array_of_grade_output[5]);
                if (st_subject_6.countTokens()==2)
                {
                Subject_VI = st_subject_6.nextToken();  
                Subject_VI_Grade = st_subject_6.nextToken(); 
                }
                else
                {
                Subject_VI = Array_of_grade_output[5].substring(0,Array_of_grade_output[5].lastIndexOf(" "));  
                Subject_VI_Grade = Array_of_grade_output[5].substring(Array_of_grade_output[5].lastIndexOf(" "));  
                }
                
                StringTokenizer st_subject_7 = new StringTokenizer(Array_of_grade_output[6]);
                if (st_subject_7.countTokens()==2)
                {
                Subject_VII = st_subject_7.nextToken();  
                Subject_VII_Grade = st_subject_7.nextToken(); 
                }
                else
                {
                Subject_VII = Array_of_grade_output[6].substring(0,Array_of_grade_output[6].lastIndexOf(" "));  
                Subject_VII_Grade = Array_of_grade_output[6].substring(Array_of_grade_output[6].lastIndexOf(" "));  
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

             
      }

       } 
    catch (Exception ex_performance_of_student) 
       {  
           System.out.println("Error on finding performance of student ----> " + ex_performance_of_student + " --- " + KNEC_candidate_index_number); 
       } 

    }
/**
 *
 ***********************************************************************************************************
 *
 */
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
/**
 *
 ***********************************************************************************************************
 *
 */
    private String Find_Out_Name_of_School(String KNEC_school_code) 
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
        Retrieved_Name_of_School = KNEC_examination_center_name;
      } 
        catch (Exception ex_school_name) 
         {  
             System.out.println("Error on finding name of the school" + ex_school_name); 
         } 
        return Retrieved_Name_of_School;

         } 
/**
 *
 ***********************************************************************************************************
 *
 */
    
public void Write_into_Text_File (String Information_to_be_written)
{   try 
     {
       String String_written_into_Text_File = Information_to_be_written +"\n";
       File file_Text_File = new File("./MySQL-Conversion/kcse_2013_MySQL.sql");
 
       if (!file_Text_File.exists()) 
       {
	 file_Text_File.createNewFile();
       }
       FileWriter fw_Text_File = new FileWriter(file_Text_File.getAbsoluteFile(), true);
       BufferedWriter bw_Text_File = new BufferedWriter(fw_Text_File);
       bw_Text_File.write(String_written_into_Text_File);
       bw_Text_File.close();

     } 
     catch (Exception e) 
      {
	e.printStackTrace();
      }
}
/**
 *
 ***********************************************************************************************************
 *
 */
public static void main(String[] args) 
    
    {
        Robot_to_convert_text_file_to_MySQL  convert_to_MySQL = new Robot_to_convert_text_file_to_MySQL();
        convert_to_MySQL.Robot_to_convert_text_file_to_MySQL();
    
    }
/**
 *
 ***********************************************************************************************************
 *
 */
}
