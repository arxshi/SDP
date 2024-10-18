package proxy.lecture;

public class ProxyVideoLecture implements VideoLecture {
    private String title;
    private String videoUrl;
    private RealVideoLecture realVideoLecture;

    public ProxyVideoLecture(String title, String videoUrl) {
        this.title = title;
        this.videoUrl = videoUrl;
    }

    @Override
    public void getInfo() {
        System.out.println("Video Title (via proxy): " + title);
    }

    @Override
    public void play() {
        if (realVideoLecture == null) {
            realVideoLecture = new RealVideoLecture(title, videoUrl);
        }
        realVideoLecture.play();
    }
}
