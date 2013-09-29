<#include "header.ftl">
<#include "menu.ftl">
<div class="breadcrumbs margin-bottom-40">
	<div class="container">
		<h1 class="color-green pull-left">登录</h1>
		<ul class="pull-right breadcrumb">
			<li class="active">登录后可免费下载书籍、推送到 Kindle...</li>
		</ul>
	</div>
</div>

<div class="container">
	<div class="row-fluid">
		<form method="post" action="${ContextPath}/login" class="log-page">
			<h3>登录</h3>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-user"></i></span>
				<input name="j_username" type="text" placeholder="用户名/手机号/电子邮件" class="input-xlarge">
			</div>
			<div class="input-prepend">
				<span class="add-on"><i class="icon-lock"></i></span>
				<input name="j_password" type="password" placeholder="密码" class="input-xlarge">
			</div>
			<div class="controls form-inline">
				<label class="checkbox"><input type="checkbox"> 记住我</label>
				<button type="submit" class="btn-u pull-right">登录</button>
			</div>
			<hr>
			<h4>忘记密码?</h4>
			<p>别担心, 你可以 <a href="#" class="color-green">重置密码</a> 。</p>
		</form>
	</div>
</div>
<#include "copyright.ftl">
<script type="text/javascript">
	window.PageContext = {
		activeNav: 'login',
		init: function(){
		}
	};
</script>
<#include "footer.ftl">