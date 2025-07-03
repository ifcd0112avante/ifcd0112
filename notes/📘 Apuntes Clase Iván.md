---
title: "\U0001F4D8 Apuntes Clase Iván"
created: '2025-07-02T12:29:52.741Z'
modified: '2025-07-03T07:13:04.675Z'
---

# 📘 Apuntes Clase

- [📘 Apuntes Clase](#-apuntes-clase)
  - [🔀 Arranque dual](#arranque-dual)
  - [💻 IDEs](#ides)
  - [☕🖥️ Instalar Java y VSC](#️-instalar-java-y-vsc)
    - [☕ Instalar Java](#-instalar-java)
  - [🖥️ Comandos de Consola](#comandos-de-consola)
    - [🪟 Windows (MS-DOS/Powershell)](#windows-ms-dospowershell)
    - [🐧 Linux](#linux)
    - [🧑‍💻 Instalar Visual Studio Code (VSC)](#-instalar-visual-studio-code-vsc)
  - [🔧 GIT](#git)
    - [📋 Listado de comandos](#listado-de-comandos)
      - [🌿 Ramas GIT](#ramas-git)
  - [👥 Roles Proyectos](#roles-proyectos)
  - [🌐 HTML](#html)
    - [🏷️ Etiquetas HTML](#etiquetas-html)
    - [⚙️ Atributos HTML](#atributos-html)
    - [✅ Validadores HTML y CSS](#validadores-html-y-css)
  - [📀 Virtualización](#virtualización)

---

## 🔀 Arranque dual
- Los SO son independientes  
- El gestor de arranque de Linux: Grub  
- El gestor de arranque de Win: MBR  
- Windows versión: 11 Pro/Home  
- Linux distribución: Mint Cinnamon → Ubuntu → Debian  
- Núcleos: GNU/Linux → Unix  

---

## 💻 IDEs
- Para MarkDown: Notable  
- Para código: Visual Studio Code  
- Oficial Java: Apache Netbeans  

---

## ☕🖥️ Instalar Java y VSC

### ☕ Instalar Java  
- LTS → Soporte extendido  
1️⃣ Ir a [🔗 Oracle Java](https://www.oracle.com/es/java/technologies/downloads/)  
2️⃣ Descargar versión *LTS (21)*  
3️⃣ Configurar **variables de entorno**  
   - ⌨️ `Win + R` → `cmd`  
   - ⚙️ `SystemPropertiesAdvanced`  
     *(📁 Panel de Control > 🖥️ Sistema > ⚙️ Configuración avanzada del sistema > 🌐 Variables de entorno)*  
   - 🧬 Variables de Entorno  
   - 🛣️ `Path` (del sistema): `C:\Program Files\Java\jdk-21`  

---

## 🖥️ Comandos de Consola

### 🪟 Windows (MS-DOS/Powershell)
- `cmd` → iniciar consola  
- `dir` → ver directorio  
- `cd` → cambiar directorio  
- `cd..` → subir nivel  
- `cls` → limpia consola  

### 🐧 Linux
- `clear` → limpia consola  
- `sudo` → privilegios superusuario  
- `apt update` → actualizar repos  
- `apt upgrade` → actualizar apps  
- `apt install paquete` → instalar paquete  
- `mkdir` → crear directorio  
- `ls` → lista contenido  
- `pwd` → ruta actual  

### 🧑‍💻 Instalar Visual Studio Code (VSC)  
1️⃣ Ir a [🔗 VS Code Download](https://code.visualstudio.com/download#)  
2️⃣ Descargar `System Installer x64`  
3️⃣ Instalar extensiones:  
   - 🌍 **Spanish**  
   - 📦 **Extension Pack for Java** (Microsoft)  
   - 📝 **Markdown All in One**  
     - F1 > markdown all in one: create table of contents  

---

## 🔧 GIT

### 📋 Listado de comandos
- `git init` → iniciar repo  
- `git clone "repo"` → clonar repo  
- `git status` → estado  
- `git add .` → añadir todo  
- `git add notes/Apuntes.md` → archivo individual  
- `git commit -m "mensaje"` → guardar  
- `git commit -a -m "mensaje"` → añadir y guardar  
- `git push` → subir repo  
- `git pull` → descargar repo  

- `git remote`  
  - `git remote add` → añadir remoto  
  - `git remote -v` → ver remotos  
- `git fetch` → descargar sin fusionar  
- `git merge` → fusionar cambios  

#### 🌿 Ramas GIT
- `git branch "rama"` → crear rama  
- `git checkout "rama"` → cambiar rama  
- `git merge rama` → fusionar ramas  

Pasos:  
1️⃣ `git checkout rama_destino`  
2️⃣ `git merge rama_a_fusionar`  
3️⃣ `git commit -m "Rama Fusionada"`  

---

## 👥 Roles Proyectos

### 🧑‍🎓 Junior (< 2-4 años)
- Front: 25k-30k  
- Back: 20k-25k  
- FullStack: 28k-32k  

### 🧑‍💼 Senior (> 2-4 años)
- Front: 30k-35k  
- Back: 25k-30k  
- FullStack: 32k-35k  

- 🧠 Analista +5k  
- 🧑‍🏫 Consultor +5-8k  
- 🏗️ Arquitecto +10-15k  

---

## 🌐 HTML

### 🏷️ Etiquetas HTML
Flechas: → , ← , ↑ , ↓ , ↗ , ↖ , ↘ , ↙
- `html` → (1) general
- `head` → (1) Cabeceras
- `body` → (1) Cuerpo
  - `h1`...`h6` → (2) secciones
  - `p` → (2) Párrafos
    - `strong` → (3) Negrita 
    - `em` → (3) Cursiva
    - `ins`→ (3) Subrayado 
    - `del` → (3) tachado  
    - `span`→ (3) fragmento texto 
  - `blockquote` → (2) Cita
    - `sup` → (3) Superindice
    - `sub`→ (3) subindice
  - `abbr` → (2) Abreviatura 
  - `dfn` → (2) Lista definición 
    - `br`→ (3) Salto de líbea 
  - `pre` → (2) Texto preformateado
  - `code` → (2) Código

- `ul`→ (2) Lista sin ordenar
- `ol` → (2) Lista ordenada
  - `li` → (3) Elemento de lista

```html
<!-- Emmet: ul>li*5{Elemento 1.$} -->
<ul>
  <li>Elemento 1.1</li>
  <li>Elemento 1.2</li>
  <li>Elemento 1.3</li>
  <li>Elemento 1.4</li>
  <li>Elemento 1.5</li>
</ul>
```

- `img` → (2) Imagen
- `map` → (2) Mapa de imágenes
  - `area` → (3) Área (Circulo, polígono, rectángulo) 

- `table` → (2) Tabla 
  - `caption`→ (3) Titulo
  - `thead`→ (3)[Sem] Cabecera tabla
  - `tbody`→ (3)[Sem] Cuerpo
  - `tfoot` → (3)[Sem] Pie tabla
    - `tr` → (3-4) Fila
      - `th` → (4-5) Celda cabecera
      - `td`→ (4-5) Celda
 
- `form` → (2) Formulario 
  (Post|Get), encriptado o por URL
  - `fieldset`→ (3) Recuadro
    - `legend` → (4) Titulo recuadro
    - `label`→ (4) Etiqueta de campo
    - `input`→ (4) Campo
    - `textarea` → (4) Área de texto 
  - Tipos Inputs: text, password, date, number, email, tel, submit, reset  
  - Atributos: required, placeholder, value, min, max  

> Etiquetas semánticas. Resto de etiquetas aumentan un nivel...
- `header` → (2) Cabecera de página
- `nav` → (2) Navegación
- `aside` → (2) Lateral
- `section` → (2) Sección
- `article` → (2) Contenido
- `figure` → (2) Sección multimedia
- `footer` → (2) pie

### ⚙️ Atributos HTML
- `id` → identificador único  
- `class` → clase reutilizable  
- `style` → CSS inline  

### ✅ Validadores HTML y CSS
- HTML → [https://validator.w3.org/](https://validator.w3.org/)  
- CSS → [https://jigsaw.w3.org/css-validator/](https://jigsaw.w3.org/css-validator/)  

---

## 📀 Virtualización

- 🧰 Oracle VirtualBox v7  
  - `sudo apt install virtualbox` → (7.0.16)  
  - [🔗 Linux Downloads](https://www.virtualbox.org/wiki/Linux_Downloads) (7.1.10)  
- 🖥️ VMWare  
- 🐶 Puppy Linux ISO  
  - [🔗 BookwormPup64 10.0.10](https://distro.ibiblio.org/puppylinux/puppy-bookwormpup/BookwormPup64/10.0.10/)
