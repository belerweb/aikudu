<#assign ContextPath=springMacroRequestContext.getContextPath() />
<#include "/macro.ftl">
<div id="page-content" class="clearfix" style="position:releative;">
	<div class="row-fluid">
		<h3 class="header smaller lighter blue">
			编辑图书信息
			<small>
				<i class="icon-double-angle-right"></i>
				${book.name!}
			</small>
			<button type="button" class="btn btn-mini btn-primary pull-right" onclick="App.go('#main-content');">
				<i class="icon-mail-reply"></i> 返回
			</button>
		</h3>
	</div>
	<div class="row-fluid">
		<#assign _URL="${ContextPath}/admin/book/edit">
		<div class="span8 form-horizontal">
			<div class="control-group">
				<label class="control-label">书名:</label>
				<div class="controls">
					<@editableText book.id "name" _URL book.name! />
				</div>
			</div>
			<div class="control-group">
				<label class="control-label">版本（如精装）:</label>
				<div class="controls">
					<@editableText book.id "format" _URL book.format! />
				</div>
			</div>
		</div>
		<div class="span4">
		</div>
	</div>
</div>
<script type="text/javascript">
$('#page-content a[data-type=text]').editable();
</script>
