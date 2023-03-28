/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author User
 */
public class User {
    protected String Username, Pass;
    
    public User(String Username, String Pass){
        this.Username = Username;
        this.Pass = Pass;
    }

    public String getUsername() {
        return Username;
    }

    public String getPass() {
        return Pass;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }
    
}
