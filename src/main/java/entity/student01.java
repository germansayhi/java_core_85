package entity;

import java.util.Objects;

public class student01 <N extends Number> {
    private N id;
    private String name;

    public student01(N id, String name) {
        this.id = id;
        this.name = name;
    }

    public N getId() {
        return id;
    }

    public void setId(N id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student01{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student01<?> student01)) return false;
        return Objects.equals(name, student01.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
