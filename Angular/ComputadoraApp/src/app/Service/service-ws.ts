import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Computadora } from '../Entidades/Computadora';

@Injectable({
  providedIn: 'root',
})
//clase que me permitira crear metodos que haran peticiones a mi clase de controlador en el backend
export class ServiceWS {
  //inicializar el httpCliente para que me permita hacer peticiones http
  constructor(private http : HttpClient){}

  //configurar una variable que contenga la URL del controlador
  url = "http://localhost:8004/api/Compu";

  //configurar los metodos que haran las peticiones
  listarCompu(){
    return this.http.get<Computadora[]>(this.url + "/listar");
  }

  guardarCompu(computadora : Computadora){
    return this.http.post<String>(this.url + "/guardar", computadora, {responseType:"text" as "json"})
  }

  buscarCompu(idCompu2 : number){
    return this.http.get<Computadora>(`${this.url}/buscar/${idCompu2}`);
  }

  editarCompu(computadora : Computadora){
    return this.http.put<String>(this.url + "/editar", computadora, {responseType : "text" as "json"})
  }

  eliminarCompu(idCompu2 : number){
    return this.http.delete<String>(`${this.url}/eliminar/${idCompu2}`, {responseType : "text" as "json"})
  }

}
 