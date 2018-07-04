# CDM
步骤：
项目环境搭建    -》能够通过ssm运行一个网页出来，并查出数据
1.：能够运行一个网页出来
2.：web.xml  pom.xml   spring.xml   等所有配置文件   
3.：dao模型的自动生成和配置
4.：fifter设置，mvc的几大功能设置
项目前端写入：
1.所有页面的准备
2.变为jsp页面，并放在web—inf下，并配置试图定位器

开始写项目：   即为controller 和 前端页面的交互：

1.注意：   BaseController 作用：  包含所有jsp页面，为了是.do文件返回所有jsp地址

2.其它页面全部使用重定向  "redirct:xxx.do"

3.注意session中存放用户信息数据，其他数据一般采用作用域为request

4.基于以上原则，使用serviceimpl 对象中的方法来实现  前端和后端的交互功能    ：    jsp和controller中的交互，实现动态网页j2ee
