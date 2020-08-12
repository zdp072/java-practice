# es核心知识

## 核心概念

### Document 
对应数据库的行，一个document可以使一条客户数据，通常用json数据结构表示，一个document里面有多个field，每个field就是一个数据字段。

### Type 
对应数据库的表，每个索引可以有一个或多个type，type是index中的一个逻辑数据分类。

### Index 
对应数据库，商品index里面存放了所有的商品数据（商品document），但是商品分很多种类，每个种类的document的field可能不太一样。比如电器商品type、生鲜商品type

## 简单的集群管理
### 快速检查集群的健康状况
GET /_cat/health?v    (green、yellow、red)

### 快速查看集群中有哪些索引
GET /_cat/indices?v

### 简单的索引操作
* 创建索引 PUT /test_index?pretty
* 删除索引 DELETE /test_index?pretty

## Document的CRUD操作
### 新增商品: 建立索引、新增文档
* PUT /index/type/id
`PUT /ecommerce/product/1
{
	"name":"高露洁",
	"desc":"美白",
	"price":30,
	"producer":"立白",
	"tags":["美白","防蛀"]
}`

### 查询商品: 检索文档
`GET /ecommerce/product/1`

### 修改商品: 替换文档
* 必须带上所有的field
`PUT /ecommerce/product/1
{
	"name":"高露洁牙膏",
	"desc":"美白",
	"price":30,
	"producer":"立白",
	"tags":["美白","防蛀"]
}`

### 修改商品: 更新文档
`POST /ecommerce/product/1/_update
{
	"doc":{
	  "name":"佳洁士牙膏"
	}
}`

### 删除商品: 删除文档
`DELETE /ecommerce/product/1?pretty`