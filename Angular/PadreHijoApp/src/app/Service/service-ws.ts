import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Padre } from '../Entidades/Padre';
import { Hijo } from '../Entidades/Hijo';

@Injectable({
  providedIn: 'root',
})
export class ServiceWS {
  constructor(private http:HttpClient){}

  url = "http://localhost:8002/api/"


//PADRE
  listarPadre(){
    return this.http.get<Padre[]>(this.url + "Padre/listar");
  }

  guardarPadre(padre : Padre){
    return this.http.post<String>(this.url + "Padre/guardar", padre, {responseType : "text" as "json"});
  }

  editarPadre(padre : Padre){
    return this.http.put<String>(this.url + "Padre/editar", padre, {responseType : "text" as "json"})
  }

  eliminarPadre(padre : number){
    return this.http.get<Padre>(this.url + "Padre/eliminar/" + padre )
  }

  buscarPadre(idPadre : number){
    return this.http.get<Padre>(this.url + "Padre/buscar/" + idPadre)
  }


  //HIJO
listarHijo(){
  return this.http.get<Hijo[]>(this.url + "Hijo");
}

guardarHijo(hijo : Hijo){
  return this.http.post<string>(this.url + "Hijo", hijo, {responseType : "text" as "json"});
}

editarHijo(hijo : Hijo){
  return this.http.put<string>(this.url + "Hijo", hijo, {responseType : "text" as "json"});
}

eliminarHijo(idHijo: number){
  return this.http.delete<string>(this.url + "Hijo/" + idHijo, {responseType : "text" as "json"});
}

buscarHijo(idHijo : number){
  return this.http.get<Hijo>(this.url + "Hijo/" + idHijo);
}


}