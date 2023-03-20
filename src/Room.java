import Enums.RoomType;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomId;
    private short roomAmount;

    private RoomType roomType;
    private List<Guest> assignedGuests;
    public Room(int roomNumber, RoomType roomType) {
        roomId = String.valueOf(roomNumber);
        this.roomType = roomType;
        assignedGuests = new ArrayList<>();
    }
    public void assignRoomToGuest(Guest guest) {
        assignedGuests.add(guest);
    }
    public void removeGuestFromRoom(Guest guest) {
        assignedGuests.remove(guest);
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public short getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(short roomAmount) {
        this.roomAmount = roomAmount;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<Guest> getAssignedGuests() {
        return assignedGuests;
    }

    public void setAssignedGuests(List<Guest> assignedGuests) {
        this.assignedGuests = assignedGuests;
    }
}
