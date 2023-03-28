import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.BonusService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {


    @Test
    void BonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() throws IllegalAccessException {
        BonusService service = new BonusService();
       BigDecimal bonus =  service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(25000)));
        assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    void BonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() throws IllegalAccessException {
        BonusService service = new BonusService();
        BigDecimal bonus =  service.calcularBonus(new Funcionario("Rodrigo", LocalDate.now(), new BigDecimal(10000)));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
