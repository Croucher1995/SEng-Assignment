package sengassignment.Library.Filters;
import sengassignment.Library.Genre;
import static sengassignment.Library.Genre.*;

public class Filter {
    private String ftitle;
    private String fauthor; 
    private Genre fgenre;
    private int fyear;
    private int fedition  ;
    
    public Filter(){
        ftitle = "";
        fauthor = ""; 
        fgenre = Default;
        fyear = 0;
        fedition= 0;  
    }
    
    void setFTitle(String ftitle){
        this.ftitle = ftitle; 
    }
    void setFAuthor(String fauthor){
        this.fauthor = fauthor; 
    }
    void setFGenre(Genre fgenre){
        this.fgenre = fgenre; 
    }
    void setFYear(int fyear){
        this.fyear = fyear; 
    }
    void setFEdition(int fedition){
        this.fedition = fedition; 
    }
    
    String getFTitle(){
        return this.ftitle;
    }
    String getFAutor(){
        return this.fauthor;
    }
    Genre getFGenre(){
        return this.fgenre;
    }
    int getFYear(){
        return this.fyear;
    }
    int getFEdition(){
        return this.fedition;
    }
}
