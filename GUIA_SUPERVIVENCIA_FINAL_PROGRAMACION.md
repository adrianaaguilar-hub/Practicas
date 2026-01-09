# 📚 GUÍA DE SUPERVIVENCIA: FINAL DE PROGRAMACIÓN
## *O cómo no morir en el intento el viernes*

---

## 🎯 REGLA DE ORO
**Si algo no existe, Java no lo inventa mágicamente.**
Variables, métodos, parámetros - TODO tiene que venir de algún lado.

---

## 1️⃣ PARÁMETROS: El Buzón Mágico 📬

### La confusión que tuviste:
"¿De dónde sale `int numero`? ¡Nunca lo declaré!"

### La verdad revelada:
Los parámetros son **buzones automáticos**. Cuando llamas a un método, Java copia los valores automáticamente.

```java
// En el main:
final int SOLDADOS_TOTALES = 1;
colocarSoldados(SOLDADOS_TOTALES, mapa);  // Envías el 1

// El método:
static void colocarSoldados(int numero, int[][] mapa) {
    // numero RECIBE el 1 automáticamente
    // Es como si Java hiciera: int numero = SOLDADOS_TOTALES;
}
```

### 🎪 FRASE PARA RECORDAR:
**"Los parámetros son como teleportación: lo que envías aparece del otro lado con otro nombre"**

### Errores comunes:
❌ "Necesito declarar `int numero` antes del método"
✅ Los parámetros YA ESTÁN declarados en `(int numero, int[][] mapa)`

❌ "¿Por qué se llama diferente? Debería llamarse igual"
✅ Pueden llamarse diferente. Es como un apodo: tú eres "Adriana" en casa pero "Adri" con tus amigos.

---

## 2️⃣ BUCLES DO-WHILE: La Ruleta Rusa 🎰

### Estructura básica:
```java
int contador = 0;  // 1. Variable ANTES del bucle

do {
    // 2. Código que se repite
    System.out.println("Turno " + contador);
    contador++;
    
    // 3. Decidir si seguir (al final del bucle)
    seguir = contador < 10;
    
} while (seguir);  // 4. Condición: ¿seguir? true/false
```

### 🎪 FRASE PARA RECORDAR:
**"Do-while = Hazlo primero, pregunta después. Como cuando comes sin ver la fecha de caducidad"**

### La diferencia con WHILE normal:
- **while**: Pregunta ANTES de entrar (puede que nunca entre)
- **do-while**: Entra PRIMERO, pregunta DESPUÉS (mínimo 1 vez)

### Tu código del juego:
```java
int turno = 0;  // Contador ANTES

do {
    imprimir(mapa);           // Mostrar
    despejarNiebla(...);      // Jugar
    boolean gane = ...;       // Verificar
    turno++;                  // Aumentar contador
    seguirJugando = turno < 5 && !gane;  // Decidir
} while (seguirJugando);     // Repetir si es true
```

---

## 3️⃣ MATRICES: El Edificio de Apartamentos 🏢

### Visualización:
```
    [0] [1] [2]
[0]  A   B   C
[1]  D   E   F
[2]  G   H   I
```

### Acceso:
```java
int[][] edificio = {{A,B,C}, {D,E,F}, {G,H,I}};

edificio[0][0] = A  // Piso 0, Apto 0
edificio[1][2] = F  // Piso 1, Apto 2
edificio[2][1] = H  // Piso 2, Apto 1
```

### 🎪 FRASE PARA RECORDAR:
**"[fila][columna] = [piso][apartamento]. Primero subes, luego caminas"**

### Recorrer TODO el edificio:
```java
for (int i = 0; i < matriz.length; i++) {           // Cada PISO
    for (int j = 0; j < matriz[i].length; j++) {    // Cada APARTAMENTO
        System.out.print(matriz[i][j]);
    }
    System.out.println();  // Cambiar de piso (nueva línea)
}
```

