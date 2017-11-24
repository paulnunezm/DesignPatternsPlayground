package C2_ObserverPattern.example_1


interface WeatherObserver {
    /** These parameters are not encapsulated. */
    fun update(temperature: Float, humidity: Float, pressure: Float)
}

interface WeatherSubject {
    fun registerObserver(o: WeatherObserver)
    fun removeObserver(o: WeatherObserver)
    fun notifyObservers()
}

interface DisplayElement {
    fun display()
}