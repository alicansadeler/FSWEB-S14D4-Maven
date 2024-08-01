import org.example.model.Bread;
import org.example.model.Chocolate;
import org.example.model.Coke;
import org.example.model.ProductForSale;
import org.example.model.rpg.Monster;
import org.example.model.rpg.Troll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.reflect.Method;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ResultAnalyzer.class)
public class MainTest {

    ProductForSale bread;
    ProductForSale chocolate;
    ProductForSale coke;

    Monster troll;

    @BeforeEach
    void setUp() {
        bread = new Bread("Test", 10, "Test Bread");
        chocolate = new Chocolate("Test", 10, "Test Chocolate");
        coke = new Coke("Test", 10, "Test Coke");
        troll = new Troll("Shrek", 1000, 100);
    }

    @DisplayName("Subclasslar Superclass değişkenlerinin değerlerine ulaşabiliyor mu?")
    @Test
    public void testProductForSaleAccessModifiers() throws NoSuchFieldException {
        assertEquals(bread.getType(), "Test");
        assertEquals(bread.getPrice(), 10);
        assertEquals(bread.getDescription(), "Test Bread");

        assertEquals(chocolate.getType(), "Test");
        assertEquals(chocolate.getPrice(), 10);
        assertEquals(chocolate.getDescription(), "Test Chocolate");
    }

    @DisplayName("Tüm sınıflar doğru sınıftan türüyorlar mı?")
    @Test
    public void testLampAccessModifiers() throws NoSuchFieldException {
        assertThat(bread, instanceOf(ProductForSale.class));
        assertThat(chocolate, instanceOf(ProductForSale.class));
        assertThat(coke, instanceOf(ProductForSale.class));
    }

    @DisplayName("getSalesPrice doğru sonuçlar üretiyor mu?")
    @Test
    public void testGetSalesPrice() throws NoSuchFieldException {
        assertEquals(bread.getSalesPrice(3), 30);
        assertEquals(chocolate.getSalesPrice(5), 50);
        assertEquals(coke.getSalesPrice(4), 40);
    }

    @DisplayName("showDetails methodu tanımlanmış mı?")
    @Test
    public void testShowDetails() throws NoSuchMethodException {
        Method showDetailsMethod = bread.getClass().getDeclaredMethod("showDetails");
        assertEquals(showDetailsMethod.getModifiers(), 1);
    }

    @DisplayName("Troll sınıfı doğru değişkenlere tiplerine sahip mi ?")
    @Test
    public void testTrollDataTypes() throws NoSuchFieldException {
        assertThat(troll.getName(), instanceOf(String.class));
        assertThat(troll.getHitPoints(), instanceOf(Integer.class));
        assertThat(troll.getDamage(), instanceOf(Double.class));

        assertEquals(troll.getName(), "Shrek");
        assertEquals(troll.getHitPoints(), 1000);
        assertEquals(troll.getDamage(), 100);
    }

    @DisplayName("attack methodu doğru çalışıyor mu ?")
    @Test
    public void testAttackMethod() {
       assertEquals(troll.attack(), 155.0);
    }
}