### ⚠️ ERROR MORTAL:
```java
for (int i = 0; i < matriz.length; i++);  // <-- PUNTO Y COMA AQUÍ = MUERTE
    // Este código NUNCA se ejecuta
```

**El punto y coma después del `for` mata todo.**

---

## 4️⃣ MÉTODOS STATIC: Las Recetas de Cocina 👨‍🍳

### ¿Qué es static?
Métodos que NO necesitan un objeto. Son como recetas públicas que cualquiera puede usar.

### Estructura:
```java
static TIPO_RETORNO nombreMetodo(PARAMETROS) {
    // código
    return valor;  // Si el tipo NO es void
}
```

### Ejemplos del juego:

#### Método que NO devuelve nada (void):
```java
static void imprimir(int[][] mapa) {
    for (int i = 0; i < mapa.length; i++) {
        for (int j = 0; j < mapa[i].length; j++) {
            System.out.print(mapear(mapa[i][j]));
        }
        System.out.println();
    }
    // NO tiene return
}
```

#### Método que DEVUELVE algo:
```java
static String mapear(int casilla) {
    String[] simbolos = {" ? ", "~~~", "\\O/"};
    return casilla < 0 ? simbolos[0] : simbolos[casilla];
    // SÍ tiene return (devuelve un String)
}
```

#### Método que DEVUELVE un array:
```java
static int[] pedirCoordenadas(Scanner scanner, int[][] mapa) {
    int x = scanner.nextInt() - 1;
    int y = scanner.nextInt() - 1;
    return new int[] {y, x};  // Devuelve un array
}
```

### 🎪 FRASE PARA RECORDAR:
**"void = vacío = no devuelve nada. Como pedirle consejos a tu ex"**

---

## 5️⃣ SCANNER: El Micrófono Compartido 🎤

### REGLA DE ORO:
**UN SOLO Scanner para System.in en TODO el programa**

### ❌ MAL (crear múltiples):
```java
static int[] pedirCoordenadas() {
    Scanner sc = new Scanner(System.in);  // NUEVO scanner
    int x = sc.nextInt();
    sc.close();  // CIERRA System.in
    return new int[] {x};
}
// Ahora System.in está cerrado = EXPLOSIÓN
```

### ✅ BIEN (pasar como parámetro):
```java
// En el main:
Scanner scanner = new Scanner(System.in);  // UNO solo aquí

// En el método:
static int[] pedirCoordenadas(Scanner scanner) {
    int x = scanner.nextInt();  // Usa el scanner del main
    return new int[] {x};
}
```

### 🎪 FRASE PARA RECORDAR:
**"Scanner es como el baño en una fiesta: UNO solo para todos. Si lo cierras, nadie más puede usarlo"**

---

## 6️⃣ OPERADOR TERNARIO: El If Perezoso 😴

### Sintaxis:
```java
condicion ? siTrue : siFalse
```

### Ejemplo:
```java
// Forma larga:
String simbolo;
if (casilla < 0) {
    simbolo = " ? ";
} else {
    simbolo = "~~~";
}

// Forma corta (ternario):
String simbolo = casilla < 0 ? " ? " : "~~~";
```

### En el juego:
```java
return casilla < 0 ? simbolos[0] : simbolos[casilla];
// Si casilla es negativa → simbolos[0] (" ? ")
// Si no → simbolos[casilla] (el símbolo correspondiente)
```

### 🎪 FRASE PARA RECORDAR:
**"Pregunta ? SíPues : NoPues"**

---

## 7️⃣ COORDENADAS: El Truco del -1 🎯

### El problema:
Los usuarios piensan en 1, 2, 3... pero los arrays empiezan en 0.

### La solución:
```java
int x = scanner.nextInt() - 1;  // Usuario dice 1 → Array necesita 0
int y = scanner.nextInt() - 1;  // Usuario dice 8 → Array necesita 7
```

### Tabla de conversión:
```
Usuario dice → Array usa
    1       →     0
    2       →     1
    3       →     2
    8       →     7
```

