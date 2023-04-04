package HW.ExNum1.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Notebook {

private Integer id;
private String manufacturer;
private String operatingSystem;
private Integer RAM;
private Integer hardDiskDrive;
private String color;

}
