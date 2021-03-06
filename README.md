# QNotified Auth Server

约定:

1. 使用UTF-8编码

2. 区分大小写

3. 发送的数据与接收的数据均为json

4. 初始化时随机生成初始管理的token，不提供额外控制界面

5. 服务器数据库使用mysql,建议使用apache/nginx反代不直接连接

Get: `/user/users`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|uin|String|QQ号|

Response:

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码| 
|status|Int|黑白名单状态| 
|reason|String|理由|
|lastUpdate|String|时间|

Post: `/user/users`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码| 
|uin|String|QQ号| 
|status|Int|黑白名单状态|
|token|String|管理员token| 
|reason|String|理由 不可为空|

Response:

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码| 
|reason|String|理由 可为空|

Delete `/user/users`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|uin|String|QQ号| 
|reason|String|理由 不可为空| 
|token|String|管理员token|

Response:

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码| 
|reason|String|理由 可为空|

Get: `/user/history`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|uin|String|QQ号| 
|token|String|管理员token|

Response:

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码| 
|history|String|所有针对该用户的操作记录|

Post: `/admin/admins`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|desttoken|String|待添加的管理员token| 
|nickname|String|待添加的管理员名称|
|token|String|管理员token| 
|reason|String|理由 可为空|

Response:
|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|code|Int|状态码|

Delete: `/admin/admins`

|参数名称|类型|描述| 
|:-:|:-:|:-:| 
|uin|String|待添加的管理员token| 
|token|String|管理员token| 
|reason|String|理由 可为空|

Response:

|参数名称|类型|描述| 
:-:|:-:|:-:|
|code|Int|状态码|
|reason|String|理由 可为空|
