package ru.complexhex.JavaEETest;

import ru.complexhex.JavaEETest.cartPackage.Cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "FirstServlet", value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");
        if (user == null)
        // response for anonim user
        // autorization
        // registration
        // session.setAttributed("current_user, ID);


//        Cart cart = (Cart) session.getAttribute("cart");
//
//        String name = request.getParameter("name");
//        int quantity = Integer.parseInt(request.getParameter("quantity"));
//
//        if (cart == null) {
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQuantity(quantity);
//        }
//            session.setAttribute("cart", cart);


//        PrintWriter printWriter = response.getWriter();
//
//        printWriter.println("<html>");
//        printWriter.println("<h1> Count:" + count + "</h1>");
//
//        printWriter.println("</html>");

        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
