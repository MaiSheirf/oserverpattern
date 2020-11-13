public class main {
    public static void main(String [] args){
        weatherData weatherData = new weatherData();
        currentConditionState current = new currentConditionState(weatherData);
        weatherData.setMeasurements(37,56);
    }
}
