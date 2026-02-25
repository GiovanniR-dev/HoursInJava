public class teste1 {
    public static void main(String[] args) {
        LocalDate d04= LocalDate.parse("2022-07-20");
        LocalDateTime d05= LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d6= Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1= LocalDate.ofInstant(d6,ZoneId.systemDefault());
        LocalDate r2= LocalDate.ofInstant(d6,ZoneId.of("Portugal"));
        LocalDateTime r3=LocalDateTime.ofInstant(d6,ZoneId.systemDefault());
        LocalDateTime r4=LocalDateTime.ofInstant(d6,ZoneId.of("Asia/Tokyo"));

        System.out.println(r1 );
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

      



    }

}
2022-07-19
2022-07-20
2022-07-19T22:30:26
2022-07-20T10:30:26
