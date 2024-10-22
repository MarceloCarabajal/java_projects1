package org.mcarabajal.ejemplos.models;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.mcarabajal.ejemplos.exceptions.DineroInsuficienteException;

import java.math.BigDecimal;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.*;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CuentaTest {
    Cuenta cuenta;

    @BeforeEach
    void initMetodoTest() {
        this.cuenta = new Cuenta("Marcelo", new BigDecimal("1000.12345"));
        System.out.println("Iniciando el metodo");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Finalizando el metodo de prueba");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("inicializando el test");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("finalizando el test");
    }

    @Test
    @DisplayName("probando el nombre de la cuenta corriente")
    void testNombreCuenta() {
        //cuenta.setPersona("Marcelo");
        String esperado = "Marcelo";
        String real = cuenta.getPersona();
        assertNotNull(real, () -> "la cuenta no puede ser nula");
        assertEquals(esperado, real, "el nombre de la cuenta no es el que se esperaba: se esperaba " + real);
        assertTrue(real.equals("Marcelo"), () -> "nombre cuenta esperada debe ser igual a la real");

    }

    @Test
    @DisplayName("probando el saldo de la cuenta que no sea null, mayor que cero y el valor esperado")
    void testSaldoCuenta() {
        assertNotNull(cuenta.getSaldo());
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
        assertTrue(cuenta.getSaldo().compareTo(BigDecimal.ZERO) > 0);
    }

    @Test
    @DisplayName("testeando referencias que sean iguales con el metodo equals")
    void testReferenciaCuenta() {
        cuenta = new Cuenta("Jorge", new BigDecimal("9999.9999"));
        Cuenta cuenta2 = new Cuenta("Jorge", new BigDecimal("9999.9999"));

        assertEquals(cuenta2, cuenta);
    }

    @Test
    void testDebitoCuenta() {
        cuenta.debito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(900, cuenta.getSaldo().intValue());
        assertEquals("900.12345", cuenta.getSaldo().toPlainString());
    }

    @Test
    void testCreditoCuenta() {
        cuenta.credito(new BigDecimal(100));
        assertNotNull(cuenta.getSaldo());
        assertEquals(1100, cuenta.getSaldo().intValue());
        assertEquals("1100.12345", cuenta.getSaldo().toPlainString());

    }

    @Test
    void testDineroInsuficienteExceptionCuenta() {
        Exception exception = assertThrows(DineroInsuficienteException.class, () -> {
            cuenta.debito(new BigDecimal(1500));
        });
        String actual = exception.getMessage();
        String esperado = "Dinero Insuficiente";
        assertEquals(esperado, actual);
    }

    @Test
    void testTransferirDineroCuentas() {
        Cuenta cuenta1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Marcelo", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.setNombre("Banco ICBC");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));
        assertEquals("1000.8989", cuenta2.getSaldo().toPlainString());
        assertEquals("3000", cuenta1.getSaldo().toPlainString());
    }

    @Test
    //@Disabled
    @DisplayName("probando relaciones entre las cuentas y el banco con assertAll")
    void testRelacionBancoCuentas() {
        //fail();
        Cuenta cuenta1 = new Cuenta("Jhon Doe", new BigDecimal("2500"));
        Cuenta cuenta2 = new Cuenta("Marcelo", new BigDecimal("1500.8989"));

        Banco banco = new Banco();
        banco.addCuenta(cuenta1);
        banco.addCuenta(cuenta2);

        banco.setNombre("Banco ICBC");
        banco.transferir(cuenta2, cuenta1, new BigDecimal(500));

        assertAll(() -> assertEquals("1000.8989", cuenta2.getSaldo().toPlainString(),
                            () -> "el valor del saldo de la cuenta 2 no es el esperado"),
                () -> assertEquals("3000", cuenta1.getSaldo().toPlainString(),
                            () -> "el valor del saldo de la cuenta 1 no es el esperado"),
                () -> assertEquals(2, banco.getCuentas().size()),
                () -> assertEquals("Banco ICBC", cuenta1.getBanco().getNombre()),
                () -> assertEquals("Marcelo", banco.getCuentas().stream()
                        .filter(c -> c.getPersona().equals("Marcelo"))
                        .findFirst()
                        .get().getPersona()),
                () -> assertTrue(banco.getCuentas().stream()
                        .anyMatch(c -> c.getPersona().equals("Marcelo")))
        );
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testSoloWindows() {

    }

    @Test
    @EnabledOnOs({OS.LINUX, OS.MAC})
    void testSoloLinuxMac() {

    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void testNoWindows() {
    }


    @Test
    @EnabledOnJre(JRE.JAVA_8)
    void soloJdk8() {
    }

    @Test
    @DisabledOnJre(JRE.JAVA_15)
    void testNoJdk15() {
    }

    @Test
    void imprimirSystemProperties() {
        Properties properties = System.getProperties();
        properties.forEach((k, v)-> System.out.println(k + ":" + v));

    }

    @Test
    @EnabledIfSystemProperty(named = "java.version", matches = "15.0.9")
    void testJavaVersion() {
    }

    @Test
    @DisabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
    void testSolo64() {
    }

    @Test
    @EnabledIfSystemProperty(named = "os.arch", matches = ".*32.*")
    void testNo64() {
    }

    @Test
    @EnabledIfSystemProperty(named = "user.name", matches = "Marcelo")
    void testUserName() {
    }

    @Test
    @EnabledIfSystemProperty(named = "ENV", matches = "dev")
    void testDev() {
    }
}
