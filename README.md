# Hello world reactive REST spring boot example

Training, spring boot based hello world reactive rest service template
It use google [jib](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin) to dockerize 

To build the docker image local docker deamon.

```bash
$ mvn compile jib:dockerBuild
```

To build and push the docker image.
It use google [jib](https://github.com/GoogleContainerTools/jib/tree/master/jib-maven-plugin) to dockerize 

```bash
$ mvn package jib:build
```


