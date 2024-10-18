package proxy;

import proxy.lecture.VideoLecture;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    private String courseName;
    private List<VideoLecture> lectures;

    public OnlineCourse(String courseName) {
        this.courseName = courseName;
        this.lectures = new ArrayList<>();
    }

    public void addLecture(VideoLecture lecture) {
        lectures.add(lecture);
    }

    public void showLectureInfo() {
        System.out.println("Course: " + courseName);
        for (VideoLecture lecture : lectures) {
            lecture.getInfo();
        }
    }

    public void playLecture(int index) {
        if (index >= 0 && index < lectures.size()) {
            lectures.get(index).play();
        } else {
            System.out.println("Invalid lecture index.");
        }
    }

}
