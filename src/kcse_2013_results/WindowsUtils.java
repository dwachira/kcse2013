/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kcse_2013_results;

import java.io.*;

public class WindowsUtils {
  private static final String REGQUERY_UTIL = "reg query ";
  private static final String REGSTR_TOKEN = "REG_SZ";
  private static final String DESKTOP_FOLDER_CMD = REGQUERY_UTIL 
     + "\"HKCU\\Software\\Microsoft\\Windows\\CurrentVersion\\" 
     + "Explorer\\Shell Folders\" /v DESKTOP";

  public WindowsUtils() {}

  public static String getCurrentUserDesktopPath() {
    try {
      Process process = Runtime.getRuntime().exec(DESKTOP_FOLDER_CMD);
      StreamReader reader = new StreamReader(process.getInputStream());

      reader.start();
      process.waitFor();
      reader.join();
      String result = reader.getResult();
      int p = result.indexOf(REGSTR_TOKEN);

      if (p == -1) return null;
      return result.substring(p + REGSTR_TOKEN.length()).trim();
    }
    catch (Exception e) {
      return null;
    }
  }

  /**
   * TEST
   */
  public static void main(String[] args) {
  //  System.out.println("Desktop directory : " 
  //   + getCurrentUserDesktopPath());
  }


  static class StreamReader extends Thread {
    private InputStream is;
    private StringWriter sw;

    StreamReader(InputStream is) {
      this.is = is;
      sw = new StringWriter();
    }

    public void run() {
      try {
        int c;
        while ((c = is.read()) != -1)
          sw.write(c);
        }
        catch (IOException e) { ; }
      }

    String getResult() {
      return sw.toString();
    }
  }
}