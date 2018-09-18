package leetCode.xml2bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Province {

    private String name;
    private List<City> cities = new ArrayList<>(2);

    public void addCity(City city) {
        cities.add(city);
    }

}
