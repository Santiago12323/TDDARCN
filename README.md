# FizzBuzz – Java TDD Project
# Santiago Coronado Pinzon

## Descripción

Este proyecto implementa el clásico **FizzBuzz** en **Java**, siguiendo un enfoque de **Desarrollo Guiado por Pruebas (TDD)**.  
El objetivo principal fue construir un código **limpio, modular y completamente testeado**, aplicando buenas prácticas de refactorización y pruebas.

**Lo que demuestra este proyecto:**

- Implementación limpia de lógica condicional.
- Cobertura total de código con **JaCoCo (100% instrucciones y ramas)**.
- Uso de **JUnit 5** con tests unitarios y **Parameterized Tests**.
- Pruebas estructuradas siguiendo el patrón **AAA (Arrange, Act, Assert)**.
- Refactorización iterativa para mejorar mantenibilidad y legibilidad.

---

## Estructura del Proyecto

FizzBuzz/
├── src/
│ ├── main/
│ │ └── java/
│ │ └── FizzBuzz.java # Lógica principal
│ └── test/
│ └── java/
│ └── FizzBuzzTest.java # Tests unitarios completos
├── pom.xml # Configuración de Maven y JaCoCo
└── README.md


---

## Tecnologías Utilizadas

| Tecnología | Versión / Uso |
|------------|---------------|
| Java       | 17            |
| Maven      | 3.8+          |
| JUnit 5    | Unit Testing  |
| JaCoCo     | Cobertura 100%|
| TDD        | Desarrollo guiado por pruebas |

---

## Desarrollo y TDD

El desarrollo siguió el ciclo típico de **TDD**:

1. **Escribir un test que falle**  
   Cada caso esperado de FizzBuzz se define primero en un test unitario.

2. **Implementar la lógica mínima**  
   Se implementa la funcionalidad suficiente para pasar el test.

3. **Refactorización iterativa**  
   Se mejora la legibilidad y mantenibilidad sin romper los tests existentes.

4. **Añadir más tests y casos borde**  
   - Múltiplos de 3 → `Fizz`  
   - Múltiplos de 5 → `Buzz`  
   - Múltiplos de 3 y 5 → `FizzBuzz`  
   - Cero y números negativos  
   - Números grandes  
   - Números no múltiplos  

5. **Cobertura completa con JaCoCo**  
   Se logró **100% de cobertura de instrucciones y ramas**, incluyendo la función privada `isMultipleOf()` de manera indirecta.

---

## Ejecución de Tests

Para correr los tests y generar el reporte de cobertura:

```bash
mvn clean test jacoco:report
```

## Buenas Prácticas Aplicadas

- **Código limpio y modular**: métodos claros y constantes bien definidas.  
- **Tests completos**: todos los caminos y casos borde cubiertos.  
- **Refactorización iterativa**: código evolucionado paso a paso.  
- **AAA en tests**: cada test sigue Arrange, Act, Assert para claridad.  
- **Parameterized Tests**: reducen duplicación y aumentan cobertura.  

## Conclusión

Este proyecto demuestra cómo aplicar **TDD real**, lograr **cobertura total con JaCoCo** y refactorizar para mantener un código **limpio y mantenible**.  
Es un ejemplo profesional de cómo abordar proyectos pequeños con enfoque **industrial y de alta calidad**, listo para ser usado como referencia de buenas prácticas en desarrollo Java.