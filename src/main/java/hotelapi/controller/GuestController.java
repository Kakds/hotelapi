package hotelapi.controller;
import hotelapi.model.Guest;
import hotelapi.repository.GuestRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guests")
public class GuestController {

    private final GuestRepository guestRepository;

    public GuestController(GuestRepository guestRepository){
        this.guestRepository=guestRepository;
    }

    @GetMapping
    public List<Guest> getAllGuests(){return guestRepository.findAll();}

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest){return guestRepository.save(guest);}
}
