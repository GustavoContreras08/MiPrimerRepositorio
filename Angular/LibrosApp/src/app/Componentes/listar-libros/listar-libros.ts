import { ChangeDetectionStrategy, ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../Service/service-ws';
import Swal from 'sweetalert2';
import { Libro } from '../../Entidades/Libros';

@Component({
  selector: 'app-listar-libros',
  imports: [],
  templateUrl: './listar-libros.html',
  styleUrl: './listar-libros.css',
})
export class ListarLibros implements OnInit{

  constructor(private router : Router, private service : ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  libro : Libro = new Libro();
  libros !: Libro[];

  ngOnInit(): void { 
        this.listarC();
  }

  listarC(){
    this.service.listarLibros().subscribe(data => {
      this.libros = data
      console.log('listado exitoso' + JSON.stringify(data));
      this.changeDetectorRef.detectChanges(); 
    })
  }

  editarButton(libro : Libro){
    localStorage.setItem('idLibro', libro.idLibro.toString());
    this.router.navigate(['editar']);
  }

  eliminarButtom(libro : Libro){
    Swal.fire({
    title: "¿Seguro que quieres eliminar el ID: " + libro.idLibro + " ?",
    text: "Este movimiento no se puede revertir!",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Si, eliminalo"
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminarLibros(libro).subscribe(data => {
        Swal.fire({
          title: "Eliminado!",
          text: JSON.stringify(data),
          icon: "success"
      });
      this.listarC();
      });
    }else if(result.isDenied){
      Swal.fire({
        title: "Cancelado",
        text: "La eliminacion fue cancelada",
        icon: "info"
      })
    }
  });

  }

}
