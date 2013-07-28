
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

import java.sql.PreparedStatement;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Administrator
 */
public class JDBCExcerptSpitter implements ExcerptSpitterDAO {

    
    private JdbcTemplate SpitterTemplate; 
    private PreparedStatement createEntrystmt;
    
   
    public void addExcerpt(Excerpt exc) {
        this.SpitterTemplate.update("INSERT INTO REFERENCE (ACCOUNT, EXCERPT, LINK, COMMENTS, DATE) VALUES (?, ?, ?, ?, ?)", 
                exc.getAccount(), exc.getExcerpt(), exc.getLink(), exc.getComments(), exc.getDate());
    
   }

    public boolean createTable() {
        return false;
    
    }

    public void removeExcerpt() {
    }

    public void updateExcerpt() {
    }

    public void setSpitterTemplate(JdbcTemplate jdbcTemplate) {
 this.SpitterTemplate = jdbcTemplate;    }
    
}
