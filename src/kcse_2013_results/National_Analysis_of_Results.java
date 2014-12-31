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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;

 /*************************************************************************
 *                                                                        *
 *                   The various imports: Libraries used in this file     *
 *                                                                        *
 *************************************************************************/

public class National_Analysis_of_Results 
{
    String Analysis_File_name;
 
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    int calculated_number_of_candidates_with_A_plain_in_particular_subject = 0;
    int calculated_number_of_candidates_with_A_minus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_B_plus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_B_plain_in_particular_subject = 0;
    int calculated_number_of_candidates_with_B_minus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_C_plus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_C_plain_in_particular_subject = 0;
    int calculated_number_of_candidates_with_C_minus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_D_plus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_D_plain_in_particular_subject = 0;
    int calculated_number_of_candidates_with_D_minus_in_particular_subject = 0;
    int calculated_number_of_candidates_with_E_in_particular_subject = 0;
    int calculated_number_of_candidates_with_U_in_particular_subject = 0;
    int calculated_number_of_candidates_with_W_in_particular_subject = 0;
    int calculated_number_of_candidates_with_X_in_particular_subject = 0;
    int calculated_number_of_candidates_with_Y_in_particular_subject = 0;
    int calculated_number_of_candidates_with_Z_in_particular_subject = 0;
    int calculated_number_of_candidates_with_P_in_particular_subject = 0;
    int calculated_male_candidates_taking_particular_subject = 0;
    int calculated_female_candidates_taking_particular_subject = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 

public void Instantiate_variables_to_Zero ()
{
     calculated_number_of_candidates_with_A_plain_in_particular_subject = 0;
     calculated_number_of_candidates_with_A_minus_in_particular_subject = 0;
     calculated_number_of_candidates_with_B_plus_in_particular_subject = 0;
     calculated_number_of_candidates_with_B_plain_in_particular_subject = 0;
     calculated_number_of_candidates_with_B_minus_in_particular_subject = 0;
     calculated_number_of_candidates_with_C_plus_in_particular_subject = 0;
     calculated_number_of_candidates_with_C_plain_in_particular_subject = 0;
     calculated_number_of_candidates_with_C_minus_in_particular_subject = 0;
     calculated_number_of_candidates_with_D_plus_in_particular_subject = 0;
     calculated_number_of_candidates_with_D_plain_in_particular_subject = 0;
     calculated_number_of_candidates_with_D_minus_in_particular_subject = 0;
     calculated_number_of_candidates_with_E_in_particular_subject = 0;
     calculated_number_of_candidates_with_U_in_particular_subject = 0;
     calculated_number_of_candidates_with_W_in_particular_subject = 0;
     calculated_number_of_candidates_with_X_in_particular_subject = 0;
     calculated_number_of_candidates_with_Y_in_particular_subject = 0;
     calculated_number_of_candidates_with_Z_in_particular_subject = 0;
     calculated_number_of_candidates_with_P_in_particular_subject = 0;
     calculated_male_candidates_taking_particular_subject = 0;
     calculated_female_candidates_taking_particular_subject = 0;
}
    
public void National_Analysis_of_Results ()
{
    Analysis_File_name = WindowsUtils.getCurrentUserDesktopPath();
    String time_of_access = "" + Calendar.getInstance().getTime();
    Analysis_File_name = Analysis_File_name + "\\KCSE 2013 Analysis - " + time_of_access.replaceAll(":","-");
       
}

public int Total_Number_of_Candidates ()
{

    
    int calculated_number_of_candidates = 0;
    int calculated_number_of_candidates_male = 0;
    int calculated_number_of_candidates_female = 0;
    
    int calculated_number_of_candidates_with_A_plain = 0;
    int calculated_number_of_candidates_with_A_minus = 0;
    int calculated_number_of_candidates_with_B_plus = 0;
    int calculated_number_of_candidates_with_B_plain = 0;
    int calculated_number_of_candidates_with_B_minus = 0;
    int calculated_number_of_candidates_with_C_plus = 0;
    int calculated_number_of_candidates_with_C_plain = 0;
    int calculated_number_of_candidates_with_C_minus = 0;
    int calculated_number_of_candidates_with_D_plus = 0;
    int calculated_number_of_candidates_with_D_plain = 0;
    int calculated_number_of_candidates_with_D_minus = 0;
    int calculated_number_of_candidates_with_E = 0;
    int calculated_number_of_candidates_with_P = 0;
    int calculated_number_of_candidates_with_U = 0;
    int calculated_number_of_candidates_with_W = 0;
    int calculated_number_of_candidates_with_X = 0;
    int calculated_number_of_candidates_with_Y = 0;
    int calculated_number_of_candidates_with_Z = 0;
    
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    int calculated_number_of_male_candidates_with_A_plain = 0;
    int calculated_number_of_male_candidates_with_A_minus = 0;
    int calculated_number_of_male_candidates_with_B_plus = 0;
    int calculated_number_of_male_candidates_with_B_plain = 0;
    int calculated_number_of_male_candidates_with_B_minus = 0;
    int calculated_number_of_male_candidates_with_C_plus = 0;
    int calculated_number_of_male_candidates_with_C_plain = 0;
    int calculated_number_of_male_candidates_with_C_minus = 0;
    int calculated_number_of_male_candidates_with_D_plus = 0;
    int calculated_number_of_male_candidates_with_D_plain = 0;
    int calculated_number_of_male_candidates_with_D_minus = 0;
    int calculated_number_of_male_candidates_with_E = 0;
    int calculated_number_of_male_candidates_with_P = 0;
    int calculated_number_of_male_candidates_with_U = 0;
    int calculated_number_of_male_candidates_with_W = 0;
    int calculated_number_of_male_candidates_with_X = 0;
    int calculated_number_of_male_candidates_with_Y = 0;
    int calculated_number_of_male_candidates_with_Z = 0;
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
    int calculated_number_of_female_candidates_with_A_plain = 0;
    int calculated_number_of_female_candidates_with_A_minus = 0;
    int calculated_number_of_female_candidates_with_B_plus = 0;
    int calculated_number_of_female_candidates_with_B_plain = 0;
    int calculated_number_of_female_candidates_with_B_minus = 0;
    int calculated_number_of_female_candidates_with_C_plus = 0;
    int calculated_number_of_female_candidates_with_C_plain = 0;
    int calculated_number_of_female_candidates_with_C_minus = 0;
    int calculated_number_of_female_candidates_with_D_plus = 0;
    int calculated_number_of_female_candidates_with_D_plain = 0;
    int calculated_number_of_female_candidates_with_D_minus = 0;
    int calculated_number_of_female_candidates_with_E = 0;
    int calculated_number_of_female_candidates_with_P = 0;
    int calculated_number_of_female_candidates_with_U = 0;
    int calculated_number_of_female_candidates_with_W = 0;
    int calculated_number_of_female_candidates_with_X = 0;
    int calculated_number_of_female_candidates_with_Y = 0;
    int calculated_number_of_female_candidates_with_Z = 0;

    try
      {
                 
            FileReader KCSE_FileReader = new FileReader("DB@254.txt");   
            BufferedReader KCSE_Buffered_Reader = new BufferedReader(KCSE_FileReader);
            String Retrieved_Line = null;
            
            while (((Retrieved_Line = KCSE_Buffered_Reader.readLine())!= null))
            {
                if (Retrieved_Line.length() > 0 )
                {
                    if ( Character.isDigit(Retrieved_Line.charAt(0)) &&  Character.isDigit(Retrieved_Line.charAt(1)) &&  Character.isDigit(Retrieved_Line.charAt(2)) &&  (Retrieved_Line.charAt(3) == ' '))
                    {
                        
                        calculated_number_of_candidates++;
                    }
                    if ((Retrieved_Line.charAt(6) == 'F'))
                    {
                        
                        calculated_number_of_candidates_female++;
                    }
                    if ((Retrieved_Line.charAt(6) == 'M'))
                    {
                        
                        calculated_number_of_candidates_male++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_A_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == '-'))
                    {
                        calculated_number_of_candidates_with_A_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '+'))
                    {
                        calculated_number_of_candidates_with_B_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_B_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '-'))
                    {
                        calculated_number_of_candidates_with_B_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '+'))
                    {
                        calculated_number_of_candidates_with_C_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_C_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '-'))
                    {
                        calculated_number_of_candidates_with_C_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '+'))
                    {
                        calculated_number_of_candidates_with_D_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_D_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '-'))
                    {
                        calculated_number_of_candidates_with_D_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'E') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_E++;
                    }    
                    if ((Retrieved_Line.charAt(9) == 'P') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_P++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'U') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_U++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'W') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_W++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'X') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_X++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Y') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_Y++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Z') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_candidates_with_Z++;
                    }
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
           /* Male candidates_with_different_grades */         
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_A_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_A_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_B_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_B_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_B_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_C_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_C_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_C_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_D_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_D_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_D_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'E') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_E++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'P') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_male_candidates_with_P++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'U') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_U++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'W') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_W++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'X') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_X++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Y') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_Y++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Z') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'M'))
                    {
                        calculated_number_of_male_candidates_with_Z++;
                    }         
                    
