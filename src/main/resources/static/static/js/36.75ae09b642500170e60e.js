webpackJsonp([36],{ifCa:function(t,e,a){var n=a("j9jb");"string"==typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);a("rjj0")("880b1766",n,!0)},j9jb:function(t,e,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.radio-label {\n  font-size: 14px;\n  color: #606266;\n  line-height: 40px;\n  padding: 0 12px 0 30px;\n}\n",""])},oz0I:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("viA7"),l=a("0xDb"),i={name:"exportExcel",data:function(){return{list:null,listLoading:!0,downloadLoading:!1,filename:"",autoWidth:!0}},created:function(){this.fetchData()},methods:{fetchData:function(){var t=this;this.listLoading=!0,Object(n.a)().then(function(e){t.list=e.data.items,t.listLoading=!1})},handleDownload:function(){var t=this;this.downloadLoading=!0,Promise.all([a.e(1),a.e(64)]).then(a.bind(null,"zWO4")).then(function(e){var a=t.list,n=t.formatJson(["id","title","author","pageviews","display_time"],a);e.export_json_to_excel({header:["Id","Title","Author","Readings","Date"],data:n,filename:t.filename,autoWidth:t.autoWidth}),t.downloadLoading=!1})},formatJson:function(t,e){return e.map(function(e){return t.map(function(t){return"timestamp"===t?Object(l.c)(e[t]):e[t]})})}}},o={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"app-container"},[a("label",{staticClass:"radio-label",staticStyle:{"padding-left":"0"}},[t._v("Filename: ")]),t._v(" "),a("el-input",{staticStyle:{width:"340px"},attrs:{placeholder:t.$t("excel.placeholder"),"prefix-icon":"el-icon-document"},model:{value:t.filename,callback:function(e){t.filename=e},expression:"filename"}}),t._v(" "),a("label",{staticClass:"radio-label"},[t._v("Cell Auto Width: ")]),t._v(" "),a("el-radio-group",{model:{value:t.autoWidth,callback:function(e){t.autoWidth=e},expression:"autoWidth"}},[a("el-radio",{attrs:{label:!0,border:""}},[t._v("True")]),t._v(" "),a("el-radio",{attrs:{label:!1,border:""}},[t._v("False")])],1),t._v(" "),a("el-button",{staticStyle:{margin:"0 0 20px 20px"},attrs:{type:"primary",icon:"document",loading:t.downloadLoading},on:{click:t.handleDownload}},[t._v(t._s(t.$t("excel.export"))+" excel")]),t._v(" "),a("el-table",{directives:[{name:"loading",rawName:"v-loading.body",value:t.listLoading,expression:"listLoading",modifiers:{body:!0}}],attrs:{data:t.list,"element-loading-text":"拼命加载中",border:"",fit:"","highlight-current-row":""}},[a("el-table-column",{attrs:{align:"center",label:"Id",width:"95"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n        "+t._s(e.$index)+"\n      ")]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"Title"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n        "+t._s(e.row.title)+"\n      ")]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"Author",width:"110",align:"center"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("el-tag",[t._v(t._s(e.row.author))])]}}])}),t._v(" "),a("el-table-column",{attrs:{label:"Readings",width:"115",align:"center"},scopedSlots:t._u([{key:"default",fn:function(e){return[t._v("\n        "+t._s(e.row.pageviews)+"\n      ")]}}])}),t._v(" "),a("el-table-column",{attrs:{align:"center",label:"Date",width:"220"},scopedSlots:t._u([{key:"default",fn:function(e){return[a("i",{staticClass:"el-icon-time"}),t._v(" "),a("span",[t._v(t._s(t._f("parseTime")(e.row.timestamp,"{y}-{m}-{d} {h}:{i}")))])]}}])})],1)],1)},staticRenderFns:[]};var r=a("VU/8")(i,o,!1,function(t){a("ifCa")},null,null);e.default=r.exports}});