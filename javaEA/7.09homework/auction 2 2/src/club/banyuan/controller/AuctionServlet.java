package club.banyuan.controller;

import club.banyuan.entity.Bid;
import club.banyuan.service.BidInsertService;
import club.banyuan.service.Impl.BidInsertServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "AuctionServlet",urlPatterns = "auction.do")
public class AuctionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     Bid bid = new Bid();
     bid.setDatetime( request.getParameter("b_time"));
     bid.setB_price(Float.valueOf(request.getParameter("b_price")));
     bid.setAuctionPersonName(request.getParameter("auctionPersonName"));
        BidInsertService bidInsertService = new BidInsertServiceImpl();
        try {
           int i = bidInsertService.InsertBid(bid);
           if(i>0){
               request.getRequestDispatcher("auction.jsp").forward(request,response);
           }else{

           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
    }
}
