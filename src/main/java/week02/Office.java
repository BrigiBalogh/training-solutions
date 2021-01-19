package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        System.out.println("printNames");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }

    }

    public void printNamesReverse() {
        System.out.println("printNamesReverse");
        for (int i = meetingRooms.size()-1; i >= 0; i--) {
            System.out.println(meetingRooms.get(i));
        }

    }

    public void printEventNames() {
        System.out.println("printEventNames");
        for (int i = 0; i < meetingRooms.size(); i += 2 ) {
            System.out.println(meetingRooms.get(i));
        }

    }

    public void printAreas() {
        System.out.println("printAreas");
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth()
                    + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea() + ")");
        }
    }

    public void printMeetingRoomsWithNames(String name) {
        System.out.println("printMeetingRoomsWithNames");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth()
                        + "*" + meetingRoom.getLength() + "=" + meetingRoom.getArea() + ")");
            }
        }

    }
    public void printMeetingRoomsContains(String part) {
        System.out.println("printAreasLargerThan");
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equalsIgnoreCase().contains()) {
                System.out.println(meetingRoom.getName() + "(" + meetingRoom.getWidth()
                        + "*" + meetingRoom.getLength() + "" + meetingRoom.getArea() + ")");
            }
        }
    }

    public void printAreasLargerThan(int area) {
        System.out.println("printAreasLargerThan");
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
