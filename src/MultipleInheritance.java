public interface MultipleInheritance {
    public static void main(String[] args) {

        SmartPhone s=new SmartPhone();

        s.takePhoto();
        s.takeVideo();;

        s.playMusic();
        s.stopMusic();

        s.startCall("Shweta");
        s.endCall("Ankita");
    }
}


class  SmartPhone implements Camera ,MusicPlayer ,Phone {

    @Override
    public void takePhoto() {
        System.out.println("taking photo from smartPhone");

    }

    @Override
    public void takeVideo() {
        System.out.println("taking video from smartPhone");
    }

    @Override
    public void playMusic() {
        System.out.println("play music from smartPhone");

    }

    @Override
    public void stopMusic() {
        System.out.println("stop music from smartPhone");
    }

    @Override
    public void startCall(String number) {
        System.out.println("start calling " + number + "from smartPhone ");
    }

    @Override
    public void endCall(String number) {
        System.out.println("end calling " + number + "from smartPhone ");

    }
}

interface Camera{

    void takePhoto();

    void takeVideo();

}

interface MusicPlayer{
    void playMusic();
    void stopMusic();

}

interface  Phone{
    void startCall(String numbber);
    void endCall(String number);

}
