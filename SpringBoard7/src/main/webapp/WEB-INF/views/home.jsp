<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="include/header.jsp" />

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<input type="button" class="btn-lg btn-success "  value="버튼" >
<button type="button" class="btn btn-block btn-danger btn-lg">Danger</button>
<a class="btn btn-block btn-social btn-github">
<i class="fa fa-github"></i> Sign in with GitHub
</a>

<jsp:include page="include/footer.jsp" />