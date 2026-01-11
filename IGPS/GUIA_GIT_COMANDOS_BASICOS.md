# GUÍA DE GIT - COMANDOS BÁSICOS Y ESENCIALES

## 📚 ¿QUÉ ES GIT?
Git es un sistema de control de versiones que te permite:
- Guardar "versiones" de tu código (como puntos de guardado en un videojuego)
- Ver el historial de cambios
- Trabajar en equipo sin pisarse el código
- Volver atrás si algo sale mal

---

## 🎯 LOS 5 COMANDOS MÁS IMPORTANTES

### 1. `git status` - Ver el estado actual
```bash
git status
```
**¿Qué hace?** Te muestra:
- Archivos modificados
- Archivos nuevos sin seguimiento
- Archivos listos para guardar
- En qué rama estás

**Úsalo:** TODO EL TIEMPO. Es tu mejor amigo.

---

### 2. `git add` - Preparar archivos para guardar
```bash
# Agregar un archivo específico
git add nombre_archivo.java

# Agregar todos los archivos modificados
git add .

# Agregar múltiples archivos
git add archivo1.java archivo2.java
```
**¿Qué hace?** Marca archivos para incluirlos en el próximo "punto de guardado" (commit).

**Piénsalo así:** Es como seleccionar qué cosas quieres guardar en tu mochila antes de salir.

---

### 3. `git commit` - Guardar una versión
```bash
# Forma completa (recomendada)
git commit -m "Descripción de lo que hiciste"

# Ejemplos de buenos mensajes:
git commit -m "Agregué método para calcular promedio"
git commit -m "Corregí error en validación de coordenadas"
git commit -m "Creé clase Edificio con constructores"
```
**¿Qué hace?** Crea un "punto de guardado" con los archivos que agregaste con `git add`.

**IMPORTANTE:** El mensaje debe explicar QUÉ hiciste, no cómo.

---

### 4. `git push` - Subir cambios a GitHub
```bash
git push

# O más específico:
git push origin main
```
**¿Qué hace?** Envía tus commits locales (en tu computadora) al repositorio remoto (GitHub).

**Piénsalo así:** Es como sincronizar tu trabajo con la nube.

---

### 5. `git pull` - Descargar cambios de GitHub
```bash
git pull

# O más específico:
git pull origin main
```
**¿Qué hace?** Descarga cambios del repositorio remoto a tu computadora.

**Úsalo:** Antes de empezar a trabajar, especialmente si trabajas en equipo.

---

## 🔄 EL FLUJO DE TRABAJO BÁSICO

```
1. git status          → Ver qué cambios tengo
2. git add .           → Preparar los archivos
3. git commit -m "..." → Guardar una versión
4. git push            → Subir a GitHub
```

**Regla de oro:** Haz commits pequeños y frecuentes, no esperes a tener 1000 cambios.

---

## 📋 OTROS COMANDOS ÚTILES

### Ver el historial
```bash
# Ver últimos commits
git log

# Ver últimos 5 commits (más corto)
git log --oneline -5

# Ver historial con gráfica
git log --oneline --graph --all
```

### Deshacer cambios
```bash
# Deshacer cambios en un archivo (antes de git add)
git checkout -- nombre_archivo.java

# Quitar archivo del staging area (después de git add, antes de commit)
git reset nombre_archivo.java

# Ver diferencias de lo que cambió
git diff
```

### Crear y manejar ramas
```bash
# Ver ramas
git branch

# Crear rama nueva
git branch nombre-rama

# Cambiar de rama
git checkout nombre-rama

# Crear y cambiar de rama en un solo comando
git checkout -b nombre-rama

# Fusionar rama a la actual
git merge nombre-rama
```

### Configuración inicial
```bash
# Configurar nombre (primera vez)
git config --global user.name "Tu Nombre"

# Configurar email
git config --global user.email "tu@email.com"

# Ver configuración
git config --list
```

---

## ⚠️ ERRORES COMUNES Y SOLUCIONES

### "Changes not staged for commit"
**Problema:** Modificaste archivos pero no los agregaste.
**Solución:** `git add .` y luego `git commit`

### "Your branch is ahead of origin/main"
**Problema:** Hiciste commits locales que no has subido.
**Solución:** `git push`

### "Your branch is behind origin/main"
**Problema:** Hay cambios en GitHub que no tienes localmente.
**Solución:** `git pull`

### Olvidaste el mensaje en el commit
**Problema:** Hiciste `git commit` sin `-m`.
**Solución:** Se abrirá un editor. Escribe el mensaje, guarda y cierra.

---

## 🎓 BUENAS PRÁCTICAS

1. **Commits frecuentes:** Haz un commit cada vez que completes algo funcional
2. **Mensajes claros:** "Agregué validación de usuario" > "cambios"
3. **git status es tu amigo:** Úsalo antes y después de cada comando
4. **Pull antes de push:** Siempre `git pull` antes de empezar a trabajar
5. **No hagas commit de archivos compilados:** .class, .exe, etc. (usa .gitignore)

---

## 📝 EJERCICIOS PRÁCTICOS RECOMENDADOS

1. ✅ Hacer commit del archivo GUIA_MARKDOWN_REFERENCIA.md
2. ✅ Ver el historial de commits
3. ✅ Crear un archivo de prueba, hacer commit y luego eliminarlo
4. ✅ Practicar el flujo: modificar → add → commit → push
5. ✅ Crear una rama nueva para experimentar

---

## 🔗 COMANDOS RÁPIDOS DE REFERENCIA

```bash
git status              # ¿Qué pasa en mi repo?
git add .               # Preparar todo
git commit -m "msg"     # Guardar versión
git push                # Subir a GitHub
git pull                # Descargar de GitHub
git log --oneline -5    # Ver últimos 5 commits
git diff                # Ver qué cambió
```

---

## 💡 CONSEJO FINAL

Git parece complicado al principio, pero el 90% del tiempo solo usarás:
- `git status`
- `git add .`
- `git commit -m "..."`
- `git push`
- `git pull`

**¡Practica estos 5 y estarás bien!**
