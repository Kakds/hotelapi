package hotelapi.model;
import jakarta.persistence.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String checkInDate;
    private String checkOutDate;

    private Long roomID;

    public Booking(){}

    public Long getId() {
        return id;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public Long getRoomID() {
        return roomID;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