### 🎪 FRASE PARA RECORDAR:
**"Los humanos cuentan desde 1, las máquinas desde 0. Restamos 1 para traducir"**

---

## 8️⃣ ERRORES COMUNES QUE TUVISTE (Y CÓMO EVITARLOS)

### 1. Punto y coma después del for:
```java
❌ for (int i = 0; i < 10; i++);  // <-- ESTO MATA TODO
      System.out.println(i);  // Nunca se ejecuta

✅ for (int i = 0; i < 10; i++)  // SIN punto y coma
      System.out.println(i);  // Se ejecuta
```

### 2. Parámetros en orden incorrecto:
```java
❌ soldadosEncontrados(SOLDADOS_TOTALES, mapa);  // Orden incorrecto

✅ soldadosEncontrados(mapa, SOLDADOS_TOTALES);  // Orden correcto
```

**Tip:** Mira la firma del método para saber el orden.

### 3. Nombres de variables inconsistentes:
```java
❌ int soldadosColocados = 0;
   soldadoColocado++;  // Sin la 's' → ERROR

✅ int soldadosColocados = 0;
   soldadosColocados++;  // Mismo nombre
```

### 4. Olvidar el return:
```java
❌ static String mapear(int casilla) {
       String simbolo = "?";
       // Falta return
   }

✅ static String mapear(int casilla) {
       String simbolo = "?";
       return simbolo;  // AQUÍ
   }
```

### 5. Índices invertidos:
```java
❌ mapa[j][i]  // Al revés

✅ mapa[i][j]  // Correcto (i=fila, j=columna)
```

---

## 9️⃣ PATRONES COMUNES EN EXÁMENES

### Patrón 1: Colocar cosas aleatorias en matriz
```java
static void colocarAlgo(int cantidad, int[][] matriz) {
    int colocados = 0;
    do {
        int x = (int)(Math.random() * matriz.length);
        int y = (int)(Math.random() * matriz.length);
        
        if (matriz[x][y] != VALOR_YA_OCUPADO) {
            matriz[x][y] = NUEVO_VALOR;
            colocados++;
        }
    } while (colocados < cantidad);
}
```

### Patrón 2: Contar cosas en matriz
```java
static int contarAlgo(int[][] matriz, int queContar) {
    int contador = 0;
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == queContar) {
                contador++;
            }
        }
    }
    return contador;
}
```

### Patrón 3: Verificar si todos cumplen condición
```java
static boolean todosCumplen(int[][] matriz, int valorBuscado, int cantidad) {
    int encontrados = contarAlgo(matriz, valorBuscado);
    return encontrados == cantidad;
}
```

### Patrón 4: Bucle de juego
```java
int turno = 0;
do {
    mostrarEstado();
    pedirAccion();
    verificarCondicion();
    turno++;
    seguir = turno < MAX_TURNOS && !ganaste;
} while (seguir);
```

---

## 🔟 CHECKLIST ANTES DEL EXAMEN

### ✅ Conceptos que DEBES dominar:
- [ ] Crear y recorrer matrices con for anidados
- [ ] Entender parámetros (se pasan automáticamente)
- [ ] Saber cuándo usar void vs devolver algo
- [ ] Pasar Scanner como parámetro (NO crear múltiples)
- [ ] Bucle do-while con contador
- [ ] Math.random() para posiciones aleatorias
- [ ] Operador ternario ( ? : )
- [ ] Coordenadas: restar 1 para convertir a índice

### ✅ Errores que NO debes cometer:
- [ ] Punto y coma después del for
- [ ] Crear múltiples Scanners
- [ ] Olvidar el return en métodos no-void
- [ ] Confundir [i][j] con [j][i]
- [ ] Parámetros en orden incorrecto

---

## 🎓 CÓDIGO COMPLETO DE REFERENCIA: RESCATE

