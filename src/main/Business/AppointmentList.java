package main.Business;

import java.util.ArrayList;

public class AppointmentList {
    private ArrayList<Appointment> list = new ArrayList<>();

    public void addAppointment(Appointment appointment) {
        list.add(appointment);
    }

    public ArrayList<Appointment> getList() {
        return list;
    }
}
