import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWS } from '../../Service/service-ws';
import Swal from 'sweetalert2';
import { Libro } from '../../Entidades/Libros';

@Component({
  selector: 'app-editar-libros',
  imports: [FormsModule],
  templateUrl: './editar-libros.html',
  styleUrl: './editar-libros.css',
})
export class EditarLibros implements OnInit{

  //inyectar las clases para navegar y usar los metodos de peticiones http
  constructor(private router: Router, private service: ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  libro : Libro = new Libro();

  ngOnInit(): void {
    this.buscarLibros();
  }

  buscarLibros(){
    let LibroString = localStorage.getItem('idLibro');
    this.libro.idLibro = Number(LibroString);
    this.service.buscarLibros(this.libro).subscribe(data => {
      this.libro = data;
        Swal.fire({
        title: "EDITAR",
        icon: "success",
        text: "Informacion Cargada",
        draggable: true
        });
      this.changeDetectorRef.detectChanges();
    })
  }

  editarDatos(){
    this.service.editarLibros(this.libro).subscribe(data =>{
        Swal.fire({
        title: "EDITAR",
        icon: "success",
        text: JSON.stringify(data),
        showConfirmButton: false,
        timer : 2500
        });
        this.router.navigate(['listar']);
    }
    )
  }

}
