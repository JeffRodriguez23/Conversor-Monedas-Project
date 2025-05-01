# 💱 Conversor de Monedas - Java

Aplicación desarrollada en Java utilizando Programación Orientada a Objetos (POO), como parte del curso de formación de **Alura LATAM**. Permite convertir montos entre distintas monedas utilizando datos en tiempo real proporcionados por una API externa.

---

## ⚙️ Funcionalidad

- Selección de moneda base.
- Menú dinámico con monedas disponibles.
- Submenú de conversión según la moneda elegida.
- Cálculo en tiempo real mediante API.
- Navegación entre menús o salida del programa.

---

## 🧩 Estructura del proyecto

El proyecto está organizado en paquetes según su responsabilidad:

- `main`: punto de entrada, limpio y organizado.
- `controllers`: controla el flujo general de conversión.
- `services`: lógica específica por tipo de moneda.
- `menus`: generación y navegación de menús.
- `utils`: lógica de conversión y consumo de API.

---

## 🏗️ Arquitectura

- Código desacoplado y modular.
- Llamadas HTTP centralizadas.
- Lógica de negocio separada del flujo de ejecución.
- Menús interactivos en consola.

---

## 🚀 Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/JeffRodriguez23/Conversor-Monedas-Project.git
