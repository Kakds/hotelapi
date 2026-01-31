package hotelapi.model;
import jakarta.persistence.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Entity
@Table(name = "guests")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String gmail;

    public Guest(){}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
