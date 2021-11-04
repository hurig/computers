package hu.computersSimpleAPI.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Computer {
    @Id
    @GeneratedValue
    private int serial;
    private String manufacture;
    private int ram;
    private String madein;

    public Computer(int serial, String manufacture, int ram, String madein) {
        this.serial = serial;
        this.manufacture = manufacture;
        this.ram = ram;
        this.madein = madein;
    }

    public Computer() {
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serial=" + serial +
                ", manufacture='" + manufacture + '\'' +
                ", ram=" + ram +
                ", madein='" + madein + '\'' +
                '}';
    }
}
