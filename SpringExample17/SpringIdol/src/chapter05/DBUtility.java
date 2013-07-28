/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public interface DBUtility {
    
     public boolean createTable() throws SQLException;
     public boolean insertData() throws SQLException;
}
