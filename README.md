# gm
game manager system

## 项目结构

- gmm:model	 模型层
- gms:service       服务层
- gmc:controller  控制层

## 简化原则

- 配置依赖库时，尽可能使用默认配置，减少application的体积，降低学习成本。慢点就慢点吧。
- 模型层尽可能使用注解实现sql，毕竟gm的sql变动很少
- 服务层不再将service拆封为接口和实现，而是统一做成一个class

