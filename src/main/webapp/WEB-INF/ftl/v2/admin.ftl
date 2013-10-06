<#include "header.ftl">
<#assign Title='爱苦读' />
<#include "header_top.ftl">
<#assign Menu=[{
	'name':'图书管理',
	'url':'/book/all'
}] />
<#include "sidebar.ftl">
<div id="main-content" class="clearfix">
	<div id="page-content" class="clearfix">
		<div class="alert alert-success text-center" style="padding:100px 10px;">
			你好，${User.detail.nickname!User.detail.fullname!User.username}!
		</div>
	</div>
</div>
<script type="text/javascript">
var PageContext = {
	init: function(){
	}
};
</script>
<#include "footer.ftl">