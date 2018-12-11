How to add Immutables support to gradle project
---

* Add the following dependencies 

```
dependencies {
    compileOnly("org.immutables:value-annotations:2.7.3")
    annotationProcessor("org.immutables:value:2.7.3")
}
```
* Add the following plugin for intellij support
```
plugins {
    id 'java'
    id 'idea'
    id "net.ltgt.apt-idea" version "0.19"
}
```

* Run `./gradlew compileJava` for intellij to pick up code generation changes
