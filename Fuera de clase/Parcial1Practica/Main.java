package Parcial1Practica;

public class Main {
    public static void main(String[] args) {
        // Configuración
        final int EDIFICIOS = 10;
        final int PISOS_POR_EDIFICIO = 5;
        final int CASAS_POR_PISO = 4;

        final int PROB_CASA_ABIERTA = 70; // %

        // Probabilidades de recibir dulces por niño (cuando la casa está abierta)
        final int PROB_DAR_DULCES_ANA = 60;
        final int PROB_DAR_DULCES_BRUNO = 90;
        final int PROB_DAR_DULCES_CARMEN = 80;

        // Rangos por visita (inclusive)
        final int ANA_MIN = 1, ANA_MAX = 2;
        final int BRUNO_MIN = 2, BRUNO_MAX = 4; // Bruno recibe entre 2 y 4
        final int CARMEN_MIN = 1, CARMEN_MAX = 3;

        // Capacidades de bolsa
        final int BOLSA_MAX_ANA = 15;
        final int BOLSA_MAX_BRUNO = 25;
        final int BOLSA_MAX_CARMEN = 20;

        // Estado acumulado global (no se reinicia entre edificios)
        int dulcesAna = 0;
        int dulcesBruno = 0;
        int dulcesCarmen = 0;

        // Totales por edificio (se reinician al comenzar cada edificio)
        int anaEsteEdificio = 0;
        int brunoEsteEdificio = 0;
        int carmenEsteEdificio = 0;

        boolean bolsaAna = false;
        boolean bolsaBruno = false;
        boolean bolsaCarmen = false;

        int casasVisitadas = 0;
        int edificiosVisitados = 0;

        // Acumuladores globales para métricas
        int sumaTotalTodosEdificios = 0; // suma de totales por edificio (para promedio entre 10)
        int maxTotalEdificio = -1;
        int edificioMasGeneroso = -1;

        // acumuladores por piso (sin arrays, como pediste)
        int acumuladoPiso1 = 0;
        int acumuladoPiso2 = 0;
        int acumuladoPiso3 = 0;
        int acumuladoPiso4 = 0;
        int acumuladoPiso5 = 0;

    // (sin arrays) - no necesitamos rastrear el mejor edificio por piso individualmente

    // para rastrear el par (edificio,piso) con mayor total
    int maxBuildingFloorTotal = -1;
    int maxBuildingFloorEdificio = -1;
    int maxBuildingFloorPiso = -1;

        int casasQueDieronTotal = 0;

        // Recorremos edificios
        for (int edificio = 1; edificio <= EDIFICIOS; edificio++) {
            edificiosVisitados++;
            System.out.println("\n=== Edificio " + edificio + " ===");

            // reiniciar estado por edificio
            anaEsteEdificio = brunoEsteEdificio = carmenEsteEdificio = 0;
            bolsaAna = bolsaBruno = bolsaCarmen = false;
            boolean salirEdificio = false; // si las bolsas se llenan dentro del edificio
            // contadores por piso para este edificio (se reinician cada edificio)
            int porPiso1 = 0;
            int porPiso2 = 0;
            int porPiso3 = 0;
            int porPiso4 = 0;
            int porPiso5 = 0;

            for (int piso = 1; piso <= PISOS_POR_EDIFICIO; piso++) {
                System.out.println("\n--- Piso " + piso + " ---");

                for (int casa = 1; casa <= CASAS_POR_PISO; casa++) {
                    casasVisitadas++;
                    System.out.println("Visitando casa " + casa + " del piso " + piso);

                    // recibidos por niño en esta casa (temporales)
                    int recibidosAna = 0;
                    int recibidosBruno = 0;
                    int recibidosCarmen = 0;

                    int probApertura = 1 + (int) (Math.random() * 100);
                    if (probApertura <= PROB_CASA_ABIERTA) {
                        System.out.println("¡La casa está abierta!");

                        // Ana: controlar espacio en la bolsa por edificio
                        if (!bolsaAna) {
                            int prob = 1 + (int) (Math.random() * 100);
                            if (prob <= PROB_DAR_DULCES_ANA) {
                                int recibidos = ANA_MIN + (int) (Math.random() * (ANA_MAX - ANA_MIN + 1));
                                int espacioAna = BOLSA_MAX_ANA - anaEsteEdificio; // espacio restante en la bolsa de este edificio
                                int aceptados = recibidos <= espacioAna ? recibidos : espacioAna;
                                if (aceptados > 0) {
                                    recibidosAna = aceptados;
                                    anaEsteEdificio += aceptados; // suma por edificio
                                    dulcesAna += aceptados; // suma global (acumula por edificios)
                                    System.out.println("Ana recibió " + aceptados + " caramelos");
                                    if (anaEsteEdificio >= BOLSA_MAX_ANA) {
                                        bolsaAna = true;
                                        System.out.println("¡La bolsa de Ana está llena!");
                                    }
                                } else {
                                    // no hay espacio en la bolsa de Ana en este edificio
                                }
                            }
                        }

                        // Bruno: controlar espacio en la bolsa por edificio
                        if (!bolsaBruno) {
                            int prob = 1 + (int) (Math.random() * 100);
                            if (prob <= PROB_DAR_DULCES_BRUNO) {
                                int recibidos = BRUNO_MIN + (int) (Math.random() * (BRUNO_MAX - BRUNO_MIN + 1));
                                int espacioBruno = BOLSA_MAX_BRUNO - brunoEsteEdificio;
                                int aceptados = recibidos <= espacioBruno ? recibidos : espacioBruno;
                                if (aceptados > 0) {
                                    recibidosBruno = aceptados;
                                    brunoEsteEdificio += aceptados;
                                    dulcesBruno += aceptados;
                                    System.out.println("Bruno recibió " + aceptados + " caramelos");
                                    if (brunoEsteEdificio >= BOLSA_MAX_BRUNO) {
                                        bolsaBruno = true;
                                        System.out.println("¡La bolsa de Bruno está llena!");
                                    }
                                }
                            }
                        }

                        // Carmen: controlar espacio en la bolsa por edificio
                        if (!bolsaCarmen) {
                            int prob = 1 + (int) (Math.random() * 100);
                            if (prob <= PROB_DAR_DULCES_CARMEN) {
                                int base = CARMEN_MIN + (int) (Math.random() * (CARMEN_MAX - CARMEN_MIN + 1));
                                int extra = (piso == 4 || piso == 5) ? 1 : 0; // bono por estar en piso 4 o 5
                                int recibidos = base + extra;
                                int espacioCarmen = BOLSA_MAX_CARMEN - carmenEsteEdificio;
                                int aceptados = recibidos <= espacioCarmen ? recibidos : espacioCarmen;
                                if (aceptados > 0) {
                                    recibidosCarmen = aceptados;
                                    carmenEsteEdificio += aceptados;
                                    dulcesCarmen += aceptados;
                                    System.out.println("Carmen recibió " + aceptados + " caramelos" + (extra == 1 ? " (incluye 1 extra por piso)" : ""));
                                    if (carmenEsteEdificio >= BOLSA_MAX_CARMEN) {
                                        bolsaCarmen = true;
                                        System.out.println("¡La bolsa de Carmen está llena!");
                                    }
                                }
                            }
                        }

                    } else {
                        System.out.println("Casa cerrada, seguimos adelante...");
                    }

                    // total en esta casa (suma de los tres)
                    int totalEnEstaCasa = recibidosAna + recibidosBruno + recibidosCarmen;
                    if (totalEnEstaCasa > 0) {
                        casasQueDieronTotal++;
                    }

                    // actualizar acumulado por piso (sin arrays)
                    if (piso == 1) {
                        acumuladoPiso1 += totalEnEstaCasa;
                        porPiso1 += totalEnEstaCasa;
                    } else if (piso == 2) {
                        acumuladoPiso2 += totalEnEstaCasa;
                        porPiso2 += totalEnEstaCasa;
                    } else if (piso == 3) {
                        acumuladoPiso3 += totalEnEstaCasa;
                        porPiso3 += totalEnEstaCasa;
                    } else if (piso == 4) {
                        acumuladoPiso4 += totalEnEstaCasa;
                        porPiso4 += totalEnEstaCasa;
                    } else if (piso == 5) {
                        acumuladoPiso5 += totalEnEstaCasa;
                        porPiso5 += totalEnEstaCasa;
                    }

                    // si todas las bolsas están llenas en este edificio, salimos del edificio (no de toda la simulación)
                    if (bolsaAna && bolsaBruno && bolsaCarmen) {
                        System.out.println("\n¡Todas las bolsas están llenas en este edificio! Pasamos al siguiente edificio.");
                        salirEdificio = true;
                        break; // sale del bucle de casas hacia el bucle de pisos
                    }
                }

                if (salirEdificio) {
                    break; // sale del bucle de pisos y pasa al siguiente edificio
                }
            }

            // al terminar (o interrumpir) el edificio, guardamos totales por edificio
            int totalEsteEdificio = anaEsteEdificio + brunoEsteEdificio + carmenEsteEdificio;
            sumaTotalTodosEdificios += totalEsteEdificio;
            if (totalEsteEdificio > maxTotalEdificio) {
                maxTotalEdificio = totalEsteEdificio;
                edificioMasGeneroso = edificio;
            }
            // no rastreamos el mejor edificio por piso individualmente aquí; solo el par (edificio,piso) global

            // actualizar el par (edificio,piso) con mayor total si aplica
            if (porPiso1 > maxBuildingFloorTotal) { maxBuildingFloorTotal = porPiso1; maxBuildingFloorEdificio = edificio; maxBuildingFloorPiso = 1; }
            if (porPiso2 > maxBuildingFloorTotal) { maxBuildingFloorTotal = porPiso2; maxBuildingFloorEdificio = edificio; maxBuildingFloorPiso = 2; }
            if (porPiso3 > maxBuildingFloorTotal) { maxBuildingFloorTotal = porPiso3; maxBuildingFloorEdificio = edificio; maxBuildingFloorPiso = 3; }
            if (porPiso4 > maxBuildingFloorTotal) { maxBuildingFloorTotal = porPiso4; maxBuildingFloorEdificio = edificio; maxBuildingFloorPiso = 4; }
            if (porPiso5 > maxBuildingFloorTotal) { maxBuildingFloorTotal = porPiso5; maxBuildingFloorEdificio = edificio; maxBuildingFloorPiso = 5; }
        }

        // resultados
        System.out.println("\n=== Resultados Finales ===");
        System.out.println("Casas visitadas: " + casasVisitadas);
        System.out.println("Edificios visitados: " + edificiosVisitados);
        System.out.println("Ana: " + dulcesAna + " caramelos");
        System.out.println("Bruno: " + dulcesBruno + " caramelos");
        System.out.println("Carmen: " + dulcesCarmen + " caramelos");

    // Promedio por edificio (entero, dividir entre 10 fijo)
    int promedioPorEdificio = sumaTotalTodosEdificios / EDIFICIOS;
    System.out.println("Promedio de caramelos por edificio: " + promedioPorEdificio);

        // Edificio más generoso
        if (edificioMasGeneroso != -1) {
            System.out.println("Edificio más generoso: " + edificioMasGeneroso + " con " + maxTotalEdificio + " caramelos");
        } else {
            System.out.println("No se registraron caramelos en ningún edificio.");
        }

        // (opcional) piso que más dio en total (suma sobre todos los edificios)
        int maxPorPiso = acumuladoPiso1;
        if (acumuladoPiso2 > maxPorPiso) { maxPorPiso = acumuladoPiso2; }
        if (acumuladoPiso3 > maxPorPiso) { maxPorPiso = acumuladoPiso3; }
        if (acumuladoPiso4 > maxPorPiso) { maxPorPiso = acumuladoPiso4; }
        if (acumuladoPiso5 > maxPorPiso) { maxPorPiso = acumuladoPiso5; }
        // Mostrar el par (piso, edificio) que tuvo el mayor total en una sola combinación
        if (maxBuildingFloorTotal != -1) {
            System.out.println("Piso " + maxBuildingFloorPiso + " del edificio " + maxBuildingFloorEdificio + " fue el más generoso con " + maxBuildingFloorTotal + " caramelos");
        } else {
            System.out.println("No se registraron caramelos por piso en ningún edificio.");
        }

        // Porcentaje de casas que dieron caramelos
        int porcentajeCasasQueDieron = 0;
        if (casasVisitadas > 0) {
            porcentajeCasasQueDieron = (casasQueDieronTotal * 100) / casasVisitadas; // entero
        }
        System.out.println("Porcentaje de casas que dieron caramelos: " + porcentajeCasasQueDieron + "%");
    }

}