package sengassignment.Library;
import static sengassignment.Library.Genre.*;

public interface Filter {
    static String ftitle = "";
    static String fauthor = ""; 
    static Genre fgenre = Default;
    static int fyear = 0;
    static int fedition= 0;  
    
    void setFTitle(String ftitle);
    void setFAuthor(String fauthor);
    void setFGenre(Genre fgenre);
    void setFYear(int fyear);
    void setFEdition(int fedition);
    
    String getFTitle();
    String getFAutor();
    String getFGenre();
    String getFYear();
    String getFEdition();
}
