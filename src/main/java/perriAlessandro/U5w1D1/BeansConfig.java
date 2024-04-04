package perriAlessandro.U5w1D1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import perriAlessandro.U5w1D1.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
// Annotazione OBBLIGATORIA se voglio usare i valori provenienti da application.properties
public class BeansConfig {

    @Value("${ordine.costo-coperto}")
    private double costoCoperto;

    @Bean
    public Topping toppingPomodoro() {
        return new Topping("Pomodoro", 0.5, 10);
    }

    @Bean
    public Topping toppingMozzarella() {
        return new Topping("Mozzarella", 1, 140);
    }

    @Bean
    public Topping toppingTonno() {
        return new Topping("Tonno", 1.5, 120);
    }

    @Bean
    public Topping toppingCipolla() {
        return new Topping("Cipolla", 0.5, 60);
    }

    @Bean
    public Topping toppingSalamino() {
        return new Topping("Salamino piccante", 1.5, 160);
    }

    @Bean(name = "Margherita")
    public Pizza margherita() {
        List<Topping> t = new ArrayList<>();
        t.add(toppingMozzarella());
        t.add(toppingPomodoro());
        return new Pizza("Margherita", 6, t, 900, false);
    }

    @Bean
    public Pizza margheritaXl() {
        List<Topping> t = new ArrayList<>();
        t.add(toppingMozzarella());
        t.add(toppingPomodoro());
        return new Pizza("Margherita Xl", 6, t, 900, true);
    }

    @Bean(name = "Salame Piccante")
    public Pizza salamePiccante() {
        List<Topping> t = new ArrayList<>();
        t.add(toppingMozzarella());
        t.add(toppingPomodoro());
        t.add(toppingSalamino());
        return new Pizza("Salame Piccante", 7.5, t, 1300, false);
    }

    @Bean
    public Pizza tonnoCipolla() {
        List<Topping> t = new ArrayList<>();
        t.add(toppingMozzarella());
        t.add(toppingPomodoro());
        t.add(toppingCipolla());
        t.add(toppingTonno());
        return new Pizza("Tonno e Cipolla", 8, t, 1250, false);
    }

    @Bean(name = "Acqua")
    public Bevande acqua() {
        return new Bevande("Acqua", 1.5, 0);
    }

    @Bean(name = "Coca Cola")
    public Bevande cocaCola() {
        return new Bevande("Coca Cola", 2.5, 120);
    }

    @Bean
    public Bevande birra() {
        return new Bevande("Birra", 3, 150);
    }

    @Bean
    public Bevande fanta() {
        return new Bevande("Fanta", 2.5, 110);
    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, 4, false);
    }

    @Bean
    public Tavolo tavolo2() {
        return new Tavolo(2, 2, true);
    }

    @Bean
    public Tavolo tavolo3() {
        return new Tavolo(3, 5, true);
    }

    @Bean
    public Tavolo tavolo4() {
        return new Tavolo(4, 3, false);
    }

    @Bean
    public Tavolo tavolo5() {
        return new Tavolo(5, 1, true);
    }

    @Bean
    public Tavolo tavolo6() {
        return new Tavolo(6, 6, false);
    }

    @Bean(name = "tavoli")
    public List<Tavolo> tavoli() {
        List<Tavolo> tavoli = new ArrayList<>();
        tavoli.add(tavolo1());
        tavoli.add(tavolo2());
        tavoli.add(tavolo3());
        tavoli.add(tavolo4());
        tavoli.add(tavolo5());
        tavoli.add(tavolo6());
        return tavoli;
    }

    @Bean(name = "menù")
    public Menù menù() {
        List<Pizza> pizze = new ArrayList<>();
        List<Bevande> bevande = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();

        pizze.add(margherita());
        pizze.add(margheritaXl());
        pizze.add(salamePiccante());
        pizze.add(tonnoCipolla());

        bevande.add(acqua());
        bevande.add(cocaCola());
        bevande.add(fanta());
        bevande.add(birra());

        toppingList.add(toppingPomodoro());
        toppingList.add(toppingMozzarella());
        toppingList.add(toppingTonno());
        toppingList.add(toppingCipolla());
        toppingList.add(toppingSalamino());

        return new Menù(pizze, bevande, toppingList);
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

}
