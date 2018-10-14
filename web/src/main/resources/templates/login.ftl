<!DOCTYPE html>
<html>

<head>

    <#assign ctx=request.contextPath />
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - 登录</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico"> <link href="${ctx}/h_style/css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="${ctx}/h_style/css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="${ctx}/h_style/css/animate.css" rel="stylesheet">
    <link href="${ctx}/h_style/css/style.css?v=4.1.0" rel="stylesheet">
    <!--[if lt IE 9]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
    <script type="text/javascript">
        //if(window.top !== window.self){ window.top.location = window.location;}

        function toCheck(){
            var username=$("#username").val();
            var password=$("#password").val();
            if(username==""){
                alert("请填写用户名！");
                return ;
            }
            if(password==""){
                alert("请输入密码！");
                return ;
            }
            $.ajax({
                type : "post",//向后台请求的方式，有post，get两种方法
                url :  "/validateUser",//url填写的是请求的路径
                cache : false,//缓存是否打开
                data:$("#frm").serialize(),
                success : function(msg) {//请求的返回成功的方法
                    if (msg=="fail") {
                        alert("用户名或密码有误，请重新输入！");
                    } else {
                        location.href="/v1/index";
                    }
                },
                error : function(XMLHttpRequest, textStatus, errorThrown) {//请求的失败的返回的方法
                    alert("删除失败，请稍后再次尝试删除！");
                }
            });
        }
    </script>
</head>

<body class="gray-bg">

    <div class="middle-box text-center loginscreen  animated fadeInDown">
        <div>
            <div>

                <h1 class="logo-name">S.D</h1>

            </div>
            <h3>欢迎使用 Smart Doc</h3>

            <form  name="frm" id="frm" method="post" action="">
                <div class="form-group">
                    <input type="text" name="username" id="username" class="form-control" placeholder="用户名" >
                </div>
                <div class="form-group">
                    <input type="password" name="password" id="password" class="form-control" placeholder="密码" >
                </div>
                <a href="###" onclick="toCheck()" class="btn btn-primary block full-width m-b">登 录</a>


                <p class="text-muted text-center"> <a href="login.ftl#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
                </p>

            </form>
        </div>
    </div>

    <!-- 全局js -->
    <script src="${ctx}/h_style/js/jquery.min.js?v=2.1.4"></script>
    <script src="${ctx}/h_style/js/bootstrap.min.js?v=3.3.6"></script>



</body>

</html>
