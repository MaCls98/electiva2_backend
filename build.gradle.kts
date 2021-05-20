import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.jetbrains.kotlin.plugin.jpa") version "1.5.0-RC"
	id("org.springframework.boot") version "2.4.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	war
	kotlin("jvm") version "1.4.32"
	kotlin("plugin.spring") version "1.4.32"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	//Springboot para servidor web
	compile("org.springframework.boot:spring-boot-starter-web")
	//Springboot para manejo de servidor en instancia de apache tomcat
	compile("org.springframework.boot:spring-boot-starter-tomcat")
	//Springboot para manejo de anotaciones de servicios web
	compile("org.springframework.boot:spring-boot-starter-data-jdbc")
	//Springboot para manejo de etiquetas de JPA e Hibernate
	compile("org.springframework.boot:spring-boot-starter-data-jpa")
	//Librerias necesarias para el manejo de kotlin
	compile("org.jetbrains.kotlin:kotlin-reflect")
	compile("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	//Libreria para el parseo de JSON en java
	compile("com.fasterxml.jackson.module:jackson-module-kotlin")
	//Libreria para conexion de BD de mysql
	compile("mysql:mysql-connector-java")
	compile ("org.postgresql:postgresql:42.2.10")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}
