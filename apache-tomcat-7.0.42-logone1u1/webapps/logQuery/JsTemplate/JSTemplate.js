var JSTemplate = function(templateStr) {

	this.content = templateStr;

	this.preparse = function(content) {
		content = content.replace(/\t/g, " ");
		content = content.replace(/\r\n/g, "");
		content = content.replace(/\r/g, "");
		content = content.replace(/^\s+/g, "");
		content = content.replace(/\s+$/g, "");
		content = content.replace(/\s+/g, " ");
		content = content.replace(/'/g, '"');
		return content;
	};
	this.inList = function(p, list) {
		if (list && p) {
			for ( var i = 0; i < list.length; i++) {
				if (p == list[i]) {
					return true;
				}
			}
		}
		return false;
	};

	this.dumper = function(obj, excludeProperties) {
		var desc = "";
		for ( var p in obj) {
			if (this.inList(p, excludeProperties)) {
				continue;
			}
			desc = desc + p + " : " + obj[p] + " \n";
		}
		return desc;
	}
	this.render = function(data,debug) {
        
		var template = this.preparse(this.content);
        if(debug){
		     alert("Template String is "+this.content+"\n");
		}
		var elements = template.split(/<%|%>/g);

		var script = "";
		
		for ( var i = 0; i < elements.length; i++) {
			var target = elements[i];
			if (/^\s*\$/.test(target)) {
				script = script + target.replace(/\$/, '');
			} else if (/^\s*=\$/.test(target)) {
				script = script + "result=result+" + target.replace(/=\$/g, '')
						+ ";";
			} else {
				script = script + "result=result+'" + target + "';";
			}
		}
		try {
		    if(debug){
			  var varibleList="[";
			  for(var v in data){
			     varibleList=varibleList+v+",";
			  }
			  varibleList=varibleList+v+"]";
			
		     alert("Data in render context are "+varibleList+"\n");
		    }
			data.result = "";
			with (data) {
			        if(debug){
		               alert("Template render process is "+script+"\n");
		            }
				eval(script);
			}
		} catch (e) {
			alert(this.dumper(e, [ 'stack' ]));
		}
		if(debug){
		     alert("Final HTML string is \n"+data.result+"\n");
		    }
		return data.result;
	}
	this.loadTemplateOutSide = function(path) {
		if ($) {
			var tempStr = "";
			$.ajax( {
				async : false,
				dataType : "text",
				error : function() {
					alert("Can't load template " + path);
				},
				url : (path),
				success : function(data) {
					tempStr = data;
				}
			});
			if (tempStr === "") {
				alert("Can't load template " + path);
			} else {
				this.content = tempStr;
			}
		} else {
			alert("This file require Jquery lib.");

		}
	}
	this.loadTemplateInSide = function(id) {
		this.content=$("#"+id).html();
	}
}