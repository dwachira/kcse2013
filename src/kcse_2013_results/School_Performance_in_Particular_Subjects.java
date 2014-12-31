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

import java.io.BufferedReader;
import java.io.FileReader;

public class School_Performance_in_Particular_Subjects 
{
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    int Subject_analysis_candidates_with_A_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_A_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_B_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_C_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_plus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_plain_in_particular_subject = 0;
    int Subject_analysis_candidates_with_D_minus_in_particular_subject = 0;
    int Subject_analysis_candidates_with_E_in_particular_subject = 0;
    int Subject_analysis_candidates_with_U_in_particular_subject = 0;
    int Subject_analysis_candidates_with_W_in_particular_subject = 0;
    int Subject_analysis_candidates_with_X_in_particular_subject = 0;
    int Subject_analysis_candidates_with_Y_in_particular_subject = 0;
    int Subject_analysis_candidates_with_Z_in_particular_subject = 0;
    int Subject_analysis_candidates_with_P_in_particular_subject = 0;
    int Subject_analysis_calculated_male_candidates_taking_particular_subject = 0;
    int Subject_analysis_calculated_female_candidates_taking_particular_subject = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 

    
    public void Variables_Instantiated_to_Zero ()
    {
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    Subject_analysis_candidates_with_A_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_A_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_B_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_C_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_plus_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_plain_in_particular_subject = 0;
    Subject_analysis_candidates_with_D_minus_in_particular_subject = 0;
    Subject_analysis_candidates_with_E_in_particular_subject = 0;
    Subject_analysis_candidates_with_U_in_particular_subject = 0;
    Subject_analysis_candidates_with_W_in_particular_subject = 0;
    Subject_analysis_candidates_with_X_in_particular_subject = 0;
    Subject_analysis_candidates_with_Y_in_particular_subject = 0;
    Subject_analysis_candidates_with_Z_in_particular_subject = 0;
    Subject_analysis_candidates_with_P_in_particular_subject = 0;
    Subject_analysis_calculated_male_candidates_taking_particular_subject = 0;
    Subject_analysis_calculated_female_candidates_taking_particular_subject = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 

    }
    
    public void School_Performance_in_Particular_Subjects (int Header_for_School, int Subject_that_is_Analysed, String Name_of_Subject_that_is_Analysed)
    {
    try 
       {    
            Variables_Instantiated_to_Zero ();
            
            int SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found = Header_for_School;
            FileReader Subject_Analysis_in_School_FileReader = new FileReader("DB@254.txt");

            BufferedReader Subject_Analysis_in_School_Buffered_Reader = new BufferedReader(Subject_Analysis_in_School_FileReader);
            String Subject_Analysis_in_School__Retrieved_Students_Line;

            int SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count = 0;

            int SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[] = new int[10];
            int SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers = 0;
            int SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found = SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found + 500;

              while ((Subject_Analysis_in_School__Retrieved_Students_Line = Subject_Analysis_in_School_Buffered_Reader.readLine())!=null) 
                    {
                       SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count++;

                       if (SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count > SUBJECT_ANALYSIS_IN_SCHOOL_line_number_where_school_is_found && SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count <= SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found)
                            {
                                     int SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found = Subject_Analysis_in_School__Retrieved_Students_Line.indexOf("THE	 KENYA	 NATIONAL	 EXAMINATIONS	 COUNCIL");
                                     if (SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found>-1)
					  {
                                              System.out.println("Header was found at position:: " + SUBJECT_ANALYSIS_IN_SCHOOL_KNEC_header_index_found + " ::on line "+ SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count);
                                              SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers] = SUBJECT_ANALYSIS_IN_SCHOOL_Students_of_particular_school_Line_count;
                                              SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers++;
                                              SUBJECT_ANALYSIS_IN_SCHOOL_max_limit_line_number_where_school_is_found = SUBJECT_ANALYSIS_IN_SCHOOL_Array_of_Footers_to_assist_in_marking_end_of_school[SUBJECT_ANALYSIS_IN_SCHOOL_Counter_Array_of_Footers] - 2;
                                          } 

/* ----------------------------------------------------------------------------------------------------------------------------- */ 
               if (Subject_Analysis_in_School__Retrieved_Students_Line.length() > 0 )
                {
                      int subject_index_in_line = Subject_Analysis_in_School__Retrieved_Students_Line.indexOf(" "+ Subject_that_is_Analysed +" ");
                      //System.out.println("Found ---> " + subject_index_in_line + " in line "+ buffered_reader_line_number);
                      if (subject_index_in_line!=-1)//&& (Subject_Analysis_in_School__Retrieved_Students_Line.length() > (subject_index_in_line + 5) ))
                      {
                          int grade_in_subject_index_in_line = subject_index_in_line + 4;
                          int grade_1st_char = grade_in_subject_index_in_line + 1;
                          int grade_2nd_char = grade_in_subject_index_in_line + 2;
                          //String actual_grade_in_subject = ""+Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_in_subject_index_in_line+1) + Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_in_subject_index_in_line+2);

                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(6) == 'F'))
                            { 
                                Subject_analysis_calculated_female_candidates_taking_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(6) == 'M'))
                            {
                                Subject_analysis_calculated_male_candidates_taking_particular_subject++;
                            }
                            
                          if (Subject_Analysis_in_School__Retrieved_Students_Line.length() > (subject_index_in_line + 6))
                            {    
                               
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'A') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'A') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_A_minus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_B_plus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'B') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_B_minus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_C_plus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'C') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_C_minus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '+'))
                            {
                                Subject_analysis_candidates_with_D_plus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'D') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == '-'))
                            {
                                Subject_analysis_candidates_with_D_minus_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'E') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_E_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'U') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_U_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'W') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_W_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'X') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_X_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'Y') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_Y_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'Z') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_Z_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'P') && (Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_2nd_char) == ' '))
                            {
                                Subject_analysis_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                         }
                        if (Subject_Analysis_in_School__Retrieved_Students_Line.length() == (subject_index_in_line + 6))
                         {    
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'A'))
                            {
                                Subject_analysis_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'B'))
                            {
                                Subject_analysis_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'C'))
                            {
                                Subject_analysis_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'D'))
                            {
                                Subject_analysis_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'E'))
                            {
                                Subject_analysis_candidates_with_E_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'U'))
                            {
                                Subject_analysis_candidates_with_U_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'W'))
                            {
                                Subject_analysis_candidates_with_W_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'X'))
                            {
                                Subject_analysis_candidates_with_X_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'Y'))
                            {
                                Subject_analysis_candidates_with_Y_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'Z'))
                            {
                                Subject_analysis_candidates_with_Z_in_particular_subject++;
                            }
                            if ((Subject_Analysis_in_School__Retrieved_Students_Line.charAt(grade_1st_char) == 'P'))
                            {
                                Subject_analysis_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                        }      
                      }
                } 
/* ----------------------------------------------------------------------------------------------------------------------------- */     
                                        
			   }
		      }

                 Subject_Analysis_in_School_FileReader.close();

		   } 
		   catch (Exception SCHOOL_PERFORMANCE_in_Subjects_ex_performance_of_student) 
		   {  
			   System.out.println("Error on finding performance of school in subjects----> " + SCHOOL_PERFORMANCE_in_Subjects_ex_performance_of_student); 
		   } 
    
    
    }
    
}
