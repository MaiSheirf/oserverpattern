import java.util.ArrayList;

public class weatherData implements subject{
    private ArrayList observers;
    private float temperature;
    private float pressure;
    public weatherData(){
        observers = new ArrayList();
    }
    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observer observer = (observer)observers.get(i);
            observer.update(temperature, pressure);
        }
    }

    @Override
    public void registerObserver(observer o) {
        observers.add(o);
    }

    public void measurementsChanged() {
        notifyObserver();
    }
    public void setMeasurements(float temperature,  float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        measurementsChanged();
    }
}
