package co.misw4203.grupo7.vinilos.ui.albums

import android.os.Bundle
import androidx.navigation.NavDirections
import co.misw4203.grupo7.vinilos.R
import kotlin.Int

public class AlbumsFragmentDirections private constructor() {
  private data class ActionNavigationAlbumsToDetailedAlbumActivity(
    public val id: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_navigation_albums_to_DetailedAlbumActivity

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  public companion object {
    public fun actionNavigationAlbumsToDetailedAlbumActivity(id: Int): NavDirections =
        ActionNavigationAlbumsToDetailedAlbumActivity(id)
  }
}
