Material Red-Teal
10 Temas rojo-verde azulado diseñados en  Diseños materiales

Instalación
Plataforma: Android Studio 3.4

Haga clic derecho sobre el proyecto> Nuevo> Módulo> Importar paquete .JAR / .ARR
Seleccionar la librería ydar en Finish.

Añadir lo siguiente en build.gradle (Módulo: aplicación).
dependencias {
     .. .   
    proyecto de implementación ( ' : joseRAC')
     .. .


Sincronizar Gradle dando en 'Sincronizar ahora'.

Uso
Ir al archivo AndroidManifest.xml y cambiar el tema al requerido.
< aplicación
        ...
        android : theme = " @ style / AppTheme.Red>
    < actividad ...>
      ...
    </ actividad >
</ application >
