package interfaceLess;

public class PlayMusic {
    public static void main(String[] args) {
        Guitar musicTool1 = new Guitar(12);
        Drum musicTool2 = new Drum(750);
        Trumpet musicTool3 = new Trumpet(11);

        MusicTool[] allTool = {musicTool1, musicTool2, musicTool3};
        for (MusicTool tool : allTool){
            tool.play();
        }
    }
}
