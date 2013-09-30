<div class="header">
	<div class="container">
		<div class="navbar">
			<div class="navbar-inner">
				<div class="nav-collapse collapse">
					<ul class="nav">
						<li data-active-nav="index">
							<a href="${ContextPath}/">首页</a>
						</li>
						<li data-active-nav="reading-random">
							<a href="${ContextPath}/reading/random.html">随机阅读</a>
						</li>
					</ul>
					<ul class="nav pull-right">
						<#if User?has_content>
						<li>
							<img src="http://www.gravatar.com/avatar/${User.detail.gravatar}?s=67&d=monsterid" />
						</li>
						<li data-active-nav="user">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								${User.detail.nickname!User.detail.fullname!User.username} 
								<b class="caret"></b> 
							</a>
							<ul class="dropdown-menu">
								<#if User.detail.roles?seq_contains('ROLE_ADMIN')>
								<li><a href="${ContextPath}/admin" target="blank">管理</a></li>
								</#if>
								<li><a href="${ContextPath}/logout">退出</a></li>
							</ul>
						</li>
						<#else>
						<li data-active-nav="signup">
							<a href="${ContextPath}/signup.html">注册</a>
						</li>
						<li data-active-nav="login">
							<a href="${ContextPath}/login.html">登录</a>
						</li>
						</#if>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
