# 📚 Sistema de Gestión de Calificaciones

## 📂 Estructura del Proyecto

```
SistemaNotas/
├── Estudiante.java      ← Clase que representa a un estudiante
├── Calificaciones.java  ← Clase principal con el menú (main)
└── README.md            ← Este archivo
```

---

## 🧠 Cómo Pensar en POO (Programación Orientada a Objetos)

### **1. Identifica los OBJETOS del mundo real**
En este caso: **Estudiante**

### **2. Pregúntate: ¿Qué CARACTERÍSTICAS tiene?**
- Nombre
- Calificaciones (array de notas)
- Contador de cuántas notas lleva

### **3. Pregúntate: ¿Qué ACCIONES puede hacer?**
- Agregar una nota
- Mostrar todas sus notas
- Calcular su promedio
- Mostrar si aprobó

---

## 🏗️ Estructura del Código

### **Estudiante.java** (La plantilla/molde)

```
┌─────────────────────────────────┐
│  CLASE: Estudiante              │
├─────────────────────────────────┤
│  ATRIBUTOS (datos):             │
│  - nombre: String               │
│  - calificacion: int[10]        │
│  - contador: int                │
├─────────────────────────────────┤
│  CONSTRUCTOR:                   │
│  - Estudiante(nombre)           │
├─────────────────────────────────┤
│  MÉTODOS (acciones):            │
│  - AñadirCalificacion(nota)     │
│  - MostrarCalificacion()        │
│  - PromedioDeCalificaciones()   │
│  - MostrarPromedio()            │
└─────────────────────────────────┘
```

### **Calificaciones.java** (El programa principal)

```
┌─────────────────────────────────┐
│  CLASE: Calificaciones          │
├─────────────────────────────────┤
│  main():                        │
│    1. Crear objeto Estudiante   │
│    2. Mostrar menú              │
│    3. Leer opción               │
│    4. Ejecutar acción           │
│    5. Repetir                   │
├─────────────────────────────────┤
│  ImprimirMenu():                │
│    - Muestra las opciones       │
└─────────────────────────────────┘
```

---

## 🔄 Flujo del Programa

```
INICIO
  ↓
Crear objeto: estudiante1
  ↓
┌──────────────────┐
│ Mostrar Menú     │
└────────┬─────────┘
         ↓
    Leer opción
         ↓
    ┌────────────────────────┐
    │  ¿Qué eligió?          │
    ├────────────────────────┤
    │ A → Agregar nota       │
    │ V → Ver notas          │
    │ P → Ver promedio       │
    │ S → Salir              │
    └────────┬───────────────┘
             ↓
    Ejecutar acción
             ↓
      ¿Salir? ─NO→ Volver al menú
         │
        SÍ
         ↓
       FIN
```

---

## 💡 Conceptos Clave

### **this** - ¿Qué significa?
`this` se refiere al objeto **actual**

```java
public Estudiante(String nombre) {
    this.nombre = nombre;
    // ↑             ↑
    // atributo    parámetro
}
```

### **static** - ¿Por qué se usa?
- `main` es `static` → Se ejecuta sin crear objetos
- `ImprimirMenu` es `static` → Se puede llamar desde `main`

### **void** vs **return**
- `void` → El método NO devuelve nada
- `return` → El método devuelve un valor

```java
public void MostrarPromedio() {  // void - solo imprime
    System.out.println(promedio);
}

public double PromedioDeCalificaciones() {  // devuelve double
    return promedioCalificaciones;
}
```

---

## 🎯 Cómo Funciona Paso a Paso

### **1. Se crea el objeto**
```java
Estudiante estudiante1 = new Estudiante("Adriana");
```

En memoria:
```
estudiante1
├── nombre: "Adriana"
├── calificacion: [0,0,0,0,0,0,0,0,0,0]
└── contador: 0
```

### **2. Usuario agrega una nota (7)**
```java
estudiante1.AñadirCalificacion(7);
```

En memoria:
```
estudiante1
├── nombre: "Adriana"
├── calificacion: [7,0,0,0,0,0,0,0,0,0]
└── contador: 1
              ↑ aumentó
```

### **3. Usuario agrega más notas (8, 9)**
```
estudiante1
├── nombre: "Adriana"
├── calificacion: [7,8,9,0,0,0,0,0,0,0]
└── contador: 3
```

### **4. Usuario ve su promedio**
```java
estudiante1.MostrarPromedio();
```

Cálculo:
```
Suma = 7 + 8 + 9 = 24
Promedio = 24 / 3 = 8.0
8.0 >= 6 → ¡Aprobado!
```

---

## 🚀 Cómo Ejecutarlo

```powershell
# Compilar
javac Estudiante.java Calificaciones.java

# Ejecutar
java Programación2.POO.SistemaNotas.Calificaciones
```

---

## 🎓 Para tu Clase de Mañana

### **Si te piden crear otra clase similar, sigue estos pasos:**

1. **Identifica el objeto** (ej: Producto, Libro, Coche)

2. **Define atributos** (características)
   ```java
   String titulo;
   double precio;
   int stock;
   ```

3. **Crea el constructor**
   ```java
   public Producto(String titulo, double precio) {
       this.titulo = titulo;
       this.precio = precio;
   }
   ```

4. **Agrega métodos** (acciones)
   ```java
   public void mostrarInfo() {
       System.out.println(titulo + " - $" + precio);
   }
   ```

5. **En el main, crea y usa objetos**
   ```java
   Producto p1 = new Producto("Laptop", 799.99);
   p1.mostrarInfo();
   ```

---

## ✅ Checklist de Buenas Prácticas

- [ ] Cada clase en su propio archivo
- [ ] Nombres de clases con Mayúscula (Estudiante)
- [ ] Nombres de métodos con minúscula (mostrarPromedio)
- [ ] Usar `this` para claridad
- [ ] Validar datos antes de usarlos
- [ ] Comentar código complejo

---

## 🐛 Errores Comunes que Evitar

❌ **Llamar método sin crear objeto**
```java
Estudiante.MostrarPromedio();  // ERROR
```

✅ **Correcto**
```java
Estudiante e1 = new Estudiante("Ana");
e1.MostrarPromedio();  // CORRECTO
```

---

❌ **Acceder a variable fuera de alcance**
```java
static void ImprimirMenu() {
    estudiante1.MostrarCalificacion();  // ERROR - no existe aquí
}
```

✅ **Correcto: Pasar como parámetro**
```java
static void ImprimirMenu(Estudiante est) {
    est.MostrarCalificacion();  // CORRECTO
}
```

---

¡Éxito en tu clase mañana! 🎉
