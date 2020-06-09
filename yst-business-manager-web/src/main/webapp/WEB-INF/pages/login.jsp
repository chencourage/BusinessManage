<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<!DOCTYPE html>
<html>

<jsp:include page="common/head.jsp"></jsp:include>
<body>

    <form method="post">
        <div>
            <!--/*@thymesVar id="error" type=""*/-->
            <span id="basic-addon0">&nbsp;</span>
            <span style="font-size: 12px;color: red" th:text="${error}" aria-describedby="basic-addon0"></span>
        <br />
        </div>
        <div>
            <span id="basic-addon1">@</span>
            <input id="username" name="name" type="text" placeholder="用户名" aria-describedby="basic-addon1" />

        </div>
        <br />
        <div>
            <span id="basic-addon2">@</span>
            <input id="password" name="password" type="password" placeholder="密码" aria-describedby="basic-addon2" />
        </div>
        <br />
        <button id="doLogin" type="button" style="width:190px;">登 录</button>
    </form>


</body>
<jsp:include page="common/foot.jsp"></jsp:include>

<script type="text/javascript">
$('#doLogin').click(function() {
    var param = {
        username : $("#username").val(),
        password : md5($("#password").val())
    };
//    $('#tips').html('登录中，请稍候...');
    $.ajax({ 
        type: "post", 
        url: "<%=request.getContextPath()%>" + "/login", 
        data: param, 
        dataType: "json",
        beforeSend: function (XMLHttpRequest) {
     		XMLHttpRequest.setRequestHeader("Authorization", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1NTE5NDYzMzIsInVzZXJuYW1lIjoidGVzdCJ9.v9FYU_OJuXR1sulc4Of2tYFimr-PQfzXffOKMX3Ld6Q");
        },
        success: function(data) { 
        	console.log(data);
            if(data.code !=1){
            	//alert("成功");
  //          	$('#tips').html(data.msg);
                //登录成功
                //window.location.href = "<%=request.getContextPath()%>/" ;
            }else{
            	alert("失败");
                //登录成功
                window.location.href = "<%=request.getContextPath()%>/" ;
            }
        },
        error: function(data) { 
 //       	$('#tips').html("调用失败...."); 
        }
    });
});

</script>
</html>

