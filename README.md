

# Resultados

0. caso de prueba inicial

Dispatcher callcenter = new Dispatcher();  
callcenter.start();  
  

    Employee e2 = new Operator(callcenter, "operador 2");  
    Employee e3 = new Supervisor(callcenter, "supervisor 1");  
    Employee e4 = new Director(callcenter, "director 1");  
    Employee e1 = new Operator(callcenter, "operador 1");  
      
      
    Call call1 = new Call("llamada 1");  
    Call call2 = new Call("llamada 2");  
    Call call3 = new Call("llamada 3");  
    Call call4 = new Call("llamada 4");  
    Call call5 = new Call("llamada 5");  
    Call call6 = new Call("llamada 6");  
    Call call7 = new Call("llamada 7");  
    Call call8 = new Call("llamada 8");  
    Call call9 = new Call("llamada 9");  
    Call call10 = new Call("llamada 10");  
    Call call11 = new Call("llamada 11");  
    Call call12 = new Call("llamada 12");  
    Call call13 = new Call("llamada 13");  
    Call call14 = new Call("llamada 14");  
    Call call15 = new Call("llamada 15");  
    Call call16 = new Call("llamada 16");  
    Call call17 = new Call("llamada 17");  
    Call call18 = new Call("llamada 18");  
    Call call19 = new Call("llamada 19");  
    Call call20 = new Call("llamada 20");  
      
    callcenter.dispatchCall(call1);  
    callcenter.dispatchCall(call2);  
    callcenter.dispatchCall(call3);  
    callcenter.dispatchCall(call4);  
    callcenter.dispatchCall(call5);  
    callcenter.dispatchCall(call6);  
    callcenter.dispatchCall(call7);  
    callcenter.dispatchCall(call8);  
    callcenter.dispatchCall(call9);  
    callcenter.dispatchCall(call10);  
    callcenter.dispatchCall(call11);  
    callcenter.dispatchCall(call12);  
    Employee e5 = new Director(callcenter, "director 2");  
    Employee e6 = new Operator(callcenter, "Operator 3");  
    Employee e7 = new Operator(callcenter, "Operator 4");  
    Employee e8 = new Operator(callcenter, "Operator 5");  
    Employee e9 = new Operator(callcenter, "Operator 6");  
    Employee e10 = new Operator(callcenter, "Operator 7");  
    callcenter.dispatchCall(call13);  
    callcenter.dispatchCall(call14);  
    callcenter.dispatchCall(call15);  
    callcenter.dispatchCall(call16);  
    callcenter.dispatchCall(call17);  
    callcenter.dispatchCall(call18);  
    callcenter.dispatchCall(call19);  
    callcenter.dispatchCall(call20);

 1.  **Aunque se agregaron los empleados en ordenes aleatorios, la asignación, respeta la prioridad de llamada segun lo especificado en el planteamiento, esto gracias a la cola PriorityBlockingQueue y al comparador implementado en Employee.**
 
**Available employee operador 2**
 
Employee operador 2  attending call  llamada 1

**Available employee operador 1**

Employee operador 1  attending call  llamada 2

**Available employee Operator 5**

Employee Operator 5  attending call  llamada 3

**Available employee Operator 6**

Employee Operator 6  attending call  llamada 4

**Available employee Operator 4**

Employee Operator 4  attending call  llamada 5

**Available employee Operator 7**

Employee Operator 7  attending call  llamada 6

**Available employee Operator 3**

Employee Operator 3  attending call  llamada 7

**Available employee supervisor 1**

Employee supervisor 1  attending call  llamada 8

**Available employee director 2**

Employee director 2  attending call  llamada 9

**Available employee director 1**

Employee director 1  attending call  llamada 10

Employee Operator 4  finished call  llamada 5

Available employee Operator 4

Employee Operator 4  attending call  llamada 11

Employee Operator 6  finished call  llamada 4

Available employee Operator 6

Employee Operator 6  attending call  llamada 12

Employee supervisor 1  finished call  llamada 8

Available employee supervisor 1

Employee supervisor 1  attending call  llamada 13

Employee Operator 5  finished call  llamada 3

Available employee Operator 5

Employee Operator 5  attending call  llamada 14

Employee director 1  finished call  llamada 10

Available employee director 1

Employee director 1  attending call  llamada 15

