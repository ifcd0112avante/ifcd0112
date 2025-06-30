---
title: Apuntes_Clase_Ivan
created: '2025-06-24T08:49:52.694Z'
modified: '2025-06-30T08:55:53.355Z'
---

# 📘 Apuntes Clase

- [📘 Apuntes Clase](#-apuntes-clase)
  - [☕🖥️ Instalar Java y VSC](#️-instalar-java-y-vsc)
    - [☕ Instalar Java](#-instalar-java)
    - [🧑‍💻 Instalar Visual Studio Code (VSC)](#-instalar-visual-studio-code-vsc)
  - [GIT](#git)
    - [Listado de comandos](#listado-de-comandos)
      - [Ramas GIT](#ramas-git)
  - [Roles Proyectos](#roles-proyectos)
  - [HTML](#html)
    - [Etiquetas HTML](#etiquetas-html)
    - [Atributos HTML](#atributos-html)
    - [Validador HTML](#validador-html)


## ☕🖥️ Instalar Java y VSC

### ☕ Instalar Java  
1️⃣ Ir a [🔗 Oracle Java](https://www.oracle.com/es/java/technologies/downloads/)  
2️⃣ Descargar versión *LTS (21)*  
3️⃣ Configurar **variables de entorno**  
   - ⌨️ `Win + R` → `cmd`  
   - ⚙️ `SystemPropertiesAdvanced`  
     *(📁 Panel de Control > 🖥️ Sistema > ⚙️ Configuración avanzada del sistema > 🌐 Variables de entorno)*  
   - 🧬 Variables de Entorno  
   - 🛣️ `Path` (del sistema): `C:\Program Files\Java\jdk-21`

---

### 🧑‍💻 Instalar Visual Studio Code (VSC)  
1️⃣ Ir a [🔗 VS Code Download](https://code.visualstudio.com/download#)  
2️⃣ Descargar `System Installer x64`  
3️⃣ Instalar extensiones:  
   - 🌍 **Spanish**  
   - 📦 **Extension Pack for Java** (Microsoft)
   - **Extension Markdown**
   - Markdown All in One
     - F1 > markdown all in one: create table of contents

## GIT

### Listado de comandos

- git init -> Iniciar repositorio
- git clone "repo" -> Clonar repositorio

- git status -> Estado del repositorio
- git add . -> Añadir TODOS los archivos
  - git add notes/Apuntes.md -> Archivo individual
- git commit -m "mensaje" -> Guardar cambios
  - git commit -a -m "mensaje" -> Añadir y guardar a la vez
- git push -> Subir al repo remoto (nube)
- git pull -> Descargar versión repo remoto (en local)

- git remote -> Repositorios remotos
  - git remote add -> Añadir repo remoto
  - git remote -v -> ver repositorios remotos
- git fetch -> Descargar cambios SIN FUSIONAR
- git merge -> Fusiona cambios

#### Ramas GIT

- git branch "rama" -> Crea una rama
- git checkout "rama" -> Cambiar de rama
- git merge rama -> Fusiona ramas
- Pasos para fusionar:
  - git checkout rama_destino
  - git merge rama_a_fusionar
  - git commit -m "Rama Fusionada"

## Roles Proyectos
Junior (< 2-4 años)
- Junior Front -> 25k-30k
- Junior Back -> 20k-25k
- Junior FullStack -> 28k-32k

Senior (> 2-4 años)
- Senior Front -> 30k-35k
- Senior Back -> 25k-30k
- Senior FullStack -> 32k-35k

Analista  +5k
Consultor +5-8k
Arquitecto +10-15k

## HTML

### Etiquetas HTML

- html (1) 
- head (1) -> Cabeceras
- body (1) -> Cuerpo (se ve)
  - p (2) -> párrafo
  - h1...h6 (2) -> Secciones
    - string (3) -> Negrita
    - em (3) -> Cursiva
    - ins (3) -> Subrayado
    - del (3) -> Tachado
  - blockquote (2) -> cita
    - sup (3) -> Superindice
    - sub (3) -> Subindice
  - abbr -> Acrónimos o abreviaturas
  - span (3) -> Fragmento de texto
  - dfn (3) -> Definición
  - br (3) -> Salto de línea
  - pre (2) -> texto preformateado

### Atributos HTML

- id -> identificado único
- class -> Clase (se puede repetir)
- style -> Formato (CSS en línea)

### Validador HTML

https://validator.w3.org/
- File Upload



   
