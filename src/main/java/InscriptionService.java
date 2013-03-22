import java.util.*;;

public interface InscriptionService {

	    /**
	     * Retourne soit Ok, soit KO, suivant les elements passé en paramètres
	     * @param nom
	     * @param prenom
	     * @param email
	     * @param codepostal
	     * @return le type de l'erreur suivant la donnée
	     */
	    public List<inscription> findAllInscriptionPersonnel(
	           String nom,
	           String prenom,
	           String email,
	            int codePostale
	    );
	

}


