# MMSystem
MyBatis + POI + Element UI + Redis


在项目中负责后台题库管理、用户登录、权限控制等功能的实现和基于AdminLTE的页面结构搭建 1. 根据学科类型、题目类型等模块之间的层级关系，基于MyBatis实现了题库不同模块的管理功能；
页面获取用户名和密码，在数据库中进行对比实现登录功能，使用Redis存储登陆状态；
建立用户与角色、角色与模块之间的关联，通过权限过滤器实现模块访问权限管理；
在项目中解决了JSP和MySQL中文乱码问题，文件上传重名问题，删除时产生的逻辑依赖问题等。