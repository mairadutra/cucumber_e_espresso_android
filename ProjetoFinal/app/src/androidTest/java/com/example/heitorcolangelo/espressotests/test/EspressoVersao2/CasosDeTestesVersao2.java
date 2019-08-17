package com.example.heitorcolangelo.espressotests.test.EspressoVersao2;

import android.support.test.rule.ActivityTestRule;

import com.example.heitorcolangelo.espressotests.test.EspressoVersao2.robot.robotVersao2;
import com.example.heitorcolangelo.espressotests.ui.activity.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class CasosDeTestesVersao2 {

    @Rule
    public ActivityTestRule<LoginActivity>
            mActivityRule = new ActivityTestRule<>(LoginActivity.class, false, true);

    @Before
    public void setup()  {


    }

    @After
    public void finish(){


    }

    @Test
    public void TestNumero1(){
        new robotVersao2()
                .verificarTituloDaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotao()
                .verificarElementoImagem();

    }

    @Test
    public void TesteNumero2(){

        new robotVersao2()
                .clicarNoBotaoLogin()
                .verificarPopup();

    }

    @Test
    public void TesteNumero3(){

        new robotVersao2()
                .EscreverEmail()
                .clicarNoBotaoLogin()
                .verificarPopup();

    }

    @Test
    public void TesteNumero4() throws InterruptedException {

        new robotVersao2()
                .EscreverSenha()
                .clicarNoBotaoLogin()
                .verificarPopup()
                .sleep(3);

    }

    @Test
    public void TesteNumero5() throws InterruptedException {

        new robotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoBotaoLogin()
                .VerificarTituloTela2()
                .sleep(2);
    }

    @Test
    public void TesteNumero6() throws InterruptedException {

        new robotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoBotaoLogin()
                .ClicarEmVoltar()
                .verificarTituloDaTela()
                .verificarCampoLogin()
                .verificarCampoSenha()
                .verificarBotao()
                .verificarElementoImagem()
                .sleep(5);
    }

    @Test
    public void TesteNumero7() throws InterruptedException {

        new robotVersao2()
                .EscreverEmail()
                .EscreverSenha()
                .clicarNoBotaoLogin()
                .sleep(5)
                .ScrolarParaBaixo()
                .sleep(2);
    }

}
