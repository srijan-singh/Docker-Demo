# Docker Tutorial for Java Program

## Commands

1. Docker-Boot (Spring Boot Application) 

    1. Change Directory

                cd docker-boot

    2. Build docker Image

                docker build -t docker-boot .

    3. Run Docker Container

                docker run -p 8080:8080 docker-boot

    _Remember to add /hello_

        https://srijan-singh-fantastic-engine-wxvrwv5x566c9xwx-8080.preview.app.github.dev/hello

2. Hola-World (Simple Java Program)

    1. Build docker Image

                cd hola-world

    2. Build docker Image

                docker build -t hola-world .

    3. Run Docker Container

                docker run -p 8080:8080 hola-world

