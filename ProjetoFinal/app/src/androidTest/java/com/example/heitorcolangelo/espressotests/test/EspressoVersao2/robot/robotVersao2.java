package com.example.heitorcolangelo.espressotests.test.EspressoVersao2.robot;

import com.example.heitorcolangelo.espressotests.R;
import com.example.heitorcolangelo.espressotests.test.common.ScreenRobot;

import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.EMAIL;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.HINT_EMAIL;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.HINT_SENHA;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.SENHA;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.TITLE_LIST_OF_USERS;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.TITLE_LOGIN;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.TXT1_POPUP;
import static com.example.heitorcolangelo.espressotests.test.EspressoVersao2.constants.constantsVersao2.TXT2_POPUP;

public class robotVersao2 extends ScreenRobot<robotVersao2> {

    private static final int IMAGEM_LOGIN = R.id.login_image;
    private static final int CAMPO_EMAIL = R.id.login_username;
    private static final int CAMPO_SENHA = R.id.login_password;
    private static final int BTN_LOGIN = R.id.login_button;
    private static final int VIEW_PARA_SCROLL = R.id.recycler_view;

    public robotVersao2 verificarElementoImagem(){
        checkIsDisplayed(IMAGEM_LOGIN);
        return this;
    }

    public robotVersao2 verificarCampoLogin(){
        checkViewHasHint(CAMPO_EMAIL, HINT_EMAIL);
        return this;
    }

    public robotVersao2 verificarCampoSenha(){
        checkViewHasHint(CAMPO_SENHA, HINT_SENHA );
        return this;
    }

    public robotVersao2 verificarBotao(){
        checkIsDisplayed(BTN_LOGIN);
        return this;
    }

    public robotVersao2 verificarTituloDaTela(){
        checkViewContainsText(TITLE_LOGIN);
        return this;
    }

    public robotVersao2 clicarNoBotaoLogin(){
        clickOnView(BTN_LOGIN);
        return this;
    }

    public robotVersao2 verificarPopup(){
        checkDialogWithTextIsDisplayed(TXT1_POPUP);
        checkDialogWithTextIsDisplayed(TXT2_POPUP);
        return this;
    }

    public robotVersao2 EscreverEmail(){
        enterTextIntoView(CAMPO_EMAIL, EMAIL);
        return this;
    }

    public robotVersao2 EscreverSenha(){
        enterTextIntoView(CAMPO_SENHA, SENHA);
        return this;
    }


    public robotVersao2 VerificarTituloTela2(){
        checkViewContainsText(TITLE_LIST_OF_USERS);
        return this;
    }

    public robotVersao2 ClicarEmVoltar(){
        pressBack();
        return this;
    }

    public robotVersao2 ScrolarParaBaixo(){
        scrollViewDown(VIEW_PARA_SCROLL);
        return this;
    }



}