/* ----------------------------------------------------------------------------------------------------------------------------- */                    

                    
/* ----------------------------------------------------------------------------------------------------------------------------- */ 
           /* Female candidates_with_different_grades */         
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_A_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'A') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_A_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_B_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_B_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'B') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_B_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_C_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_C_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'C') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_C_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '+') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_D_plus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_D_plain++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'D') && (Retrieved_Line.charAt(10) == '-') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_D_minus++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'E') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_E++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'P') && (Retrieved_Line.charAt(10) == ' '))
                    {
                        calculated_number_of_female_candidates_with_P++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'U') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_U++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'W') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_W++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'X') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_X++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Y') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_Y++;
                    }
                    if ((Retrieved_Line.charAt(9) == 'Z') && (Retrieved_Line.charAt(10) == ' ') && (Retrieved_Line.charAt(6) == 'F'))
                    {
                        calculated_number_of_female_candidates_with_Z++;
                    }        
                    
/* ----------------------------------------------------------------------------------------------------------------------------- */                   
                } 
            }  
        KCSE_FileReader.close(); 
        
        Write_into_Analysis_Text_File ("All the Candidates ---> " + calculated_number_of_candidates);
        Write_into_Analysis_Text_File ("   Male Candidates ---> " + calculated_number_of_candidates_female);
        Write_into_Analysis_Text_File (" Female Candidates ---> " + calculated_number_of_candidates_male + "\n");

        Write_into_Analysis_Text_File ("Candidates (Male & Female) with Grade:");
        Write_into_Analysis_Text_File ("                A  ---> " + calculated_number_of_candidates_with_A_plain);
        Write_into_Analysis_Text_File ("                A- ---> " + calculated_number_of_candidates_with_A_minus);
        Write_into_Analysis_Text_File ("                B+ ---> " + calculated_number_of_candidates_with_B_plus);
        Write_into_Analysis_Text_File ("                B  ---> " + calculated_number_of_candidates_with_B_plain);
        Write_into_Analysis_Text_File ("                B- ---> " + calculated_number_of_candidates_with_B_minus);
        Write_into_Analysis_Text_File ("                C+ ---> " + calculated_number_of_candidates_with_C_plus);
        Write_into_Analysis_Text_File ("                C  ---> " + calculated_number_of_candidates_with_C_plain);
        Write_into_Analysis_Text_File ("                C- ---> " + calculated_number_of_candidates_with_C_minus); 
        Write_into_Analysis_Text_File ("                D+ ---> " + calculated_number_of_candidates_with_D_plus);
        Write_into_Analysis_Text_File ("                D  ---> " + calculated_number_of_candidates_with_D_plain);
        Write_into_Analysis_Text_File ("                D- ---> " + calculated_number_of_candidates_with_D_minus);
        Write_into_Analysis_Text_File ("                E  ---> " + calculated_number_of_candidates_with_E);
        Write_into_Analysis_Text_File ("                P  ---> " + calculated_number_of_candidates_with_P);
        Write_into_Analysis_Text_File ("                U  ---> " + calculated_number_of_candidates_with_U);
        Write_into_Analysis_Text_File ("                W  ---> " + calculated_number_of_candidates_with_W);
        Write_into_Analysis_Text_File ("                X  ---> " + calculated_number_of_candidates_with_X);
        Write_into_Analysis_Text_File ("                Y  ---> " + calculated_number_of_candidates_with_Y);
        Write_into_Analysis_Text_File ("                Z  ---> " + calculated_number_of_candidates_with_Z + "\n");
        
        Write_into_Analysis_Text_File ("Male Candidates with Grade:");
        Write_into_Analysis_Text_File ("                A  ---> " + calculated_number_of_male_candidates_with_A_plain);
        Write_into_Analysis_Text_File ("                A- ---> " + calculated_number_of_male_candidates_with_A_minus);
        Write_into_Analysis_Text_File ("                B+ ---> " + calculated_number_of_male_candidates_with_B_plus);
        Write_into_Analysis_Text_File ("                B  ---> " + calculated_number_of_male_candidates_with_B_plain);
        Write_into_Analysis_Text_File ("                B- ---> " + calculated_number_of_male_candidates_with_B_minus);
        Write_into_Analysis_Text_File ("                C+ ---> " + calculated_number_of_male_candidates_with_C_plus);
        Write_into_Analysis_Text_File ("                C  ---> " + calculated_number_of_male_candidates_with_C_plain);
        Write_into_Analysis_Text_File ("                C- ---> " + calculated_number_of_male_candidates_with_C_minus); 
        Write_into_Analysis_Text_File ("                D+ ---> " + calculated_number_of_male_candidates_with_D_plus);
        Write_into_Analysis_Text_File ("                D  ---> " + calculated_number_of_male_candidates_with_D_plain);
        Write_into_Analysis_Text_File ("                D- ---> " + calculated_number_of_male_candidates_with_D_minus);
        Write_into_Analysis_Text_File ("                E  ---> " + calculated_number_of_male_candidates_with_E);
        Write_into_Analysis_Text_File ("                P  ---> " + calculated_number_of_male_candidates_with_P);
        Write_into_Analysis_Text_File ("                U  ---> " + calculated_number_of_male_candidates_with_U);
        Write_into_Analysis_Text_File ("                W  ---> " + calculated_number_of_male_candidates_with_W);
        Write_into_Analysis_Text_File ("                X  ---> " + calculated_number_of_male_candidates_with_X);
        Write_into_Analysis_Text_File ("                Y  ---> " + calculated_number_of_male_candidates_with_Y);
        Write_into_Analysis_Text_File ("                Z  ---> " + calculated_number_of_male_candidates_with_Z + "\n");
        
        Write_into_Analysis_Text_File ("Female Candidates with Grade:");
        Write_into_Analysis_Text_File ("                A  ---> " + calculated_number_of_female_candidates_with_A_plain);
        Write_into_Analysis_Text_File ("                A- ---> " + calculated_number_of_female_candidates_with_A_minus);
        Write_into_Analysis_Text_File ("                B+ ---> " + calculated_number_of_female_candidates_with_B_plus);
        Write_into_Analysis_Text_File ("                B  ---> " + calculated_number_of_female_candidates_with_B_plain);
        Write_into_Analysis_Text_File ("                B- ---> " + calculated_number_of_female_candidates_with_B_minus);
        Write_into_Analysis_Text_File ("                C+ ---> " + calculated_number_of_female_candidates_with_C_plus);
        Write_into_Analysis_Text_File ("                C  ---> " + calculated_number_of_female_candidates_with_C_plain);
        Write_into_Analysis_Text_File ("                C- ---> " + calculated_number_of_female_candidates_with_C_minus); 
        Write_into_Analysis_Text_File ("                D+ ---> " + calculated_number_of_female_candidates_with_D_plus);
        Write_into_Analysis_Text_File ("                D  ---> " + calculated_number_of_female_candidates_with_D_plain);
        Write_into_Analysis_Text_File ("                D- ---> " + calculated_number_of_female_candidates_with_D_minus);
        Write_into_Analysis_Text_File ("                E  ---> " + calculated_number_of_female_candidates_with_E);
        Write_into_Analysis_Text_File ("                P  ---> " + calculated_number_of_female_candidates_with_P);
        Write_into_Analysis_Text_File ("                U  ---> " + calculated_number_of_female_candidates_with_U);
        Write_into_Analysis_Text_File ("                W  ---> " + calculated_number_of_female_candidates_with_W);
        Write_into_Analysis_Text_File ("                X  ---> " + calculated_number_of_female_candidates_with_X);
        Write_into_Analysis_Text_File ("                Y  ---> " + calculated_number_of_female_candidates_with_Y);
        Write_into_Analysis_Text_File ("                Z  ---> " + calculated_number_of_female_candidates_with_Z + "\n");
        
        
        Analyze_Particular_Subject_Performance (101, "English");
        Analyze_Particular_Subject_Performance (102, "Kiswahili");
        Analyze_Particular_Subject_Performance (121, "Mathematics");
        Analyze_Particular_Subject_Performance (122, "Mathematics Alternative B");
        Analyze_Particular_Subject_Performance (231, "Biology");
        Analyze_Particular_Subject_Performance (232, "Physics");
        Analyze_Particular_Subject_Performance (233, "Chemistry");
        Analyze_Particular_Subject_Performance (237, "General Science for Option B");
        Analyze_Particular_Subject_Performance (311, "History & Government");
        Analyze_Particular_Subject_Performance (312, "Geography");
        Analyze_Particular_Subject_Performance (313, "Christian Religious Education");
        Analyze_Particular_Subject_Performance (314, "Islamic Religious Education");
        Analyze_Particular_Subject_Performance (315, "Hindu Religious Education");
        Analyze_Particular_Subject_Performance (441, "Home Science");
        Analyze_Particular_Subject_Performance (442, "Art and Design");
        Analyze_Particular_Subject_Performance (443, "Agriculture");
        Analyze_Particular_Subject_Performance (444, "Woodwork");
        Analyze_Particular_Subject_Performance (445, "Metalwork");
        Analyze_Particular_Subject_Performance (446, "Building Construction");
        Analyze_Particular_Subject_Performance (447, "Power Mechanics");
        Analyze_Particular_Subject_Performance (448, "Electricity");
        Analyze_Particular_Subject_Performance (449, "Drawing and Design");
        Analyze_Particular_Subject_Performance (450, "Aviation Technology");
        Analyze_Particular_Subject_Performance (451, "Computer Studies");
        Analyze_Particular_Subject_Performance (501, "French");
        Analyze_Particular_Subject_Performance (502, "German");
        Analyze_Particular_Subject_Performance (503, "Arabic");
        Analyze_Particular_Subject_Performance (504, "Kenya Sign Language");
        Analyze_Particular_Subject_Performance (511, "Music");
        Analyze_Particular_Subject_Performance (565, "Business Studies");
        Analyze_Particular_Subject_Performance (236, "Biology for the blind");
    
      }     
      catch (Exception ex_total_candidates) 
       {  
           System.out.println("Error inside Total_Number_of_Candidates() ---> " + ex_total_candidates); 
       } 
            
    return calculated_number_of_candidates;
}

