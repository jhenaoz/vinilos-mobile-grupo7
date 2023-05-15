package co.misw4203.grupo7.vinilos.ui.performer

import android.os.Bundle
import androidx.navigation.NavDirections
import co.misw4203.grupo7.vinilos.R
import kotlin.Int

public class PerformersFragmentDirections private constructor() {
  private data class ActionNavigationPerformersToNavigationDetailPerformer(
    public val id: Int
  ) : NavDirections {
    public override val actionId: Int =
        R.id.action_navigation_performers_to_navigation_detail_performer

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("id", this.id)
        return result
      }
  }

  public companion object {
    public fun actionNavigationPerformersToNavigationDetailPerformer(id: Int): NavDirections =
        ActionNavigationPerformersToNavigationDetailPerformer(id)
  }
}
