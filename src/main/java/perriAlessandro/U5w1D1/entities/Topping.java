package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Topping extends Item {
    private String nome;

    public Topping(String nome, double prezzo, long calorie) {
        super(prezzo, calorie);
        this.nome = nome;
    }

}
