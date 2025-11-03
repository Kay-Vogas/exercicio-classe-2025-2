package view;

public class ConversorTemperatura {

    public ConversorTemperatura() {

    }

    public double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }


    public double converterFahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
