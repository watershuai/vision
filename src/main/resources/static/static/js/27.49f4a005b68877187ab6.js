webpackJsonp([27],{"7IIG":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("dAEq"),i={components:{BmlLushu:n.BmlLushu},data:function(){return{play:!0,path:[],icon:{url:"http://api.map.baidu.com/library/LuShu/1.2/examples/car.png",size:{width:52,height:26},opts:{anchor:{width:27,height:13}}}}},methods:{reset:function(){this.play=!1},handleSearchComplete:function(t){this.path=t.getPlan(0).getRoute(0).getPath()}}},r={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"app-container"},[t._m(0),t._v(" "),a("baidu-map",{staticClass:"map",attrs:{center:{lng:116.404,lat:39.915},zoom:11}},[a("bm-driving",{attrs:{start:"天安门",end:"百度大厦",panel:!1,autoViewport:!0},on:{searchcomplete:t.handleSearchComplete}}),t._v(" "),a("bml-lushu",{attrs:{path:t.path,icon:t.icon,play:t.play,rotation:!0},on:{stop:t.reset}})],1)],1)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("p",{staticClass:"warn-content"},[e("a",{attrs:{href:"https://dafrok.github.io/vue-baidu-map/#/zh/index",target:"_blank"}},[this._v("参考百度地图 Vue Baidu Map\n            ")])])}]};var s=a("VU/8")(i,r,!1,function(t){a("guyV")},null,null);e.default=s.exports},ApU2:function(t,e,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.map {\n  width: 100%;\n  height: 800px;\n}\n",""])},guyV:function(t,e,a){var n=a("ApU2");"string"==typeof n&&(n=[[t.i,n,""]]),n.locals&&(t.exports=n.locals);a("rjj0")("621e5636",n,!0)}});