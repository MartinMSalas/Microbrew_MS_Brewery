package com.mstechnology.msbrewery.web.mappers;

import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class DateMapper {
    public OffsetDateTime asOffsetDateTime(java.sql.Timestamp ts) {
        if (ts != null) {
            return OffsetDateTime.of(ts.toLocalDateTime().getYear(), ts.toLocalDateTime().getMonthValue(), ts.toLocalDateTime().getDayOfMonth(), ts.toLocalDateTime().getHour(), ts.toLocalDateTime().getMinute(), ts.toLocalDateTime().getSecond(), ts.toLocalDateTime().getNano(), OffsetDateTime.now().getOffset());
        } else {
            return null;
        }
    }
    public java.sql.Timestamp asTimestamp(OffsetDateTime offsetDateTime) {
        if (offsetDateTime != null) {
            return java.sql.Timestamp.valueOf(offsetDateTime.atZoneSameInstant(OffsetDateTime.now().getOffset()).toLocalDateTime());
        } else {
            return null;
        }
    }
}