```java
package PracticasdeClase.Matrices.PracticaPreExamenFinal;

import java.util.Scanner;

public class RescateVersionMia {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Crear matriz
        int[][] mapa = {
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
            {-1,-1,-1,-1,-1,-1,-1,-1},
        };
        
        // 2. Constantes
        final int SOLDADOS_TOTALES = 1;
        final int TURNOS_TOTALES = 5;
        
        // 3. Colocar soldados
        colocarSoldados(SOLDADOS_TOTALES, mapa);
        
        // 4. Bucle de juego
        boolean seguirJugando = true;
        int turno = 0;
        
        do {
            imprimir(mapa);
            despejarNiebla(scanner, mapa);
            boolean halladosTodos = soldadosEncontrados(mapa, SOLDADOS_TOTALES);
            turno++;
            seguirJugando = turno < TURNOS_TOTALES && !halladosTodos;
        } while (seguirJugando);
        
        System.out.println("Se acabaron los turnos!");
        scanner.close();
    }
    
    // Colocar soldados aleatoriamente
    static void colocarSoldados(int numero, int[][] mapa) {
        boolean terminado = false;
        int soldadosColocados = 0;

        do {
            int x = (int)(Math.random() * mapa.length);
            int y = (int)(Math.random() * mapa.length);

            if (mapa[x][y] != -2) {
                mapa[x][y] = -2;
                soldadosColocados++;
            }
            terminado = soldadosColocados >= numero;
        } while (!terminado);
    }
    
    // Imprimir tablero
    static void imprimir(int[][] mapa) {
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapear(mapa[i][j]));
            }
            System.out.println();
        }
    }
    
    // Convertir número a símbolo
    static String mapear(int casilla) {
        String[] simbolos = {" ? ", "~~~", "\\O/"};
        return casilla < 0 ? simbolos[0] : simbolos[casilla];
    }
    
    // Pedir coordenadas al usuario
    static int[] pedirCoordenadas(Scanner scanner, int[][] mapa) {
        System.out.println("Ingresa la coordenada x: ");
        int x = scanner.nextInt() - 1;  // -1 para convertir a índice
        System.out.println("Ingresa la coordenada y: ");
        int y = scanner.nextInt() - 1;
        return new int[] {y, x};
    }
    
    // Despejar niebla (quitar el negativo)
    static void despejarNiebla(Scanner scanner, int[][] mapa) {
        int[] coordenada = pedirCoordenadas(scanner, mapa);
        int x = coordenada[1];
        int y = coordenada[0];
        
        mapa[y][x] = mapa[y][x] < 0 ? mapa[y][x] * -1 : mapa[y][x];
    }
    
    // Verificar si encontramos todos los soldados
    static boolean soldadosEncontrados(int[][] mapa, int cantidad) {
        int soldadosEncontrados = 0;
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 2) {
                    soldadosEncontrados++;
                }
            }
        }
        return soldadosEncontrados == cantidad;
    }
}
```

---

## 💪 MENSAJE FINAL 

**Respira. Ya sabes esto.**

Has construido un juego completo desde cero. Entiendes:
- Matrices
- Bucles
- Métodos
- Parámetros
- Lógica de juego

El viernes NO te van a poner algo que no sepas hacer. Te van a poner una VARIACIÓN de lo que ya hiciste.

### Estrategia para el examen:
1. **Lee TODO el enunciado primero**
2. **Identifica el patrón** (¿Es como Aspiradora? ¿Como Rescate?)
3. **Divide en métodos** (paso a paso)
4. **Usa esta guía** si te bloqueas
5. **Prueba tu código** antes de entregar

### Cuando te atasques:
- ¿Necesito recorrer toda la matriz? → for anidados
- ¿Necesito colocar cosas aleatorias? → Patrón 1
- ¿Necesito contar? → Patrón 2
- ¿Es un juego por turnos? → Patrón 4

**¡TÚ PUEDES! 💪🎓**

---

*Creado con ❤️ (y mucha paciencia) para sobrevivir al final que vale el 60%*
