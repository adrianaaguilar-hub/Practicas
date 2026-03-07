# 🎨 EXPLICACIÓN VISUAL - Cómo Pensar en POO

## 🏭 Analogía: Fábrica de Galletas

```
┌──────────────────────────────────┐
│  CLASE = MOLDE DE GALLETA        │  ← Estudiante.java
│  (La receta, el diseño)          │
└──────────────────────────────────┘
              │
              │ new Estudiante("Adriana")
              ↓
┌──────────────────────────────────┐
│  OBJETO = GALLETA REAL           │  ← estudiante1
│  (Una galleta específica hecha)  │
└──────────────────────────────────┘
```

**La clase es el MOLDE**, el objeto es la **GALLETA CONCRETA**.

---

## 👤 Ejemplo: Crear Estudiantes

### **Código:**
```java
Estudiante estudiante1 = new Estudiante("Adriana");
Estudiante estudiante2 = new Estudiante("Carlos");
Estudiante estudiante3 = new Estudiante("María");
```

### **En memoria:**

```
┌─────────────────────┐      ┌─────────────────────┐      ┌─────────────────────┐
│   estudiante1       │      │   estudiante2       │      │   estudiante3       │
├─────────────────────┤      ├─────────────────────┤      ├─────────────────────┤
│ nombre: "Adriana"   │      │ nombre: "Carlos"    │      │ nombre: "María"     │
│ calificacion: []    │      │ calificacion: []    │      │ calificacion: []    │
│ contador: 0         │      │ contador: 0         │      │ contador: 0         │
└─────────────────────┘      └─────────────────────┘      └─────────────────────┘
```

**Cada objeto es INDEPENDIENTE** - tienen sus propios datos.

---

## 📝 Seguimiento Paso a Paso

### **Estado Inicial**
```java
Estudiante estudiante1 = new Estudiante("Adriana");
```

```
estudiante1
├── nombre: "Adriana"
├── calificacion: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
│                  0  1  2  3  4  5  6  7  8  9  ← índices
└── contador: 0
```

---

### **Paso 1: Agregar nota 8**
```java
estudiante1.AñadirCalificacion(8);
```

**¿Qué pasa internamente?**
```java
public void AñadirCalificacion(int nota) {
    // nota = 8
    // contador = 0
    
    this.calificacion[this.contador] = nota;
    // this.calificacion[0] = 8
    
    this.contador++;
    // contador = 1
}
```

**Resultado:**
```
estudiante1
├── nombre: "Adriana"
├── calificacion: [8, 0, 0, 0, 0, 0, 0, 0, 0, 0]
│                  ↑
│              guardado aquí
└── contador: 1  ← aumentó
```

---

### **Paso 2: Agregar nota 7**
```java
estudiante1.AñadirCalificacion(7);
```

```
estudiante1
├── nombre: "Adriana"
├── calificacion: [8, 7, 0, 0, 0, 0, 0, 0, 0, 0]
│                     ↑
│                 guardado aquí
└── contador: 2
```

---

### **Paso 3: Agregar nota 9**
```java
estudiante1.AñadirCalificacion(9);
```

```
estudiante1
├── nombre: "Adriana"
├── calificacion: [8, 7, 9, 0, 0, 0, 0, 0, 0, 0]
│                        ↑
│                    guardado aquí
└── contador: 3
```

---

### **Paso 4: Mostrar Calificaciones**
```java
estudiante1.MostrarCalificacion();
```

**¿Qué pasa internamente?**
```java
public void MostrarCalificacion() {
    // contador = 3
    
    for (int i = 0; i < contador; i++) {
        //      i < 3
        
        // Iteración 1: i=0 → imprime calificacion[0] = 8
        // Iteración 2: i=1 → imprime calificacion[1] = 7
        // Iteración 3: i=2 → imprime calificacion[2] = 9
        // i=3 → 3 < 3 es FALSO → termina
    }
}
```

**Salida:**
```
--- Calificaciones de Adriana ---
  1. 8
  2. 7
  3. 9
```

---

### **Paso 5: Calcular Promedio**
```java
estudiante1.MostrarPromedio();
```

**¿Qué pasa internamente?**
```java
public double PromedioDeCalificaciones() {
    int sumaCalificaciones = 0;
    
    // Iteración 1: i=0 → suma = 0 + 8 = 8
    // Iteración 2: i=1 → suma = 8 + 7 = 15
    // Iteración 3: i=2 → suma = 15 + 9 = 24
    
    for (int i = 0; i < contador; i++) {
        sumaCalificaciones = sumaCalificaciones + calificacion[i];
    }
    
    // suma = 24
    // contador = 3
    double promedio = 24 / 3 = 8.0
    
    return 8.0;
}
```

**Salida:**
```
=== Promedio de Adriana ===
Promedio: 8.0
✓ ¡Felicidades! Has aprobado
```

---

## 🔄 Flujo Completo de Ejecución

