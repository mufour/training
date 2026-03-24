package thursdaytest;

public class Bloc {
    
    private String description;
    
    Bloc(final String description) {
    	this.description = description;
    }
    
    void afficherDescription() {
        System.out.println(this.description);
    }
    
    public String getDescription() {
    	return description;
    }
    
    public void setDescription(String description) {
    	this.description = description;
    }

}