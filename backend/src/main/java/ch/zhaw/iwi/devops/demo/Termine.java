package ch.zhaw.iwi.devops.demo;


public class Termine {

    private int id;
    private String title;
    private String description;
    private String datumvon;
    private String datumbis;
   

    public Termine(){
    }
    
    public Termine(int id, String title, String description, String datumvon, String datumbis) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datumvon = datumvon;
        this.datumbis = datumbis;
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
    
    public String getDatumvon() {
        return datumvon;
    }

    public String getDatumbis() {
        return datumbis;
    }
    
}