package adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType) {
		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMusicPlayer = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(audioType)) {
			advancedMusicPlayer = new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMusicPlayer.PlayVlc(fileName);
		}else if("mp4".equalsIgnoreCase(audioType)) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
