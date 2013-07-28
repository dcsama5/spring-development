/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Administrator
 */
public interface ExcerptSpitterDAO {
    
    public void setSpitterTemplate(JdbcTemplate jdbcTemplate);
    public void addExcerpt(Excerpt exc);
    public boolean createTable();
    public void removeExcerpt();
    public void updateExcerpt();
    
}
