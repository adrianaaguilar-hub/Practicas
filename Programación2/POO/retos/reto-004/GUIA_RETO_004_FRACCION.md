# Reto 004 — Clase `Fraccion`

> **Objetivo del profesor:** Diseñar e implementar la clase `Fraccion` con operaciones básicas, métodos de comparación, utilidades (inversa y opuesta) y los métodos habituales de Java (`toString`, `clone`, conversión a decimal).


#CREAR V ERION ALTERNATIVAAAAAAAA!!!!!!!!!!!!!!!!!!!
---

## Cómo usar esta guía

Antes de escribir código, **siempre hazte las preguntas de diseño**. El proceso es:

```
1. Preguntas de diseño  →  2. Identificar atributos  →  3. Identificar métodos
→  4. Implementar por bloques  →  5. Commit por bloque  →  6. Probar
```

---

## Paso 1 — Preguntas de diseño (hazlas ANTES de abrir el IDE)

### ¿Qué ES una fracción?

Una fracción representa una parte de un entero. Tiene dos partes:

```
    numerador
   ───────────
   denominador
```

Por ejemplo: `3/4` → numerador = 3, denominador = 4.

---

### ¿Qué datos (atributos) necesita la clase?

| Pregunta | Respuesta |
|---|---|
| ¿Qué números la forman? | `numerador` (int) y `denominador` (int) |
| ¿Puede el denominador ser 0? | **NO** → hay que validarlo |
| ¿Puede el numerador ser negativo? | Sí, eso indica que la fracción es negativa |
| ¿Dónde ponemos el signo si ambos son negativos? | Convenio: el signo vive en el **numerador** |
| ¿La guardamos simplificada o no? | Mejor simplificada siempre → usar MCD |

---

### ¿Qué métodos necesita? (checklist del profesor)

#### Constructores
- [ ] `Fraccion(int numerador, int denominador)` — constructor principal con validación
- [ ] `Fraccion(int entero)` — un entero es una fracción con denominador 1

#### Operaciones básicas
- [ ] `sumar(Fraccion otra)`
- [ ] `restar(Fraccion otra)`
- [ ] `multiplicar(Fraccion otra)`
- [ ] `dividir(Fraccion otra)`

#### Comparación
- [ ] `equals(Object o)` — ¿son iguales?
- [ ] `esMayor(Fraccion otra)` — ¿esta fracción es mayor que otra?
- [ ] `esMenor(Fraccion otra)`

#### Utilidades
- [ ] `inversa()` — devuelve `denominador/numerador`
- [ ] `opuesta()` — devuelve la fracción con numerador negado
- [ ] `simplificar()` — divide numerador y denominador entre su MCD

#### Métodos habituales de Java
- [ ] `toString()` — representación como texto: `"3/4"`
- [ ] `clone()` — copia independiente del objeto
- [ ] `aDecimal()` — devuelve `(double) numerador / denominador`

---

## Paso 2 — Lógica de cada operación (razona antes de codificar)

### ¿Cómo se suma una fracción?

```
a/b + c/d = (a*d + c*b) / (b*d)
```

Ejemplo: `1/2 + 1/3 = (1*3 + 1*2) / (2*3) = 5/6`

> Después de la operación → **simplificar** con MCD.

---

### ¿Cómo se resta?

```
a/b - c/d = (a*d - c*b) / (b*d)
```

---

### ¿Cómo se multiplica?

```
a/b * c/d = (a*c) / (b*d)
```

---

### ¿Cómo se divide?

```
(a/b) / (c/d) = (a*d) / (b*c)
```

> Ojo: si `c = 0` la división no existe → validar.

---

### ¿Cómo funciona el algoritmo de Euclides (MCD)?

El **Máximo Común Divisor** se usa para simplificar fracciones.

```java
int calcularMCD(int a, int b) {
    while (b != 0) {
        int temporal = b;
        b = a % b;
        a = temporal;
    }
    return a;
}
```

**Traza mental para `MCD(12, 8)`:**

