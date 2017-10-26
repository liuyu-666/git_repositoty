<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/24
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>

        #ball {
            width: 20px;
            height: 20px;
            position: absolute;
            left: 70px;
            top:70px;
            background-color: red;
            border-radius: 50%;
            text-align: center;
            line-height: 20px;
        }
        .bug {
            width: 10px;
            height: 10px;
            background-color: red;
            border-radius: 50%;
            position: absolute;
        }

    </style>
</head>
<body>
<h1></h1>
<div class="div"></div>
<div id="ball">艾兴岭</div>
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.js"></script>
<script>
    $(function(){
        var count = 0;
        var $ball = $("div");
        var left = 70;
        var top = 70;
        var bugLeft = 0;
        var bugTop = 0;
        var body = $(".div")
        var width = 20;
        var height =20;
        $(document).keydown(function(){

            if(event.keyCode == 37){
                left = left - 10;
                $ball.css("left",left + "px");
            } else if(event.keyCode == 39){
                left = left + 10;
                $ball.css("left",left + "px");
            } else if(event.keyCode == 38){
                top = top - 10;
                $ball.css("top",top + "px");
            } else if(event.keyCode == 40){
                top = top + 10;
                $ball.css("top",top + "px");
            }

            for(var i = 0 ; i < $(".div>div").length ;i++) {
                if( ($(".div>div")[i].style.left <= (left + width + "px")&&$(".div>div")[i].style.left >= (left + "px")) &&  ($(".div>div")[i].style.top >= (top + "px")&&$(".div>div")[i].style.top <= (top + height + "px"))){
                    $(".div>div")[i].remove();
                    width += 2;
                    height += 2;
                    count++;
                    $("h1").empty();
                    $("h1").append(count);
                    $ball.css("width",width + "px");
                    $ball.css("height",height + "px");
                }
            }
        })


        setInterval(function(){
            var color = parseInt(Math.random()*1000);
            if(color < 100) {
                color += 400;
            }
            bugLeft = parseInt(Math.random()*1300);
            bugLeft = parseInt(bugLeft/10)*10;
            bugTop = parseInt(Math.random()*600);
            bugTop = parseInt(bugTop/10)*10;
            var html = '<div class ="bug" style="left:' + bugLeft + 'px;top:' + bugTop +'px;background-color:#'+color+'"></div>'
            body.append(html);
        },1000)
      /*  setInterval(function(){
            var  ball = $("#ball");
            ball.css();

           $.get("/synchronization").done(
               function(){

               }
           )
        },100)*/

    })


</script>
</body>
</html>
