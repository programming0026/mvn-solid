# Principios SOLID en Java

Un ejemplo pequeño y ejecutable de cada uno de los cinco principios SOLID del diseño orientado a objetos.

## Características

- **S**ingle Responsibility: cada clase hace una sola cosa (validar, guardar, enviar correo).
- **O**pen/Closed: se añaden figuras geométricas nuevas sin tocar el código que calcula el área total.
- **L**iskov Substitution: una paloma y un pingüino sustituyen a `Bird` sin romper el programa.
- **I**nterface Segregation: interfaces pequeñas (`Workable`, `Feedable`...) para que un robot no tenga que "comer".
- **D**ependency Inversion: `Notificator` depende de la interfaz `Email`, no de Gmail ni de Outlook.

## Requisitos

- JDK 21 y Maven 3.9 o superior.

## Compilar y ejecutar

```bash
mvn compile exec:java
```

## Estructura

```text
src/main/java/com/juniverse/solid/
├── Main.java
├── srp/   # responsabilidad única
├── ocp/   # abierto/cerrado
├── lsp/   # sustitución de Liskov
├── isp/   # segregación de interfaces
└── dip/   # inversión de dependencias
```

## JAR ejecutable (fat jar)

```bash
mvn clean package
java -jar target/mvn-solid-1.0-SNAPSHOT-launcher.jar
```

El archivo `-launcher.jar` incluye todas las dependencias.

## Licencia

Código de ejemplo de uso libre con fines educativos.
