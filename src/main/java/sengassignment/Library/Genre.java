/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengassignment.Library;

public class Genre {

    private String type;
    
    public Genre(){
        type = "";
    }
    
    public Genre(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
}
