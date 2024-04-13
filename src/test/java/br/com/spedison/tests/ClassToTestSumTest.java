package br.com.spedison.tests;


import br.com.spedison.ClassToTestSum;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.SortedMap;

public class ClassToTestSumTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Rodando antes do teste da classe");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Rodando depois do teste da classe");
    }

    @Test
    public void sum() {
        System.out.println("Executando um teste....");
        ClassToTestSum soma = new ClassToTestSum();
        Assertions.assertEquals(soma.sum(10,12),22);
    }
}