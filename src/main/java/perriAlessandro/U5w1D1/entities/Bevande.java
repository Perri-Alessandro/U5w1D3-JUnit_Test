package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevande extends Item {

    public String nome;

    public Bevande(String nome, double prezzo, long calorie) {
        super(prezzo, calorie);
        this.nome = nome;
    }
    
}
