import java.util.ArrayList;
public class ExploradorGalactico
{
    private String NomeCodigo;
    private String PlanetaOrigem;
    private int Nivel;
    private int Energia;
    private boolean Ativo;
    ArrayList<String> Equipamentos = new ArrayList<String>();
    
    public ExploradorGalactico(){
        NomeCodigo = "Sem nome";
        PlanetaOrigem = "Terra";
        Nivel = 1;
        Energia = 100;
        Ativo = true;
        Equipamentos = new ArrayList<>();
    }
    
    public ExploradorGalactico(String nomeCodigo, String planetaOrigem, int nivel, int energia, boolean ativo){
        this.NomeCodigo = nomeCodigo;
        this.PlanetaOrigem = planetaOrigem;
        this.Nivel = nivel;
        this.Energia = energia;
        this.Ativo = ativo;
        this.Equipamentos = Equipamentos;
    }
    //nomeCodigo
    public String getNomeCodigo() {
        return NomeCodigo;
    }
    public void setNomeCodigo(String NomeCodigo) {
    if (NomeCodigo != null && !NomeCodigo.isEmpty()) {
        this.NomeCodigo = NomeCodigo;
    }
}
    //planetaOrigem
    public String getPlanetaOrigem() {
        return PlanetaOrigem;
    }
    public void setPlanetaOrigem(String PlanetaOrigem){
        if (PlanetaOrigem != null && !PlanetaOrigem.isEmpty()) {
            this.PlanetaOrigem = PlanetaOrigem;
        }
    }
    //nivel
    public int getNivel() {
        return Nivel;
    }
    public void setNivel(int Nivel) {
        if(Nivel >=1){
            this.Nivel = Nivel;
        }
    }
    //energia
    public int getEnergia() {
        return Energia;
    }
    public void setEnergia(int Energia) {
        if(Energia >= 0 && Energia <= 100){
            this.Energia = Energia;
        }
    }
    public void adicionarEquipamento(String equipamento) {
        Equipamentos.add(equipamento);
    }
}