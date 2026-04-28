```mermaid
classDiagram
    class Customer {
        -String id
        -String password
        -String name
        +registerCustomer()
        +viewCustomer(id) Customer
        +authenticate(id, password) boolean
    }

    class Room {
        -String roomId
        -int size
        -int price
        +registerRoom()
        +viewRoom(roomId) Room
        +getPrice(roomId) int
    }

    class Reservation {
        -String reservationId
        -String id
        -String roomId
        -String stayDate
        -int stayDuration
        -int totalCost
        +makeReservation(id, roomId, stayDate, stayDuration) int
        +cancelReservation(reservationId) boolean
        +viewReservation(reservationId) Reservation
        -generateReservationId(id, roomId, stayDate) String
        -calculateTotalCost(price, stayDuration) int
    }

    %% 연관 관계
    Customer "1" -- "*" Reservation : makes >
    Room "1" -- "*" Reservation : is booked for >
    ```