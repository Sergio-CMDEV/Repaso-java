# Batería de Ejercicios Java - 31 Días de Aprendizaje

## 📚 Plan de Estudio Progresivo

### Semana 1: Fundamentos Básicos (Días 1-7)

#### Día 1: Hola Mundo y Variables
**Objetivo**: Configurar entorno y comprender variables básicas
```java
// Ejercicio: Crear un programa que:
// 1. Imprima "Hola Mundo"
// 2. Declare variables de diferentes tipos (int, double, String, boolean)
// 3. Imprima el valor de cada variable
```
**Conceptos**: Sintaxis básica, tipos de datos primitivos

#### Día 2: Operadores Aritméticos
**Objetivo**: Dominar operaciones matemáticas
```java
// Ejercicio: Calculadora básica
// 1. Crear variables para dos números
// 2. Realizar suma, resta, multiplicación, división y módulo
// 3. Mostrar resultados formateados
```
**Conceptos**: Operadores (+, -, *, /, %), precedencia

#### Día 3: Entrada de Datos
**Objetivo**: Interactuar con el usuario
```java
// Ejercicio: Programa interactivo
// 1. Solicitar nombre y edad al usuario
// 2. Calcular año de nacimiento
// 3. Mostrar mensaje personalizado
// Usar Scanner para entrada de datos
```
**Conceptos**: Scanner, entrada por teclado

#### Día 4: Condicionales if-else
**Objetivo**: Toma de decisiones
```java
// Ejercicio: Clasificador de edades
// 1. Solicitar edad
// 2. Clasificar: niño (0-12), adolescente (13-17), adulto (18-64), adulto mayor (65+)
// 3. Mostrar categoría correspondiente
```
**Conceptos**: if, else if, else, operadores de comparación

#### Día 5: Switch
**Objetivo**: Múltiples opciones
```java
// Ejercicio: Menú de opciones
// 1. Mostrar menú con 4 opciones
// 2. Usar switch para ejecutar acción según elección
// 3. Incluir opción por defecto
```
**Conceptos**: switch-case, break, default

#### Día 6: Bucle while
**Objetivo**: Repetición con condición
```java
// Ejercicio: Juego de adivinanza
// 1. Generar número aleatorio entre 1-100
// 2. Permitir intentos hasta acertar
// 3. Dar pistas (mayor/menor)
// 4. Contar intentos
```
**Conceptos**: while, Random, lógica de juegos

#### Día 7: Bucle for
**Objetivo**: Repetición controlada
```java
// Ejercicio: Generador de patrones
// 1. Crear triángulo de asteriscos
// 2. Tabla de multiplicar del 1 al 10
// 3. Números pares del 1 al 50
```
**Conceptos**: for, bucles anidados, patrones

---

### Semana 2: Estructuras de Datos Básicas (Días 8-14)

#### Día 8: Arrays Unidimensionales
**Objetivo**: Manejo de arrays básicos
```java
// Ejercicio: Estadísticas de calificaciones
// 1. Array de 10 calificaciones
// 2. Calcular promedio, máxima, mínima
// 3. Contar aprobados (>=6) y reprobados
```
**Conceptos**: Arrays, recorrido, operaciones estadísticas

#### Día 9: Arrays Bidimensionales
**Objetivo**: Matrices
```java
// Ejercicio: Juego Tres en Raya
// 1. Matriz 3x3 para el tablero
// 2. Mostrar tablero
// 3. Permitir movimientos alternados
// 4. Detectar ganador
```
**Conceptos**: Matrices, bucles anidados, lógica de juegos

#### Día 10: Strings - Manipulación Básica
**Objetivo**: Procesamiento de texto
```java
// Ejercicio: Analizador de texto
// 1. Contar caracteres, palabras, líneas
// 2. Convertir a mayúsculas/minúsculas
// 3. Reemplazar caracteres
// 4. Verificar palíndromos
```
**Conceptos**: String methods, charAt, length, substring

#### Día 11: ArrayList
**Objetivo**: Listas dinámicas
```java
// Ejercicio: Lista de tareas
// 1. Agregar tareas
// 2. Marcar como completadas
// 3. Eliminar tareas
// 4. Mostrar pendientes y completadas
```
**Conceptos**: ArrayList, add, remove, get, size

