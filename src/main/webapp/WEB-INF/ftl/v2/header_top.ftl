<#assign TopNav=[] />
<div class="navbar navbar-inverse navbar-fixed-top">
	<div class="navbar-inner">
		<div class="container-fluid">
			<a href="#" class="brand">
				<small>${Title!}</small>
			</a>
			<ul class="nav ace-nav pull-right">
				<li class="light-blue user-profile">
					<a class="user-menu dropdown-toggle" href="#" data-toggle="dropdown">
						<img src="http://www.gravatar.com/avatar/${User.detail.gravatar}?d=monsterid" class="nav-user-photo">
						<span id="user_info">
							<small>你好，</small>
							${User.detail.nickname!User.detail.fullname!User.username}!
						</span>
						<i class="icon-caret-down"></i>
					</a>
					<ul class="pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-closer" id="user_menu">
						<#if TopNav?has_content>
						<#list TopNav as nav>
						<#if nav?is_string && nav=='divider'>
						<li class="divider"></li>
						<#else>
						<li id="${nav.id!}">
							<a href="<#if nav.url?has_content>${ContextPath}${nav.url}<#else>javascript:void(0);</#if>">
								<i class="icon-wrench"></i> ${nav.name!}
							</a>
						</li>
						</#if>
						</#list>
						</#if>
						<li><a href="${ContextPath}/logout"><i class="icon-off"></i> 退出</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
</div>
<div class="container-fluid" id="main-container">