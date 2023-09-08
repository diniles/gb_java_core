FROM openjdk:11
COPY ./java ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d ./out src/HW1.java
CMD java -classpath ./out HW1