#### Día 12: HashMap
**Objetivo**: Estructuras clave-valor
```java
// Ejercicio: Diccionario español-inglés
// 1. Almacenar palabras y traducciones
// 2. Buscar traducciones
// 3. Agregar nuevas palabras
// 4. Mostrar todo el diccionario
```
**Conceptos**: HashMap, put, get, containsKey, entrySet

#### Día 13: Métodos Estáticos
**Objetivo**: Organización de código
```java
// Ejercicio: Biblioteca de utilidades matemáticas
// 1. Método para números primos
// 2. Método para factorial
// 3. Método para potencia
// 4. Método para MCD y MCM
```
**Conceptos**: static methods, parámetros, return, sobrecarga

#### Día 14: Validación y Manejo de Errores
**Objetivo**: Entrada robusta
```java
// Ejercicio: Validador de datos
// 1. Validar email
// 2. Validar números de teléfono
// 3. Validar fechas
// 4. Manejar entradas inválidas con try-catch
```
**Conceptos**: try-catch, InputMismatchException, regex básico

---

### Semana 3: Programación Orientada a Objetos (Días 15-21)

#### Día 15: Clases y Objetos Básicos
**Objetivo**: Primer contacto con OOP
```java
// Ejercicio: Clase Estudiante
// 1. Atributos: nombre, edad, carrera, promedio
// 2. Constructor
// 3. Métodos getter y setter
// 4. Método mostrarInfo()
```
**Conceptos**: class, constructor, this, encapsulación básica

#### Día 16: Encapsulación
**Objetivo**: Protección de datos
```java
// Ejercicio: Clase CuentaBancaria
// 1. Atributos privados: saldo, numeroCuenta
// 2. Métodos depositar, retirar
// 3. Validaciones (no retirar más del saldo)
// 4. Método consultarSaldo()
```
**Conceptos**: private, public, validaciones, métodos de acceso

#### Día 17: Herencia
**Objetivo**: Jerarquía de clases
```java
// Ejercicio: Sistema de vehículos
// 1. Clase padre: Vehiculo (marca, modelo, año)
// 2. Clases hijas: Coche, Moto
// 3. Métodos específicos para cada tipo
// 4. Override del método toString()
```
**Conceptos**: extends, super, override, jerarquías

#### Día 18: Polimorfismo
**Objetivo**: Múltiples formas
```java
// Ejercicio: Figuras geométricas
// 1. Clase abstracta Figura
// 2. Subclases: Círculo, Rectángulo, Triángulo
// 3. Método abstracto calcularArea()
// 4. Array de figuras con polimorfismo
```
**Conceptos**: abstract, polimorfismo, downcasting

#### Día 19: Interfaces
**Objetivo**: Contratos de código
```java
// Ejercicio: Sistema de empleados
// 1. Interface Trabajador con método trabajar()
// 2. Interface Pagable con método calcularSalario()
// 3. Clases que implementen ambas interfaces
// 4. Demostrar uso de interfaces
```
**Conceptos**: interface, implements, múltiple implementación

#### Día 20: Composición y Agregación
**Objetivo**: Relaciones entre objetos
```java
// Ejercicio: Sistema universitario
// 1. Clase Universidad
// 2. Clase Facultad
// 3. Clase Estudiante
// 4. Relaciones: Universidad tiene Facultades, Facultad tiene Estudiantes
```
**Conceptos**: composición, agregación, relaciones UML

#### Día 21: Excepciones Personalizadas
**Objetivo**: Manejo avanzado de errores
```java
// Ejercicio: Sistema de reservas
// 1. Excepción personalizada: ReservaInvalidaException
// 2. Validar fechas, disponibilidad
// 3. Lanzar y capturar excepciones apropiadas
// 4. Finally block para limpieza
```
**Conceptos**: custom exceptions, throw, throws, finally

---

### Semana 4: Conceptos Avanzados (Días 22-28)

#### Día 22: Archivos - Lectura y Escritura
**Objetivo**: Persistencia de datos
```java
// Ejercicio: Sistema de inventario
// 1. Guardar productos en archivo
// 2. Cargar productos al iniciar
// 3. Actualizar inventario
// 4. Manejar errores de archivo
```
**Conceptos**: FileWriter, FileReader, BufferedReader, File I/O

