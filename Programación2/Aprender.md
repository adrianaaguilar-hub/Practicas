## 📚 PATRONES DE APRENDIZAJE - DÍA 1: ENCAPSULACIÓN Y ATRIBUTOS

### Plantilla Básica de Clase (Encapsulación)
```java
public class MiClase {
    // 1️⃣ ATRIBUTOS PRIVADOS - Los datos guardados
    private tipo atributo1;
    private tipo atributo2;
    
    // 2️⃣ CONSTRUCTOR - Inicializa el objeto con this.
    public MiClase(tipo parametro1, tipo parametro2) {
        this.atributo1 = parametro1;
        this.atributo2 = parametro2;
    }
    
    // 3️⃣ MÉTODOS - El comportamiento del objeto
    public void hacerAlgo() {
        // Modificar atributos
    }
    
    public tipo obtenerAlgo() {
        // Devolver cálculos
        return this.atributo1;
    }
}
```

### 1️⃣ Constructores con `this`
- **`this.variable`** = "yo mismo, mis atributos"
- **SIEMPRE** usar `this.` para diferenciar parámetro de atributo
- Ejemplo correcto:
  ```java
  public Tiempo(int horas, int minutos, int segundos) {
      this.horas = horas;      // Parámetro → atributo
      this.minutos = minutos;
      this.segundos = segundos;
  }
  ```

### 2️⃣ Validación en Constructores
- **Objetivo:** Que el objeto nazca "sano" (sin datos inválidos)
- **Patrón:** `if (condición válida) { guardar } else { valor_por_defecto }`
- Ejemplo:
  ```java
  if (horas >= 0 && horas <= 23) {
      this.horas = horas;
  } else {
      this.horas = 0;  // Valor seguro por defecto
  }
  ```

### 3️⃣ Método toString() - Formato para Imprimir
- **Propósito:** Convertir el objeto a texto visible
- **Patrón:** `String.format("%02d:%02d:%02d", horas, minutos, segundos)`
- **%02d** significa:
  - `%` → "Aquí va algo dinámico"
  - `0` → "Rellena con ceros"
  - `2` → "Quiero 2 dígitos"
  - `d` → "Es un número entero"

### 4️⃣ Conversión de Unidades (/ y %)
- **División normal (`/`)**: Devuelve solo la PARTE ENTERA
  - `90 / 60 = 1` (1 minuto completo)
- **Módulo (`%`)**: Devuelve el RESTO de la división
  - `90 % 60 = 30` (sobran 30 segundos)
- **Patrón de conversión:**
  ```java
  segundos = segundos + 90;
  minutos = minutos + (segundos / 60);  // Sumar minutos completos
  segundos = segundos % 60;              // Quedarse solo con el resto
  ```

### 5️⃣ Métodos para Interactuar (Paso de Mensajes)
- **getter (obtener)**: Devuelve información sin modificar
  ```java
  public int obtenerFila() {
      return this.fila;
  }
  ```
- **setter (establecer)**: Modifica atributos
  ```java
  public void establecerFila(int nuevaFila) {
      this.fila = nuevaFila;
  }
  ```
- **validador**: Devuelve true/false sin modificar
  ```java
  public boolean esValida() {
      return (fila >= 1 && fila <= 3);
  }
  ```

### 6️⃣ Lectura de Input con Scanner
- **Patrón completo:**
  ```java
  public void pedir() {
      Scanner lector = new Scanner(System.in);
      
      System.out.print("Introduce la fila (1-3): ");
      this.fila = lector.nextInt();
      
      System.out.print("Introduce la columna (1-3): ");
      this.columna = lector.nextInt();
  }
  ```
- **Regla:** Siempre mostrar mensaje ANTES de pedir el dato

---

## 🎯 PLAN DE 5 DÍAS - "DIVIDE Y VENCERÁS"

**Día 1 ✅:** El "Secreto" (Encapsulación y Atributos)  
**Día 2:** El "Seguro de Vida" (Validación con assert)  
**Día 3:** El "Favor" (Paso de Mensajes)  
**Día 4:** La "Delegación" (Conexión de Objetos)  
**Día 5:** El "Simulacro" (Reto 004 - Fracción)  

---

## 💡 TIPS DE MENTALIDAD

- ❌ **NO** mires toda la montaña de una vez
- ✅ **SÍ** celebra pequeñas victorias (como completar Coordenada.pedir())
- ❌ **NO** compares tu ritmo con el de tu clase
- ✅ **SÍ** divide cada problema en pasos minúsculos
- ❌ **NO** copies código
- ✅ **SÍ** entiende cada línea antes de avanzar