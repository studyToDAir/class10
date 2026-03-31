package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo.service.TodoService;

@WebServlet("/todo/modify")
public class TodoModifyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo/modify goGet 실행");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8;");
		
		String todo_id = request.getParameter("todo_id");
		System.out.println("todo_id: "+ todo_id);
		
		int nTodo_id = Integer.parseInt(todo_id);
		
		// nTodo_id를 service --> DAO 까지 보낼꺼임
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = todoService.getTodo(nTodo_id);
		
		System.out.println(todoDTO);
		
		
		//----------------------------
		

		PrintWriter out = response.getWriter();
		// "목록으로" a tag
		out.write("<form method='post' action='update'>");
		out.write("		todo_id: "+ todoDTO.getTodo_id() +" <br>");
		out.write("		<input type=hidden name='todo_id' value='"+ todoDTO.getTodo_id() +"'>");
		out.write("		duedate: <input type=date name='duedate' value='"+ todoDTO.getDuedate() +"'> <br>");
		out.write("		done: <input type=number name='done' value='"+ todoDTO.getDone() +"'> <br>");
		out.write("		content: <input type=text name='content' value='"+ todoDTO.getContent() +"'> <br>");
		out.write("		ctime: <input type=date name='ctime' value='"+ todoDTO.getCtime() +"'> <br>");
		out.write("     <input type='submit' value='수정'> ");
		out.write("</form>");
		
		
	}

}
