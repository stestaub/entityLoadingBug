/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ce.entityloadingbug.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

/**
 *
 * @author stefan
 */
@Entity
@DiscriminatorValue("derived")
public class DerivedEntity extends BaseEntity {
    
    /**
     * The problem code
     */
    private void theProblemCode() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        try {
            db = dbf.newDocumentBuilder();
            
            // This is the line that makes Problems!!
            Document doc = db.parse("");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
