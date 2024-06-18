package member.memberController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.memberModel.Member;
import member.memberDAO.MemberFunctionImpl;
import member.memberDAO.MemberDAOFunction;
import util.ConnectionPool;
import util.ConnectionPoolImpl;

@WebServlet("/add-member")
public class AddMember extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        req.getRequestDispatcher("addMember.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ConnectionPool cp = new ConnectionPoolImpl();
        MemberDAOFunction<Member> m = new MemberFunctionImpl(cp);
        int mem_id = Integer.parseInt(req.getParameter("memberID"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");

        
        Member a = new Member(mem_id, name, address, phone, email);
        boolean isSuccess = m.addMember(a);
        
        if (isSuccess) {
            resp.sendRedirect(req.getContextPath() + "/add-member?message=addSuccess");
        } else {
            // Nếu không thành công, xử lý lỗi ở đây
            // Ví dụ: có thể chuyển hướng về trang lỗi, hoặc hiển thị thông báo lỗi khác
            resp.sendRedirect(req.getContextPath() + "/error.jsp");
        }
        
	}
}
