package _13Inheritance_Multiple;

public class smartPhone implements phone, camera, musicPlayer {
    @Override
    public void makeCall() {
        System.out.println("make a call");
    }

    @Override
    public void endCall() {
        System.out.println("end call");
    }

    @Override
    public void clickPhoto() {
        System.out.println("click a photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("record a video");
    }

    @Override
    public void resume() {
        System.out.println("resume the music");
    }

    @Override
    public void pause() {
        System.out.println("pause the music");
    }
}
