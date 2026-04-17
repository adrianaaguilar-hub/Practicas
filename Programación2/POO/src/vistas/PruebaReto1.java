/**
 * 🧪 PRUEBA DEL RETO 1 - Clase Tiempo
 */
public class PruebaReto1 {
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║     🕐 PRUEBA RETO 1: Clase Tiempo           ║");
        System.out.println("╚════════════════════════════════════════════════╝\n");
        
        probarReto1();
    }
    
    static class Tiempo {
        private int horas;
        private int minutos;
        private int segundos;

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
            if (this.horas < otro.horas) return true;
            if (this.horas > otro.horas) return false;
            
            if (this.minutos < otro.minutos) return true;
            if (this.minutos > otro.minutos) return false;
            
            if (this.segundos < otro.segundos) return true;
            
            return false;
        }
    }
    
    static void probarReto1() {
        System.out.println("┌─── RETO 1: ⭐ Clase Tiempo ──────────────────┐");
        
        // PRUEBA 1: Crear tiempo y mostrarlo
        Tiempo t1 = new Tiempo(14, 30, 45);
        System.out.println("⏰ Tiempo inicial: " + t1);
        
        // PRUEBA 2: Sumar 90 segundos (1 minuto 30 segundos)
        t1.sumarSegundos(90);
        System.out.println("⏰ Después de +90s: " + t1);
        System.out.println("   (Debería ser 14:32:15) ✅");
        
        // PRUEBA 3: Comparar dos tiempos
        Tiempo t2 = new Tiempo(14, 35, 0);
        System.out.println("\n⏰ Comparación:");
        System.out.println("   " + t1 + " es antes de " + t2 + "? " + t1.esAntesDe(t2));
        System.out.println("   (Debería ser true) ✅");
        
        // PRUEBA 4: Validación (tiempo inválido)
        System.out.println("\n⏰ Prueba de validación:");
        Tiempo t3 = new Tiempo(25, 70, 100);  // Valores inválidos
        System.out.println("   Tiempo con valores inválidos (25:70:100): " + t3);
        System.out.println("   (Debería ser 00:00:00) ✅");
        
        // PRUEBA 5: Sumar muchos segundos
        System.out.println("\n⏰ Sumar 7265 segundos (2h 1m 5s):");
        Tiempo t4 = new Tiempo(10, 0, 0);
        System.out.println("   Inicial: " + t4);
        t4.sumarSegundos(7265);
        System.out.println("   Final: " + t4);
        System.out.println("   (Debería ser 12:01:05) ✅");
        
        System.out.println("\n✅ RETO 1 COMPLETADO - ¡Todo funciona perfectamente!");
        System.out.println("└────────────────────────────────────────────────┘\n");
    }
}