#### Día 23: Serialización
**Objetivo**: Guardar objetos
```java
// Ejercicio: Agenda de contactos persistente
// 1. Clase Contacto serializable
// 2. Guardar lista de contactos
// 3. Cargar contactos al inicio
// 4. Manejar versiones de objetos
```
**Conceptos**: Serializable, ObjectOutputStream, ObjectInputStream

#### Día 24: Genéricos
**Objetivo**: Tipos parametrizados
```java
// Ejercicio: Contenedor genérico
// 1. Clase generica Caja<T>
// 2. Métodos para almacenar y recuperar
// 3. Lista genérica personalizada
// 4. Wildcards básicos
```
**Conceptos**: generics, type parameters, bounded types

#### Día 25: Lambda y Streams
**Objetivo**: Programación funcional
```java
// Ejercicio: Procesador de datos
// 1. Lista de empleados con salarios
// 2. Filtrar por salario usando lambda
// 3. Mapear a nombres usando streams
// 4. Reducir para obtener salario total
```
**Conceptos**: lambda expressions, Stream API, functional interfaces

#### Día 26: Concurrencia Básica
**Objetivo**: Hilos
```java
// Ejercicio: Simulador de descarga
// 1. Clase que extiende Thread
// 2. Simular descarga con sleep()
// 3. Múltiples descargas simultáneas
// 4. Reportar progreso
```
**Conceptos**: Thread, Runnable, concurrencia básica

#### Día 27: Patrones de Diseño
**Objetivo**: Singleton y Factory
```java
// Ejercicio: Sistema de configuración
// 1. Singleton para configuración global
// 2. Factory para crear diferentes tipos de conexión
// 3. Observer para notificaciones
// 4. Demostrar uso de patrones
```
**Conceptos**: design patterns, singleton, factory, observer

#### Día 28: Base de Datos Básica
**Objetivo**: JDBC
```java
// Ejercicio: Sistema de biblioteca simple
// 1. Conectar a base de datos SQLite
// 2. CRUD básico para libros
// 3. Buscar libros por autor
// 4. Manejar conexiones apropiadamente
```
**Conceptos**: JDBC, SQL básico, prepared statements

---

### Días Finales: Proyectos Integradores (Días 29-31)

#### Día 29: Proyecto Mini - Sistema de Gestión Escolar
**Objetivo**: Integrar conceptos aprendidos
```java
// Características del sistema:
// 1. Clases: Estudiante, Profesor, Curso, Calificación
// 2. Herencia y polimorfismo
// 3. Persistencia en archivos
// 4. Interfaz de consola con menús
// 5. Manejo de excepciones
```

#### Día 30: Proyecto Mini - Juego de Texto
**Objetivo**: Aplicar lógica y estructuras
```java
// Juego de aventura por texto:
// 1. Sistema de habitaciones y objetos
// 2. Inventario del jugador
// 3. Combate por turnos
// 4. Guardar y cargar partida
// 5. Múltiples finales
```

#### Día 31: Revisión y Optimización
**Objetivo**: Refactoring y mejores prácticas
- Revisar código de proyectos anteriores
- Aplicar principios SOLID
- Optimizar rendimiento
- Documentar código
- Preparar para conceptos avanzados

---

## 📋 Recursos Adicionales

### Herramientas Recomendadas:
- **IDE**: IntelliJ IDEA Community o Eclipse
- **JDK**: OpenJDK 17 o superior
- **Base de datos**: SQLite para ejercicios

### Estructura de Carpetas Sugerida:
```
Repaso java/
├── Dia01_HolaMundo/
├── Dia02_Operadores/
├── Dia03_EntradaDatos/
├── ...
├── Proyectos/
│   ├── SistemaEscolar/
│   └── JuegoTexto/
└── Recursos/
    ├── notas.md
    └── referencias.md
```

### Consejos para el Éxito:
1. **Consistencia**: Dedica al menos 1-2 horas diarias
2. **Práctica**: No solo leas, programa cada ejercicio
3. **Experimenta**: Modifica los ejercicios propuestos
4. **Documenta**: Escribe comentarios explicando tu código
5. **Revisa**: Vuelve a ejercicios anteriores regularmente

### Próximos Pasos (después de los 31 días):
- Frameworks (Spring, Hibernate)
- Desarrollo web (Spring Boot, JSP)
- Programación móvil (Android)
- Microservicios
- Testing (JUnit, Mockito)

¡Buena suerte en tu viaje de aprendizaje de Java! 🚀
