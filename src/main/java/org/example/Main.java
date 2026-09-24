static void main() {
    // Datum
    System.out.println("LocalDate: " + LocalDate.now());
    // Datum + cas
    System.out.println("LocalDateTime: " + LocalDateTime.now());
    System.out.println("Instant: " + Instant.now());
    System.out.println("OffsetDateTime: " + OffsetDateTime.now());
    System.out.println("ZoneDateTime: " + ZonedDateTime.now());
    // Cas
    System.out.println("LocalTime: " + LocalTime.now());
}
