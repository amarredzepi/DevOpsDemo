package ch.zhaw.iwi.devops.demo;


public class Termine {

    private int id;
    private String title;
    private String description;
    private String datum_von;
    private String datum_bis;
   

    public Termine(){
    }
    
    public Termine(int id, String title, String description, String datum_von, String datum_bis) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datum_von = datum_von;
        this.datum_bis = datum_bis;
    }

    public int getId() {
        return id;
    }    

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
    public String getDatum_von() {
        return datum_von;
    }
    public String getDatum_bis() {
        return datum_bis;
    }
    
}