# 📚 Sistema de Gestión de Calificaciones

## 📋 ¿Qué hace este programa?

Es un sistema que permite a un estudiante:
- ✅ Agregar hasta 10 calificaciones
- 👀 Ver todas sus calificaciones
- 📊 Calcular su promedio
- 🚪 Salir del programa

---

## 🏗️ Estructura del Proyecto

```
SistemaCalificaciones/
├── Estudiante.java  ← La CLASE (el molde/plantilla)
├── Main.java        ← El PROGRAMA principal
└── README.md        ← Esta documentación
```

---

## 🧠 Conceptos Clave de POO (Programación Orientada a Objetos)

### 1. **CLASE** = Molde/Plantilla
`Estudiante.java` es una **clase**, es decir, un MOLDE para crear estudiantes.

**Piénsalo como:**
- Una receta de cocina (la clase)
- El pastel que haces con esa receta (el objeto)

### 2. **OBJETO** = Instancia de la clase
```java
Estudiante estudiante = new Estudiante("Adriana");
```
Esto crea un OBJETO llamado `estudiante` usando el molde `Estudiante`.

### 3. **ATRIBUTOS** = Características
```java
private String nombre;
private int[] calificaciones;
private int contador;
```
Son las **variables** que describen al estudiante.

### 4. **MÉTODOS** = Acciones/Comportamientos
```java
public void agregarCalificacion(int nota)
public void mostrarCalificaciones()
public void mostrarPromedio()
```
Son las **funciones** que el estudiante puede hacer.

---

## 🔄 Flujo del Programa

```
┌─────────────────────────┐
│ 1. Crear Estudiante     │
│    estudiante = new...  │
└───────────┬─────────────┘
            ▼
┌─────────────────────────┐
│ 2. Mostrar Menú         │
│    [A] [V] [P] [S]      │
└───────────┬─────────────┘
            ▼
┌─────────────────────────┐
│ 3. Usuario elige        │
│    opcion = "A"         │
└───────────┬─────────────┘
            ▼
┌─────────────────────────┐
│ 4. Ejecutar acción      │
│    estudiante.metodo()  │
└───────────┬─────────────┘
            ▼
┌─────────────────────────┐
│ 5. Repetir hasta [S]    │
└─────────────────────────┘
```

---

## 🎯 Cómo funciona por dentro

### **Agregar una calificación:**
```java
estudiante.agregarCalificacion(8);
```

**Paso a paso:**
1. Verifica que `contador < 10` (hay espacio)
2. Guarda `8` en `calificaciones[contador]`
3. Incrementa `contador++`

**Representación visual:**
```
calificaciones = [8, 0, 0, 0, 0, 0, 0, 0, 0, 0]
                  ↑
              contador = 1
```

### **Calcular promedio:**
```java
double promedio = calcularPromedio();
```

**Paso a paso:**
1. Suma todas las notas: `suma = 8 + 7 + 9 = 24`
2. Divide por cantidad: `promedio = 24 / 3 = 8.0`
3. Retorna el resultado

---

## 🤔 Cómo Pensar para Resolver Ejercicios de POO

### **Paso 1: Identificar el "objeto" del mundo real**
> ¿Qué estoy modelando?
- En este caso: Un **Estudiante**

### **Paso 2: ¿Qué CARACTERÍSTICAS tiene?**
> Atributos = Sustantivos
- Nombre ✅
- Calificaciones ✅
- Cantidad de calificaciones ✅

### **Paso 3: ¿Qué ACCIONES puede hacer?**
> Métodos = Verbos
- Agregar calificación ✅
- Mostrar calificaciones ✅
- Calcular promedio ✅

### **Paso 4: ¿Cómo se CREA?**
> Constructor
```java
public Estudiante(String nombre) {
    this.nombre = nombre;
}
```

### **Paso 5: ¿Cómo se USA?**
> Programa principal (Main)
```java
Estudiante estudiante = new Estudiante("Adriana");
estudiante.agregarCalificacion(8);
estudiante.mostrarPromedio();
```

---

## 💡 Tips para tu Clase de Mañana

### ✅ **Piensa en objetos del mundo real**
- Carro → atributos: color, marca, velocidad | métodos: acelerar(), frenar()
- Cuenta Bancaria → atributos: saldo, titular | métodos: depositar(), retirar()

### ✅ **Separa responsabilidades**
- **Clase Estudiante** = Maneja los datos y lógica del estudiante
- **Clase Main** = Maneja la interacción con el usuario

### ✅ **Usa `private` para atributos**
```java
private String nombre;  // ✅ Buena práctica
String nombre;          // ❌ No tan seguro
```
Esto se llama **encapsulamiento**.

### ✅ **Usa métodos auxiliares**
En `Main.java` hay métodos como `mostrarMenu()` y `agregarNota()` que hacen el código más limpio.

---

## 🚀 Cómo Ejecutar

### **Opción 1: Desde VS Code**
1. Abre `Main.java`
2. Click en "Run" o presiona `F5`

### **Opción 2: Desde Terminal**
```bash
cd "c:\Users\adria\OneDrive\Documentos\Repos\Practicas\Programación2\POO\SistemaCalificaciones"
javac Main.java Estudiante.java
java Programación2.POO.SistemaCalificaciones.Main
```

---

## 📝 Ejemplo de Ejecución

```
Ingresa tu nombre: Adriana
¡Bienvenido/a Adriana! 🎓

╔════════════════════════════════╗
║   MENÚ DE CALIFICACIONES       ║
╚════════════════════════════════╝
[A] Agregar una calificación
[V] Ver todas las calificaciones
[P] Ver promedio
[S] Salir

Elige una opción: A

Ingresa la calificación (0-10): 8
✅ Calificación agregada correctamente
📌 Total de calificaciones: 1/10

Elige una opción: V

📋 Calificaciones de Adriana:
─────────────────────
1. 8
─────────────────────

Elige una opción: P

📊 RESULTADO:
────────────────────
Promedio: 8.00
✅ ¡Felicidades! Has APROBADO
────────────────────
```

---

## 🔑 Palabras Clave que Debes Entender

| Palabra | Significado |
|---------|-------------|
| `class` | Define una clase (molde) |
| `new` | Crea un objeto (instancia) |
| `this` | Referencia al objeto actual |
| `private` | Solo accesible dentro de la clase |
| `public` | Accesible desde cualquier lugar |
| `void` | El método no retorna nada |
| `return` | Devuelve un valor |

---

¡Éxito en tu clase! 🎯
