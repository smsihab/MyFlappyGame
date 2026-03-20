import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;

public class SoundManager {
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;
    private Context context;

    // Constructor
    public SoundManager(Context context) {
        this.context = context;
        audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
    }

    // Load sound effects
    public void loadSound(int resourceId) {
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        mediaPlayer = MediaPlayer.create(context, resourceId);
    }

    // Play sound effect
    public void playSound() {
        if (mediaPlayer != null) {
            mediaPlayer.start();
        } else {
            Log.e("SoundManager", "MediaPlayer not initialized. Load sound first.");
        }
    }

    // Release resources
    public void release() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}