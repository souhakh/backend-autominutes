package com.Controller;

import com.entity.Reservation;
import com.entity.Voiture;
import com.service.ReservationService;
import com.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/Reservation")
@CrossOrigin("*")
public class ReservationController {
    @Autowired
    public ReservationService reservationService;

    @RequestMapping(value="/ajouterReservation",method= RequestMethod.POST,headers="accept=Application/json")
    public Reservation save(@RequestBody Reservation reservation) {
        try {
            reservation=this.reservationService.saveReservation(reservation);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return reservation;

    }

    @RequestMapping(value="/getAllReservation",method= RequestMethod.GET,headers="accept=Application/json")
    public List<Reservation> getAll() {
        List<Reservation> reservations=new ArrayList<>();
        try {
            reservations=this.reservationService.getAllReservation();
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return reservations;

    }

    @RequestMapping(value="/updateReservation",method= RequestMethod.PUT,headers="accept=Application/json")
    public Reservation update(@RequestBody Reservation reservation) {
        try {
            reservation=this.reservationService.updateReservation(reservation);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return reservation;

    }

    @RequestMapping(value = "/deleteReservation", method =RequestMethod.DELETE)
    public String DeleteByObject(@RequestBody Reservation reservation){
        return this.reservationService.deleteReservationByObject(reservation);
    }


    @RequestMapping(value = "/deleteReservation/{id}", method =RequestMethod.DELETE)
    public String DeleteById(@PathVariable("id") long id){
        return this.reservationService.deleteReservationById(id);
    }



    @RequestMapping(value = "/findReservationById/{id}", method =RequestMethod.GET)
        public Reservation findById(@PathVariable("id") long id){
        return this.reservationService.findReservationById(id);
    }

}
