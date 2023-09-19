package PROJETOVEICULOSESTAGIARIO;

import java.time.LocalDate;

public class MotocicletA extends BaseVeiculoS {
    protected String placa;
    protected String codRENAVAM;
    protected String proprietario;
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCodRENAVAM() {
        return codRENAVAM;
    }
    public void setCodRENAVAM(String codRENAVAM) {
        this.codRENAVAM = codRENAVAM;
    }
    public String getProprietario() {
        return proprietario;
    }
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public MotocicletA(int codigo, String nome, String modelo, String cor, String chassi, LocalDate anoModelo,
            LocalDate anoFabricacao, int eixo, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, String estadoUF, String cidadeUF,
            String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa, String codRENAVAM,
            String proprietario) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, eixo, pesoLiquido, pesoTotal, assentos,
                rodas, fabricante, potencia, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.placa = placa;
        this.codRENAVAM = codRENAVAM;
        this.proprietario = proprietario;
    }
    @Override
    public void Imprimir() {
        
    }

}
