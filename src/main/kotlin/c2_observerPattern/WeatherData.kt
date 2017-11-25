package c2_observerPattern

import java.util.*

class WeatherData : Observable() {
    var temperature = 0f
        private set

    var humidity = 0f
        private set

    var pressure = 0f
        private set

    private fun measurementsChanged() {
        setChanged()

        /* This method let us send the notification to our subscribers
         * with the difference that they can pull the data from this object
         * as it passes a reference to the observers */
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}