package my20250307home;

import jakarta.persistence.Entity;

@Entity
public record Student(int id, String firstName, String lastNAme) {
    public Student(int id) {
        this(id, "firstName", "lastNAme");
    }
}
