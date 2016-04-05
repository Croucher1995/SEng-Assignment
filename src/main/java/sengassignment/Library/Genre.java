/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengassignment.Library;

public class Genre {

    private String type;
    private String genre_description;
    
    public Genre(){
        type = "FICTION";
        genre_description = "A STORY FILLED WITH IMAGINATION";
    }
    
    public Genre(String type){
        this.type = type;
    }
    
    public String getType(){
        return this.type;
    }
    
    public String getGenre_Description(){
        return this.genre_description;
    }
}
