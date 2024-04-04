package perriAlessandro.U5w1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Ordine {

    public int nOrdine;

    public int nCoperti;

    public LocalTime oraAcquisizione;

    public Tavolo tavolo;

    public List<Item> ordine;

    private StatoOrdine stato;

    @Value("${ordine.costo-coperto}")
    private double costoCoperto;


    public Ordine(int nCoperti, LocalTime oraAcquisizione, Tavolo tavolo, List<Item> ordine, StatoOrdine stato) {
        Random rndm = new Random();
        this.nOrdine = rndm.nextInt(1000, 10000);
        this.nCoperti = nCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.tavolo = tavolo;
        this.ordine = ordine;
        this.stato = stato;
    }

    public double calcolaTotale() {
        double totale = ordine.stream().mapToDouble(Item::getPrezzo).sum();
        totale += nCoperti * costoCoperto;
        return totale;
    }
//
//    public void addItem(Item item) {
//        this.ordine.add(item);
//    }

    public enum StatoOrdine {
        IN_CORSO, PRONTO, SERVITO
    }

}
