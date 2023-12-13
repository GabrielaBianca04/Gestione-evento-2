package biancaiancu.entities;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="evento")
public class Evento {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="titolo")
    private String titolo;
    @Column(name="dataEvento")
    private LocalDate dataEvento;
    @Column(name="descrizione")
    private String descrizione;
    @Enumerated (EnumType.STRING)
    @Column(name="tipoEvento")
    private tipoEvento tipoEvento;
    @Column(name="numeroMassimoPartecipanti")
    private int numeroMassimoPartecipanti;

    @OneToOne(mappedBy = "evento")
    @OneToMany(mappedBy = "evento")

    private List<Persona> PersonaList;
    private List<Location> LocationList;
    public int getId() {
        return id;
    }
    public String getTitolo() {
        return titolo;
    }
    public LocalDate getDataEvento() {
        return dataEvento;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public tipoEvento getTipoEvento() {
        return tipoEvento;
    }
    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setTipoEvento(tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }
    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }
    public List<Persona> getPersonaList() {
        return PersonaList;
    }

    public void setPersonaList(List<Persona> PersonaList) {
        this.PersonaList = PersonaList;
    }

    public List<Location> LocationList() {
        return LocationList;
    }

    public void LocationList(List<Location> LocationList) {
        this.LocationList = LocationList;
    }
    public Evento(String titolo,LocalDate dataEvento) {
        this.titolo=titolo;
        this.dataEvento=dataEvento;
    }


}
