package PROJETOVEICULOSESTAGIARIO;

import java.time.LocalDate;

public class CarrO extends BaseVeiculoS {
    protected String placa;
    protected int portas;
    protected String codRENAVAM;
    protected String propritario;
   
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public String getCodRENAVAM() {
        return codRENAVAM;
    }
    public void setCodRENAVAM(String codRENAVAM) {
        this.codRENAVAM = codRENAVAM;
    }
    public String getPropritario() {
        return propritario;
    }
    public void setPropritario(String propritario) {
        this.propritario = propritario;
    }
    
    public CarrO(int codigo, String nome, String modelo, String cor, String chassi, LocalDate anoModelo,
            LocalDate anoFabricacao, int eixo, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, String estadoUF, String cidadeUF,
            String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa, int portas, String codRENAVAM,
            String propritario) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, anoFabricacao, eixo, pesoLiquido, pesoTotal, assentos,
                rodas, fabricante, potencia, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.placa = placa;
        this.portas = portas;
        this.codRENAVAM = codRENAVAM;
        this.propritario = propritario;
    }
    @Override
    public void Imprimir() {
        
    }
    
}
