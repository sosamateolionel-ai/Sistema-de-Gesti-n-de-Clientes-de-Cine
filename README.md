# Sistema de Gestión de Clientes de Cine

## Descripción

Este proyecto desarrolla una clase `ClienteCine` en Java para representar a los clientes de un cine y controlar su acceso a funciones para mayores de edad y a la sala VIP. Se utilizan atributos privados, métodos de consulta y validaciones para mantener la información consistente y aplicar las reglas de acceso.

## Funcionamiento

El programa crea tres clientes con diferentes edades y condiciones de membresía VIP. Luego comprueba si cada uno puede asistir a funciones para mayores de edad y acceder a la sala VIP.

También realiza pruebas para verificar que la edad pueda actualizarse correctamente y que se rechacen los valores inválidos.

* **Registro de clientes:** almacena el nombre, la edad y si el cliente posee membresía VIP.
* **Validación de edad:** acepta edades entre 0 y 120 años y evita que la edad disminuya.
* **Acceso a funciones para mayores:** permite el acceso cuando el cliente tiene 18 años o más.
* **Acceso a la sala VIP:** requiere tener membresía VIP y cumplir el requisito de edad.
* **Control de modificaciones:** muestra mensajes cuando se intenta establecer una edad inválida.

## Clases principales

### `ClienteCine`

Representa a un cliente del cine y contiene los atributos y métodos necesarios para controlar su información y sus permisos de acceso.

**Atributos:**

* `nombre`: nombre del cliente.
* `edad`: edad actual del cliente.
* `tieneMembresiaVip`: indica si posee una membresía VIP.

**Métodos principales:**

* `getNombre()`: devuelve el nombre del cliente.
* `getEdad()`: devuelve la edad actual.
* `isTieneMembresiaVip()`: indica si el cliente tiene membresía VIP.
* `setEdad(int nuevaEdad)`: actualiza la edad si cumple las restricciones establecidas.
* `esAptoParaFuncionMayores()`: verifica si el cliente tiene al menos 18 años.
* `puedeAccederSalaVip()`: comprueba si posee membresía VIP y cumple el requisito de edad.

### `Main`

Contiene el método `main`, crea los clientes Ana, Tomás y Marta, y utiliza un arreglo y un ciclo `for-each` para mostrar sus datos y comprobar sus permisos.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de clientes mediante una clase.
* **Encapsulamiento:** uso de atributos privados para controlar el acceso a los datos.
* **Validación de datos:** comprobación de los límites permitidos para la edad.
* **Métodos con retorno booleano:** indican si una condición se cumple o si una modificación es válida.
* **Condiciones lógicas:** combinación de condiciones para determinar el acceso a la sala VIP.
* **Reutilización de métodos:** `puedeAccederSalaVip()` utiliza `esAptoParaFuncionMayores()` para evitar duplicar la regla de edad.
* **Arreglos:** almacenamiento de varios objetos `ClienteCine`.
* **Ciclo `for-each`:** recorrido de los clientes para mostrar sus datos y permisos.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="606" height="492" alt="image" src="https://github.com/user-attachments/assets/4d76f0b5-474c-4808-9733-53a961222d47" />

## Resultado esperado

* Ana, de 25 años y con membresía VIP, puede acceder a funciones para mayores y a la sala VIP.
* Tomás, de 15 años y con membresía VIP, inicialmente no puede acceder a ninguno de esos espacios. Después de actualizar su edad a 18, cumple ambas condiciones.
* Marta, de 40 años y sin membresía VIP, puede acceder a funciones para mayores, pero no a la sala VIP.
* Los intentos de asignar a Tomás una edad menor que la actual, negativa o superior a 120 son rechazados.

## Objetivo del ejercicio

Aplicar encapsulamiento, validaciones y métodos que representen reglas de negocio en Java, utilizando objetos, arreglos y ciclos para administrar clientes y determinar sus permisos de acceso.
