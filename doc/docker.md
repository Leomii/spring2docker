1. mac 安装docker，启动
2. 添加阿里云docker 镜像加速：
                        
   设置完毕重启。
3. 下载KiteMatic
4. 下载 VitualBox.dmg 安装，执行：docker-machine create dev，过程中自动安装 boot2docker
5. 设置2375端口代理shipyard，执行：docker run  -ti  -d -p 2375:2375 --hostname=$HOSTNAME --restart=always --name shipyard-proxy -v /var/run/docker.sock:/var/run/docker.sock -e PORT=2375 shipyard/docker-proxy:latest
   执行完毕，输入：curl localhost:2375/version 检验是否安装成功
6. sh ./mvnw dependency:copy-dependencies
7. sh mvnw clean package docker:build -DskipTests
8. docker-compose rm /  docker-compose run -d
9. pom.xml 添加：docker-maven-plugin，maven-dependency-plugin
10. win:   C:\Users\ronglei\.m2\wrapper\dists
11. mac:   /Users/leomii/.m2/wrapper/dists

编译推送镜像：
mvnw clean package docker:build -DskipTests

查看所有容器（包含停止的）
docker ps -a

删除容器
docker rm -f {container_id}

删除镜像
docker rmi -f {image_id}

启动镜像：
docker run -p 8081:8081 -t spring2docker:latest

日志查看
docker logs {container_id}

进入容器操作：
docker exec -ti {container_id} /bin/bash


项目访问地址：(ip 为 docker 宿主机ip，port 为 -p 关联的宿主机ip)
http://172.17.89.36:8081/spring2docker/

swaager-ui：
http://172.17.89.36:8081/spring2docker/swagger-ui.html
