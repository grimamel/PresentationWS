
public class inscription {
	private String nom;
   private  String prenom;
    private String email;
    private int codePostale;
/**
 * creation d'une inscription
 * @param nom
 * @param  prenom
 * @param email
 * @param codePostale
 */
    public inscription(
    		String nom,
    		String prenom,
    		String email, 
    		int codePostale
    		)
    {
    	this.nom=nom;
    	this.prenom=prenom;
    	this.email=email;
    	this.codePostale=codePostale;
    	
    }
    public String getNom(){
    	return nom;
    }
    public String getPrenom(){
    	return prenom;
    }
    public String getEmail(){
    	return email;
    }
    public int getCodePostale(){
    	return codePostale;
    }
    public void setNom(String nom){
    	this.nom=nom;
    }
    public void setPrenom(String prenom){
    	this.prenom=prenom;
    }
    public void setEmail(String email){
    	this.email=email;
    }
    public void setcodePostale(int codePostale){
    	this.codePostale=codePostale;
    }
}
