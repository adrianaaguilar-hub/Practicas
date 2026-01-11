# 📝 GUÍA DE REFERENCIA RÁPIDA - MARKDOWN

Esta guía te muestra cómo escribir en Markdown para que tu texto se vea bonito y profesional.

---

## 1. ENCABEZADOS (Títulos)

```
# Título Nivel 1 (El más grande)
## Título Nivel 2
### Título Nivel 3
#### Título Nivel 4
##### Título Nivel 5
###### Título Nivel 6 (El más pequeño)
```

**Resultado:**
- # es el título más grande
- ## es un poco más pequeño
- Y así sucesivamente hasta ######

---

## 2. FORMATO DE TEXTO

```
**Texto en negrita**
*Texto en cursiva*
***Texto en negrita Y cursiva***
~~Texto tachado~~
`Código en línea`
```

**Resultado:**
- **Texto en negrita** (se ve grueso)
- *Texto en cursiva* (se ve inclinado)
- ***Texto en negrita Y cursiva*** (grueso e inclinado)
- ~~Texto tachado~~ (con línea encima)
- `Código en línea` (con fondo gris)

---

## 3. ENLACES (LINKS)

```
[Texto que se ve](https://www.ejemplo.com)
[Google](https://www.google.com)
[Mi archivo](./archivo.txt)
```

**Resultado:**
- El texto entre [ ] es lo que se ve clickeable
- El link entre ( ) es la dirección a la que lleva
- Ejemplo: [Google](https://www.google.com)

---

## 4. LISTAS

### Listas con viñetas (sin números):
```
- Elemento 1
- Elemento 2
- Elemento 3
  - Sub-elemento (con 2 espacios)
  - Otro sub-elemento
```

### Listas numeradas:
```
1. Primer elemento
2. Segundo elemento
3. Tercer elemento
   1. Sub-elemento
   2. Otro sub-elemento
```

**Resultado:**
- Los guiones (-) crean puntos negros
- Los números (1. 2. 3.) crean lista numerada
- Con 2 espacios antes se hace sub-lista

---

## 5. CÓDIGO

### Código en línea:
```
Usa `System.out.println()` para imprimir.
```

### Bloque de código:
````
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}
```
````

**Resultado:**
- Código en línea usa 1 acento grave: `codigo`
- Bloque de código usa 3 acentos graves: ```
- Después de los 3 acentos puedes poner el lenguaje: ```java

---

## 6. CITAS

```
> Esta es una cita
> Puede tener varias líneas
>> Esto es una cita dentro de otra cita
```

**Resultado:**
- Se ve con una barra gris a la izquierda
- El texto aparece ligeramente indentado

---

## 7. LÍNEAS HORIZONTALES

```
---
***
___
```

**Resultado:**
- Cualquiera de las 3 opciones crea una línea horizontal que separa secciones

---

## 8. TABLAS

```
| Columna 1 | Columna 2 | Columna 3 |
|-----------|-----------|-----------|
| Dato 1    | Dato 2    | Dato 3    |
| Dato 4    | Dato 5    | Dato 6    |
```

**Resultado:**

| Columna 1 | Columna 2 | Columna 3 |
|-----------|-----------|-----------|
| Dato 1    | Dato 2    | Dato 3    |
| Dato 4    | Dato 5    | Dato 6    |

---

## 9. IMÁGENES

```
![Texto alternativo](ruta/imagen.jpg)
![Logo](https://ejemplo.com/logo.png)
```

**Resultado:**
- Similar a los links pero con ! al inicio
- El texto entre [ ] se muestra si la imagen no carga
- La ruta entre ( ) es donde está la imagen

---

## 10. LISTAS DE TAREAS (Checkboxes)

```
- [ ] Tarea pendiente
- [x] Tarea completada
- [ ] Otra tarea pendiente
```

**Resultado:**
- [ ] Aparece una casilla vacía
- [x] Aparece una casilla marcada

---

## 11. SALTOS DE LÍNEA

```
Primera línea  
Segunda línea (deja 2 espacios al final de la línea anterior)

O deja una línea en blanco para hacer un párrafo nuevo.
```

**Importante:** 
- Para salto de línea simple: 2 espacios al final + Enter
- Para nuevo párrafo: línea en blanco

---

## 12. ESCAPAR CARACTERES ESPECIALES

```
\* No será cursiva
\# No será título
\[ No será link
```

**Resultado:**
- Usa \ antes del carácter especial para que se vea literal
- Ejemplo: \* se ve como *

---

## 📌 TIPS RÁPIDOS PARA EL EXAMEN

### Links (lo más importante):
```
[texto visible](url o ruta)
```

### Formato común:
```
**negrita**
*cursiva*
`código`
```

### Estructura:
```
# Título principal
## Secciones
- Lista de elementos
```

### Código Java:
````
```java
// tu código aquí
```
````

---

## ✅ PLANTILLA RÁPIDA PARA DOCUMENTAR CÓDIGO

```markdown
# Nombre del Proyecto

## Descripción
Breve descripción de qué hace el programa.

## Características
- Característica 1
- Característica 2
- Característica 3

## Código Principal
```java
public class Main {
    public static void main(String[] args) {
        // Código aquí
    }
}
```

## Cómo Usar
1. Paso 1
2. Paso 2
3. Paso 3

## Autor
Tu nombre

## Fecha
Enero 2026
```

---

## 🎯 ERRORES COMUNES A EVITAR

❌ **MAL:**
```
#Título sin espacio
[Link sin cerrar](url
**Negrita sin cerrar
```

✅ **BIEN:**
```
# Título con espacio
[Link cerrado](url)
**Negrita cerrada**
```

---

## 🚀 RECUERDA

1. Los **espacios importan** (especialmente después de # para títulos)
2. Cierra siempre los **símbolos dobles** (**, *, ~~, etc.)
3. Los **links** llevan [texto](url)
4. Para **código** usa acentos graves: ` o ```
5. Las **listas** necesitan espacio después del - o número

---

**¡Buena suerte en tu examen! 🍀**
