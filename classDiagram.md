classDiagram
    class 고객 {
        -String 아이디
        -String 암호
        -String 성명
        +고객등록()
        +고객조회(아이디) 고객
        +고객인증(아이디, 암호) boolean
    }

    class 객실 {
        -String 객실아이디
        -int 평수
        -int 객실가격
        +객실등록()
        +객실조회(객실아이디) 객실
        +객실가격조회(객실아이디) int
    }

    class 예약 {
        -String 예약아이디
        -String 아이디
        -String 객실아이디
        -String 숙박일자
        -int 숙박기간
        -int 총비용
        +예약하기(아이디, 객실아이디, 숙박일자, 숙박기간) int
        +예약취소(예약아이디) boolean
        +예약조회(예약아이디) 예약
        -예약아이디생성(아이디, 객실아이디, 숙박일자) String
        -총비용계산(객실가격, 숙박기간) int
    }

    %% 연관 관계
    고객 "1" -- "*" 예약 : 예약하다 >
    객실 "1" -- "*" 예약 : 예약되다 >