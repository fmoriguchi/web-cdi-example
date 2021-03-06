package com.fmoriguchi.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author fmoriguchi
 *
 */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	Message test;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		try (PrintWriter out = resp.getWriter()) {
			out.write(test.message());
			out.flush();
		}

	}
}