public void Write_into_Analysis_Text_File (String Information_to_be_written)
{   try 
     {
       String String_written_into_Text_File = Information_to_be_written +"\n";
       
       File file_Text_File = new File(Analysis_File_name + ".txt" );
 
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
        System.out.println("Error inside Write_into_Analysis_Text_File() ---> " + e); 
      }
}




public void Analyze_Particular_Subject_Performance (int The_Particular_Subject, String Name_of_the_Particular_Subject)
{   try 
     {
            Instantiate_variables_to_Zero ();
            
            FileReader Analyze_Subjects_KCSE_FileReader = new FileReader("DB@254.txt");   
            BufferedReader Analyze_Subjects_KCSE_Buffered_Reader = new BufferedReader(Analyze_Subjects_KCSE_FileReader);
            String Analyze_Subjects_Retrieved_Line = null;
            
            while (((Analyze_Subjects_Retrieved_Line = Analyze_Subjects_KCSE_Buffered_Reader.readLine())!= null))
            {   
                if (Analyze_Subjects_Retrieved_Line.length() > 0 )
                {
                      int subject_index_in_line = Analyze_Subjects_Retrieved_Line.indexOf(" "+ The_Particular_Subject +" ");
                      //System.out.println("Found ---> " + subject_index_in_line + " in line "+ buffered_reader_line_number);
                      if (subject_index_in_line!=-1)//&& (Analyze_Subjects_Retrieved_Line.length() > (subject_index_in_line + 5) ))
                      {
                          int grade_in_subject_index_in_line = subject_index_in_line + 4;
                          int grade_1st_char = grade_in_subject_index_in_line + 1;
                          int grade_2nd_char = grade_in_subject_index_in_line + 2;
                          //String actual_grade_in_subject = ""+Analyze_Subjects_Retrieved_Line.charAt(grade_in_subject_index_in_line+1) + Analyze_Subjects_Retrieved_Line.charAt(grade_in_subject_index_in_line+2);

                            if ((Analyze_Subjects_Retrieved_Line.charAt(6) == 'F'))
                            { 
                                calculated_female_candidates_taking_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(6) == 'M'))
                            {
                                calculated_male_candidates_taking_particular_subject++;
                            }
                            
                          if (Analyze_Subjects_Retrieved_Line.length() > (subject_index_in_line + 6))
                            {    
                               
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'A') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'A') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '-'))
                            {
                                calculated_number_of_candidates_with_A_minus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'B') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '+'))
                            {
                                calculated_number_of_candidates_with_B_plus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'B') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'B') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '-'))
                            {
                                calculated_number_of_candidates_with_B_minus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'C') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '+'))
                            {
                                calculated_number_of_candidates_with_C_plus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'C') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'C') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '-'))
                            {
                                calculated_number_of_candidates_with_C_minus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'D') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '+'))
                            {
                                calculated_number_of_candidates_with_D_plus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'D') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'D') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == '-'))
                            {
                                calculated_number_of_candidates_with_D_minus_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'E') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_E_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'U') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_U_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'W') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_W_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'X') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_X_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'Y') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_Y_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'Z') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_Z_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'P') && (Analyze_Subjects_Retrieved_Line.charAt(grade_2nd_char) == ' '))
                            {
                                calculated_number_of_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                         }
                        if (Analyze_Subjects_Retrieved_Line.length() == (subject_index_in_line + 6))
                         {    
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 

                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'A'))
                            {
                                calculated_number_of_candidates_with_A_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'B'))
                            {
                                calculated_number_of_candidates_with_B_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'C'))
                            {
                                calculated_number_of_candidates_with_C_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'D'))
                            {
                                calculated_number_of_candidates_with_D_plain_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'E'))
                            {
                                calculated_number_of_candidates_with_E_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'U'))
                            {
                                calculated_number_of_candidates_with_U_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'W'))
                            {
                                calculated_number_of_candidates_with_W_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'X'))
                            {
                                calculated_number_of_candidates_with_X_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'Y'))
                            {
                                calculated_number_of_candidates_with_Y_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'Z'))
                            {
                                calculated_number_of_candidates_with_Z_in_particular_subject++;
                            }
                            if ((Analyze_Subjects_Retrieved_Line.charAt(grade_1st_char) == 'P'))
                            {
                                calculated_number_of_candidates_with_P_in_particular_subject++;
                            }
        /* ----------------------------------------------------------------------------------------------------------------------------- */ 
                        }      
                      }
                } 
                
            }  
        Analyze_Subjects_KCSE_FileReader.close();
