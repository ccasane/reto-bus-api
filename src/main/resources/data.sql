TRUNCATE TABLE buses RESTART IDENTITY CASCADE;
TRUNCATE TABLE marcas RESTART IDENTITY CASCADE;

INSERT INTO marcas (nombre) VALUES
  ('Volvo'),
  ('Scania'),
  ('Fiat'),
  ('Mercedes Benz'),
  ('Hyundai'),
  ('MAN');

INSERT INTO buses (numero_bus, placa, caracteristicas, marca_id, activo, fecha_creacion) VALUES
  ('B001', 'ABC-123', 'Aire acondicionado, WiFi', 1, true, now()),
  ('B002', 'DEF-456', 'Asientos reclinables', 2, true, now()),
  ('B003', 'GHI-789', 'TV, USB', 3, false, now()),
  ('B005', 'ACD-123', 'Aire acondicionado, WiFi', 4, true, now()),
  ('B006', 'DFE-456', 'Asientos reclinables', 5, true, now()),
  ('B007', 'IFF-719', 'TV, Asientos reclinables', 6, false, now()),
  ('B008', 'HCS-299', 'TV, USB, Aire acondicionado', 2, false, now()),
  ('B009', 'GJJ-989', 'TV, USB, WiFi', 1, false, now());