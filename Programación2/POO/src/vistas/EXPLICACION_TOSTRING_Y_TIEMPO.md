# 🕐 EXPLICACIÓN SIMPLE: toString() y conversión de tiempo

## 1️⃣ ¿Qué es toString()? 

**toString()** es un método MÁGICO que convierte tu objeto en texto cuando lo imprimes.

### Ejemplo sin toString():
```java
Tiempo t = new Tiempo(14, 5, 9);
System.out.println(t);  
// Imprime algo feo como: Tiempo@15db9742
```

### Ejemplo CON toString():
```java
Tiempo t = new Tiempo(14, 5, 9);
System.out.println(t);  
// Imprime: 14:05:09  ← ¡Bonito y legible!
```

---

## 2️⃣ String.format() - EXPLICACIÓN ULTRA SIMPLE

`String.format()` es como las plantillas de Word: pones marcadores y luego los rellenas.

### Ejemplo 1: Sin formato
```java
int horas = 9;
int minutos = 5;
int segundos = 3;

String tiempo = horas + ":" + minutos + ":" + segundos;
// Resultado: "9:5:3"  ← Se ve mal
```

### Ejemplo 2: CON String.format
```java
int horas = 9;
int minutos = 5;
int segundos = 3;

String tiempo = String.format("%02d:%02d:%02d", horas, minutos, segundos);
// Resultado: "09:05:03"  ← Se ve profesional con ceros
```

---

## 3️⃣ ¿Qué significa %02d?

Desglosando `%02d`:

```
%     →  "Aquí va algo dinámico"
0     →  "Rellena con ceros"
2     →  "Quiero 2 dígitos"
d     →  "Es un número entero (decimal)"
```

### Ejemplos visuales:

| Número | %02d | %03d | %d (sin formato) |
|--------|------|------|------------------|
| 5      | 05   | 005  | 5                |
| 12     | 12   | 012  | 12               |
| 3      | 03   | 003  | 3                |
| 100    | 100  | 100  | 100              |

---

## 4️⃣ toString() COMPLETO para tu clase Tiempo

```java
public String toString() {
    return String.format("%02d:%02d:%02d", horas, minutos, segundos);
}
```

**Eso es TODO.** Una sola línea.

### ¿Cómo funciona?
1. `%02d` → primera posición → usa `horas`
2. `:`    → texto literal
3. `%02d` → segunda posición → usa `minutos`
4. `:`    → texto literal
5. `%02d` → tercera posición → usa `segundos`

### Ejemplo real:
```java
Tiempo t = new Tiempo(9, 5, 3);
System.out.println(t.toString());  // "09:05:03"
System.out.println(t);             // "09:05:03" (llama automáticamente a toString)
```

---

## 5️⃣ sumarSegundos() - LÓGICA PASO A PASO

### El problema:
Tienes 14:30:45 (14 horas, 30 minutos, 45 segundos)
Le sumas 90 segundos
Debe quedar: 14:32:15

### ¿Cómo pensarlo?

#### VERSIÓN SIMPLE (sin bucles):
```java
public void sumarSegundos(int seg) {
    // 1. Sumo los segundos que me dan
    segundos = segundos + seg;
    
    // 2. Si los segundos pasan de 59, los "paso" a minutos
    if (segundos >= 60) {
        minutos = minutos + (segundos / 60);  // ¿Cuántos minutos completos hay?
        segundos = segundos % 60;             // Me quedo solo con el resto
    }
    
    // 3. Si los minutos pasan de 59, los "paso" a horas
    if (minutos >= 60) {
        horas = horas + (minutos / 60);
        minutos = minutos % 60;
    }
    
    // 4. Si las horas pasan de 23, vuelvo a 0
    if (horas >= 24) {
        horas = horas % 24;
    }
}
```

---

## 6️⃣ Entendiendo / y %

### División normal (/)
Divide y te da solo la PARTE ENTERA:
```java
90 / 60  = 1     (1 minuto completo)
5 / 60   = 0     (0 minutos completos)
125 / 60 = 2     (2 minutos completos)
```

### Módulo (%)
Te da el RESTO de la división:
```java
90 % 60  = 30    (sobran 30 segundos)
5 % 60   = 5     (sobran 5 segundos)
125 % 60 = 5     (sobran 5 segundos)
```

---

## 7️⃣ EJEMPLO COMPLETO con números

### Situación: 14:30:50 + 90 segundos

```java
// Estado inicial
horas = 14
minutos = 30
segundos = 50

// Llamamos: sumarSegundos(90)

// Paso 1: Sumar
segundos = 50 + 90 = 140

// Paso 2: ¿140 >= 60? SÍ
minutos = 30 + (140 / 60) = 30 + 2 = 32
segundos = 140 % 60 = 20

// Paso 3: ¿32 >= 60? NO, no hacemos nada

// Paso 4: ¿14 >= 24? NO, no hacemos nada

// Estado final
horas = 14
minutos = 32
segundos = 20

// Resultado: 14:32:20 ✅
```

---

## 8️⃣ CÓDIGO COMPLETO de la clase Tiempo

```java
static class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        // Validación horas
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }
        
        // Validación minutos
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
        
        // Validación segundos
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }
    
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
    
    public void sumarSegundos(int seg) {
        segundos = segundos + seg;
        
        if (segundos >= 60) {
            minutos = minutos + (segundos / 60);
            segundos = segundos % 60;
        }
        
        if (minutos >= 60) {
            horas = horas + (minutos / 60);
            minutos = minutos % 60;
        }
        
        if (horas >= 24) {
            horas = horas % 24;
        }
    }
    
    public boolean esAntesDe(Tiempo otro) {
        // Primero comparo horas
        if (this.horas < otro.horas) return true;
        if (this.horas > otro.horas) return false;
        
        // Si horas iguales, comparo minutos
        if (this.minutos < otro.minutos) return true;
        if (this.minutos > otro.minutos) return false;
        
        // Si minutos iguales, comparo segundos
        if (this.segundos < otro.segundos) return true;
        
        return false;  // Son iguales o este es mayor
    }
}
```

---

## 💡 RESUMEN RÁPIDO

### toString():
```java
return String.format("%02d:%02d:%02d", horas, minutos, segundos);
```
**Una línea.** Eso es todo.

### sumarSegundos():
1. Sumo a segundos
2. Si segundos >= 60 → Paso a minutos usando `/` y `%`
3. Si minutos >= 60 → Paso a horas
4. Si horas >= 24 → Vuelvo a 0

---

## 🎯 ¿Qué hacer ahora?

**Opción A**: Intenta implementarlo tú mismo con esta guía
**Opción B**: Te ayudo a completar el código juntos paso a paso
**Opción C**: Te pego la solución completa y la analizamos juntos

**No hay vergüenza en necesitar ayuda.** Todos empezamos así. 💪
