webpackJsonp([6],{"1WmT":function(t,n,a){var e=a("Fp06");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("6c4870a1",e,!0)},"2nmN":function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.data-card .item {\n  position: relative;\n  margin: 0 auto;\n  margin-bottom: 50px;\n  width: 230px;\n  height: 340px;\n  overflow: hidden;\n  border-radius: 5px;\n  border-color: #fff;\n  border-width: 1px;\n  border-style: solid;\n}\n.data-card .item:hover .item-text {\n    top: 0;\n}\n.data-card .item-img {\n  width: 100%;\n  background: red;\n  border-radius: 5px;\n  border-bottom-left-radius: 0;\n  border-bottom-right-radius: 0;\n}\n.data-card .item-text {\n  position: absolute;\n  top: 150px;\n  padding: 20px 15px;\n  width: 100%;\n  height: 340px;\n  overflow: auto;\n  -webkit-box-sizing: border-box;\n          box-sizing: border-box;\n  border-radius: 5px;\n  border-top-left-radius: 0;\n  border-top-right-radius: 0;\n  opacity: 0.9;\n  -webkit-transition: top 0.4s;\n  transition: top 0.4s;\n}\n.data-card .item-text > p {\n    font-size: 12px;\n    line-height: 25px;\n    text-indent: 2em;\n}\n.nx-data-display .item {\n  display: -webkit-box;\n  display: -ms-flexbox;\n  display: flex;\n  -webkit-box-align: center;\n      -ms-flex-align: center;\n          align-items: center;\n  -webkit-box-orient: vertical;\n  -webkit-box-direction: normal;\n      -ms-flex-direction: column;\n          flex-direction: column;\n  margin: 5px 0;\n  text-align: center;\n}\n.nx-data-display .count {\n  margin: 8px 0;\n  font-weight: bold;\n  font-size: 32px;\n  color: #15A0FF;\n}\n.nx-data-display .title {\n  color: #999;\n}\n.nx-data-display .splitLine {\n  display: block;\n  margin: 0 auto;\n  width: 24px;\n  height: 1px;\n  background: #9B9B9B;\n}\n.data-icons .item {\n  display: -webkit-box;\n  display: -ms-flexbox;\n  display: flex;\n  -webkit-box-align: center;\n      -ms-flex-align: center;\n          align-items: center;\n  -webkit-box-pack: justify;\n      -ms-flex-pack: justify;\n          justify-content: space-between;\n  width: 80px;\n  margin: 0 auto;\n}\n.data-icons .item-icon {\n  margin-top: 3px;\n  margin-right: 8px;\n}\n.data-icons .item-icon > i {\n    font-size: 46px !important;\n}\n.data-icons .item-info {\n  line-height: 25px;\n}\n.data-icons .item-info > span {\n    color: #999;\n    font-size: 12px;\n}\n.data-icons .item--easy > .item-icon {\n  margin: 0;\n}\n.data-icons .item--easy > .item-info {\n  margin-top: -15px;\n}\n.data-icons .item--easy > .item-info > span {\n    font-size: 14px;\n}\n.data-tabs .item {\n  position: relative;\n  margin: 15px;\n  padding: 12px;\n  height: 144px;\n  border-radius: 4px;\n  -webkit-box-sizing: border-box;\n          box-sizing: border-box;\n  overflow: hidden;\n  color: #fff;\n}\n.data-tabs .item-header {\n  position: relative;\n}\n.data-tabs .item-header > p {\n    margin: 0px;\n    font-size: 14px;\n}\n.data-tabs .item-header > span {\n    position: absolute;\n    right: 0px;\n    top: 0px;\n    padding: 2px 8px;\n    border-radius: 4px;\n    font-size: 12px;\n    background: rgba(255, 255, 255, 0.3);\n}\n.data-tabs .item-body > h2 {\n  margin: 0;\n  font-size: 32px;\n  line-height: 60px;\n}\n.data-tabs .item-footer {\n  line-height: 16px;\n}\n.data-tabs .item-footer > span {\n    font-size: 10px;\n}\n.data-tabs .item-footer > p {\n    margin: 0px;\n    font-size: 12px;\n}\n.data-tabs .item-tip {\n  display: -webkit-box;\n  display: -ms-flexbox;\n  display: flex;\n  -webkit-box-align: center;\n      -ms-flex-align: center;\n          align-items: center;\n  -webkit-box-pack: center;\n      -ms-flex-pack: center;\n          justify-content: center;\n  position: absolute;\n  width: 80px;\n  height: 80px;\n  bottom: 10px;\n  right: 10px;\n  border: 2px solid #fff;\n  border-radius: 100%;\n  font-size: 48px;\n  -webkit-transform: rotate(-40deg);\n          transform: rotate(-40deg);\n  opacity: 0.1;\n}\n",""])},"7h8/":function(t,n,a){var e=a("f0QY");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("b69e0ff8",e,!0)},DBLc:function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"",""])},DoUj:function(t,n,a){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var e=a("PmaN"),i={name:"nx-data-display",components:{nxCountUp:e.a},data:function(){return{span:this.option.span||8,data:this.option.data,color:this.option.color||"rgb(63, 161, 255)"}},props:{option:{type:Object,default:function(){}}},created:function(){},methods:{}},o={render:function(){var t=this,n=t.$createElement,a=t._self._c||n;return a("div",{staticClass:"nx-data-display"},[a("el-row",{attrs:{span:24}},t._l(t.data,function(n,e){return a("el-col",{key:e,attrs:{span:t.span}},[a("div",{staticClass:"item",style:{color:t.color}},[a("h5",{staticClass:"count"},[a("nx-count-up",{attrs:{start:14,end:n.count}})],1),t._v(" "),a("span",{staticClass:"splitLine"}),t._v(" "),a("p",{staticClass:"title"},[t._v(t._s(n.title))])])])}))],1)},staticRenderFns:[]},r=a("VU/8")(i,o,!1,null,null,null).exports,s={name:"nx-data-card",data:function(){return{span:this.option.span||6,data:this.option.data||[],colorText:this.option.colorText||"#fff",bgText:this.option.bgText||"#2e323f",borderColor:this.option.borderColor||"#2e323f"}},props:{option:{type:Object,default:function(){}}},created:function(){},mounted:function(){},watch:{},computed:{},methods:{}},c={render:function(){var t=this,n=t.$createElement,a=t._self._c||n;return a("div",{staticClass:"data-card"},[a("el-row",{attrs:{span:24}},t._l(t.data,function(n,e){return a("el-col",{key:e,attrs:{span:t.span}},[a("div",{staticClass:"item"},[a("img",{staticClass:"item-img",attrs:{src:n.src}}),t._v(" "),a("div",{staticClass:"item-text",style:{color:t.colorText,backgroundColor:t.bgText}},[a("h3",[t._v(t._s(n.name))]),t._v(" "),a("p",[t._v(t._s(n.text))])])])])}))],1)},staticRenderFns:[]};var l=a("VU/8")(s,c,!1,function(t){a("7h8/")},"data-v-34f87685",null).exports,d={components:{nxCountUp:e.a},name:"nx-data-tabs",data:function(){return{span:this.option.span||6,data:this.option.data||[]}},props:{option:{type:Object,default:function(){}}}},u={render:function(){var t=this,n=t.$createElement,a=t._self._c||n;return a("div",{staticClass:"data-tabs"},[a("el-row",{attrs:{span:24}},t._l(t.data,function(n,e){return a("el-col",{key:e,attrs:{span:t.span}},[a("div",{staticClass:"item",style:{background:n.color}},[a("div",{staticClass:"item-header"},[a("p",[t._v(t._s(n.title))]),t._v(" "),a("span",[t._v(t._s(n.subtitle))])]),t._v(" "),a("div",{staticClass:"item-body"},[a("h2",[a("nx-count-up",{attrs:{start:14,end:n.count}})],1)]),t._v(" "),a("div",{staticClass:"item-footer"},[a("span",[t._v(t._s(n.allcount))]),t._v(" "),a("p",[t._v(t._s(n.text))])]),t._v(" "),a("p",{staticClass:"item-tip"},[t._v(t._s(n.key))])])])}))],1)},staticRenderFns:[]};var p=a("VU/8")(d,u,!1,function(t){a("Fgic")},"data-v-5b9414a8",null).exports,m={name:"nx-data-icons",components:{nxCountUp:e.a},data:function(){return{span:this.option.span||6,data:this.option.data,color:this.option.color||"rgb(63, 161, 255)",discount:this.option.discount||!1}},props:{option:{type:Object,default:function(){}}}},f={render:function(){var t=this,n=t.$createElement,a=t._self._c||n;return a("div",{staticClass:"data-icons"},[a("el-row",{attrs:{span:24}},[t._l(t.data,function(n){return[a("el-col",{attrs:{span:t.span}},[a("div",{staticClass:"item",class:[{"item--easy":t.discount}]},[a("div",{staticClass:"item-icon",style:{color:t.color}},[a("i",{class:n.icon})]),t._v(" "),a("div",{staticClass:"item-info"},[a("span",[t._v(t._s(n.title))]),t._v(" "),a("h3",{style:{color:t.color}},[a("nx-count-up",{attrs:{start:14,end:n.count}})],1)])])])]})],2)],1)},staticRenderFns:[]};var x={render:function(){var t=this.$createElement,n=this._self._c||t;return n("a",{staticClass:"github-corner",attrs:{href:"https://github.com/mgbq/nx-admin",target:"_blank","aria-label":"View source on Github"}},[n("svg",{staticStyle:{fill:"#40c9c6",color:"#fff",position:"absolute",top:"84px",border:"0",right:"0"},attrs:{width:"80",height:"80",viewBox:"0 0 250 250","aria-hidden":"true"}},[n("path",{attrs:{d:"M0,0 L115,115 L130,115 L142,142 L250,250 L250,0 Z"}}),this._v(" "),n("path",{staticClass:"octo-arm",staticStyle:{"transform-origin":"130px 106px"},attrs:{d:"M128.3,109.0 C113.8,99.7 119.0,89.6 119.0,89.6 C122.0,82.7 120.5,78.6 120.5,78.6 C119.2,72.0 123.4,76.3 123.4,76.3 C127.3,80.9 125.5,87.3 125.5,87.3 C122.9,97.6 130.6,101.9 134.4,103.2",fill:"currentColor"}}),this._v(" "),n("path",{staticClass:"octo-body",attrs:{d:"M115.0,115.0 C114.9,115.1 118.7,116.5 119.8,115.4 L133.7,101.6 C136.9,99.2 139.9,98.4 142.2,98.6 C133.8,88.0 127.5,74.4 143.8,58.0 C148.5,53.4 154.0,51.2 159.7,51.0 C160.3,49.4 163.2,43.6 171.4,40.1 C171.4,40.1 176.1,42.5 178.8,56.2 C183.1,58.6 187.2,61.8 190.9,65.4 C194.5,69.0 197.7,73.2 200.1,77.6 C213.8,80.2 216.3,84.9 216.3,84.9 C212.7,93.1 206.9,96.0 205.4,96.6 C205.1,102.4 203.0,107.8 198.3,112.5 C181.9,128.9 168.3,122.5 157.7,114.1 C157.9,116.9 156.7,120.9 152.7,124.9 L141.0,136.5 C139.8,137.7 141.6,141.9 141.8,141.8 Z",fill:"currentColor"}})])])},staticRenderFns:[]};var b={name:"report",components:{nxDataDisplay:r,nxDataCard:l,nxDataTabs:p,nxDataIcons:a("VU/8")(m,f,!1,function(t){a("uPE7")},"data-v-0c09a73e",null).exports,nxGithubCorner:a("VU/8")(null,x,!1,function(t){a("c4hZ")},"data-v-78df68ec",null).exports},data:function(){return{option:{span:8,color:"#15A0FF",data:[{count:1e3,title:"日活跃数"},{count:3e3,title:"月活跃数"},{count:2e4,title:"年活跃数"}]},easyDataOption:{span:6,data:[{title:"分类统计",subtitle:"实时",count:7993,allcount:10222,text:"当前分类总记录数",color:"rgb(49, 180, 141)",key:"类"},{title:"附件统计",subtitle:"实时",count:3112,allcount:10222,text:"当前上传的附件数",color:"rgb(56, 161, 242)",key:"附"},{title:"文章统计",subtitle:"实时",count:908,allcount:10222,text:"评论次数",color:"rgb(117, 56, 199)",key:"评"},{title:"新闻统计",subtitle:"实时",count:908,allcount:10222,text:"评论次数",color:"rgb(59, 103, 164)",key:"新"}]},easyDataOption0:{span:6,borderColor:"#fff",data:[{name:"姓名1",src:"static/img/mock/card/card-1.jpg",text:"介绍1"},{name:"姓名2",src:"static/img/mock/card/card-2.jpg",text:"介绍2"},{name:"姓名3",src:"static/img/mock/card/card-3.jpg",text:"介绍3"},{name:"姓名4",src:"static/img/mock/card/card-4.jpg",text:"介绍4"}]},easyDataOption1:{color:"rgb(63, 161, 255)",span:4,data:[{title:"今日注册",count:12678,icon:"icon-cuowu"},{title:"今日登录",count:22139,icon:"icon-shujuzhanshi2"},{title:"今日订阅",count:35623,icon:"icon-jiaoseguanli"},{title:"今日评论",count:16826,icon:"icon-caidanguanli"},{title:"今日评论",count:16826,icon:"icon-caidanguanli"},{title:"今日评论",count:16826,icon:"icon-caidanguanli"}]},easyDataOption2:{color:"rgb(63, 161, 255)",span:4,discount:!0,data:[{title:"错误日志",count:12678,icon:"icon-cuowu"},{title:"数据展示",count:12678,icon:"icon-shujuzhanshi2"},{title:"权限管理",count:12678,icon:"icon-jiaoseguanli"},{title:"菜单管理",count:12678,icon:"icon-caidanguanli"},{title:"权限测试",count:12678,icon:"icon-caidanguanli"},{title:"错误页面",count:12678,icon:"icon-caidanguanli"}]}}},created:function(){},watch:{},mounted:function(){},computed:{}},h={render:function(){var t=this,n=t.$createElement,a=t._self._c||n;return a("div",{staticClass:"app-container"},[a("nx-github-corner"),t._v(" "),a("div",{staticClass:"item"},[a("h4",[t._v("数据展示")]),t._v(" "),a("nx-data-display",{attrs:{option:t.option}})],1),t._v(" "),a("div",{staticClass:"item"},[a("h4",[t._v("选项卡展示")]),t._v(" "),a("nx-data-tabs",{attrs:{option:t.easyDataOption}})],1),t._v(" "),a("div",{staticClass:"item"},[a("h4",[t._v("卡片的展示")]),t._v(" "),a("nx-data-card",{attrs:{option:t.easyDataOption0}})],1),t._v(" "),a("div",{staticClass:"item"},[a("h4",[t._v("带数字的展示")]),t._v(" "),a("nx-data-icons",{attrs:{option:t.easyDataOption1}})],1),t._v(" "),a("div",{staticClass:"item"},[a("h4",[t._v("简易展示")]),t._v(" "),a("nx-data-icons",{attrs:{option:t.easyDataOption2}})],1)],1)},staticRenderFns:[]};var g=a("VU/8")(b,h,!1,function(t){a("1WmT"),a("uEji")},"data-v-59a1bd5d",null);n.default=g.exports},EbL4:function(t,n,a){var e,i;void 0===(i="function"==typeof(e=function(t,n,a){return function(t,n,a,e,i,o){function r(t){return"number"==typeof t&&!isNaN(t)}var s=this;if(s.version=function(){return"1.9.3"},s.options={useEasing:!0,useGrouping:!0,separator:",",decimal:".",easingFn:function(t,n,a,e){return a*(1-Math.pow(2,-10*t/e))*1024/1023+n},formattingFn:function(t){var n,a,e,i,o,r,c=t<0;if(t=Math.abs(t).toFixed(s.decimals),a=(n=(t+="").split("."))[0],e=n.length>1?s.options.decimal+n[1]:"",s.options.useGrouping){for(i="",o=0,r=a.length;o<r;++o)0!==o&&o%3==0&&(i=s.options.separator+i),i=a[r-o-1]+i;a=i}return s.options.numerals.length&&(a=a.replace(/[0-9]/g,function(t){return s.options.numerals[+t]}),e=e.replace(/[0-9]/g,function(t){return s.options.numerals[+t]})),(c?"-":"")+s.options.prefix+a+e+s.options.suffix},prefix:"",suffix:"",numerals:[]},o&&"object"==typeof o)for(var c in s.options)o.hasOwnProperty(c)&&null!==o[c]&&(s.options[c]=o[c]);""===s.options.separator?s.options.useGrouping=!1:s.options.separator=""+s.options.separator;for(var l=0,d=["webkit","moz","ms","o"],u=0;u<d.length&&!window.requestAnimationFrame;++u)window.requestAnimationFrame=window[d[u]+"RequestAnimationFrame"],window.cancelAnimationFrame=window[d[u]+"CancelAnimationFrame"]||window[d[u]+"CancelRequestAnimationFrame"];window.requestAnimationFrame||(window.requestAnimationFrame=function(t,n){var a=(new Date).getTime(),e=Math.max(0,16-(a-l)),i=window.setTimeout(function(){t(a+e)},e);return l=a+e,i}),window.cancelAnimationFrame||(window.cancelAnimationFrame=function(t){clearTimeout(t)}),s.initialize=function(){return!(!s.initialized&&(s.error="",s.d="string"==typeof t?document.getElementById(t):t,s.d?(s.startVal=Number(n),s.endVal=Number(a),r(s.startVal)&&r(s.endVal)?(s.decimals=Math.max(0,e||0),s.dec=Math.pow(10,s.decimals),s.duration=1e3*Number(i)||2e3,s.countDown=s.startVal>s.endVal,s.frameVal=s.startVal,s.initialized=!0,0):(s.error="[CountUp] startVal ("+n+") or endVal ("+a+") is not a number",1)):(s.error="[CountUp] target is null or undefined",1)))},s.printValue=function(t){var n=s.options.formattingFn(t);"INPUT"===s.d.tagName?this.d.value=n:"text"===s.d.tagName||"tspan"===s.d.tagName?this.d.textContent=n:this.d.innerHTML=n},s.count=function(t){s.startTime||(s.startTime=t),s.timestamp=t;var n=t-s.startTime;s.remaining=s.duration-n,s.options.useEasing?s.countDown?s.frameVal=s.startVal-s.options.easingFn(n,0,s.startVal-s.endVal,s.duration):s.frameVal=s.options.easingFn(n,s.startVal,s.endVal-s.startVal,s.duration):s.countDown?s.frameVal=s.startVal-(s.startVal-s.endVal)*(n/s.duration):s.frameVal=s.startVal+(s.endVal-s.startVal)*(n/s.duration),s.countDown?s.frameVal=s.frameVal<s.endVal?s.endVal:s.frameVal:s.frameVal=s.frameVal>s.endVal?s.endVal:s.frameVal,s.frameVal=Math.round(s.frameVal*s.dec)/s.dec,s.printValue(s.frameVal),n<s.duration?s.rAF=requestAnimationFrame(s.count):s.callback&&s.callback()},s.start=function(t){s.initialize()&&(s.callback=t,s.rAF=requestAnimationFrame(s.count))},s.pauseResume=function(){s.paused?(s.paused=!1,delete s.startTime,s.duration=s.remaining,s.startVal=s.frameVal,requestAnimationFrame(s.count)):(s.paused=!0,cancelAnimationFrame(s.rAF))},s.reset=function(){s.paused=!1,delete s.startTime,s.initialized=!1,s.initialize()&&(cancelAnimationFrame(s.rAF),s.printValue(s.startVal))},s.update=function(t){if(s.initialize()){if(!r(t=Number(t)))return void(s.error="[CountUp] update() - new endVal is not a number: "+t);s.error="",t!==s.frameVal&&(cancelAnimationFrame(s.rAF),s.paused=!1,delete s.startTime,s.startVal=s.frameVal,s.endVal=t,s.countDown=s.startVal>s.endVal,s.rAF=requestAnimationFrame(s.count))}},s.initialize()&&s.printValue(s.startVal)}})?e.call(n,a,n,t):e)||(t.exports=i)},Fgic:function(t,n,a){var e=a("DBLc");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("9bfd2eee",e,!0)},Fp06:function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.item[data-v-59a1bd5d] {\n  margin-bottom: 16px;\n}\n",""])},PmaN:function(t,n,a){"use strict";var e=a("EbL4"),i=a.n(e),o={name:"nx-count-up",props:{start:{type:Number,required:!1,default:0},end:{type:Number,required:!0,default:0},decimals:{type:Number,required:!1,default:0},duration:{type:Number,required:!1,default:2},options:{type:Object,required:!1,default:function(){return{}}},callback:{type:Function,required:!1,default:function(){}}},data:function(){return{c:null}},watch:{end:function(t){this.c&&this.c.update&&this.c.update(t)}},mounted:function(){this.init()},methods:{init:function(){var t=this;this.c||(this.c=new i.a(this.$el,this.start,this.end,this.decimals,this.duration,this.options),this.c.start(function(){t.callback(t.c)}))},destroy:function(){this.c=null}},beforeDestroy:function(){this.destroy()},start:function(t){var n=this;this.c&&this.c.start&&this.c.start(function(){t&&t(n.c)})},pauseResume:function(){this.c&&this.c.pauseResume&&this.c.pauseResume()},reset:function(){this.c&&this.c.reset&&this.c.reset()},update:function(t){this.c&&this.c.update&&this.c.update(t)}},r={render:function(){var t=this.$createElement;return(this._self._c||t)("span")},staticRenderFns:[]},s=a("VU/8")(o,r,!1,null,null,null);n.a=s.exports},c4hZ:function(t,n,a){var e=a("gFdd");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("9b4e26f6",e,!0)},f0QY:function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"",""])},gFdd:function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"\n.github-corner:hover .octo-arm[data-v-78df68ec] {\n  -webkit-animation: octocat-wave-data-v-78df68ec 560ms ease-in-out;\n          animation: octocat-wave-data-v-78df68ec 560ms ease-in-out\n}\n@-webkit-keyframes octocat-wave-data-v-78df68ec {\n0%,\n  100% {\n    -webkit-transform: rotate(0);\n            transform: rotate(0)\n}\n20%,\n  60% {\n    -webkit-transform: rotate(-25deg);\n            transform: rotate(-25deg)\n}\n40%,\n  80% {\n    -webkit-transform: rotate(10deg);\n            transform: rotate(10deg)\n}\n}\n@keyframes octocat-wave-data-v-78df68ec {\n0%,\n  100% {\n    -webkit-transform: rotate(0);\n            transform: rotate(0)\n}\n20%,\n  60% {\n    -webkit-transform: rotate(-25deg);\n            transform: rotate(-25deg)\n}\n40%,\n  80% {\n    -webkit-transform: rotate(10deg);\n            transform: rotate(10deg)\n}\n}\n@media (max-width:500px) {\n.github-corner:hover .octo-arm[data-v-78df68ec] {\n    -webkit-animation: none;\n            animation: none\n}\n.github-corner .octo-arm[data-v-78df68ec] {\n    -webkit-animation: octocat-wave-data-v-78df68ec 560ms ease-in-out;\n            animation: octocat-wave-data-v-78df68ec 560ms ease-in-out\n}\n}\n",""])},"l/rg":function(t,n,a){(t.exports=a("FZ+f")(!1)).push([t.i,"",""])},uEji:function(t,n,a){var e=a("2nmN");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("0ad492de",e,!0)},uPE7:function(t,n,a){var e=a("l/rg");"string"==typeof e&&(e=[[t.i,e,""]]),e.locals&&(t.exports=e.locals);a("rjj0")("1f761151",e,!0)}});