Employee operador 2  finished call  llamada 1

Employee operador 1  finished call  llamada 2

Employee Operator 7  finished call  llamada 6

Available employee operador 2

Employee operador 2  attending call  llamada 16

Available employee operador 1

Employee operador 1  attending call  llamada 17

Available employee Operator 7

Employee Operator 7  attending call  llamada 18

Employee Operator 3  finished call  llamada 7

Available employee Operator 3

Employee Operator 3  attending call  llamada 19

Employee director 2  finished call  llamada 9

Available employee director 2

Employee director 2  attending call  llamada 20

Employee Operator 6  finished call  llamada 12

Employee Operator 4  finished call  llamada 11

Employee supervisor 1  finished call  llamada 13

Employee director 2  finished call  llamada 20

Employee Operator 5  finished call  llamada 14

Employee director 1  finished call  llamada 15

Employee operador 2  finished call  llamada 16

Employee operador 1  finished call  llamada 17

Employee Operator 7  finished call  llamada 18

Employee Operator 3  finished call  llamada 19 

2.**Usando tiempos fijos en llamada (ejemplo ya que es aleatorio entre 5 y 10 seg)  usamos un Executor service limitado a 4 threads (ejemplo son 10) para respetar el enunciado.**

Available employee operador 2  
  
Employee operador 2  attending call  llamada 1  
  
Available employee operador 1  
  
Employee operador 1  attending call  llamada 2  
  
Available employee supervisor 1  
  
Employee supervisor 1  attending call  llamada 3  
  
Available employee director 1  
  
Employee director 1  attending call  llamada 4  
  
**Employee operador 2  finished call  llamada 1**  
  
**Employee operador 1  finished call  llamada 2**  
  
**Employee director 1  finished call  llamada 4**  
  
**Employee supervisor 1  finished call  llamada 3**
  
Available employee operador 2  
  
Employee operador 2  attending call  llamada 5  
  
Available employee operador 1  
  
Employee operador 1  attending call  llamada 6  
  
Available employee supervisor 1  
  
Employee supervisor 1  attending call  llamada 7  
  
Available employee director 1  
  
Employee director 1  attending call  llamada 8  
  

    **Employee director 1  finished call  llamada 8**  
      
    **Employee operador 1  finished call  llamada 6**  
      director y operador acabaron luego la prioridad debe ser para
      el operador 1

  
** Available employee operador 1   **
  
Employee operador 1  attending call  llamada 9 
  
**Employee supervisor 1  finished call  llamada 7**  
  
**Employee operador 2  finished call  llamada 5** 
  
Available employee director 1  
  
Employee director 1  attending call  llamada 10  
  
Available employee operador 2  
  
Employee operador 2  attending call  llamada 11  
  
Available employee supervisor 1  
  
Employee supervisor 1  attending call  llamada 12  
  
Employee operador 1  finished call  llamada 9  
  
Available employee operador 1  
  
Employee operador 1  attending call  llamada 13  
  
Employee supervisor 1  finished call  llamada 12  
  
Available employee supervisor 1  
  
Employee supervisor 1  attending call  llamada 14  
  
Employee operador 2  finished call  llamada 11  
  
Available employee operador 2  
  
Employee operador 2  attending call  llamada 15  
  
Employee director 1  finished call  llamada 10  
  
Available employee director 1  
  
Employee director 1  attending call  llamada 16  
  
Employee director 1  finished call  llamada 16  
  
Employee operador 2  finished call  llamada 15  
  
Employee operador 1  finished call  llamada 13 
  
Employee supervisor 1  finished call  llamada 14  
  
Available employee director 1  
  
Employee director 1  attending call  llamada 17  
  
Available employee operador 2  
  
Employee operador 2  attending call  llamada 18  
  
Available employee operador 1  
  
Employee operador 1  attending call  llamada 19  
  
Available employee supervisor 1  
  
Employee supervisor 1  attending call  llamada 20  
  
Employee operador 1  finished call  llamada 19  
  
Employee director 1  finished call  llamada 17  
  
Employee supervisor 1  finished call  llamada 20  
  
Employee operador 2  finished call  llamada 18


  3.**Todos las llamadas se encolan y esperan ser atendidas segun la cantidad de empleados disponibles y el pool size definido.**

