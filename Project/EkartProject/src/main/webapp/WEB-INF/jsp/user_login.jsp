<%@ include file="header.jsp" %>

<div class="container">
<div id="loginbox" style="margin-top: 50px;" class="mainbox col-md-4 col-md-offset-4 col-md-4">
<div class="panel panel-info">
<div class="panel-heading">
<div class="panel-title">SignIn</div>
</div>

<div style="padding-top:30px" class="panel-body">

<form:form modelAttribute="user" method="post" class="form-horizontal" >

<div style="margin-bottom: 25px" class="input-group"> <span class="input-group-addon">username</span>
<form:input path="username" type="text" class="form-control" placeholder="username or email"></form:input>

</div>
<div style="margin-bottom: 25px" class="input-group"> <span class="input-group-addon">password</span>

<form:input path="password" type="password" class="form-control" placeholder="password"/>
</div>
<form:errors path="username" cssClass="text-danger"/>

<div style="margin-top:10px" class="form-group" align='center'>

<div class="col-sm-12 controls">
<form:button type='success' class="btn btn-success">Login</form:button>
</div>
</div>

</form:form>
</div>
</div>
</div>
</div>
