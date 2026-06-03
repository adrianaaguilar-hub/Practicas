## QUIZ DE PREPARACIÓN: EXAMEN FINAL (PRG2)
1. Abstracción y Encapsulación (Verdadero o Falso y por qué)
"Si una clase hija (SocioPremium) extiende a una clase base (Socio), y los atributos del padre son private, la clase hija puede modificarlos directamente si se encuentra dentro del mismo paquete del proyecto".
R-No, no los puede modificar ya que al ser privados solo tiene acceso la clase padre, esta los conoce porque al poner su constructor se declaran dentro de el mediante super(atributo1, atributo2), entonces aunque esten dentro del mismo paquete esta no los puede editar.

2. Relación de Tipos (Pregunta de Diseño)
Para que una jerarquía de herencia sea considerada válida bajo el criterio del profesor, ¿qué regla lingüística o pregunta de control mental debemos poder responder de forma afirmativa al relacionar la clase derivada con la clase base?
R-Nos debemos preguntar si son del mismo tipo "La regla del "Es un..." (Is a...)", por ejemplo con el ejemplo de el BeachClub y la clase padre Consumcion, yo podia preguntarme, un plato y una bebida son del tipo consumsiones? la respeusta es si, por ende son del mismo tipo.

3. Enlace Dinámico vs. Estático (Análisis de Código)
Disponemos del siguiente fragmento de código:

Java
Socio unSocio = new SocioPremium("Adriana", "1234A", true, true, true);
Sabiendo que calcularMensualidad() está declarado en Socio y redefinido (@Override) en SocioPremium... ¿Qué determina qué versión del método se ejecutará al invocar unSocio.calcularMensualidad(): el tipo de la referencia declarada en compilación (Emisor) o el tipo del objeto real en memoria (Receptor)? ¿Cómo se llama técnicamente este fenómeno?
R-La referencia va directa al tipo del objeto en memoria, el fenomeno se llama enlace dinámico, porque podemos saber su valor solo si se ejecuta todo, esto dentro del polimorfismo, que es un enlace dinamico entre la referencia del objeto y la clase a la que se apunta en cada instante, aunque esta parte de la clase a la que apunta a cada instante no me queda clara.
¿Qué significa eso de "la clase a la que apunta a cada instante"? Imagina que en el código de tu gimnasio haces esto:

Java
Socio variableSocio; // Declaramos la referencia emisora

variableSocio = new SocioStandard(...); // En este instante, apunta a un Socio Standard
variableSocio.mostrar(); // El enlace dinámico ejecuta la versión Standard

variableSocio = new SocioPremium(...);  // Un segundo después, apunta a un Socio Premium
variableSocio.mostrar(); // El enlace dinámico ejecuta la versión Premium con SPA

4. Limitación Polimórfica (La regla estricta de interfaces)
Imagina que la clase hija SocioPremium añade un método completamente nuevo que el padre no tiene, llamado public void solicitarMasaje().
Si hacemos la asignación polimórfica: Socio socio = new SocioPremium(...);
¿Podemos ejecutar la línea socio.solicitarMasaje(); directamente a través de esa variable socio? Explica por qué basándote en las limitaciones del polimorfismo vistas en clase.
R-No se puede ejecutar.
Aquí es donde aplicamos la regla estricta de la asignatura sobre la limitación polimórfica:
"El mensaje lanzado debe estar obligatoriamente en la interfaz de la clase declarada de la referencia (el Emisor)".
Java
Socio socio = new SocioPremium(...);

5. Clases Abstractas e Interfaces (Diferenciación conceptual)
Tu profesor afirma en los apuntes que las Interfaces son "clases abstractas puras". Menciona al menos dos diferencias drásticas a nivel de atributos o de herencia múltiple que existen entre una clase abstracta tradicional y una interfaz.
R- A nivel de atributo
A nivel de Atributos: Una clase abstracta puede tener atributos normales de instancia (variables que cambian de estado). Una Interfaz NO puede tener atributos de instancia; todo lo que declares en ella es automáticamente una constante estática e inmutable (public static final).

A nivel de Herencia Múltiple: En Java, una clase solo puede heredar por extensión (extends) de una única clase (sea abstracta o concreta). En cambio, la herencia por implementación te da total libertad: una clase puede implementar (implements) múltiples interfaces a la vez.
## Repasar esto!!!