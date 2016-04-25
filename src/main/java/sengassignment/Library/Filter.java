package sengassignment.Library;
import java.util.ArrayList;
import sengassignment.Library.Genre;
import static sengassignment.Library.Genre.*;

public class Filter {
    private String ftitle;
    private String fauthor; 
    private Genre fgenre;
    private int fyear;
    private int fedition;
    
    private ArrayList<Filter> filters;
    
    public Filter(){
        ftitle = "";
        fauthor = ""; 
        fgenre = Default;
        fyear = 0;
        fedition= 0;  
        filters = new ArrayList<Filter>();
    }
    
    public void add(Filter f){
        filters.add(f);
    }
    
    public void remove(Filter f){
        filters.remove(f);
    }
    
    public ArrayList<Filter> getFilters(){
        return filters;
    }
   
    public void setFTitle(String ftitle){
        this.ftitle = ftitle; 
    }    
    public void setFAuthor(String fauthor){
        this.fauthor = fauthor; 
    }
    public void setFGenre(Genre fgenre){
        this.fgenre = fgenre; 
    }
    public void setFYear(int fyear){
        this.fyear = fyear; 
    }
    public void setFEdition(int fedition){
        this.fedition = fedition; 
    }
    
    public String getFTitle(){
        return this.ftitle;
    }
    public String getFAuthor(){
        return this.fauthor;
    }
    public Genre getFGenre(){
        return this.fgenre;
    }
    public int getFYear(){
        return this.fyear;
    }
    public int getFEdition(){
        return this.fedition;
    }
}
