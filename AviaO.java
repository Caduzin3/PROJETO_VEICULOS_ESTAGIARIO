package PROJETOVEICULOSESTAGIARIO;

import java.time.LocalDate;

public class AviaO extends BaseVeiculoS{

    public AviaO(int codigo, String nome, String modelo, String cor, String chassi, LocalDate anoModelo,
            LocalDate anoFabricacao, int eixo, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, String estadoUF, String cidadeUF,
            String tipoVeiculo, int qtdeMotores, int qtdeOcupantes) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, eixo, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores, qtdeOcupantes);
    
    }
    @Override
    public void Imprimir(){
        
    }

}