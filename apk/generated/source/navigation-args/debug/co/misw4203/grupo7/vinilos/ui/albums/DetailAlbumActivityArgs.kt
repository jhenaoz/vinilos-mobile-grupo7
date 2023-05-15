package co.misw4203.grupo7.vinilos.ui.albums

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class DetailAlbumActivityArgs(
  public val id: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("id", this.id)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("id", this.id)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): DetailAlbumActivityArgs {
      bundle.setClassLoader(DetailAlbumActivityArgs::class.java.classLoader)
      val __id : Int
      if (bundle.containsKey("id")) {
        __id = bundle.getInt("id")
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      return DetailAlbumActivityArgs(__id)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailAlbumActivityArgs {
      val __id : Int?
      if (savedStateHandle.contains("id")) {
        __id = savedStateHandle["id"]
        if (__id == null) {
          throw IllegalArgumentException("Argument \"id\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue")
      }
      return DetailAlbumActivityArgs(__id)
    }
  }
}
