package perriAlessandro.U5w1D1.entities;

import lombok.Getter;

@Getter
public abstract class Item {

    public double prezzo;
    public long calorie;
    
    public Item(double prezzo, long calorie) {
        this.prezzo = prezzo;
        this.calorie = calorie;
    }

}
