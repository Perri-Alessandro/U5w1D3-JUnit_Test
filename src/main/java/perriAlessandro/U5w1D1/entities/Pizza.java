package perriAlessandro.U5w1D1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Pizza extends Item {

    public List<Topping> toppingList;
    public boolean isXl = false;
    private String nome;

    public Pizza(String nome, double prezzo, List<Topping> toppingList, long calorie, boolean isXl) {
        super(prezzo, calorie);
        this.nome = nome;
        this.toppingList = toppingList;
        this.isXl = isXl;
    }
}
