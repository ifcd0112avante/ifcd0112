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
- `html`, `head`, `body`  
- `p`, `h1`...`h6`, `strong`, `em`, `ins`, `del`  
- `blockquote`, `sup`, `sub`, `abbr`, `span`, `dfn`, `br`, `pre`, `code`  
- `ul`, `ol`, `li`  

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

- `img`, `map`, `area`  
- `table`, `caption`, `tr`, `th`, `td`, `thead`, `tbody`, `tfoot`  
- `form`, `fieldset`, `label`, `input`, `textarea`  
  - Tipos: text, password, date, number, email, tel, submit, reset  
  - Atributos: required, placeholder, value, min, max  

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
