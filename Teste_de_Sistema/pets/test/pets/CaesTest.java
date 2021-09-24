package pets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CaesTest {
    Caes auau;
    String nome = "Lele";
    float peso = 75;
    
    public CaesTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Iniciando os testes...\n");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("\nFinalizando os testes...");
    }

    @Before
    public void setUp() {
        System.out.println("\nIniciando teste:");
        auau = new Caes("Lele", 75);
        auau.humor = "animado";
    }

    @After
    public void tearDown() {
        System.out.println("\nTeste Finalizado!");
    }
    
        @Test
    public void testFalar() {
        System.out.println("Teste Falar");
        String mensagem = "Buu";
        String expResult = "Meu nome é " + nome + ", " + mensagem;
        String result = auau.falar(mensagem);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAndar() {
        System.out.println("Teste Andar");
        int num_passos = 5000;
        boolean expResult = true;
        boolean result = auau.andar(num_passos);
        assertEquals(expResult, result);
        assertEquals(num_passos, auau.qtd_passos, 0);
    }
    
    @Test
    public void testComer() {
        System.out.println("Teste Comer");
        auau.comer();
        float expResult = peso + 0.01f;
        assertEquals(expResult, auau.peso, 0);
        assertEquals("satisfeito", auau.humor);
    }

    @Test
    public void testDormir() {
        System.out.println("Teste Dormir");
        auau.humor = "animado";
        boolean expResult = false;
        boolean result = auau.dormir();
        assertEquals(expResult, result);
    }
    
}
