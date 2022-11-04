package pl.twojstary.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Soczek {

    @Id
    private Integer id;
    private String nazwa;
    private Integer pojemnosc;

    public Soczek(Integer id, String nazwa, Integer pojemnosc) {
        this.id = id;
        this.nazwa = nazwa;
        this.pojemnosc = pojemnosc;
    }

    public Soczek() {
    }

    public Integer getId() {
        return id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Integer getPojemnosc() {
        return pojemnosc;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setPojemnosc(Integer pojemnosc) {
        this.pojemnosc = pojemnosc;
    }
}
