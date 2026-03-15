package br.com.curso.spring.Curso.de.Spring.filter;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import at.favre.lib.crypto.bcrypt.BCrypt;
import br.com.curso.spring.Curso.de.Spring.user.IUserRepository;

@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Autowired
    private IUserRepository userRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        var serletPath = request.getServletPath();

        if (serletPath.equals("/tasks/")) {

            var autorization = request.getHeader("Autorization");

            var authEncoded = autorization.substring("Basic ".length()).trim();

            byte[] authdecoded = Base64.getDecoder().decode(authEncoded);

            var authDecoded = new String(authdecoded);

            String[] credentials = authDecoded.split(":");
            String username = credentials[0];
            String password = credentials[1];

            var user = this.userRepository.findByUserName(username);
            if (user == null) {

                response.sendError(401);

            } else {

                var passwordVerify = BCrypt.verifyer().verify(password.toCharArray(), user.getPassword().toCharArray());
                if (passwordVerify.verified) {
                    request.setAttribute("idUser", user.getId());
                    filterChain.doFilter(request, response);

                } else {
                    response.sendError(401);
                }

            }

        } else {
            filterChain.doFilter(request, response);
        }

    }
}
