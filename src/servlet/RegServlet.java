package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Users;

public class RegServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		Users user = new Users();
		String username,password,confirmpassword,sex,email,introduce;
		Date birthday;
		String[] intereste;
		String[] interesteZero = {"无"};
		String isAccpet;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			username = request.getParameter("username");
			password = request.getParameter("password");
			confirmpassword = request.getParameter("confirmpassword");
			sex = request.getParameter("sex");
			email = request.getParameter("email");
			introduce = request.getParameter("introduce");
			
			if(request.getParameterValues("isAccpet")!=null)
				isAccpet = request.getParameter("isAccpet");
			else
				isAccpet = "false";
			
			birthday = sdf.parse(request.getParameter("birthday"));
			
			
			
			user.setUsername(username);
			user.setPassword(password);
			user.setConfirmpassword(confirmpassword);
			user.setEmail(email);
			user.setSex(sex);
			user.setIntroduce(introduce);
			user.setBirthday(birthday);
			if(request.getParameterValues("interest")!=null){
				intereste = request.getParameterValues("interest");
				user.setInterest(intereste);
			}
			else{
				user.setInterest(interesteZero);
			}
			if(isAccpet.equals("true") ){
				user.setFlag(true);
			}
			else{
				user.setFlag(false);
			}
			
			System.out.println(user);
			//把注册成功的用户对象保存在session中
			request.getSession().setAttribute("regUser", user);
			System.out.println(request.getContextPath());
			request.getRequestDispatcher("/userinfo.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
