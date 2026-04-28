public class Reservation {
    private String reservationId; // 예약id
    private String customerId;    // id (고객id)
    private String roomId;        // 객실id
    private String checkInDate;   // 숙박일자
    private int duration;         // 숙박기간
    private int totalCost;        // 총비용

    public Reservation(String reservationId, String customerId, String roomId, 
                       String checkInDate, int duration, int totalCost) {
        this.reservationId = reservationId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.checkInDate = checkInDate;
        this.duration = duration;
        this.totalCost = totalCost;
    }

    public String getReservationId() { return reservationId; }
    public String getCustomerId() { return customerId; }
    public String getRoomId() { return roomId; }
    public String getCheckInDate() { return checkInDate; }
    public int getDuration() { return duration; }
    public int getTotalCost() { return totalCost; }
}