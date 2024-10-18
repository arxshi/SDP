package proxy.lecture;

public class RealVideoLecture implements VideoLecture {
    private String title;
    private String videoUrl;

    public RealVideoLecture(String title, String videoUrl) {
        this.title = title;
        this.videoUrl = videoUrl;
        loadVideo();
    }

    private void loadVideo() {
        System.out.println("Loading video from URL: " + videoUrl);
        try {
            // simulate loading time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing video: " + title);
    }
}
