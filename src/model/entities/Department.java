package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable {
    private int Id;
    private String name;

    public Department(){

    }

    public Department(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return getId() == that.getId() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public String toString() {
        return "Department{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }

}
