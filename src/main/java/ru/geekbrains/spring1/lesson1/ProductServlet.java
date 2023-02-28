package ru.geekbrains.spring1.lesson1;

import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductServlet extends HttpServlet {

    private List<Product> products;

    @Override
    public void init() throws ServletException {
        products = new ArrayList<>();
        products.add(new Product(1l, "first", 50));
        products.add(new Product(2l, "second", 50));
        products.add(new Product(3l, "third", 50));
        products.add(new Product(4l, "fourth", 50));
        products.add(new Product(5l, "five", 50));
        products.add(new Product(6l, "six", 50));
        products.add(new Product(7l, "seven", 50));
        products.add(new Product(8l, "eight", 50));
        products.add(new Product(9l, "nine", 50));
        products.add(new Product(10l, "ten", 50));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
//        for (int i = 0; i < 10; i++) {
//            resp.getWriter().printf("<h1>Слово" + i + "</h1>");
//        }

        for (int i = 0; i < products.size() ; i++) {
            resp.getWriter().printf("<h1>product" + i + products.get(i) + "</h1>");
        }
        resp.getWriter().printf("</body></html>");
        resp.getWriter().close();
    }

}