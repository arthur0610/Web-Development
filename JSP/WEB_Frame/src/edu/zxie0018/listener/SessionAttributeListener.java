package edu.zxie0018.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import edu.zxie0018.model.User;
import edu.zxie0018.util.SessionManager;


@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {


    public SessionAttributeListener() {
        // TODO Auto-generated constructor stub
    }


    public void attributeAdded(HttpSessionBindingEvent hsbe)  { 
    	if(hsbe.getName().equals("user")) {
    		User user = (User) hsbe.getValue();
    		if(SessionManager.sessionMap.containsKey(user.getUsername())) {
    			HttpSession httpSession = SessionManager.sessionMap.get(user.getUsername());
    			httpSession.removeAttribute("user");
    			SessionManager.sessionMap.remove(user.getUsername());
    		} 		
    		SessionManager.sessionMap.put(user.getUsername(), hsbe.getSession());
    	}
    	
    }


    public void attributeRemoved(HttpSessionBindingEvent hsbe)  { 
         // TODO Auto-generated method stub
    }


    public void attributeReplaced(HttpSessionBindingEvent hsbe)  { 
         // TODO Auto-generated method stub
    }
	
}
