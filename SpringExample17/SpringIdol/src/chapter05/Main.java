/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

import java.sql.SQLException;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Administrator
 */
public class Main {
    
            public static final ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter05/xmlconfig.xml");
            private static Scanner sc;
    public static void main(String[] args) throws SQLException
    {
           JDBCExcerptSpitter exc = (JDBCExcerptSpitter) ctx.getBean("excerptDAO");
           sc = new Scanner(System.in);
           executeConsole();
        
    }
    
   public static void executeConsole()
   {
          System.out.println("Enter a reference");
          while(!sc.nextLine().equals("quit"))
          {
              Excerpt c = new Excerpt();
              System.out.println("Enter account");
              c.setAccount(sc.nextLine());
              System.out.println("Enter excerpt");
              c.setExcerpt(sc.nextLine());
              System.out.println("Enter link");
              c.setLink(sc.nextLine());
              System.out.println("Enter any comments you'd like to add");
              c.setComments(sc.nextLine());
              c.setDate();
              
              exc.addExcerpt(c);
          }
          System.out.println("end of program");
   }
    
}
