package C2_ObserverPattern.example_1

import java.util.*

class CurrentConditionsDisplay(
        weatherData: Observable
) : Observer, DisplayElement {

    private var temperature = 0f
    private var humidity = 0f
    private var observable: Observable = weatherData

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            temperature = o.temperature
            humidity = o.humidity
            display()
        }
    }

    override fun display() {
        println("Current conditions temp: $temperature ºC, humidity: $humidity")
    }
}

class CrazyDisplayer(
        weatherData: Observable
) : Observer, DisplayElement {

    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f
    private var observable: Observable = weatherData

    init {
        observable.addObserver(this)
    }

    override fun update(o: Observable?, arg: Any?) {
        if (o is WeatherData) {
            temperature = o.temperature
            humidity = o.humidity
            display()
        }
    }

    override fun display() {
        println("Crazy measurements temp: ${temperature * humidity * pressure}")
    }

}