package CW.ExNum4.model;

public class Kelvin implements Converter {
    @Override
    public Double convertValue(Double importValue) {
        return importValue + 273.15;
    }
}
