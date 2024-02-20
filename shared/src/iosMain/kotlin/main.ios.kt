import androidx.compose.ui.window.ComposeUIViewController
import cocoapods.MMKV.MMKV
import kotlinx.cinterop.ExperimentalForeignApi

actual fun getPlatformName(): String = "iOS"

fun MainViewController() = ComposeUIViewController { App() }

@OptIn(ExperimentalForeignApi::class)
fun usePodLibrary() {
    MMKV.defaultMMKV()
}
