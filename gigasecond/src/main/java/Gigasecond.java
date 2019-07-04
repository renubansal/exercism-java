import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
	
    private final LocalDateTime date;
    private final long GIGA_SEC = (long)Math.pow(10, 9);
	
    Gigasecond(LocalDate moment) {
        this.date = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        this.date = moment;
    }
    
    LocalDateTime getDateTime() {
        return date.plusSeconds(GIGA_SEC);
    }
}

