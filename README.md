# ImageViewer
Se trata de un visor de imágenes desarrollado en Java con tres paquetes principales: model, view, y control. La aplicación sigue el patrón de diseño MVC (Model-View-Controller).

## **Estructura del Proyecto**

### **model:** Contiene las clases relacionadas con la lógica de negocio y el manejo de datos.

**- FileImageLoader.java:** Implementa la interfaz ImageLoader para cargar imágenes desde archivos en un directorio específico.
**- Image.java:** Define la interfaz para representar una imagen.
**- ImageLoader.java:** Interfaz para cargar, avanzar y retroceder imágenes.
**- RealImage.java:** Implementación concreta de Image para representar imágenes reales desde un InputStream.
**- VirtualImage.java:** Implementación de Image que actúa como un contenedor virtual para contabilizar accesos mediante ImageAccessCounter.

### **control:** Contiene clases relacionadas con el control de la aplicación y la interacción entre la vista y el modelo.

**- ImageAccessCounter.java:** Singleton que lleva el conteo de accesos a imágenes.
**- Main.java:** Clase principal que inicia la aplicación cargando una imagen y mostrándola en un MainFrame.
**- MainFrame.java:** La ventana principal de la aplicación que contiene la interfaz gráfica y maneja la interacción del usuario.

### **view:** Contiene las clases encargadas de la interfaz de usuario y la presentación de datos.

**- ImageDisplay.java:** Interfaz que define los métodos para obtener la imagen actual y mostrar una nueva imagen.
**- SwingImageDisplay.java:** Implementación de ImageDisplay utilizando la biblioteca Swing para la interfaz gráfica.

## **A tener en cuenta para su uso**

En el archivo Main.java, actualiza la siguiente línea con la ruta completa del directorio que contiene tus imágenes:
```java
File folder = new File("RUTA_DE_TUS_IMAGENES");
```
Asegúrate de que el directorio tenga imágenes en formato .jpg.
