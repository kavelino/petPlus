package com.example.petplus

/*import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import java.security.Provider


class VideoActivity : YouTubeBaseActivity(), YouTubePlayer.OnInitializedListener {
    var myYouTubePlayerFragment: YouTubePlayerFragment? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        myYouTubePlayerFragment = getFragmentManager()
            .findFragmentById(R.id.youtubeplayerfragment) as YouTubePlayerFragment
        myYouTubePlayerFragment.initialize(ConfigYoutube.DEVELOPER_KEY, this@VideoActivity)
    }

    fun onInitializationFailure(
        provider: Provider?,
        errorReason: YouTubeInitializationResult
    ) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show()
        } else {
            val errorMessage = java.lang.String.format(
                "There was an error initializing the YouTubePlayer (%1\$s)",
                errorReason.toString()
            )
            Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
        }
    }

    fun onInitializationSuccess(
        provider: Provider?, player: YouTubePlayer,
        wasRestored: Boolean
    ) {
        if (!wasRestored) {
            player.cueVideo(VIDEO_ID)
        }
    }

    protected fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) { // Retry initialization if user performed a recovery action
            youTubePlayerProvider.initialize(DEVELOPER_KEY, this)
        }
    }

    protected val youTubePlayerProvider: Provider
        protected get() = findViewById(R.id.youtubeplayerfragment) as YouTubePlayerView

    companion object {
        val DEVELOPER_KEY: String = ConfigYoutube.DEVELOPER_KEY
        private val VIDEO_ID: String = ConfigYoutube.YOUTUBE_VIDEO_CODE
        private const val RECOVERY_DIALOG_REQUEST = 1
    }
}*/