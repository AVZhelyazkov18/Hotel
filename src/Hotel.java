import Enums.RoomType;

import java.util.List;

public class Hotel {
    private String hotelName;

    private List<Room> hotelRooms;
    public int roomAmount() {
        return hotelRooms.size();
    }

    public void addRoom(int roomNumber, String roomType) {
        hotelRooms.add(new Room(roomNumber, RoomType.valueOf(roomType)));
    }

    public void removeRoom(int roomNumber) {
        for (int i = 0; i < roomAmount(); i++) {
            if (hotelRooms.get(i).getRoomId().equalsIgnoreCase(String.valueOf(roomNumber))) {
                hotelRooms.remove(i);
                return;
            }
        }
    }


}
