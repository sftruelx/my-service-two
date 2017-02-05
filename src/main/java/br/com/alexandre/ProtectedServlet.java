package br.com.alexandre;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/protected", name="protectedServlet")
public class ProtectedServlet extends HttpServlet {

	private static final long serialVersionUID = -4718739199311134131L;

	@SuppressWarnings("deprecation")
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*final String targetUrl = "https://localhost:8443/my-service-three/protected";
		
		final CasAuthenticationToken token = (CasAuthenticationToken) req.getUserPrincipal();

		final User user = (User) token.getPrincipal();
		
		final String proxyTicket = token.getAssertion().getPrincipal().getProxyTicketFor(targetUrl);
				
		final String serviceUrl = targetUrl + "?ticket=" + URLEncoder.encode(proxyTicket, "UTF-8");
		
		final String proxyResponse = CommonUtils.getResponseFromServer(serviceUrl, "UTF-8");

		resp.getWriter().println();
		resp.getWriter().println("########################## My Service Two ##########################");
		resp.getWriter().println("UserName: " + user.getUsername());
		resp.getWriter().println("Authorities: " + user.getAuthorities());
		resp.getWriter().println("Account Non Expired: " + user.isAccountNonExpired());
		resp.getWriter().println("Account Non Locked: " + user.isAccountNonLocked());
		resp.getWriter().println("Credentials Non Expired: " + user.isCredentialsNonExpired());
		resp.getWriter().println("Target URL: " + targetUrl);
		resp.getWriter().println("Service URL: " + serviceUrl);
		resp.getWriter().println("Proxy Ticket: " + proxyTicket);
		resp.getWriter().println("Proxy Response: " + proxyResponse);*/
		resp.getWriter().println("########################## My Service Two ##########################");
		resp.getWriter().println();
	}

}
