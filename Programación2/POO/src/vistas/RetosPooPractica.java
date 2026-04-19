package Programación2.src.vistas;

/**
 * 🎯 SISTEMA DE RETOS POO - PRÁCTICA DE LÓGICA
 * 
 * INSTRUCCIONES:
 * - Completa los retos en orden (están organizados por dificultad)
 * - Cada reto está marcado con su nivel: ⭐ Básico | ⭐⭐ Intermedio | ⭐⭐⭐ Avanzado
 * - NO modifiques las pruebas en main(), solo las clases
 * - Ejecuta después de cada reto para verificar que funciona
 * 
 * 📚 Conceptos que practicarás:
 * - Encapsulación y validación
 * - Métodos de instancia vs métodos estáticos
 * - Relaciones entre objetos
 * - Sobrecarga de métodos
 * - Lógica de negocio
 */

public class RetosPooPractica {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║     🎯 SISTEMA DE RETOS POO - PRÁCTICA       ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        probarReto1();
        probarReto2();
        probarReto3();
        probarReto4();
        probarReto5();
        
        System.out.println("\n🎉 ¡TODOS LOS RETOS COMPLETADOS!");
    }
    
    // ═══════════════════════════════════════════════════════════════
    // RETO 1: ⭐ Clase Tiempo - Gestión de Horas
    // ═══════════════════════════════════════════════════════════════
    /**
     * 🎯 COMPARACIÓN CON TU CLASE INTERVALO:
     * 
     * Intervalo tiene:                    Tiempo debe tener:
     * - double inferior, superior    →    - int horas, minutos, segundos
     * - Constructor simple           →    - Constructor CON validación
     * - longitud()                   →    - toString() [para imprimir]
     * - incluye(double punto)        →    - esAntesDe(Tiempo otro) [comparar]
     * 
     * ┌─────────────────────────────────────────────────────────────┐
     * │ PASO 1: ATRIBUTOS (igual que Intervalo, pero 3 en vez de 2) │
     * └─────────────────────────────────────────────────────────────┘
     * private int horas;
     * private int minutos; 
     * private int segundos;
     * 
     * ┌─────────────────────────────────────────────────────────────┐
     * │ PASO 2: CONSTRUCTOR CON VALIDACIÓN                          │
     * └─────────────────────────────────────────────────────────────┘
     * public Tiempo(int horas, int minutos, int segundos) {
     *     // VALIDAR horas entre 0 y 23
     *     if (horas >= 0 && horas <= 23) {
     *         this.horas = horas;
     *     } else {
     *         this.horas = 0;  // Valor por defecto si es inválido
     *     }
     *     
     *     // VALIDAR minutos entre 0 y 59
     *     // VALIDAR segundos entre 0 y 59
     *     // (Haz lo mismo que con horas)
     * }
     * 
     * ┌─────────────────────────────────────────────────────────────┐
     * │ PASO 3: toString() - Para poder imprimir el tiempo          │
     * └─────────────────────────────────────────────────────────────┘
     * public String toString() {
     *     // Debe devolver "14:05:09" (con ceros a la izquierda)
     *     // PISTA: String.format("%02d:%02d:%02d", horas, minutos, segundos)
     *     //        %02d = número con 2 dígitos (rellena con 0)
     * }
     * 
     * ┌─────────────────────────────────────────────────────────────┐
     * │ PASO 4: sumarSegundos() - Modificar el tiempo               │
     * └─────────────────────────────────────────────────────────────┘
     * public void sumarSegundos(int seg) {
     *     // Sumar a this.segundos
     *     // Si segundos >= 60, pasar a minutos
     *     // Si minutos >= 60, pasar a horas
     *     // Si horas >= 24, volver a 0
     * }
     * 
     * ┌─────────────────────────────────────────────────────────────┐
     * │ PASO 5: esAntesDe() - Comparar como incluye() en Intervalo  │
     * └─────────────────────────────────────────────────────────────┘
     * public boolean esAntesDe(Tiempo otro) {
     *     // Comparar primero horas, luego minutos, luego segundos
     *     // Devolver true si este tiempo es menor que otro
     * }
     */
    static class Tiempo {
        private int horas;
        private int minutos;
        private int segundos;

        // CONSTRUCTOR - Tenías "int," en vez de "int" (error de sintaxis)
        public Tiempo(int horas, int minutos, int segundos) {
            if (horas >= 0 && horas <= 23) {
                this.horas = horas;
            } else {
                this.horas = 0;
            }

            if (minutos >= 0 && minutos <= 59) {
                this.minutos = minutos;
            } else {
                this.minutos = 0;
            }

            if (segundos >= 0 && segundos <= 59) {
                this.segundos = segundos;
            } else {
                this.segundos = 0;
            }
        }
        
        // PASO 3: toString() - Una sola línea
        public String toString() {
            // %02d = número de 2 dígitos, rellena con 0 si hace falta
            // Ejemplo: 9 → "09",  14 → "14"
            return String.format("%02d:%02d:%02d", horas, minutos, segundos);
        }
        
        // PASO 4: sumarSegundos() - La lógica paso a paso
        public void sumarSegundos(int seg) {
            // 1. Sumo los segundos que me dan
            segundos = segundos + seg;
            
            // 2. Si los segundos >= 60, los paso a minutos
            if (segundos >= 60) {
                minutos = minutos + (segundos / 60);  // ¿Cuántos minutos completos?
                segundos = segundos % 60;              // Solo me quedo con el resto
            }
            
            // 3. Si los minutos >= 60, los paso a horas
            if (minutos >= 60) {
                horas = horas + (minutos / 60);
                minutos = minutos % 60;
            }
            
            // 4. Si las horas >= 24, vuelvo a 0
            if (horas >= 24) {
                horas = horas % 24;
            }
        }
        
        // PASO 5: esAntesDe() - Comparar dos tiempos
        public boolean esAntesDe(Tiempo otro) {
            // Primero comparo las horas
            if (this.horas < otro.horas) return true;
            if (this.horas > otro.horas) return false;
            
            // Si las horas son iguales, comparo minutos
            if (this.minutos < otro.minutos) return true;
            if (this.minutos > otro.minutos) return false;
            
            // Si minutos también iguales, comparo segundos
            if (this.segundos < otro.segundos) return true;
            
            return false;  // Son iguales o este es mayor
        }
    }
    
    static void probarReto1() {
        System.out.println("┌─── RETO 1: ⭐ Clase Tiempo ──────────────────┐");
        try {
            Tiempo t1 = new Tiempo(14, 30, 45);
            System.out.println("⏰ Tiempo inicial: " + t1);
            
            t1.sumarSegundos(90); // Sumar 1 minuto 30 segundos
            System.out.println("⏰ Después de +90s: " + t1);
            
            Tiempo t2 = new Tiempo(14, 35, 0);
            System.out.println("⏰ Comparación: " + t1 + " es antes de " + t2 + "? " + t1.esAntesDe(t2));
            
            System.out.println("✅ RETO 1 COMPLETADO\n");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage() + " - Completa el Reto 1\n");
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // RETO 2: ⭐⭐ Clase CuentaBancaria - Transacciones
    // ═══════════════════════════════════════════════════════════════
    /**
     * OBJETIVO: Simular una cuenta bancaria con validaciones y comisiones
     * 
     * REQUISITOS:
     * 1. Atributos: numeroCuenta (String), titular (String), saldo (double)
     * 2. Constructor que inicialice con saldo 0
     * 3. Método depositar(double cantidad) - solo si cantidad > 0
     * 4. Método retirar(double cantidad) - solo si hay saldo suficiente
     * 5. Método transferir(CuentaBancaria destino, double cantidad)
     *    - Debe cobrar una comisión del 2% al que envía
     *    - Validar fondos antes de transferir
     * 6. Método obtenerSaldo() para consultar el saldo actual
     * 7. toString() con información de la cuenta
     * 
     * DESAFÍO: La comisión se descuenta ADEMÁS de la cantidad transferida
     */
    static class CuentaBancaria {
        // TODO: Implementar aquí
        
        
        
        
        
    }
    
    static void probarReto2() {
        System.out.println("┌─── RETO 2: ⭐⭐ Cuenta Bancaria ──────────────┐");
        try {
            CuentaBancaria cuenta1 = new CuentaBancaria("001", "Ana García");
            CuentaBancaria cuenta2 = new CuentaBancaria("002", "Luis Pérez");
            
            cuenta1.depositar(1000);
            cuenta2.depositar(500);
            
            System.out.println("💰 Estado inicial:");
            System.out.println("   " + cuenta1);
            System.out.println("   " + cuenta2);
            
            cuenta1.transferir(cuenta2, 200);
            
            System.out.println("\n💸 Después de transferir 200€:");
            System.out.println("   " + cuenta1 + " (se cobró 4€ de comisión)");
            System.out.println("   " + cuenta2);
            
            System.out.println("✅ RETO 2 COMPLETADO\n");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage() + " - Completa el Reto 2\n");
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // RETO 3: ⭐⭐ Clase Producto y CarritoCompra - Composición
    // ═══════════════════════════════════════════════════════════════
    /**
     * OBJETIVO: Crear un sistema de carrito de compras con productos
     * 
     * REQUISITOS CLASE PRODUCTO:
     * 1. Atributos: nombre, precio, cantidad
     * 2. Constructor y getters necesarios
     * 3. Método calcularSubtotal() que devuelva precio * cantidad
     * 
     * REQUISITOS CLASE CARRITOCOMPRA:
     * 1. Atributo: array de Producto (máximo 10 productos)
     * 2. Método agregarProducto(Producto p)
     * 3. Método calcularTotal() que sume todos los subtotales
     * 4. Método aplicarDescuento(double porcentaje) - devuelve total con descuento
     * 5. Método mostrarResumen() que imprima todos los productos y el total
     * 
     * DESAFÍO: Validar que no se agreguen más de 10 productos
     */
    static class Producto {
        // TODO: Implementar aquí
        
        
        
        
    }
    
    static class CarritoCompra {
        // TODO: Implementar aquí
        
        
        
        
    }
    
    static void probarReto3() {
        System.out.println("┌─── RETO 3: ⭐⭐ Carrito de Compra ────────────┐");
        try {
            CarritoCompra carrito = new CarritoCompra();
            
            carrito.agregarProducto(new Producto("Laptop", 899.99, 1));
            carrito.agregarProducto(new Producto("Mouse", 25.50, 2));
            carrito.agregarProducto(new Producto("Teclado", 75.00, 1));
            
            carrito.mostrarResumen();
            
            double total = carrito.calcularTotal();
            double conDescuento = carrito.aplicarDescuento(10);
            
            System.out.println("\n💵 Total: " + String.format("%.2f", total) + "€");
            System.out.println("🎟️  Con 10% descuento: " + String.format("%.2f", conDescuento) + "€");
            
            System.out.println("✅ RETO 3 COMPLETADO\n");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage() + " - Completa el Reto 3\n");
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // RETO 4: ⭐⭐⭐ Clase Rectangulo - Geometría y Validaciones
    // ═══════════════════════════════════════════════════════════════
    /**
     * OBJETIVO: Clase para manipular rectángulos en un plano 2D
     * 
     * REQUISITOS:
     * 1. Atributos: x, y (esquina superior izquierda), ancho, alto
     * 2. Constructor que valide que ancho y alto sean positivos
     * 3. Método calcularArea()
     * 4. Método calcularPerimetro()
     * 5. Método contienePunto(double px, double py) - verifica si un punto está dentro
     * 6. Método seSuperpone(Rectangulo otro) - detecta si se solapan dos rectángulos
     * 7. Método obtenerInterseccion(Rectangulo otro) - devuelve un nuevo Rectangulo
     *    con el área de intersección (si no hay, devolver null)
     * 
     * DESAFÍO LÓGICO: La intersección de rectángulos requiere cálculo de
     * máximos y mínimos de las coordenadas
     */
    static class Rectangulo {
        // TODO: Implementar aquí
        // PISTA: Para intersección, usa:
        //   - x_inter = max(x1, x2)
        //   - y_inter = max(y1, y2)
        //   - ancho_inter = min(x1+ancho1, x2+ancho2) - x_inter
        //   - alto_inter = min(y1+alto1, y2+alto2) - y_inter
        
        
        
        
        
    }
    
    static void probarReto4() {
        System.out.println("┌─── RETO 4: ⭐⭐⭐ Rectángulos ─────────────────┐");
        try {
            Rectangulo r1 = new Rectangulo(0, 0, 10, 10);
            Rectangulo r2 = new Rectangulo(5, 5, 10, 10);
            
            System.out.println("📐 Rectángulo 1: Área=" + r1.calcularArea() + 
                             ", Perímetro=" + r1.calcularPerimetro());
            
            System.out.println("🔍 Punto (7,7) está en R1? " + r1.contienePunto(7, 7));
            System.out.println("🔍 R1 y R2 se superponen? " + r1.seSuperpone(r2));
            
            Rectangulo inter = r1.obtenerInterseccion(r2);
            if (inter != null) {
                System.out.println("✂️  Área de intersección: " + inter.calcularArea());
            }
            
            System.out.println("✅ RETO 4 COMPLETADO\n");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage() + " - Completa el Reto 4\n");
        }
    }
    
    // ═══════════════════════════════════════════════════════════════
    // RETO 5: ⭐⭐⭐ Clase EstadisticasArray - Métodos Estáticos
    // ═══════════════════════════════════════════════════════════════
    /**
     * OBJETIVO: Crear una clase de utilidad con métodos estáticos para análisis
     * 
     * REQUISITOS (todos los métodos deben ser STATIC):
     * 1. calcularMedia(double[] datos) - promedio aritmético
     * 2. encontrarMaximo(double[] datos) - valor más alto
     * 3. encontrarMinimo(double[] datos) - valor más bajo
     * 4. calcularDesviacionEstandar(double[] datos) - mide dispersión de datos
     * 5. obtenerMediana(double[] datos) - valor central (ordenar primero)
     * 6. contarPorEncimaDe(double[] datos, double umbral) - cuántos superan un valor
     * 
     * FÓRMULA DESVIACIÓN ESTÁNDAR:
     * 1. Calcular la media
     * 2. Para cada dato: (dato - media)²
     * 3. Sumar todos esos valores
     * 4. Dividir entre el número de datos
     * 5. Sacar raíz cuadrada
     * 
     * NOTA: Para la mediana, necesitarás ordenar el array (usa Arrays.sort() o hazlo manual)
     */
    static class EstadisticasArray {
        // TODO: Implementar aquí
        // PISTA: Math.sqrt() te da la raíz cuadrada
        // PISTA: Math.pow(base, exponente) para potencias
        
        
        
        
        
    }
    
    static void probarReto5() {
        System.out.println("┌─── RETO 5: ⭐⭐⭐ Estadísticas ────────────────┐");
        try {
            double[] datos = {15.5, 23.1, 18.7, 29.3, 12.8, 21.4, 17.9, 25.6};
            
            System.out.println("📊 Análisis de datos: ");
            System.out.println("   Media: " + String.format("%.2f", EstadisticasArray.calcularMedia(datos)));
            System.out.println("   Máximo: " + EstadisticasArray.encontrarMaximo(datos));
            System.out.println("   Mínimo: " + EstadisticasArray.encontrarMinimo(datos));
            System.out.println("   Mediana: " + String.format("%.2f", EstadisticasArray.obtenerMediana(datos)));
            System.out.println("   Desviación Estándar: " + 
                             String.format("%.2f", EstadisticasArray.calcularDesviacionEstandar(datos)));
            System.out.println("   Datos > 20: " + EstadisticasArray.contarPorEncimaDe(datos, 20));
            
            System.out.println("✅ RETO 5 COMPLETADO\n");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage() + " - Completa el Reto 5\n");
        }
    }
}

/* 
 * ╔════════════════════════════════════════════════════════════════╗
 * ║                     CONSEJOS PARA RESOLVER                     ║
 * ╠════════════════════════════════════════════════════════════════╣
 * ║ 1. Lee TODOS los requisitos antes de empezar                  ║
 * ║ 2. Piensa primero en los atributos que necesitas              ║
 * ║ 3. Luego en los constructores y validaciones                  ║
 * ║ 4. Finalmente implementa los métodos uno por uno              ║
 * ║ 5. Prueba después de cada método                              ║
 * ║ 6. No tengas miedo de usar métodos auxiliares privados        ║
 * ║ 7. La práctica está en PENSAR la lógica, no copiar código     ║
 * ╚════════════════════════════════════════════════════════════════╝
 * 
 * 🎯 OBJETIVO DE APRENDIZAJE:
 * Estos retos están diseñados para que practiques PENSAMIENTO LÓGICO
 * y diseño de clases. No se trata de tener la solución perfecta, sino
 * de aprender a descomponer problemas en pasos más pequeños.
 * 
 * ¡Buena suerte! 🚀
 */
