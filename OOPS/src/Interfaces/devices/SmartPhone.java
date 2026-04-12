package Interfaces.devices;

public class SmartPhone implements Phone, Camera, MusicPlayer{
    @Override
    public void takePhoto() {
        System.out.println("Taking a photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void makeCal(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void endCall() {
        System.out.println("Ending Call");
    }
}
