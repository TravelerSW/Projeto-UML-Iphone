package main;

import main.funcionalidades.Internet;
import main.funcionalidades.Music;
import main.funcionalidades.Phone;

public class Iphone implements Music, Internet, Phone{

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolha a música que deseja ouvir");  
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova guia aberta. Digite a URL:"); 
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página recarregada.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página carregada!");
    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida... Alô?");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Limite de toques excedido, se encaminhando para a caixa postal."); 
    }

    @Override
    public void ligar() {
        System.out.println("Realizando chamada..."); 
    }
    
}
