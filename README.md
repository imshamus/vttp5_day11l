# Git commands

In project root folder<br/>
1. git init

Add files to staging<br/>
2. git add *

Commit files to local repo<br/>
3. git commit -m “initial commit”

Change branch name<br/>
4. git branch -m main

Link up remote repo to local repo<br/>
5. git remote add origin <repo url>

Push code up from local repo to remote repo<br/>
6. git push -u origin main

Deployment<br/>
Only deploy jar files, need to know packaging<br/>

# Mvn commands
To update dependencies to new version, its better to clean first (delete the target folder), cause sometimes they compile before dw compile again, better just delete and recompile, so to clean<br/>

In project root folder <br/>
./mvnw clean        - mac<br/>
mvnw.cmd clean      - windows<br/>

Package the compiled bytecode classes into jar/war file<br/>
./mvnw package<br/>
mvnw.cmd package<br/>

delete target, redownload dependencies, recompile to class files, package to jar/war<br/>
./mvnw clean package<br/>
mvnw.cmd clean package      - wipe target, recreate, redownload dependencies, repackage<br/>

run the application in embedded localhost server (test mode)<br/>
./mvnw spring-boot:run<br/>
mvnw.cmd spring-boot:run<br/>

# Wrapper 
dont need do this maybe
mvn -N io.takari:maven:wrapper      This will re-download the necessary files for the Maven Wrapper, including maven-wrapper.jar.
.\mvnw.cmd spring-boot:run

template needs controller end point reference, static doesnt need controller end point reference,
tempalte put things you need thymeleaf dynamic? like employee data

# Railway CLI commands in cmd of proj root folder
- railway login --browserless
- railway link
- railway up

# Change java
java --version
java17
java --version


