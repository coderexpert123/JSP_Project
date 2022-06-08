/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hand;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Nishant Singh
 */
public class mytaghand extends TagSupport{

    @Override
    public int doStartTag() throws JspException {

        
        try {
            
            JspWriter out=pageContext.getOut();
            out.print("<h1>My Custome Tag</h1>");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    return SKIP_BODY;



    }
    
    
    
    
    
}
