package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }

    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i));
        }

    }

    public void printEventNames() {
        for (int i = 0; i < meetingRooms.size(); i+2 ) {
            System.out.println(meetingRooms);
        }

    }

    public printAreas() {

    }

    public void printMeetingRoomsWithNames(String name) {

    }
    public void printMeetingRoomsContains(String part) {

    }

    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth()
                + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea() + ")");
            }

        }

    }

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    @Override
    public String toString() {
        return "Office{" +
                "meetingRooms=" + meetingRooms +
                '}';
    }
}
