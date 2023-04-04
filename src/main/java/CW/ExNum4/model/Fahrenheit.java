package CW.ExNum4.model;

public class Fahrenheit implements Converter {
    @Override
    public Double convertValue(Double importValue) {
        return importValue * 1.8 + 32;
    }
}
