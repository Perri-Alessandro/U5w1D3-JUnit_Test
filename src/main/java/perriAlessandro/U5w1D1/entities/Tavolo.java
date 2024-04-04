package perriAlessandro.U5w1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Tavolo {
    public int numero;

    public int copertiMax;

    public boolean libero = true;


}
