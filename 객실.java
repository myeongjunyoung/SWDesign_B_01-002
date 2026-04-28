public class Room {
    private String roomId; // 객실id
    private int size;      // 평수
    private int price;     // 객실가격

    public Room(String roomId, int size, int price) {
        this.roomId = roomId;
        this.size = size;
        this.price = price;
    }

    public String getRoomId() { return roomId; }
    public int getSize() { return size; }
    public int getPrice() { return price; }
}