/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

import org.hibernate.Session;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Administrator
 */
public interface ExcerptSpitterDAO {
    
    public Session currentSession();
    public void addExcerpt(Excerpt exc);
    public boolean createTable();
    public void removeExcerpt(Excerpt exc);
    public void updateExcerpt(Excerpt exc);
    
}
