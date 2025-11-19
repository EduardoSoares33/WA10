package wa10;

//MainApp.java
import java.time.LocalDate;
import java.util.List;

public class MainWA {
 public static void main(String[] args) {
     // 1. Criar um usuário
     Usuario usuario = new Usuario("123.456.789-00", "senha", "Comum");
     System.out.println("CPF do Usuário: " + usuario.getCpf());
     

     // 2. Realizar login
     boolean sucessoLogin = usuario.realizarLogin("123.456.789-00", "senha");
     System.out.println("Login bem-sucedido? " + sucessoLogin);
     

     // 3. Criar um documento
     Documento doc = new Documento(
         1L, // ID (Herdado de BaseEntity)
         "Renda_2025.pdf",
         "/uploads/user1/doc1.pdf",
         LocalDate.now(),
         usuario, // Objeto Usuario como proprietário
         TipoDocumento.comprovanteRenda // Enum TipoDocumento
     );
 

     System.out.println("---");
     System.out.println("ID do Documento: " + doc.getIdDocumento());
     System.out.println("Tipo do Documento: " + doc.getTipoDocumento());
     
     // 4. Usar métodos do Usuário
     usuario.enviarDocumento();
     List<Documento> lista = usuario.visualizarDocumentosEnviados();
     System.out.println("Número de documentos na lista: " + lista.size());
 }
}
