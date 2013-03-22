import java.util.List;

import javax.swing.text.Element;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.springframework.ws.server.endpoint.annotation.XPathParam;
@Endpoint
public class InscriptionEndPoint {

    private InscriptionService inscriptionService;

    private static final String NAMESPACE_URI ="http://www.example.org/Inscription";

    public InscriptionEndPoint(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InscriptionRequest")
    @ResponsePayload
    public Element handleInscriptionRequest(@XPathParam("/InscriptionRequest/nom") String nom, @XPathParam("/InscriptionRequest/prenom") String prenom, @XPathParam("/InscriptionRequest/email") String email, @XPathParam("/InscriptionRequest/adresse/codePostale") int code) throws Exception {

        // parse le XML de InscriptionRequest pour extraire les informations de
        // tel que le nom, le prenom, l'adresse mail ainsi que le code postale,ainsi que de creer les objets ad-hoc
        
     String nom1=nom;
     String prenom1=prenom;
     String email1=email;
     int codeP=code;	
        // invoque le service "releveNoteService" pour récupérer les objets recherchés
       List <inscription> evals = inscriptionService.findAllInscriptionPersonnel(nom, prenom, email,code);
      // Transforme en élément XML ad-hoc pour le retour
     
        if (email1!=null) System.out.println("erreur 100: adresse email déja utilisée");
         else if (!(email1.endsWith("@univ-tlse3.fr"))) System.out.println("erreur 110: l'adresse mail est incorrecte");
		
        return null;
        
       //Element elt=XmlHelper.getRootElementFromFileInClasspath("Inscription.xml");
       //return elt;

    }

}
