<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<title>JYP Bank</title>
	<%@ include file="/JSP/include/link.jsp" %>
</head>
<body>
<%@ include file="/JSP/include/topMenu.jsp" %>
<div id="spinner"
     class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
	<div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
		<span class="sr-only">Loading...</span>
	</div>
</div>
<div class="container-fluid p-0 pb-5 wow fadeIn" data-wow-delay="0.1s">
	<div class="owl-carousel header-carousel position-relative">
		<div class="owl-carousel-item position-relative" data-dot="<img src='img/carousel-1.jpg'>">
			<img class="img-fluid" src="img/carousel-1.jpg" alt="">
			<div class="owl-carousel-inner">
				<div class="container">
					<div class="row justify-content-start">
						<div class="col-10 col-lg-8">
							<h1 class="display-2 text-white animated slideInDown">JYP Bank</h1>
							<p class="fs-5 fw-medium text-white mb-4 pb-3">Vero elitr justo clita lorem. Ipsum dolor at
								sed stet sit diam no. Kasd rebum ipsum et diam justo clita et kasd rebum sea elitr.</p>
							<a href="" class="btn btn-primary rounded-pill py-3 px-5 animated slideInLeft">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="owl-carousel-item position-relative" data-dot="<img src='img/carousel-2.jpg'>">
			<img class="img-fluid" src="img/carousel-2.jpg" alt="">
			<div class="owl-carousel-inner">
				<div class="container">
					<div class="row justify-content-start">
						<div class="col-10 col-lg-8">
							<h1 class="display-2 text-white animated slideInDown">JYP Bank</h1>
							<p class="fs-5 fw-medium text-white mb-4 pb-3">Vero elitr justo clita lorem. Ipsum dolor at
								sed stet sit diam no. Kasd rebum ipsum et diam justo clita et kasd rebum sea elitr.</p>
							<a href="" class="btn btn-primary rounded-pill py-3 px-5 animated slideInLeft">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="owl-carousel-item position-relative" data-dot="<img src='img/carousel-3.jpg'>">
			<img class="img-fluid" src="img/carousel-3.jpg" alt="">
			<div class="owl-carousel-inner">
				<div class="container">
					<div class="row justify-content-start">
						<div class="col-10 col-lg-8">
							<h1 class="display-2 text-white animated slideInDown">JYP Bank</h1>
							<p class="fs-5 fw-medium text-white mb-4 pb-3">Vero elitr justo clita lorem. Ipsum dolor at
								sed stet sit diam no. Kasd rebum ipsum et diam justo clita et kasd rebum sea elitr.</p>
							<a href="" class="btn btn-primary rounded-pill py-3 px-5 animated slideInLeft">Read More</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<div class="container-xxl py-5">
	<div class="container">
		<div class="row g-5">
			<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.1s">
				<div class="d-flex align-items-center mb-4">
					<div class="btn-lg-square bg-primary rounded-circle me-3">
						<i class="fa fa-users text-white"></i>
					</div>
					<h1 class="mb-0" data-toggle="counter-up">10,000,000</h1>
				</div>
				<h5 class="mb-3">가입한 고객님</h5>
				<span>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit</span>
			</div>
			<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.3s">
				<div class="d-flex align-items-center mb-4">
					<div class="btn-lg-square bg-primary rounded-circle me-3">
						<i class="fa fa-check text-white"></i>
					</div>
					<h1 class="mb-0" data-toggle="counter-up">20,000,000</h1>
				</div>
				<h5 class="mb-3">계좌 개설 수</h5>
				<span>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit</span>
			</div>
			<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.5s">
				<div class="d-flex align-items-center mb-4">
					<div class="btn-lg-square bg-primary rounded-circle me-3">
						<i class="fa fa-award text-white"></i>
					</div>
					<h1 class="mb-0" data-toggle="counter-up">100,000,000</h1>
				</div>
				<h5 class="mb-3">일간 거래량</h5>
				<span>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit</span>
			</div>
			<div class="col-md-6 col-lg-3 wow fadeIn" data-wow-delay="0.7s">
				<div class="d-flex align-items-center mb-4">
					<div class="btn-lg-square bg-primary rounded-circle me-3">
						<i class="fa fa-users-cog text-white"></i>
					</div>
					<h1 class="mb-0" data-toggle="counter-up">321</h1>
				</div>
				<h5 class="mb-3">JYP Bank 나이</h5>
				<span>Tempor erat elitr rebum at clita. Diam dolor diam ipsum sit</span>
			</div>
		</div>
	</div>
</div>
<%@ include file="/JSP/include/footer.jsp" %>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<script src="lib/wow/wow.min.js"></script>
<script src="lib/easing/easing.min.js"></script>
<script src="lib/waypoints/waypoints.min.js"></script>
<script src="lib/counterup/counterup.min.js"></script>
<script src="lib/owlcarousel/owl.carousel.min.js"></script>
<script src="lib/isotope/isotope.pkgd.min.js"></script>
<script src="lib/lightbox/js/lightbox.min.js"></script>
<script src="js/main.js"></script>
</body>
</html>