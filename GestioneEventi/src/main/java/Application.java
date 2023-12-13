import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import DAO.*;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEventi");

    public static void main(String[] args) {

        PersonaDAO Bianca = new PersonaDAO();
        LocationDAO Cinema = new LocationDAO();
        PartecipazioneDAO pd = new PartecipazioneDAO();
    }
}
