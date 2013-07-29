package logic;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import chapter05.Excerpt;
import chapter05.HibernateExcerptSpitter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author Administrator
 */
public class Main{
    
    public static final ApplicationContext ctx = new ClassPathXmlApplicationContext("chapter05/xmlconfig.xml");
    public static Scanner sc = new Scanner(System.in);
    private HibernateExcerptSpitter exc = new HibernateExcerptSpitter();
    
    public static void main(String[] args) throws SQLException
    {
        Main maine = new Main();
        
    }
    
    public Main()
    {
        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("quit"))
        {
            if(input.equalsIgnoreCase("INSERT"))
                insertEntry();
            else if(input.equalsIgnoreCase("SHOW"))
                showData();
            else if(input.equalsIgnoreCase("DELETE"))
                deleteEntry();
        }
    }
    
    private void insertEntry()
    {
        Excerpt c = exc.makeExcerpt();
        exc.addExcerpt(c);
        
    }
    
    private void showData() {
        
        List<Excerpt> list = exc.getExcerptbyAccountName("AMEER");
        for(Excerpt e: list)
        {
            System.out.println(e.getAccount()+"  :   " + e.getDate()+"   :   "+e.getExcerpt()+"  :   "+e.getComments()+"  :  "+e.getLink());
        }
        
    }
    
    private void deleteEntry() {
        
        
        
    }
    /**
     * Generates a map of all column value pairs for each row on the database. Expects only a single
     * rows
     */
    /*
     * private static void getMappedExcerpt() {
     * Map<String, Object> allExcerpts = exc.getMappedExcerpt();
     * 
     * for(String s : allExcerpts.keySet())
     * {
     * Object obj =  allExcerpts.get(s);
     * System.out.println(s + obj);
     * 
     * }
     * }*/
   
    

}
