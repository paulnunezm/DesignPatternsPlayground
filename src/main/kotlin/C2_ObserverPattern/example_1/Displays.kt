package C2_ObserverPattern.example_1

class CurrentConditionsDisplay(
        private val weatherData: WeatherSubject
) : WeatherObserver, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        display()
    }

    override fun display() {
        println("Current conditions temp: $temperature ºC, humidity: $humidity")
    }
}

class CrazyDisplayer(
        private val weatherData: WeatherSubject
) : WeatherObserver, DisplayElement {
    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        display()
    }

    override fun display() {
        println("Crazy measurements temp: ${temperature*humidity*pressure}")
    }

}