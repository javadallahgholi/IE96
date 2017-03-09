<%--
  Created by IntelliJ IDEA.
  User: j-ghazvne
  Date: 3/6/17
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="utf-8">
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.css">

    <link rel="stylesheet" href="Main.css"/>
</head>
<body>
<div class="container">
    <!--Header-->
    <div class="top-bar">
        <div class="panel-body">
            <div class="row">
                <div class="col-md-10"> جواد اله قلی
                    <i class="fa fa-user" aria-hidden="true"></i>
                </div>
                <div class="col-md-2"> اکبر تیکت
                    <img id="LogoWhite" src="assets/LogoWhite.png">
                </div>
            </div>
        </div>
        <div class="line"></div>
    </div>
    <!--Main Part-->
    <div class="row">
    </div>
    <!--upper-->
    <div class="col-md-6 col-centered pull-right">
        <div class="choose row">
            <div class="twoway col-md-6">
                <a href="#" class="ttype2">دو‌طرفه</a>
            </div>
            <div class="oneway col-md-6">
                <a href="#" class="ttype">یک‌طرفه</a>
            </div>
        </div>
        <div class="form form-inline">
            <div class="form-inputs row">
                <div class="col-md-8">
                    <select class="form-control input-form" id="sl1">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                <div class="col-md-2">مبدأ</div>
                <i class="fa fa-plane fa-lg col-md-2" aria-hidden="true"></i>
            </div>

            <div class="form-inputs row">
                <div class="col-md-8">
                    <select class="form-control input-form" id="sel">
                        <option>1</option>
                        <option>2</option>
                        <option>3</option>
                        <option>4</option>
                    </select>
                </div>
                <div class="col-md-2">مقصد</div>
                <i class="fa fa-plane fa-lg col-md-2" aria-hidden="true"></i>
            </div>

            <div class="form-inputs row">
                <div class="col-md-8">
                    <input type="text" value="۱۳۹۵/۱۱/۲۵" class="form-control ">
                </div>
                <div class="col-md-2">رفت</div>
                <i class="fa fa-calendar fa-lg col-md-2" aria-hidden="true"></i>
            </div>

            <div class="form-inputs row">
                <div class="col-md-8">
                    <input type="text" value="۱۳۹۵/۱۱/۲۵" class="form-control notacc" disabled>
                </div>
                <div class="col-md-2">برگشت</div>
                <i class="fa fa-calendar fa-lg col-md-2" aria-hidden="true"></i>
            </div>

            <div class="row form-inputs">
                <div class="col-md-4">
                    <h3>نوزاد زیر ۲ سال</h3>
                    <div class="row">
                        <div class="col-md-8">
                            <select class="form-control col-md-6" id="sel1">
                                <option>۱</option>
                                <option>۲</option>
                                <option>۳</option>
                                <option>۴</option>
                            </select>
                        </div>
                        <div class="col-md">
                            <i class="fa fa-child" aria-hidden="true"></i>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <h3>کودک زیر ۱۲ سال</h3>
                    <div class="row">
                        <div class="col-md-8">
                            <select class="form-control col-md-6" id="sel2">
                                <option>۱</option>
                                <option>۲</option>
                                <option>۳</option>
                                <option>۴</option>
                            </select>
                        </div>
                        <div class="col-md">
                            <i class="fa fa-child fa-lg" aria-hidden="true"></i>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <h3>بزرگ‌سال</h3>
                    <div class="row">
                        <div class="col-md-8">
                            <select class="form-control col-md-6" id="sel3">
                                <option>۱</option>
                                <option>۲</option>
                                <option>۳</option>
                                <option>۴</option>
                            </select>
                        </div>
                        <div class="col-md">
                            <i class="fa fa-male fa-lg" aria-hidden="true"></i>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <!--<div class="form">-->
        <!--<form class="form-horizontal">-->


        <!--<div class="form-group ">-->
        <!--<label for="in2" class="col-sm-3 control-label pull-right"><i class="fa fa-plane fa-lg " aria-hidden="true"></i>-->
        <!--مقصد-->
        <!--</label>-->
        <!--<div class="col-sm-9 pull-right">-->
        <!--<select class="form-control" id="in2">-->
        <!--<option>1</option>-->
        <!--<option>2</option>-->
        <!--<option>3</option>-->
        <!--<option>4</option>-->
        <!--<option>5</option>-->
        <!--</select>-->
        <!--&lt;!&ndash;<input type="email" class="form-control" id="in2" placeholder="Email">&ndash;&gt;-->
        <!--</div>-->
        <!--</div>-->
        <!--<div class="form-group ">-->
        <!--<label for="in2" class="col-sm-3 control-label pull-right"><i class="fa fa-plane fa-lg " aria-hidden="true"></i>-->
        <!--مقصد-->
        <!--</label>-->
        <!--<div class="col-sm-9 pull-right">-->
        <!--<select class="form-control" id="in2">-->
        <!--<option>1</option>-->
        <!--<option>2</option>-->
        <!--<option>3</option>-->
        <!--<option>4</option>-->
        <!--<option>5</option>-->
        <!--</select>-->
        <!--&lt;!&ndash;<input type="email" class="form-control" id="in2" placeholder="Email">&ndash;&gt;-->
        <!--</div>-->
        <!--</div>-->
        <!--<div class="form-group ">-->
        <!--<label for="in3" class="col-sm-3 control-label pull-right"><i class="fa fa-plane fa-lg " aria-hidden="true"></i>-->
        <!--رفت-->
        <!--</label>-->
        <!--<div class="col-sm-9 pull-right">-->
        <!--<input type="email" class="form-control" id="in3" placeholder="۱۳۹۵/۱۱/۲۵">-->
        <!--</div>-->
        <!--</div>-->
        <!--<div class="form-group ">-->
        <!--<label for="in4" class="col-sm-3 control-label pull-right "><i class="fa fa-plane fa-lg " aria-hidden="true"></i>-->
        <!--برگشت-->
        <!--</label>-->
        <!--<div class="col-sm-9 pull-right">-->
        <!--<input type="email" class="form-control notacc" id="in4" placeholder="۱۳۹۵/۱۱/۲۵">-->
        <!--</div>-->
        <!--</div>-->



        <!--</form>-->
        <!--<div class="row">-->
        <!--<div class="col-md-4 pull-right">-->
        <!--<h5>نوزاد زیر ۲ سال</h5>-->
        <!--<i class="fa fa-plane fa-lg" aria-hidden="true"></i>-->
        <!--<select >-->
        <!--<option>1</option>-->
        <!--<option>2</option>-->
        <!--<option>3</option>-->
        <!--<option>4</option>-->
        <!--<option>5</option>-->
        <!--</select>-->
        <!--</div>-->
        <!--<div class="col-md-4 pull-right">-->
        <!--<h5>نوزاد زیر ۲ سال</h5>-->
        <!--<i class="fa fa-plane fa-lg" aria-hidden="true"></i>-->
        <!--<select >-->
        <!--<option>1</option>-->
        <!--<option>2</option>-->
        <!--<option>3</option>-->
        <!--<option>4</option>-->
        <!--<option>5</option>-->
        <!--</select>-->
        <!--</div>-->
        <!--<div class="col-md-4 pull-right">-->
        <!--<h5>نوزاد زیر ۲ سال</h5>-->
        <!--<i class="fa fa-plane fa-lg" aria-hidden="true"></i>-->
        <!--<select >-->
        <!--<option>1</option>-->
        <!--<option>2</option>-->
        <!--<option>3</option>-->
        <!--<option>4</option>-->
        <!--<option>5</option>-->
        <!--</select>-->
        <!--</div>-->
        <!--</div>-->
        <!--</div>-->

        <form method='get' action="/result.jsp">
            <button class="search">جستجو</button>
        </form>
    </div>
    <div class="col-md-6 col-centered pull-left">
        <div class="css-slideshow">
            <figure>
                <img src="assets/HomeSlideShow/1.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/2.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/3.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/4.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/5.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/6.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/7.png" width="250" height="350" />
            </figure>
            <figure>
                <img src="assets/HomeSlideShow/8.png" width="250" height="350" />
            </figure>
        </div>
        <h2 class="padd">سفری ارزان و آسان
            با اکبر‌تیکت</h2>
    </div>

</div>

<div class="copyright"> امیرعلی مشایخی ، جواد الله‌قلی | دانشکده فنی دانشگاه تهران، بهار ۱۳۹۶</div>

</div>
</body>
</html>