# Resumen POO General

## 1. Idea central de POO
Programación Orientada a Objetos significa modelar cosas del mundo real como objetos en código.

- Clase: molde o plantilla (ejemplo: `Estudiante`)
- Objeto: instancia real creada desde la clase (ejemplo: `new Estudiante("Ana")`)
- Atributos: datos del objeto (estado)
- Métodos: acciones del objeto (comportamiento)

## 2. Regla mental para resolver ejercicios
Usa esta secuencia siempre:

1. Identifica el objeto principal del problema.
2. Saca sus atributos (sustantivos).
3. Saca sus métodos (verbos).
4. Crea constructor para inicializar estado.
5. Implementa métodos.
6. Prueba todo en `main` creando objetos y llamando métodos.

## 3. Estructura base de una clase
```java
public class Estudiante {
    private String nombre;
    private int[] calificaciones;
    private int contador;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.calificaciones = new int[10];
        this.contador = 0;
    }

    public void agregarCalificacion(int nota) {
        if (contador < calificaciones.length) {
            calificaciones[contador] = nota;
            contador++;
        }
    }

    public double calcularPromedio() {
        if (contador == 0) return 0;
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += calificaciones[i];
        }
        return (double) suma / contador;
    }
}
```

## 4. Palabras clave que debes dominar
- `class`: define una clase.
- `new`: crea objeto en memoria.
- `this`: referencia al objeto actual.
- `private`: solo accesible dentro de la clase.
- `public`: accesible desde fuera.
- `static`: pertenece a la clase, no al objeto.
- `void`: no retorna valor.
- `return`: devuelve valor.

## 5. Flujo tipico en programas POO
1. Crear objeto(s).
2. Pedir datos al usuario.
3. Llamar metodos del objeto.
4. Mostrar resultados.
5. Repetir hasta salir.

## 6. Buenas practicas basicas
- Una clase por archivo.
- Nombres de clase con mayuscula inicial (`Estudiante`).
- Nombres de metodos/variables con minuscula inicial (`calcularPromedio`).
- Usa `private` para proteger atributos.
- Valida datos antes de guardarlos.
- Separa logica del objeto y logica de interfaz/menu.

## 7. Errores comunes (y como evitarlos)
- Error: usar metodo sin crear objeto.
  - Solucion: primero `new`, luego llamadas.
- Error: olvidar `this` en constructor cuando hay mismo nombre.
  - Solucion: `this.atributo = parametro;`
- Error: salirte del limite del arreglo.
  - Solucion: valida con `contador < arreglo.length`.
- Error: dividir entre cero al calcular promedio.
  - Solucion: validar `contador == 0`.
- Error: mezclar todo en `main`.
  - Solucion: mover logica del dominio a la clase.

## 8. Plantilla rapida para examen
```java
public class MiClase {
    private String dato1;
    private int dato2;

    public MiClase(String dato1, int dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public void accion1() {
        // comportamiento
    }

    public int accion2() {
        return dato2;
    }
}

public class Main {
    public static void main(String[] args) {
        MiClase obj = new MiClase("valor", 10);
        obj.accion1();
        System.out.println(obj.accion2());
    }
}
```

## 9. Comandos utiles (Windows/PowerShell)
```powershell
# Compilar
javac Estudiante.java Main.java

# Ejecutar (si tiene package, usa el nombre completo)
java Programación2.POO.SistemaNotas.Calificaciones
```

## 10. Checklist final de repaso
- [ ] Distingo clase vs objeto sin dudar.
- [ ] Puedo crear constructor correctamente.
- [ ] Uso `this` cuando corresponde.
- [ ] Encapsulo con `private` y expongo con metodos `public`.
- [ ] Puedo modelar un problema en atributos + metodos.
- [ ] Puedo crear objetos y probarlos desde `main`.
