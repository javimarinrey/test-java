Supongamos que estas clases ya están creadas y necesitamos agregar un par de funcionalidades sin tener que tocar
el código ya existente. La primera funcionalidad es validar que los números a y b sean mayores a 0 y
la segunda funcionalidad es loggear los parámetros de entrada.

Como podrán ver en el ejemplo, en el método invoke se hace el control y el log sobre los argumentos que entran
al método suma del RealSubject. Además para simplificar la creación del Proxy, se implementó un method-factory que
crea el proxy dinámico (método proxyFactory).