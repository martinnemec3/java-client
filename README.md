# CLIent
A super-simple http client written in java for testing purposes.

## Background
What led me to create this thing was the need to test how some concrete JRE installation (e.g. in a docker container) behaves when connecting to a webserver (typically https).

In many cases an easy way to find out and debug problems on an ssl layer (typically connected to certificates/truststore) is to run such simple java program and read the stack trace of the thrown exception.

## Run
#### Optionally
```
docker run it --rm eclipse-temurin:11-jdk /bin/bash
```

#### Execute
```
wget https://raw.githubusercontent.com/martinnemec3/java-curl/main/CLIent.java

javac CLIent.java

java CLIent <url>
```
