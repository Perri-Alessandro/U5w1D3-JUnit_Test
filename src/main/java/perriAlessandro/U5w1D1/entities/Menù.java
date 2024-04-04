package perriAlessandro.U5w1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Menù {

    public List<Pizza> pizze;

    public List<Bevande> bevande;

    public List<Topping> toppingList;

    public Menù() {
    }

    public void stampaMenù() {
        System.out.println("------------------------------ MENù -----------------------------");
        System.out.println();

        System.out.println("PIZZE");
        this.pizze.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("BEVANDE");
        this.bevande.forEach(System.out::println);
        System.out.println();
    }

}
