package C2_ObserverPattern.example_1

import kotlin.collections.ArrayList

class WeatherData : WeatherSubject {
    var observers: ArrayList<WeatherObserver> = ArrayList()
    var temperature = 0f
    var humidity = 0f
    var pressure = 0f

    override fun registerObserver(o: WeatherObserver) {
        observers.add(o)
    }

    override fun removeObserver(o: WeatherObserver) {
        val i = observers.indexOf(o)
        if (i > 0) {
            observers.remove(o)
        }
    }

    override fun notifyObservers() {
        for (observer: WeatherObserver in observers) {
            observer.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged()
    }
}