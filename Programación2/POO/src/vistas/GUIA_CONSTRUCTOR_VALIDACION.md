# 📘 GUÍA: Constructores y Validación - Explicación Simple

## 🎯 Basado en tu clase Intervalo

Vamos a analizar TU código de `Intervalo` paso a paso:

---

## 1️⃣ **ATRIBUTOS (Variables privadas)**

```java
private double inferior;
private double superior;
```

**¿Qué hace `private`?**
- Solo la clase puede tocar estas variables
- Nadie de afuera puede cambiarlas directamente
- Es como tener tus cosas en un cajón con llave 🔒

---

## 2️⃣ **CONSTRUCTOR (Inicializa el objeto)**

```java
public Intervalo (double inferior, double superior) {
    this.inferior = inferior;
    this.superior = superior;
}
```

**Desglosando:**

| Parte | Qué hace |
|-------|----------|
| `public` | Todo el mundo puede crear un Intervalo |
| `Intervalo` | MISMO nombre que la clase (así Java sabe que es constructor) |
| `(double inferior, double superior)` | Los datos que necesito para crear el objeto |
| `this.inferior = inferior;` | Guardo el parámetro en mi atributo privado |

**`this` = yo mismo (el objeto que se está creando)**

---

## 3️⃣ **VALIDACIÓN en el Constructor**

Tu `Intervalo` NO tiene validación, pero imagina este caso:

```java
public Intervalo (double inferior, double superior) {
    // ❌ PROBLEMA: ¿Y si alguien pone superior < inferior?
    // Ejemplo: Intervalo(10, 5) no tiene sentido
    
    // ✅ SOLUCIÓN: Validar antes de guardar
    if (inferior > superior) {
        System.out.println("ERROR: El inferior no puede ser mayor que superior");
        // Aquí podrías intercambiarlos o lanzar error
    }
    
    this.inferior = inferior;
    this.superior = superior;
}
```

---

## 4️⃣ **EJEMPLO COMPLETO: Clase Tiempo con Validación**

Ahora apliquemos esto a una clase `Tiempo` (HH:MM:SS):

```java
class Tiempo {
    // 1. ATRIBUTOS PRIVADOS
    private int horas;
    private int minutos;
    private int segundos;
    
    // 2. CONSTRUCTOR CON VALIDACIÓN
    public Tiempo(int horas, int minutos, int segundos) {
        
        // VALIDAR HORAS (0-23)
        if (horas < 0 || horas > 23) {
            System.out.println("⚠️ Horas inválidas, usando 0");
            this.horas = 0;
        } else {
            this.horas = horas;
        }
        
        // VALIDAR MINUTOS (0-59)
        if (minutos < 0 || minutos > 59) {
            System.out.println("⚠️ Minutos inválidos, usando 0");
            this.minutos = 0;
        } else {
            this.minutos = minutos;
        }
        
        // VALIDAR SEGUNDOS (0-59)
        if (segundos < 0 || segundos > 59) {
            System.out.println("⚠️ Segundos inválidos, usando 0");
            this.segundos = 0;
        } else {
            this.segundos = segundos;
        }
    }
    
    // 3. MÉTODO toString() - Para imprimir
    public String toString() {
        // Formato HH:MM:SS con ceros a la izquierda
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        // %02d = número con 2 dígitos, rellena con 0 si hace falta
    }
}
```

---

## 5️⃣ **MÉTODOS (Como en tu Intervalo)**

### Método que NO cambia el objeto (como `longitud()` en Intervalo)

```java
public double longitud() {
    return superior - inferior;  // Solo devuelve un cálculo
}
```

### Método que SÍ cambia el objeto (como `desplazar()` en Intervalo)

```java
public void desplazar(double desplazamiento) {
    inferior = inferior + desplazamiento;  // Modifico mis atributos
    superior = superior + desplazamiento;
}
```

### Método que crea un NUEVO objeto (como `desplazado()` en Intervalo)

```java
public Intervalo desplazado(double desplazamiento) {
    // Devuelvo un NUEVO Intervalo, no modifico el actual
    return new Intervalo(inferior + desplazamiento, superior + desplazamiento);
}
```

---

## 📝 **PLANTILLA BÁSICA PARA CUALQUIER CLASE**

```java
class MiClase {
    
    // 1️⃣ ATRIBUTOS PRIVADOS
    private tipo atributo1;
    private tipo atributo2;
    
    // 2️⃣ CONSTRUCTOR (mismo nombre que la clase)
    public MiClase(tipo parametro1, tipo parametro2) {
        // Validaciones aquí (si las necesitas)
        if (parametro1 cumple condición) {
            this.atributo1 = parametro1;
        } else {
            // Manejo del error
        }
        
        this.atributo2 = parametro2;
    }
    
    // 3️⃣ MÉTODOS
    public tipo metodo1() {
        // Hacer cosas con los atributos
        return algo;
    }
    
    public void metodo2() {
        // Modificar atributos
    }
}
```

---

## ✅ **RESUMEN ULTRA-RÁPIDO**

1. **Atributos privados**: Las "variables" de la clase (solo ella las toca)
2. **Constructor**: Método especial que inicializa (mismo nombre que la clase)
3. **Validación**: Comprobar que los datos tengan sentido ANTES de guardarlos
4. **`this`**: Referencia al objeto actual ("yo mismo")
5. **Métodos**: Funciones que usan o modifican los atributos

---

## 🎯 **TU PRIMER RETO SIMPLIFICADO**

Ahora con esto claro, intenta el Reto 1 siguiendo esta estructura:

```java
class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;
    
    public Tiempo(int horas, int minutos, int segundos) {
        // TODO: Validar y guardar
    }
    
    public String toString() {
        // TODO: Devolver "HH:MM:SS"
    }
}
```

**¿Dudas?** ¡Pregúntame lo que no entiendas! 🚀
