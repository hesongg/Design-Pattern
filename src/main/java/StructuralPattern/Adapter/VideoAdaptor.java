package StructuralPattern.Adapter;

public class VideoAdaptor implements SoundPlayer{
    private VideoPlayer videoPlayer;

    public VideoAdaptor(VideoPlayer videoPlayer){
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String file) {
        videoPlayer.playVideo(file);
    }
}
