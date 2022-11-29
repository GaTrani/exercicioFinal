import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contato {
    public static  List<Contato> contatos = new ArrayList<>();
    private String contato;
    private String telefone;
    private String email;

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
