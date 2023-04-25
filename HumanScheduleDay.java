public class HumanScheduleDay {

    DayOfWeek scheduleDay;
    Task scheduleTask;

    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    enum Task{
        Eat,
        Sleep,
        Rest,
        Study,
        Workout,
        Cook,
        Pray
    }
    HumanScheduleDay (DayOfWeek day, Task task){
        scheduleDay = day;
        scheduleTask = task;
    }

}

