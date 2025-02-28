package filb.webdev.trackyourrun.run;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;

import java.time.LocalDateTime;

public record Run(
        Integer id,
        @NotEmpty
        String title,
        LocalDateTime startedOn,
        LocalDateTime finishedOn,
        @Positive
        Integer miles,
        Location location
) {

    public Run {
        if(!finishedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("Finished On must be after Started On");
        }
    }
}
