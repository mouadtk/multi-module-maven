<nav class="navbar-default navbar-static-side" role="navigation">
	<div class="sidebar-collapse">
		<ul class="nav metismenu" id="side-menu">
			<li class="nav-header">
				<!-- avatar start-->
				<div class="dropdown profile-element">
					<span> <img alt="image" class="img-circle"
						src="${pageContext.request.contextPath}/assets/img/entities/avatar.jpg" style="height:70px;"/>
					</span> 
<!-- 					<a data-toggle="dropdown" class="dropdown-toggle" href="#"> <span -->
<!-- 						class="clear"> <span class="block m-t-xs"> <strong -->
<%-- 								class="font-bold"><sec:authentication property="principal.username" /></strong> --%>
<!-- 						</span> <span class="text-muted text-xs block">Profile <b class="caret"></b></span> -->
<!-- 					</span> -->
<!-- 					</a> -->
					<ul class="dropdown-menu animated fadeInRight m-t-xs">
						<li><a href='<c:url value="/Auth/logout"/>'>Logout</a></li>
					</ul>
				</div> <!-- avatar End-->
				<div class="logo-element">Send OPM+</div>
			</li>
			<!-- Menu Links Start  -->			
			<li><a href="#"><i class="fa fa-files-o"></i> <span
					class="nav-label">Campaigns </span><span class="fa arrow"></span></a>
				<ul class="nav nav-second-level collapse " style="">
					<li><a href='<c:url value="/prepare"></c:url>'>Test send </a></li>
				</ul></li>
			
			<!-- Menu Links END-->
		</ul>
	</div>
</nav>