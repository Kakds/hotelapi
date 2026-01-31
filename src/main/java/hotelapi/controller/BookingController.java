package hotelapi.controller;
import hotelapi.model.Booking;
import hotelapi.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }

    @GetMapping
    public List<Booking> getAllBookings(){return bookingRepository.findAll();}

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking){return bookingRepository.save(booking);}
}
