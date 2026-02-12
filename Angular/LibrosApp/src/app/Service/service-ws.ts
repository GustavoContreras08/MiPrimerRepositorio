import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Libro } from '../Entidades/Libros';

@Injectable({
  providedIn: 'root',
})
export class ServiceWS {
  constructor(private http : HttpClient){}

  url = "http://localhost:8000/api/libro";

  listarLibros(){
    return this.http.get<Libro[]>(this.url + "/listar");
  }

  guardarLibros(libro : Libro){
    return this.http.post<String>(this.url + "/guardar", libro, {responseType:"text" as "json"})
  }

  buscarLibros(libro : Libro){
    return this.http.post<Libro>(`${this.url}/buscar`,libro);
  }

  editarLibros(libro : Libro){
    return this.http.put<String>(this.url + "/editar", libro, {responseType : "text" as "json"})
  }

  eliminarLibros(libro : Libro){
    return this.http.delete<String>(`${this.url}/eliminar`, {body : libro})
  }

}
 