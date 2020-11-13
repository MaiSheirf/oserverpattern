public class currentConditionState implements observer{
    private float temprature;
    private float pressure;
    private subject weatherData;
    public currentConditionState(subject weatherData){
        this.weatherData= weatherData;

    }
    @Override
    public void update(float temp, float pressure) {
        this.temprature = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("tempreture : " + temprature +"\n" + "pressure :" + pressure);
    }
}

