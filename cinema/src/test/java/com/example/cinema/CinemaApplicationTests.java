package com.example.cinema;
import com.example.cinema.pojo.entity.*;
import com.example.cinema.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
class CinemaApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void saveCustomerTest() {
		Customer customer = new Customer("Jon", "Java", "jonjava@gmail", 21);
		customerRepository.save(customer);
		assertNotNull(customerRepository.findCustomerByName("Jon"));
	}

	@Test
	public void updateCustomerTest(){
		Customer customer= customerRepository.findCustomerByName("Aurora");
		customer.setEmail("auroratopojani@gmail.com");
		customerRepository.save(customer);
		assertEquals("auroratopojani@gmail.com", customer.getEmail());
	}

	@Test
	public void deleteCustomerTest(){
		Customer customer= customerRepository.findCustomerByName("Jon");
		customerRepository.delete(customer);
		assertNull(customerRepository.findCustomerByName("Jon"));
	}

	@Autowired
	MovieRepository movieRepository;

	@Test
	public void saveMovieTest(){
		Movie movie=new Movie("Spiderman: No Way Home", "Action");
		movieRepository.save(movie);
		assertNotNull(movie);
	}

	@Test
	public void updateMovieTest(){
		Movie movie= movieRepository.findMovieByName("Spiderman: No Way Home");
		movie.setCategory("Action/Adventure");
		movieRepository.save(movie);
		assertNotEquals("Action", movie.getCategory());
	}

	@Test
	public void deleteMovieTest(){
		Movie movie= movieRepository.findMovieByName("Spiderman: No Way Home");
		movieRepository.delete(movie);
		assertNull(movieRepository.findMovieByName("Spiderman: No Way Home"));
	}

	@Autowired
	AuditoriumRepository auditoriumRepository;

	@Test
	public void saveAuditoriumTest(){
		Auditorium auditorium=new Auditorium(8, 75);
		auditoriumRepository.save(auditorium);
		assertNotNull(auditorium);
	}

	@Test
	public void updateAuditoriumTest(){
		Auditorium auditorium= auditoriumRepository.findAuditoriumByNr(8);
		auditorium.setCapacity(80);
		auditoriumRepository.save(auditorium);
		assertEquals("80",auditorium.getCapacity().toString());
	}

	@Test
	public void deleteAuditoriumTest(){
		Auditorium auditorium= auditoriumRepository.findAuditoriumByNr(8);
		auditoriumRepository.delete(auditorium);
		assertNull(auditoriumRepository.findAuditoriumByNr(8));
	}

	@Autowired
	SeatRepository seatRepository;

	@Test
	public void saveSeatTest(){
		Seat seat=new Seat(67);
		seatRepository.save(seat);
		assertNotNull(seat);
	}

	@Test
	public void updateSeatTest(){
		Seat seat= seatRepository.findSeatByNumber(67);
		seat.setNumber(68);
		seatRepository.save(seat);
		assertEquals("68",seat.getNumber().toString());
	}

	@Test
	public void deleteSeatTest(){
		Seat seat= seatRepository.findSeatByNumber(68);
		seatRepository.delete(seat);
		assertNull(seatRepository.findSeatByNumber(68));
	}

	@Autowired
	TicketRepository ticketRepository;

	@Test
	public void saveTicketTest(){
		Ticket ticket=new Ticket("128619", null, null,25.0 );
		ticketRepository.save(ticket);
		assertNotNull(ticket);
	}

	@Test
	public void updateTicketTest(){
		Ticket ticket=ticketRepository.findTicketById("128619");
		ticket.setFee(15);
		ticketRepository.save(ticket);
		assertNotEquals(25.0, ticket.getFee());
	}

	@Test
	public void deleteTicketTest(){
		Ticket ticket=ticketRepository.findTicketById("128619");
		ticketRepository.delete(ticket);
		assertNull(ticketRepository.findTicketById("128619"));
	}
}
