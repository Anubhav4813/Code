package Interfaces;

import Interfaces.animals.Animal;
import Interfaces.animals.Cat;
import Interfaces.animals.Dog;
import Interfaces.devices.SmartPhone;

public class Test {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCal("1234567890");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.recordVideo();
    }
}