/*	Write_into_Analysis_Text_File ("Subject: "+ Name_of_the_Particular_Subject + " ("+The_Particular_Subject + ")");
        Write_into_Analysis_Text_File ("Candidates (Male & Female) with Grade:");
        Write_into_Analysis_Text_File ("                A  ---> " + calculated_number_of_candidates_with_A_plain_in_particular_subject);
        Write_into_Analysis_Text_File ("                A- ---> " + calculated_number_of_candidates_with_A_minus_in_particular_subject);
        Write_into_Analysis_Text_File ("                B+ ---> " + calculated_number_of_candidates_with_B_plus_in_particular_subject);
        Write_into_Analysis_Text_File ("                B  ---> " + calculated_number_of_candidates_with_B_plain_in_particular_subject);
        Write_into_Analysis_Text_File ("                B- ---> " + calculated_number_of_candidates_with_B_minus_in_particular_subject);
        Write_into_Analysis_Text_File ("                C+ ---> " + calculated_number_of_candidates_with_C_plus_in_particular_subject);
        Write_into_Analysis_Text_File ("                C  ---> " + calculated_number_of_candidates_with_C_plain_in_particular_subject);
        Write_into_Analysis_Text_File ("                C- ---> " + calculated_number_of_candidates_with_C_minus_in_particular_subject); 
        Write_into_Analysis_Text_File ("                D+ ---> " + calculated_number_of_candidates_with_D_plus_in_particular_subject);
        Write_into_Analysis_Text_File ("                D  ---> " + calculated_number_of_candidates_with_D_plain_in_particular_subject);
        Write_into_Analysis_Text_File ("                D- ---> " + calculated_number_of_candidates_with_D_minus_in_particular_subject);
        Write_into_Analysis_Text_File ("                E  ---> " + calculated_number_of_candidates_with_E_in_particular_subject);
        Write_into_Analysis_Text_File ("                P  ---> " + calculated_number_of_candidates_with_P_in_particular_subject);
        Write_into_Analysis_Text_File ("                U  ---> " + calculated_number_of_candidates_with_U_in_particular_subject);
        Write_into_Analysis_Text_File ("                W  ---> " + calculated_number_of_candidates_with_W_in_particular_subject);
        Write_into_Analysis_Text_File ("                X  ---> " + calculated_number_of_candidates_with_X_in_particular_subject);
        Write_into_Analysis_Text_File ("                Y  ---> " + calculated_number_of_candidates_with_Y_in_particular_subject);
        Write_into_Analysis_Text_File ("            Male   ---> " + calculated_male_candidates_taking_particular_subject);
        Write_into_Analysis_Text_File ("            Female ---> " + calculated_female_candidates_taking_particular_subject); 
        Write_into_Analysis_Text_File ("            Total  ---> " + (calculated_number_of_candidates_with_A_plain_in_particular_subject + calculated_number_of_candidates_with_A_minus_in_particular_subject + calculated_number_of_candidates_with_B_plus_in_particular_subject + calculated_number_of_candidates_with_B_plain_in_particular_subject + calculated_number_of_candidates_with_B_minus_in_particular_subject + calculated_number_of_candidates_with_C_plus_in_particular_subject + calculated_number_of_candidates_with_C_plain_in_particular_subject + calculated_number_of_candidates_with_C_minus_in_particular_subject + calculated_number_of_candidates_with_D_plus_in_particular_subject + calculated_number_of_candidates_with_D_plain_in_particular_subject + calculated_number_of_candidates_with_D_minus_in_particular_subject + calculated_number_of_candidates_with_E_in_particular_subject + calculated_number_of_candidates_with_U_in_particular_subject + calculated_number_of_candidates_with_W_in_particular_subject + calculated_number_of_candidates_with_X_in_particular_subject + calculated_number_of_candidates_with_Y_in_particular_subject + calculated_number_of_candidates_with_Z_in_particular_subject + calculated_number_of_candidates_with_P_in_particular_subject) + "\n\n");
*/
     } 
     catch (Exception excep) 
      {
	//excep.printStackTrace();
        System.out.println("Error inside Analyze_Particular_Subject_Performance() ---> " + excep); 
      }
}






    public static void main(String[] args) 
    
    {
        National_Analysis_of_Results  pupils_kcse = new National_Analysis_of_Results();
        pupils_kcse.National_Analysis_of_Results ();
        pupils_kcse.Total_Number_of_Candidates();
    
    }
}
