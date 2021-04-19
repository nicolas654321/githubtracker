package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GithubersServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

        Githuber monGithuber1 = new Githuber("gith1", "son1@mail", "gith1login", "1231","http");
        Githuber monGithuber2 = new Githuber("gith2", "son2@mail", "gith2login", "1232","http");
        Githuber monGithuber3 = new Githuber("gith3", "son3@mail", "gith3login", "1233","http");
        Githuber monGithuber4 = new Githuber("gith4", "son4@mail", "gith4login", "1234","http");
        Githuber monGithuber5 = new Githuber("gith5", "son5@mail", "gith5login", "1235","http");

        Githuber[] mesGithubers = new Githuber[]{monGithuber1, monGithuber2, monGithuber3,monGithuber4, monGithuber5};
        // ${pageContext.request.contextPath}/
        req.setAttribute("githubers", mesGithubers);
        req.getRequestDispatcher("/githubers.jsp").forward(req, rep);
    }



}
