package sirAneesLab;


class TemperatureData {
    int id;
    String city, date, time, month;
    double temperature;
    TemperatureData next;  

    public TemperatureData(int id, String city, String date, String time, String month, double temperature) {
        this.id = id;
        this.city = city;
        this.date = date;
        this.time = time;
        this.month = month;
        this.temperature = temperature;
        this.next = null;
    }
}
