<%--
  Created by IntelliJ IDEA.
  User: j-ghazvne
  Date: 3/6/17
  Time: 8:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

    <link rel="stylesheet" href="font-awesome-4.7.0/css/font-awesome.css">

    <link rel="stylesheet" href="Results.css"/>
</head>
<body>
<div class="container">
    <!--First Header-->
    <div class="top-bar">
        <div class="panel-body">
            <div class="row">
                <div class="col-md-10"> امیرعلی مشایخی
                    <i class="fa fa-user" aria-hidden="true"></i>
                </div>
                <div class="col-md-2"> اکبر تیکت
                    <img id="LogoWhite" src="assets/LogoBlack.png">
                </div>
            </div>
        </div>
    </div>
    <!--Second Header-->
    <div class="list-nav">
        <ul class="list-inline ">
            <li><a href="#" class="col-list-nav">دریافت بلیت</a></li>
            <i class="fa fa-angle-left" aria-hidden="true"></i>
            <li><a href="#" class="col-list-nav">ورود اطلاعات</a></li>
            <i class="fa fa-angle-left col-list-nav-act" aria-hidden="true"></i>
            <li><a href="#" class="col-list-nav-act">انتخاب پرواز</a></li>
            <i class="fa fa-angle-left" aria-hidden="true"></i>
            <li><a href="#" class="col-list-nav">جستوجو پرواز</a></li>
        </ul>
    </div>
    <!--Main Part-->
    <div class="row">
        <div class="col-md-6 left-al">
            ۱۰ پرواز با مشخصات شما پیدا شد
        </div>
        <div class="col-md-6 right-al">
            برگشت به صفحه‌ی جستجو
            <i class="fa fa-arrow-right" aria-hidden="true"></i>
        </div>
    </div>
    <div class="main-section">
        <div class="flight-data">
            <div class="row">
                <div class="col-md-3 price">
                    <h3>ریال ۱٫۳۵۰٫۰۰۰ </h3>
                    <br>
                    <p>رزرو آنلاین</p>
                </div>
                <div class="col-md-6">
                    <div class="list-inline de-arr-time">
                        <li>مشهد ۱۸:۵۰</li>
                        <i class="fa fa-angle-double-left" aria-hidden="true"></i>
                        <li>تهران ۱۷:۴۰</li>
                    </div>
                    <div class="list-inline seat-flight">
                        <li>هشت صندلی باقیمانده کلاس اقتصادی</li>
                        <li>MD83 بویینگ</li>
                    </div>
                </div>
                <div class="col-md-3 flight-no">
                    <h3>ایران ایر ۱۷۴۰</h3>
                    <br>
                    <p>دوشنبه ۱۷ اسفند</p>
                    <i class="fa fa-calendar-o" aria-hidden="true"></i>
                </div>
            </div>
        </div>
        <div class="flight-data">
            <div class="row">
                <div class="col-md-3 price">
                    <h3>ریال ۱٫۳۵۰٫۰۰۰ </h3>
                    <br>
                    <p>رزره آنلاین</p>
                </div>
                <div class="col-md-6">
                    <div class="list-inline de-arr-time">
                        <li>مشهد ۱۸:۵۰</li>
                        <i class="fa fa-angle-double-left" aria-hidden="true"></i>
                        <li>تهران ۱۷:۴۰</li>
                    </div>
                    <div class="list-inline seat-flight">
                        <li>هشت صندلی باقیمانده کلاس اقتصادی</li>
                        <li>MD83 بویینگ</li>
                    </div>
                </div>
                <div class="col-md-3 flight-no">
                    <h3>ایران ایر ۱۷۴۰</h3>
                    <br>
                    <p>دوشنبه ۱۷ اسفند</p>
                    <i class="fa fa-calendar-o" aria-hidden="true"></i>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>