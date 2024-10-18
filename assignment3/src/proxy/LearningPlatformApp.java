package proxy;

import proxy.lecture.ProxyVideoLecture;

public class LearningPlatformApp {
    public static void main(String[] args) {

        OnlineCourse course = new OnlineCourse("Design Patterns in Java");

        course.addLecture(new ProxyVideoLecture("Introduction to Design Patterns", "http://video1.com"));
        course.addLecture(new ProxyVideoLecture("The Proxy Pattern", "http://video2.com"));
        course.addLecture(new ProxyVideoLecture("The Singleton Pattern", "http://video3.com"));

        course.showLectureInfo();

        System.out.println("\nPlaying the second lecture (The Proxy Pattern):");
        course.playLecture(1);

        System.out.println("\nPlaying the first lecture (Introduction to Design Patterns):");
        course.playLecture(0);
    }

}
