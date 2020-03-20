package ddiportal.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ddiportal.dao.BranchDao;
import ddiportal.dao.ResultDao;
import ddiportal.dao.StudentDao;
import ddiportal.dao.SubjectDao;
import ddiportal.pojo.Result;

/**
 * Servlet implementation class result
 */
@WebServlet("/result")
public class result extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ResultDao rd = new ResultDao();
		SubjectDao sd= new SubjectDao();
		StudentDao std= new StudentDao();
		BranchDao bd = new BranchDao();
		System.out.println(""+request.getParameter("sem"));
		
		String enrollment = new String();
		String name = new String();
		String branch = new String();
		HttpSession session = request.getSession();
		if(session != null) {
			enrollment = (String) session.getAttribute("enroll");
			name = std.getStudentName(enrollment);
			branch = bd.getBranch(std.getBranchId(enrollment));
		}
		else
			response.sendRedirect("lrf");
		ArrayList<String> subname = sd.getSubjectName(Integer.parseInt((String)request.getParameter("sem")),std.getBranchId(enrollment));
		ArrayList<String> subid = sd.getSubjectId(Integer.parseInt((String)request.getParameter("sem")), std.getBranchId(enrollment));
		
		Result res = rd.generateResult(enrollment, Integer.parseInt(request.getParameter("sem")));
		
		
		System.out.print(""+subid);
		System.out.print(""+res);
		
		PrintWriter out =  response.getWriter();
		if(res !=null) {

				out.println("<!DOCTYPE HTML>");
				out.println("<HTML>");
				out.println("<HEAD>");
				out.println("<META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
				out.println("<META http-equiv=\"X-UA-Compatible\" content=\"IE=8\">");
				out.println("<TITLE>Result/student/"+name+"</TITLE>");
				out.println("");
				out.println("<STYLE type=\"text/css\">");
				out.println("");
				out.println("body {margin-top: 0px;margin-left: 0px;}");
				out.println("");
				out.println("#page_1 {position:relative; overflow: hidden;margin: 26px 0px 71px 29px;padding: 0px;border: none;width: 765px;}");
				out.println("");
				out.println("#page_1 #p1dimg1 {position:absolute;top:0px;left:0px;z-index:-1;width:551px;height:774px;}");
				out.println("#page_1 #p1dimg1 #p1img1 {width:551px;height:774px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println("#page_2 {position:relative; overflow: hidden;margin: 26px 0px 73px 29px;padding: 0px;border: none;width: 765px;}");
				out.println("");
				out.println("#page_2 #p2dimg1 {position:absolute;top:0px;left:0px;z-index:-1;width:551px;height:774px;}");
				out.println("#page_2 #p2dimg1 #p2img1 {width:551px;height:774px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println("#page_3 {position:relative; overflow: hidden;margin: 26px 0px 71px 29px;padding: 0px;border: none;width: 765px;}");
				out.println("");
				out.println("#page_3 #p3dimg1 {position:absolute;top:0px;left:0px;z-index:-1;width:551px;height:774px;}");
				out.println("#page_3 #p3dimg1 #p3img1 {width:551px;height:774px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println("#page_4 {position:relative; overflow: hidden;margin: 26px 0px 67px 29px;padding: 0px;border: none;width: 765px;}");
				out.println("");
				out.println("#page_4 #p4dimg1 {position:absolute;top:0px;left:0px;z-index:-1;width:551px;height:774px;}");
				out.println("#page_4 #p4dimg1 #p4img1 {width:551px;height:774px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println("#page_5 {position:relative; overflow: hidden;margin: 26px 0px 214px 29px;padding: 0px;border: none;width: 765px;}");
				out.println("");
				out.println("#page_5 #p5dimg1 {position:absolute;top:0px;left:0px;z-index:-1;width:551px;height:774px;}");
				out.println("#page_5 #p5dimg1 #p5img1 {width:551px;height:774px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println(".dclr {clear:both;float:none;height:1px;margin:0px;padding:0px;overflow:hidden;}");
				out.println("");
				out.println("");
				out.println(".ft1{font: bold 21px 'Book Antiqua';line-height: 26px;}");
				out.println(".ft2{font: bold 16px 'Book Antiqua';line-height: 21px;}");
				out.println(".ft3{font: bold 13px 'Book Antiqua';line-height: 18px;}");
				out.println("");
				out.println("");
				out.println(".p0{text-align: left;padding-left: 83px;margin-top: 3px;margin-bottom: 0px;}");
				out.println(".p1{text-align: left;padding-left: 195px;margin-top: 4px;margin-bottom: 0px;}");
				out.println(".p2{text-align: left;padding-left: 147px;margin-top: 1px;margin-bottom: 0px;}");
				out.println("");
				out.println("");
				out.println("");
				out.println("");
				out.println("</STYLE>");
				out.println("</HEAD>");
				out.println("");
				out.println("<BODY>");
				out.println("<div style=\"margin-left: 150px;\" >");
				out.println("<a target=\"_blank\" style=\"position:fixed;top:120px;right:-14px;z-index:10;\" onclick=\"window.print()\">Print</a>");
				out.println("<DIV id=\"page_1\">");
				out.println("<DIV id=\"p1dimg1\">");
				out.println("<IMG src=\"data:image/jpg;base64,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6fMfyP4Nj1zFDpMkyiNlWG0zyvV5fd+Pr8vQdweg3FUIgUZwBgZOa6KVJ3vI5qk1tEWiiiukxCiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAK5bxff3mm273dhdRieFd/wBnk3YkA52jaep7fhkEcjqaie2glffJDG7YxllBNTJNqyKhJRkm1c8mT4j+LJ0Jh8PXMh9VjZh+iZ/Wsi813xhqqNJe6beLYN8ssFvG6NKB/DuOWA6nI4r28WdqGDC2hDDoQgzUjokiFHVWU9QwyDWToya1kdscXTi7xpL8TzfQNX0iO2WC0vNQs8FVZLm4aUIxxhQxbb36Zz04rdOuacrrG3iqEFgdoOzJx1xx/WtK/wDCej6i4ee1UsDu3YBbPruPI/A1mH4d6MTFxIFh/wBWBI42/T5vYVHsprSyZDqUZu7bX3Mytc1XSfsjRX2oXtzGw3Ytp2j3A9PmD7QDz1IzwK4u11fxPpy+domm36aanKW1yrSlQe6twxB74OM16xY+DdEsGVobQEoAqluSo9j1H51uRxRwrtjRVGckAdTTVGTd27ehccVTpx5VHmXn/kjyMfEXxbDCGm8O3KjHDeW6j/x5Cf1rqvB+r6jrO281G4jheQkrapvyo5GGz3PXoB0xk9Ove1t5H3vbxM394oCaVbW3Rw6QRK46MEAIrRU5J3bMqlenKNo00n/XclooorU5QooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKRmCqWYgKBkkngClrm/EkZF1DLkbWTaPXIP/1xQBsyanZRLua6jIzj5TuP5CoJNesEXKu8hz0VDn9cVyJak3Ggdjqv+Ejs/wDnnP8A98j/ABo/4SOz/wCec/8A3yP8a5XcfWjJ9aAsdV/wkdn/AM85/wDvkf40+PxBZO2G8yMY6svH6Zrktx9aNxoCx2S6zp7MFFwMk45UgfnirUdzBM22KeN2AzhXBOK4TcaUHNAWO/oqG1h+z2kUOFBRADt6Z7/rU1AgooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACism+12G3JjgAmkx94H5R+Pft/jWTbavMNTW4nkJQkqy9lU+g/AH3xQB1lFNeRIkLyOqKOrMcAVkXPiGBAy26NI3ZmGF6fn/KgDZqtcX9ranE06KwOCo5I/Ac1y11q13dE75SikY2JwP8A6/41R3elAWOmm8Rwo2IYXkGTksdo/DrWRfapLfxqk0cQ2nIZQc/Tk1n5PrSUDsKetJRiikMKKXFGOvtQAlFAGaMUDCnowUgkA4OSD3pmKKBG/F4kmGfNt0b02Erj+daMOu2UzbSzxHIA8xeD+Iz+tcfS7jTFY79JElQPG6up6MpyDTq4KKeSFt0cjxsRjKkjita28Q3MeROqzDsfukfkP6UCOnoqnaana3uBHJh/7j8N/wDX6dqg1y7+z2JjU/PNlR9O/wDh+NAGnRXLWOuT252zlpo/c/MvPr3/ABrobS9gvYy8L5xjcp4K/WgCxRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRWdqOrxWOY1G+fGQvZfrQBauruGziMkzgccL3b6Cua1DWZrslEJihycAHlh7/4fzqjc3UtzL5kzl3xjJ7VXJzQNIUtmlU84ptFIdieW4klCCSRmCDaoJ4UYxx+VQliaSlA5GaAsJS45xS8E4xQp7UAIAOTRwRxQDjg0ZGMCgBT164ox1FJk0maAsOzjHuKAMZptFAWFHWlPAxTaKAHE/MaD0HekyaM80AKRz7UmOKAeppRwtADSMUdKceOe+KTHHPWgLihvWpprqa4VfNlaTYMLuOcVXxxmigLBmpI5njcOjsjjoynBqOigLHT6drqyfu7wqjcBZAOD9fT+X0rbrz4NitXTNYeyHluDJCT0zyvrj/CmKx1lFMiljniWWJgyMMgin0CCiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiisXWdWMBa1tyRLj53/ALoPYe/v/kAC6prX2dzBbbWkHDueQvsPeuZeQsxYklickk8mkZuwptA0gooo60igpcccnFGB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oAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKAKGt/8gif/AID/AOhCuOIy34V2+oKG065DAEeUx5HcCuJ/iFAITb70bfenUUDuN2+9Lg+tLRQFxBnOM0tIeopaBBSEZFLRQBHRT245xTKRSCiiigYUUUUAFSDoKjqQdBQJhRTSQRSA4pisPoNIGzSmgQU1s06igBB6mloooAa3Wm05utNpFIKKKKBhRRRQAUoGTSDipB0oE2FFITj60tMkD0pMHHWg9DS0AN2+9G33p1GaB3G7fejbx1p1IehoC5oaH/yFrf8A4F/6Ca6+uU0CLfqatnHloWxjr2/rXV0CCiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigAooooAKKKKACiiigBGUMpVgCpGCCOCK4J1KNtYFWBwQeorvq4zVovK1K5XOctuzj15/rQBUpPel7UnPtQAc5paT3zmloARulLRSDpQAtFFFABTSD2FOooAYRikp5UUhX0pFXG0UuCO1JQMKf/DTKkHQUCYzB9KNp9KfRTFcj60/oKRe9ONAMQnApN3tSt0poGTQCF3e1OByKYRg05fu0AxG602nN1ptIaCiil2n0oGJS4NLt4pcAUCuJ0GSBThTW6Uo5FMQgBzk06jNFAhD2FLSdW+lLQAU3A4zSnpR0NAwAx3obpSikP3hQBu+G4wZriXJ3KoUemD/APqFdFWV4fh8vTjIQuZHJBHXA45/EH861aBBRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAUUUUAFFFFABRRRQAVzniSLFxBLn7yFcY6YOf610dZ+t25n0x8ZLRnzAAfTr+hNAHIDpj0oPSjo31paAE46UZpPoMUdMjuaBjqTo31paQ9KBC0UdaKACiim7qAHUU0HJp1ABSFc0tFADCCKeOgphOaVT2NA2OooooEFBooNACN0po60+jA9KB3GHrTl+7S4HpScCgLiN1pNpoJyaVTnikPoKBiloopkhTSfmFLnLUjDkGgY4+lNwfWlyKAc0AAGPrS9KKQ8nFAgHSloooAQ9cZo57GgEd6AO9AxaQdSaUnAq3pVt9p1CGMjKg7m+XIwOefr0/GgR1lnbi1s4oeMovODkZ7/rmp6KKACiiigAooooAKKKKACiiigA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\" id=\"p1img1\"></DIV>");
				out.println("");
				out.println("");
				out.println("<DIV class=\"dclr\"></DIV>");
				out.println("<P class=\"p0 ft1\"><SPAN class=\"ft0\">R</SPAN>AJIV GANDHI PROUDYOGIKI VISHWAVIDYALAYA</P>");
				out.println("");
				out.println("<P class=\"p1 ft2\">(Dual Degree Integrated PG-Programm)</P>");
				out.println("<P class=\"p2 ft3\">Airport Bypass Road Gandhi Nagar, Bhopal – 462 033 Tel: 91 755 2678855</P>");
				out.println("");
				out.println("<p></p>");
				out.println("<div><table border=\"0\" width=\"100%\">");
				out.println("		<tr>");
				out.println("				<td>&nbsp;</td>");
				out.println("				<td>&nbsp;</td>");
				out.println("		</tr>");
				out.println("		<tr>");
				out.println("				<td>&nbsp;</td>");
				out.println("				<td>&nbsp;</td>");
				out.println("		</tr>");
				out.println("		<tr>");
				out.println("		<td>Name - <b>"+std.getStudentName(enrollment)+"</b></td>");
				out.println("		<td align=\"center\">Enrollment -"+enrollment+"<b></b></td>");
				out.println("		</tr>");
				out.println("");
				out.println("	");
				out.println("		<tr>");
				out.println("				<td>&nbsp;</td>");
				out.println("				<td>&nbsp;</td>");
				out.println("		</tr>");
				out.println("		<tr>");
				out.println("		<td>Semester - <b>"+request.getParameter("sem")+"</b></td>");
				out.println("		<td align=\"center\">Branch -<b>"+branch+"</b></td>");
				out.println("		</tr>");
				out.println("");
				out.println("		<tr>");
				out.println("				<td>&nbsp;</td>");
				out.println("				<td>&nbsp;</td>");
				out.println("		</tr>");
				out.println("");
				out.println("		<table border=\"2\" width=\"100%\">");
				out.println("			<tr>");
				out.println("				<td align=\"center\"><b>Subject-Code</b></td>");
				out.println("				<td align=\"center\"><b>Subject-Name</b></td>");
				out.println("				<td align=\"center\"><b>Marks-Obtained</b></td>");
				out.println("			</tr>");
				out.println("");
				out.println("			<!---Dynamic Marks Data Here(Animesh Singh)--->");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(0)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(0)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub1()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(1)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(1)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub2()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(2)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(2)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub3()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(3)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(3)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub4()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(4)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(4)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub5()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(5)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(5)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub6()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(6)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(6)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub7()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(7)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(7)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub8()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(8)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(8)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub9()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(9)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(9)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub10()+"</td>");
				out.println("			</tr>");
				out.println("			<tr>");
				out.println("					<!--Subject_Code-->");
				out.println("					<td align=\"center\">"+subid.get(10)+"</td>");
				out.println("					<!--Subject_Name-->");
				out.println("					<td align=\"center\">"+subname.get(10)+"</td>");
				out.println("					<!--marks-->");
				out.println("					<td align=\"center\">"+res.getSub11()+"</td>");
				out.println("			</tr>");
				out.println("		</table>");
				out.println("		");
				out.println("</table></div>");
				out.println("</DIV>");
				out.println("	<p>Result : <b>Pass</b></p>");
				out.println("	");
				out.println("	<p>CGPA :<b>"+res.getCgpa()+"</b></p>");
				out.println("<div align=\"right\"><b><a href=\"home\">Home</a></b></div>");
				out.println("	");
				out.println("</div>");
				out.println("</BODY>");
				out.println("</HTML>");
		}
		else
			response.sendRedirect("info?text=NO Result Available for Student:  "+std.getStudentName((String)session.getAttribute("enroll")+""));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
