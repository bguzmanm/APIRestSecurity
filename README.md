# Ejemplo de implementación Spring Security

## 1ro de Febrero

- Incluimos dependencias en POM.xml: spring-security.
- Incluimos filter y filter-mapper en web.xml
- incluimos en contextConfigLocation referencia a spring-security.xml
- Creamos spring-security.xml
- Creamos RestController, que retorna llamados en Json.
- Autenticamos estas llamadas con Security.
- Prueba la llamada con Postman (o similiar). Para autenticarte, debes elegir Authorization, Type -> Basic Auth y luego ingresas username y password.


# Creación de Tabla para administrar usuarios y sus roles

Para administarr los usuarios a los que Security dará acceso, en este ejemplo incluimos una tabla:

```sql
create table usuarios 
    (username varchar2(20 byte) not null enable, 
    password varchar2(100 byte), 
    rol varchar2(20 byte), 
constraint usuarios_pk primary key (username));
```

Recueda que las contraseñas deben estar encriptadas, utilza [esta herramienta](https://www.browserling.com/tools/bcrypt).