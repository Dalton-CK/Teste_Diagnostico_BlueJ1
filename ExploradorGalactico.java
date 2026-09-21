import java.util.ArrayList;
public class ExploradorGalactico
{
    private String nomeCodigo;
    private String planetaOrigem;
    private int nivel;
    private int energia;
    private boolean ativo;
    ArrayList<String> equipamentos = new ArrayList<String>();
    
    public ExploradorGalactico(){
        nomeCodigo = "Sem nome";
        planetaOrigem = "Terra";
        nivel = 1;
        energia = 100;
        ativo = true;
    }
}