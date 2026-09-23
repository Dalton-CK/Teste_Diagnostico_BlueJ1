import java.util.ArrayList;

public class ExploradorGalactico
{
    private String NomeCodigo;
    private String PlanetaOrigem;
    private int Nivel;
    private int Energia;
    private boolean Ativo;
    private ArrayList<String> Equipamentos;
    
    public ExploradorGalactico(){
        this.NomeCodigo = "Sem nome";
        this.PlanetaOrigem = "Terra";
        this.Nivel = 1;
        this.Energia = 100;
        this.Ativo = true;
        this.Equipamentos = new ArrayList<String>();
    }
    
    public ExploradorGalactico(String nomeCodigo, String planetaOrigem, int nivel, int energia, boolean ativo){
        this.NomeCodigo = nomeCodigo;
        this.PlanetaOrigem = planetaOrigem;
        this.Nivel = nivel;
        this.Energia = energia;
        this.Ativo = ativo;
        this.Equipamentos = new ArrayList<String>();
    }
    
    //nomeCodigo
    public String getNomeCodigo() {
        return this.NomeCodigo;
    }
    
    public void setNomeCodigo(String NomeCodigo) {
        if (NomeCodigo != null && !NomeCodigo.isEmpty()) {
            this.NomeCodigo = NomeCodigo;
        }
    }
    
    //planetaOrigem
    public String getPlanetaOrigem() {
        return this.PlanetaOrigem;
    }
    
    public void setPlanetaOrigem(String PlanetaOrigem){
        if (PlanetaOrigem != null && !PlanetaOrigem.isEmpty()) {
            this.PlanetaOrigem = PlanetaOrigem;
        }
    }
    
    //nivel
    public int getNivel() {
        return this.Nivel;
    }
    
    public void setNivel(int Nivel) {
        if(Nivel >=1){
            this.Nivel = Nivel;
        }
    }
    
    //energia  
    public int getEnergia() {
        return this.Energia;
    }
    
    public void setEnergia(int Energia) {
        if(Energia >= 0 || Energia <= 100){
            this.Energia = Energia;
        } 
    }
    
    public void getEquipamentos(String Equipamentos){
        this.Equipamentos.add(Equipamentos);
    }
    
    public boolean verificarEquipamentos(String Equipamentosverificar){
        this.Equipamentos.content
    }
}