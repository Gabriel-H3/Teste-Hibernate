package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import hibernate.cliente;
import dao.cliente_DAO;



@WebServlet(name = "CadastroServlet", urlPatterns = {"/CadastroServlet"})
public class CadastroServlet extends HttpServlet {
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        cliente cli = new cliente();
        cliente_DAO cli_DAO = new cliente_DAO();
        
        // Capturando os parâmetros do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        
        cli.setNome(nome);
        cli.setEmail(email);
        
        cli_DAO.insert(cli);
        
        
        //Random random = new Random();
        //int numero = random.nextInt(10);
        
    }
}
