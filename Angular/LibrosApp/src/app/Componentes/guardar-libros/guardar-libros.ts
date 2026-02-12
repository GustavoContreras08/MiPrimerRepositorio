import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../Service/service-ws';
import { FormsModule } from '@angular/forms';
import Swal from 'sweetalert2';
import { Libro } from '../../Entidades/Libros';

@Component({
  selector: 'app-guardar-libros',
  imports: [FormsModule],
  templateUrl: './guardar-libros.html',
  styleUrl: './guardar-libros.css',
})
export class GuardarLibros {

  constructor(private router: Router, private service: ServiceWS){}

  libro : Libro = new Libro();

  guardar(){
    this.service.guardarLibros(this.libro).subscribe(data=>{
      Swal.fire({
        position: "top-end",
        icon: "success",
        title: JSON.stringify(data),
        showConfirmButton: false,
        timer: 2500
      });
      this.router.navigate(['listar'])
    })
  }
}