| Iteración | a  | b | temporal | b = a%b |
|-----------|----|---|----------|---------|
| inicio    | 12 | 8 | —        | —       |
| 1ª        | 12 | 8 | 8        | 12%8=4  → a=8, b=4 |
| 2ª        | 8  | 4 | 4        | 8%4=0   → a=4, b=0 |
| fin       | **4** | 0 | — | — |

`MCD(12,8) = 4` → `12/8` simplificado = `3/2` ✓

---

### ¿Cómo se simplifica la fracción?

```
mcd = MCD(|numerador|, |denominador|)
numerador   = numerador / mcd
denominador = denominador / mcd
```

---

### ¿Cómo se comparan dos fracciones?

No se pueden comparar directamente los números. Hay que llevarlas al **mismo denominador**:

```
a/b  vs  c/d
→ comparar  a*d  vs  b*c
```

---

## Paso 3 — Plan de commits (progreso del proyecto)

Usa un commit por cada bloque funcional. Así el historial cuenta la historia de tu trabajo.

| # | Qué incluye el commit | Mensaje sugerido |
|---|---|---|
| 1 | Clase vacía + atributos + constructor básico con validación | `feat: estructura inicial clase Fraccion` |
| 2 | `simplificar()` + `calcularMCD()` | `feat: simplificacion con algoritmo de Euclides` |
| 3 | `sumar()`, `restar()`, `multiplicar()`, `dividir()` | `feat: operaciones aritmeticas basicas` |
| 4 | `equals()`, `esMayor()`, `esMenor()` | `feat: metodos de comparacion` |
| 5 | `inversa()`, `opuesta()` | `feat: utilidades inversa y opuesta` |
| 6 | `toString()`, `clone()`, `aDecimal()` | `feat: metodos estandar Java` |
| 7 | Clase de prueba con main | `test: pruebas manuales de la clase Fraccion` |

---

## Paso 4 — Estructura del archivo Java

```java
public class Fraccion {

    // ── Atributos ──────────────────────────────────────────
    private int numerador;
    private int denominador;

    // ── Constructores ──────────────────────────────────────
    public Fraccion(int numerador, int denominador) { ... }
    public Fraccion(int entero) { ... }

    // ── Simplificación (privada, uso interno) ──────────────
    private int calcularMCD(int a, int b) { ... }
    private void simplificar() { ... }

    // ── Operaciones ────────────────────────────────────────
    public Fraccion sumar(Fraccion otra) { ... }
    public Fraccion restar(Fraccion otra) { ... }
    public Fraccion multiplicar(Fraccion otra) { ... }
    public Fraccion dividir(Fraccion otra) { ... }

    // ── Comparación ────────────────────────────────────────
    public boolean equals(Object o) { ... }
    public boolean esMayor(Fraccion otra) { ... }
    public boolean esMenor(Fraccion otra) { ... }

    // ── Utilidades ─────────────────────────────────────────
    public Fraccion inversa() { ... }
    public Fraccion opuesta() { ... }

    // ── Métodos estándar Java ──────────────────────────────
    public String toString() { ... }
    public Fraccion clone() { ... }
    public double aDecimal() { ... }
}
```

---

## Paso 5 — Preguntas que debes responder antes de pedir ayuda

Cuando te atascas, antes de preguntar recorre esta lista:

1. **¿Qué se supone que debe hacer este método?** (escríbelo en español)
2. **¿Qué datos de entrada recibe?**
3. **¿Qué debe devolver?**
4. **¿Qué caso tengo pensado para probarlo?** (ej: `1/2 + 1/3 debería dar 5/6`)
5. **¿Qué parte específicamente no entiendo o no me funciona?**

Con esas 5 respuestas, cualquier explicación que pidas será mucho más precisa y útil.

---

## Checklist final antes de entregar

- [ ] El denominador nunca puede ser 0 (validado en el constructor)
- [ ] Las fracciones siempre se devuelven simplificadas
- [ ] El signo negativo está en el numerador, no en el denominador
- [ ] `toString()` muestra algo legible: `"3/4"`, `"-1/2"`, `"5"` (si denom=1)
- [ ] `clone()` devuelve un objeto **nuevo**, no la misma referencia
- [ ] Probaste casos borde: fracción con 0/n, fracción negativa, 1/1
