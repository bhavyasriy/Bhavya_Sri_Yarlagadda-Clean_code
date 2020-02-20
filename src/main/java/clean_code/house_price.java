package clean_code;
import java.util.HashMap
public class house_price {
	
	private int material_standarad;
    private double house_area;
    private boolean fully_automated;
    private HashMap<Integer, Double> priceMap;

    public house_price(int material_standarad, double house_area, boolean fully_automated) {
        this.material_standarad = material_standarad;
        this.house_area = house_area;
        this.fully_automated = fully_automated;
        #initialising price map
        priceMap = new HashMap<>();
        priceMap.put(0, 1200.0);
        priceMap.put(1, 1500.0);
        priceMap.put(2, 1800.0);
        priceMap.put(3, 2500.0);


    }

    public int getMaterial_standarad() {
        return material_standarad;
    }

    public void setMaterial_standarad(int material_standarad) {
        this.material_standarad = material_standarad;
    }

    public double getHouse_area() {
        return house_area;
    }

    public void setHouse_area(double house_area) {
        this.house_area = house_area;
    }

    public boolean isFully_automated() {
        return fully_automated;
    }

    public void setFully_automated(boolean fully_automated) {
        this.fully_automated = fully_automated;
    }

    public double calculateConstructionCost() {


        /**
         * since fully automated is only available with high standard return
         * -1 as a gesture of error, if it is asked for other standards
         */
        if (fully_automated && material_standarad != 2)
            return -1;

        if (fully_automated)
            return house_area * priceMap.get(3);
        else
           return  house_area * priceMap.get(material_standarad);



    }
}
	


