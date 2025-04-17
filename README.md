# Online Store App 🛍️

Aplicación móvil de tienda en línea desarrollada en Android con Kotlin. ¡Con un toque de diversión y animación! 🎉

## Características Principales

- Autenticación de usuarios (registro e inicio de sesión) 🔐
- Catálogo de productos con imágenes y descripciones 📱
- Carrito de compras 🛒
- Interfaz de usuario moderna y responsiva ✨
- Navegación intuitiva entre pantallas 🗺️
- Animaciones fluidas y divertidas 🎬
- Mensajes de error y carga con humor 😄

## Mensajes Divertidos 🎭

La aplicación incluye mensajes divertidos para diferentes situaciones:

### Mensajes de Carga
- "Preparando la magia... ✨"
- "Cargando unicornios... 🦄"
- "Calentando motores... 🚀"
- "Preparando la pizza... 🍕"

### Mensajes de Error
- "¡Ups! Algo salió mal... pero no te preocupes, nuestros desarrolladores están trabajando en ello mientras toman café ☕"
- "Error 404: Página no encontrada... pero encontramos un gatito perdido 🐱"
- "Parece que el backend está tomando una siesta... 💤"
- "¡Houston, tenemos un problema! Pero no te preocupes, lo resolveremos con estilo 🚀"

### Mensajes de Mantenimiento
- "Estamos mejorando la experiencia... ¡Pronto volveremos con más magia! ✨"
- "El backend está en el gimnasio... 💪"
- "Actualizando la matrix... ⏳"
- "Reiniciando el universo... 🌌"

## Tecnologías Utilizadas

- **Lenguaje**: Kotlin
- **Arquitectura**: MVVM (Model-View-ViewModel)
- **Base de Datos**: Room
- **Inyección de Dependencias**: Hilt
- **Corrutinas**: Para operaciones asíncronas
- **ViewBinding**: Para acceso seguro a vistas
- **Material Design**: Para componentes de UI modernos
- **Lottie**: Para animaciones fluidas 🎬
- **MotionLayout**: Para transiciones avanzadas 🎭

## Animaciones y Transiciones 🎬

La aplicación incluye:

1. **Animaciones de Carga**
   - Lottie animations personalizadas
   - Skeleton loading para contenido
   - Shimmer effects para listas

2. **Transiciones entre Pantallas**
   - Fade transitions
   - Slide animations
   - Shared element transitions

3. **Interacciones**
   - Ripple effects en botones
   - Scale animations en cards
   - Rotation animations en íconos

4. **Feedback Visual**
   - Success/Error animations
   - Progress indicators animados
   - Toast messages con estilo

## Estructura del Proyecto

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/onlinestore/
│   │   │   ├── data/
│   │   │   │   ├── database/
│   │   │   │   ├── models/
│   │   │   │   └── repositories/
│   │   │   ├── di/
│   │   │   ├── ui/
│   │   │   │   ├── activities/
│   │   │   │   ├── adapters/
│   │   │   │   ├── animations/
│   │   │   │   └── viewmodels/
│   │   │   └── utils/
│   │   └── res/
│   │       ├── drawable/
│   │       ├── layout/
│   │       ├── mipmap/
│   │       ├── raw/ (animaciones Lottie)
│   │       └── values/
```

## Requisitos del Sistema

- Android Studio Hedgehog | 2023.1.1
- Gradle 8.0
- Kotlin 1.8.0
- Android SDK 34
- Java 17

## Configuración del Proyecto

1. Clonar el repositorio
2. Abrir el proyecto en Android Studio
3. Sincronizar el proyecto con Gradle
4. Ejecutar la aplicación en un emulador o dispositivo físico

## Dependencias Principales

```gradle
dependencies {
    implementation 'androidx.core:core-ktx:1.12.0'
    implementation 'androidx.appcompat:appcompat:1.6.1'
    implementation 'com.google.android.material:material:1.11.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    implementation 'androidx.room:room-runtime:2.6.1'
    implementation 'androidx.room:room-ktx:2.6.1'
    implementation 'com.google.dagger:hilt-android:2.48'
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0'
    implementation 'androidx.lifecycle:lifecycle-livedata-ktx:2.7.0'
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3'
    implementation 'com.airbnb.android:lottie:6.1.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
}
```

## Temas y Estilos

La aplicación utiliza un tema personalizado basado en Material Design:

- Color primario: #2196F3
- Color secundario: #03A9F4
- Color de fondo: #FFFFFF
- Color de texto: #000000
- Sombras y elevaciones personalizadas
- Bordes redondeados en elementos UI
- Tipografía moderna y legible

## Ícono de la Aplicación

El ícono de la aplicación está basado en el archivo `logo2.xml` y está compuesto por:
- Diseño vectorial moderno y minimalista
- Tamaño: 108dp x 108dp
- Formato: Adaptive Icon
- Colores vibrantes y atractivos

## Pantallas Principales

1. **LoginActivity** 🔐
   - Inicio de sesión con animaciones fluidas
   - Validación de credenciales con feedback visual
   - Transiciones suaves a registro

2. **RegisterActivity** 📝
   - Formulario interactivo con animaciones
   - Validación en tiempo real
   - Mensajes de error divertidos

3. **ProductListActivity** 📱
   - Lista de productos con animaciones de entrada
   - Filtrado con transiciones suaves
   - Cards interactivas con efectos hover

4. **ShoppingCartActivity** 🛒
   - Animaciones al agregar/quitar productos
   - Resumen de pedido con efectos visuales
   - Proceso de pago con feedback animado

## Base de Datos

La aplicación utiliza Room para el almacenamiento local con las siguientes entidades:

- User
- Product
- CartItem
- Order

## Contribución

1. Fork del proyecto
2. Crear rama para feature (`git checkout -b feature/AmazingFeature`)
3. Commit de cambios (`git commit -m 'Add some AmazingFeature'`)
4. Push a la rama (`git push origin feature/AmazingFeature`)
5. Abrir Pull Request

## Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

## Contacto

Para consultas o sugerencias, por favor contactar al equipo de desarrollo. ¡Estamos aquí para ayudarte! 😊 