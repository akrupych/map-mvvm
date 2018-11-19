package akrupych.mapmvvm

import android.app.Application
import com.mapbox.mapboxsdk.Mapbox

class App : Application() {

    private val mapboxAccessToken = "pk.eyJ1IjoiYWtydXB5Y2giLCJhIjoiY2pvb2VxbHA2MWduZDNwbzg4c3hrcGtrbSJ9.WchTfA4Od4G3km-vNLaNtA"

    override fun onCreate() {
        super.onCreate()
        Mapbox.getInstance(applicationContext, mapboxAccessToken)
    }
}