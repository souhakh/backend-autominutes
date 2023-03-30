package com.service;

import com.Repository.ReservationRepository;
import com.Repository.VoitureRepository;
import com.entity.Reservation;
import com.entity.Voiture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private ReservationRepository reservationRepository;

    public Reservation saveReservation(Reservation reservation) {
        return this.reservationRepository.save(reservation);
    }

    public Reservation updateReservation(Reservation reservation) {
        return this.reservationRepository.save(reservation);
    }

    public String deleteReservationById(Long id) {
        this.reservationRepository.deleteById(id);
        return "Reservation Supprimé avec succes !";
    }

    public String deleteReservationByObject(Reservation reservation) {
        this.reservationRepository.deleteById(reservation.getIdReservation());
        return "Reservation Supprimé avec succes !";
    }

    public List<Reservation> getAllReservation() {
        return this.reservationRepository.findAll();
    }

    public Reservation  findReservationById(Long id) {
        return this.reservationRepository.findById(id).orElse(null);
    }
}


