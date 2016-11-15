/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the_wall;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Mexicano implements Serializable {
     private static final long SerialVersionUID=637L;
     protected String Name;
     protected String Nacional;
     protected String BirthDate;
     protected String Race;
     protected String Country;
     protected boolean Departed;

    public Mexicano(String Name, String Nacional, String BirthDate, String Race, String Country, boolean Departed) {
        this.Name = Name;
        this.Nacional = Nacional;
        this.BirthDate = BirthDate;
        this.Race = Race;
        this.Country = Country;
        this.Departed = Departed;
    }

    public Mexicano() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNacional() {
        return Nacional;
    }

    public void setNacional(String Nacional) {
        this.Nacional = Nacional;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String Race) {
        this.Race = Race;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public boolean isDeparted() {
        return Departed;
    }

    public void setDeparted(boolean Departed) {
        this.Departed = Departed;
    }

    @Override
    public String toString() {
        return "Mexicano{" + "Name=" + Name + ", Nacional=" + Nacional + ", BirthDate=" + BirthDate + ", Race=" + Race + ", Country=" + Country + ", Departed=" + Departed + '}';
    }
     
     
}
