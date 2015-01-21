
package server;

import javax.ejb.Stateless;

/**
 *
 * @author Rakshit
 */
@Stateless
public class HelloBean {

    private String uname;
    private String password;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String sayHello(String name) {
        return "Hello" + name;
    }
    
    public String checkLogin(String uname, String password)
    {
        this.uname = uname;
        this.password = password;
        
        if(uname.equals("admin")&&password.equals("reset"))
        {
            return "Valid User...!!";
        }
        else
        {
            return "Invalid User";
        }
    }
}
