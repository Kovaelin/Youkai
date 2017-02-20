package app.youkai.util.ext

import android.support.design.widget.Snackbar
import android.view.View

/**
 * Helper function to make Snackbars beautiful.
 *
 * See https://antonioleiva.com/kotlin-awesome-tricks-for-android
 */
inline fun View.snackbar(message: String, length: Int = Snackbar.LENGTH_LONG, f: Snackbar.() -> Unit): Snackbar {
    val snack = Snackbar.make(this, message, length)
    snack.f()
    snack.show()
    return snack
}