package C2_ObserverPattern.example_1

fun main(args: Array<String>){
    val weatherData = WeatherData()
    val currentsDisplay = CurrentConditionsDisplay(weatherData)
    val crazyDisplay = CrazyDisplayer(weatherData)

    weatherData.registerObserver(currentsDisplay)
    weatherData.registerObserver(crazyDisplay)
    weatherData.setMeasurements(10.11f,40.2f,5.0f)
    println()
    weatherData.setMeasurements(20.11f,10.2f,5.0f)

}
