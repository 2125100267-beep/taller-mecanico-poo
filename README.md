# Sistema de Taller Mecánico - Capa del Modelo (POO)

**Estudiante:** Francisco Alejandro Ramirez Garcia  
**Materia:** Programación Orientada a Objetos  
**Institución:** Universidad Tecnológica de Jalisco (UTJ)  

## Descripción del Proyecto
Este proyecto contiene la implementación de la capa del modelo de datos para el sistema de escritorio de un **Taller Mecánico**, desarrollado en Java con JavaFX y aplicando los principios fundamentales de la Programación Orientada a Objetos (POO).

## Principios POO Aplicados
1. **Abstracción:** Se diseñó la clase base abstracta `Persona` para agrupar los datos generales de los seres humanos en el taller, y la subclase `Administrador` para los usuarios con credenciales del sistema.
2. **Encapsulamiento:** Todos los atributos están declarados como `private` con acceso mediante `getters` y `setters` que incluyen validaciones de datos.
3. **Herencia y Modificadores (`abstract` y `final`):** La clase `Persona` es `abstract` para evitar instanciación directa y `Administrador` es `final` para impedir derivaciones posteriores.
4. **Sobrescritura Estándar:** Métodos `equals()` y `hashCode()` basados estrictamente en el ID entero, y concatenación de `super.toString()` en el método `toString()`.

## Estructura del Repositorio
- `/tallerMecanico/src/`: Código fuente en Java (Modelos, Controladores, Vistas y Enums).
- `/tallerMecanico/docs/`: Contiene el reporte técnico en PDF con el análisis arquitectónico.