```
USUARIO                    PROGRAMA                     MEMORIA
   │                          │                            │
   │  [Ejecuta programa]      │                            │
   ├─────────────────────────→│                            │
   │                          │ new Estudiante("Adriana")  │
   │                          ├───────────────────────────→│
   │                          │                       estudiante1
   │                          │                       ├─ nombre: "Adriana"
   │                          │                       ├─ calificacion: [0...]
   │                          │                       └─ contador: 0
   │                          │                            │
   │  [Muestra menú]          │                            │
   │←─────────────────────────┤                            │
   │                          │                            │
   │  Escribe "A"             │                            │
   ├─────────────────────────→│                            │
   │                          │                            │
   │  Escribe "8"             │                            │
   ├─────────────────────────→│                            │
   │                          │ AñadirCalificacion(8)      │
   │                          ├───────────────────────────→│
   │                          │                       calificacion[0] = 8
   │                          │                       contador = 1
   │                          │                            │
   │  [Muestra menú]          │                            │
   │←─────────────────────────┤                            │
   │                          │                            │
   │  Escribe "V"             │                            │
   ├─────────────────────────→│                            │
   │                          │ MostrarCalificacion()      │
   │                          ├───────────────────────────→│
   │                          │                       Lee calificacion[0..0]
   │  [Muestra: 1. 8]         │                            │
   │←─────────────────────────┤                            │
   │                          │                            │
   │  Escribe "P"             │                            │
   ├─────────────────────────→│                            │
   │                          │ MostrarPromedio()          │
   │                          ├───────────────────────────→│
   │                          │                       Calcula: 8/1 = 8.0
   │  [Promedio: 8.0]         │                            │
   │←─────────────────────────┤                            │
   │                          │                            │
   │  Escribe "S"             │                            │
   ├─────────────────────────→│                            │
   │                          │ programaActivo = false     │
   │  [Adiós]                 │                            │
   │←─────────────────────────┤                            │
   │                          │ FIN                        │
```

---

## 🧩 Relación entre las Clases

```
┌─────────────────────────────────────┐
│  Calificaciones.java                │
│  (Clase Principal - Ejecutable)     │
├─────────────────────────────────────┤
│  main() {                           │
│    Estudiante estudiante1 = ...     │  ← CREA objeto
│                    │                │
│    estudiante1.AñadirCalificacion() │  ← USA objeto
│    estudiante1.MostrarPromedio()    │  ← USA objeto
│  }                                  │
└─────────────────┬───────────────────┘
                  │
                  │ usa
                  ↓
┌─────────────────────────────────────┐
│  Estudiante.java                    │
│  (Clase Modelo - Plantilla)         │
├─────────────────────────────────────┤
│  ATRIBUTOS:                         │
│  - nombre                           │
│  - calificacion[]                   │
│  - contador                         │
│                                     │
│  MÉTODOS:                           │
│  - AñadirCalificacion()             │
│  - MostrarCalificacion()            │
│  - PromedioDeCalificaciones()       │
│  - MostrarPromedio()                │
└─────────────────────────────────────┘
```

---

## 🎯 Cómo Pensar para Resolver Ejercicios POO

### **PASO 1: Lee el problema**
> "Crear un sistema que gestione las calificaciones de un estudiante"

### **PASO 2: Identifica SUSTANTIVOS (objetos potenciales)**
- **Estudiante** ← CLASE
- Calificaciones ← atributo del estudiante

### **PASO 3: Identifica VERBOS (acciones/métodos)**
- **Agregar** calificaciones ← método
- **Mostrar** calificaciones ← método
- **Calcular** promedio ← método

### **PASO 4: Define los ATRIBUTOS (datos que necesita)**
- nombre (String)
- calificaciones (int[])
- contador (int) ← para saber cuántas lleva

### **PASO 5: Crea el CONSTRUCTOR**
```java
public Estudiante(String nombre) {
    this.nombre = nombre;
}
```

### **PASO 6: Implementa los MÉTODOS**
```java
public void AñadirCalificacion(int nota) {
    // código
}
```

### **PASO 7: Crea el MAIN para USAR la clase**
```java
public static void main(String[] args) {
    Estudiante e1 = new Estudiante("Ana");
    e1.AñadirCalificacion(8);
}
```

---

## 💭 Preguntas Frecuentes

### **P: ¿Por qué usar `this`?**
**R:** Para diferenciar entre el atributo de la clase y el parámetro

```java
public Estudiante(String nombre) {
    this.nombre = nombre;
    //↑             ↑
    //atributo    parámetro
}
```

---

### **P: ¿Qué significa `static`?**
**R:** Que pertenece a la CLASE, no a un objeto específico

```java
static void ImprimirMenu() {  // No necesita objeto
    // Se puede llamar directamente
}
```

---

### **P: ¿Cuándo usar `void` vs un tipo de retorno?**
**R:**
- `void` → cuando solo hace algo (imprimir, modificar)
- `tipo` → cuando devuelve un valor

```java
public void MostrarPromedio() {     // void - solo imprime
    System.out.println(promedio);
}

public double PromedioDeCalificaciones() {  // double - devuelve valor
    return promedio;
}
```

---

### **P: ¿Por qué el contador empieza en 0?**
**R:** Porque los arrays en Java empiezan en índice 0

```java
int[] arr = new int[10];
// arr[0] ← primera posición
// arr[9] ← última posición
```

---

## 📌 Resumen para Mañana

### **Si te dan un ejercicio de POO:**

1. ✅ Identifica el **objeto principal** (Libro, Producto, Coche...)
2. ✅ Define sus **atributos** (datos que tiene)
3. ✅ Define sus **métodos** (acciones que puede hacer)
4. ✅ Crea el **constructor**
5. ✅ En el `main`, crea y usa **objetos**

---

¡Mucha suerte en tu clase! 🚀
