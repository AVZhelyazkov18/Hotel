import java.time.LocalDate;
import java.util.List;

public class Reservation {
    public static Hotel hotel;

    private LocalDate reservationDateBegin;
    private LocalDate reservationDateEnd;

    private int reservedRoom;

    private List<Guest> reservedForGuests;


    public void occupyRoom() {
        hotel.getHotelRooms().get(reservedRoom).setAssignedGuests(this.reservedForGuests);
    }

    public void clearRoom() {
        hotel.getHotelRooms().get(reservedRoom).setAssignedGuests(null);
    }

    public Reservation(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setRoomData(LocalDate reservationDateBegin, LocalDate reservationDateEnd, int reservedRoom, List<Guest> reservedFor) {
        this.reservationDateBegin = reservationDateBegin;
        this.reservationDateEnd = reservationDateEnd;
        this.reservedRoom = reservedRoom;
        this.reservedForGuests = reservedFor;
    }

    public LocalDate getReservationDateBegin() {
        return reservationDateBegin;
    }

    public void setReservationDateBegin(LocalDate reservationDateBegin) {
        this.reservationDateBegin = reservationDateBegin;
    }

    public LocalDate getReservationDateEnd() {
        return reservationDateEnd;
    }

    public void setReservationDateEnd(LocalDate reservationDateEnd) {
        this.reservationDateEnd = reservationDateEnd;
    }

    public int getReservedRoom() {
        return reservedRoom;
    }

    public void setReservedRoom(int reservedRoom) {
        this.reservedRoom = reservedRoom;
    }

    public List<Guest> getReservedFor() {
        return reservedForGuests;
    }

    public void setReservedFor(List<Guest> reservedFor) {
        this.reservedForGuests = reservedFor;
    }
}
