package club.banyuan.controller;

import club.banyuan.entity.Bid;
import club.banyuan.service.BidShowService;
import club.banyuan.service.Impl.BidShowServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "BidShowServlet",urlPatterns = "bidShow.do")
public class BidShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BidShowService bidShowService =new BidShowServiceImpl();
        try {
            List<Bid> bids = bidShowService.bidShow();
            if(bids!=null) {
                HttpSession session = request.getSession();
                session.setAttribute("bids", bids);
                request.getRequestDispatcher("auction.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
