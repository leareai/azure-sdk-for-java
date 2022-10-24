// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.DailyRetentionFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.Day;
import com.azure.resourcemanager.recoveryservicesbackup.models.DayOfWeek;
import com.azure.resourcemanager.recoveryservicesbackup.models.MonthlyRetentionSchedule;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDuration;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionDurationType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionScheduleFormat;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeekOfMonth;
import com.azure.resourcemanager.recoveryservicesbackup.models.WeeklyRetentionFormat;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MonthlyRetentionScheduleTests {
    @Test
    public void testDeserialize() {
        MonthlyRetentionSchedule model =
            BinaryData
                .fromString(
                    "{\"retentionScheduleFormatType\":\"Invalid\",\"retentionScheduleDaily\":{\"daysOfTheMonth\":[{\"date\":340863806,\"isLast\":false},{\"date\":1072785835,\"isLast\":true}]},\"retentionScheduleWeekly\":{\"daysOfTheWeek\":[\"Friday\",\"Thursday\",\"Friday\",\"Tuesday\"],\"weeksOfTheMonth\":[\"Invalid\"]},\"retentionTimes\":[\"2021-03-04T06:20:36Z\",\"2021-08-12T09:47:08Z\",\"2021-06-17T11:55:56Z\",\"2021-10-31T16:43:41Z\"],\"retentionDuration\":{\"count\":820090734,\"durationType\":\"Weeks\"}}")
                .toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.retentionScheduleFormatType());
        Assertions.assertEquals(340863806, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.INVALID, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-04T06:20:36Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(820090734, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.retentionDuration().durationType());
    }

    @Test
    public void testSerialize() {
        MonthlyRetentionSchedule model =
            new MonthlyRetentionSchedule()
                .withRetentionScheduleFormatType(RetentionScheduleFormat.INVALID)
                .withRetentionScheduleDaily(
                    new DailyRetentionFormat()
                        .withDaysOfTheMonth(
                            Arrays
                                .asList(
                                    new Day().withDate(340863806).withIsLast(false),
                                    new Day().withDate(1072785835).withIsLast(true))))
                .withRetentionScheduleWeekly(
                    new WeeklyRetentionFormat()
                        .withDaysOfTheWeek(
                            Arrays.asList(DayOfWeek.FRIDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY, DayOfWeek.TUESDAY))
                        .withWeeksOfTheMonth(Arrays.asList(WeekOfMonth.INVALID)))
                .withRetentionTimes(
                    Arrays
                        .asList(
                            OffsetDateTime.parse("2021-03-04T06:20:36Z"),
                            OffsetDateTime.parse("2021-08-12T09:47:08Z"),
                            OffsetDateTime.parse("2021-06-17T11:55:56Z"),
                            OffsetDateTime.parse("2021-10-31T16:43:41Z")))
                .withRetentionDuration(
                    new RetentionDuration().withCount(820090734).withDurationType(RetentionDurationType.WEEKS));
        model = BinaryData.fromObject(model).toObject(MonthlyRetentionSchedule.class);
        Assertions.assertEquals(RetentionScheduleFormat.INVALID, model.retentionScheduleFormatType());
        Assertions.assertEquals(340863806, model.retentionScheduleDaily().daysOfTheMonth().get(0).date());
        Assertions.assertEquals(false, model.retentionScheduleDaily().daysOfTheMonth().get(0).isLast());
        Assertions.assertEquals(DayOfWeek.FRIDAY, model.retentionScheduleWeekly().daysOfTheWeek().get(0));
        Assertions.assertEquals(WeekOfMonth.INVALID, model.retentionScheduleWeekly().weeksOfTheMonth().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-03-04T06:20:36Z"), model.retentionTimes().get(0));
        Assertions.assertEquals(820090734, model.retentionDuration().count());
        Assertions.assertEquals(RetentionDurationType.WEEKS, model.retentionDuration().durationType());
    }
}