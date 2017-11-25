package c2_observerPattern

fun main(args: Array<String>){
    val weatherData = WeatherData()
    CurrentConditionsDisplay(weatherData)
    CrazyDisplayer(weatherData)

    weatherData.setMeasurements(10.11f,40.2f,5.0f)
    println()
    weatherData.setMeasurements(20.11f,10.2f,5.0f)

}
