INSERT INTO roles (nombre,descripcion) VALUES ("admin","Integrantes administradores de la pagina");
INSERT INTO roles (nombre,descripcion) VALUES ("cliente","Usuarios y consumidores");

INSERT INTO usuarios (nombre, direccion, telefono, email, `password`, fecha_nacimiento, ciudad, cp, rol_id) VALUES ('Olivia Rivas', 'Av. Insurgentes Sur 1234, Col. Del Valle', '123456789', 'olivia@gmail.com', 'contraseña1', '2000-01-01', 'CDMX','54909', 1);
INSERT INTO usuarios (nombre, direccion, telefono, email, `password`, fecha_nacimiento, ciudad, cp, rol_id) VALUES ('Cynthia Rosales', 'Av. Paseo de la Reforma 567, Col. Juárez', '123456780', 'cynthia@hotmail.com', 'contraseña2', '1999-02-02','CDMX','54909', 1);
INSERT INTO usuarios (nombre, direccion, telefono, email, `password`, fecha_nacimiento, ciudad, cp, rol_id) VALUES ('Brayan Hernández', 'Calle Durango 89, Col. Roma', '123456781', 'brayan@gmail.com', 'contraseña3', '1998-03-03','CDMX','54909', 1);
INSERT INTO usuarios (nombre, direccion, telefono, email, `password`, fecha_nacimiento, ciudad, cp, rol_id) VALUES ('Mario Mata', 'Av. Álvaro Obregón 456, Col. Condesa', '123456782', 'mario@hotmail.com', 'contraseña4', '1997-04-04','CDMX','54909', 1);

INSERT INTO animales (`nombre`) VALUES ('Perro');
INSERT INTO animales (`nombre`) VALUES  ('Gato');

INSERT INTO categorias (nombre) VALUES ('Alimento');
INSERT INTO categorias (nombre) VALUES ('Accesorios');
INSERT INTO categorias (nombre) VALUES ('Juguetes');

INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Science Diet Alimento para Perros', 'Hills Science Diet Alimento para Perros Adultos con Receta de Harina de Cordero y Arroz Integral', '15 kg', 2000.00, 0, 5, 'https://www.amazon.com.mx/Hills-Science-Diet-Advanced-alimento/dp/B009IXOFOC/ref=lp_12478588011_1_4?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B009IXOFOC&psc=1&th=1', 'Amazon', 1, 1);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Royal Canin', 'Royal Canin Croquetas Para Razas Medianas, Medium Adult 25', '13.6 Kg', 1800.00, 10, 3, 'https://www.amazon.com.mx/Royal-Croquetas-Medianas-Medium-empaque/dp/B00CITL9N8/ref=lp_12478588011_1_1?pf_rd_p=2e6393f5-b0da-469a-bb10-dff5f616611a&pf_rd_r=Z5M2DX71D9HT8FJYSPYA&pd_rd_r=ab274ca2-87b1-41f2-8b94-800f9dd2dd8d&pd_rd_wg=jfCz9&pd_rd_i=B00CITL9N8&psc=1&th=1', 'Amazon', 1, 1);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Collar para gatos', 'Airtag Collar para Gato, con Timbre y Hebilla de liberación automática de Seguridad', '1 unidad', 192.00, 0, 10, 'https://m.media-amazon.com/images/I/61FtWMPLyCL._AC_SL1400_.jpg', 'AZULDIMEN', 2, 2);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Collar para Gato con Moño 4', 'Material suave y diseño elegante te permiten tener distintas opciones para vestir a tu gato según su personalidad.', '4 unidades', 179.00, 0, 8, 'https://m.media-amazon.com/images/I/61drV7fBOpL._AC_.jpg', 'Fastpet Collar', 2, 2);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Hills Science Diet Adult 1-6', 'Alimento Premium para gatos', '7.2 kg', 1095.00, 0, 15, 'https://m.media-amazon.com/images/I/817mX8hi-VL._AC_SL1500_.jpg', 'Hills Science Diet', 2, 1);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Kisha', 'Alimento Seco Gato Adulto, Natural', '12 Kg', 799.00, 0, 8, 'https://m.media-amazon.com/images/I/41XmwctjaTL._AC_.jpg', 'GrandPet', 2, 1);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Bola para gatos', 'Juguete eléctrico para gatos es perfecto para que juegue tu gato.', '1 unidad', 152.00, 0, 18, 'https://m.media-amazon.com/images/I/61LvVMGMgnL._AC_SL1500_.jpg', 'Seasky', 2, 3);
INSERT INTO Productos (nombre, descripcion, contenido, precio, descuento, existencia, imagen, marca, animales_id, categorias_id) VALUES ('Juguete caña con ratón', 'Juguete para gato en forma de caña de pescar elaborado con textiles naturales.', '1 unidad', 53.00, 0, 10, 'https://m.media-amazon.com/images/I/71bGgo4QPSL._AC_SL1500_.jpg', 'Seasky', 2, 3);

