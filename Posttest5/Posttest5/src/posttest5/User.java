/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author User
 */
public final class User {
    protected final String Username, Pass;
    
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
}
