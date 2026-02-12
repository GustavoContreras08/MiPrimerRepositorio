import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { ServiceWS } from '../../../Service/service-ws';
import { Padre } from '../../../Entidades/Padre';
import Swal from 'sweetalert2';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-listar-padre',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './listar-padre.html',
  styleUrl: './listar-padre.css',
})
//al hacer una peticion donde quiero que me muestre la informacion de la peticion http al metodo de listar, quiero que cunado entre a mi componente listar, me muetres esa informacion que usaremos OnInit
export class ListarPadre implements OnInit{

  //instanciar clases para navegar a otro componenes y el service para utilizar el metodo que hace la peticion http
  constructor(private router : Router, private service : ServiceWS, private changeDetector : ChangeDetectorRef){}

  //instanciar
  padre : Padre = new Padre();
  padres !: Padre[];

  ngOnInit(): void {
    this.listar();
  }

  listar(){
    this.service.listarPadre().subscribe(data=>{
      this.padres = data;

      console.log(JSON.stringify(data));
      this.changeDetector.detectChanges();
    })
  }

  editarButton(padre : Padre){
    localStorage.setItem('idPadre', padre.idPadre.toString());
    this.router.navigate(['editarPadre']);
  }

  eliminarButtom(padre : Padre){
    Swal.fire({
    title: "¿Seguro que quieres eliminar el ID: " + padre.idPadre + " ?",
    text: "Este movimiento no se puede revertir!",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Si, eliminalo"
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminarPadre(padre.idPadre).subscribe(data => {
        Swal.fire({
          title: "Eliminado!",
          text: JSON.stringify(data),
          icon: "success"
      });
      //this.router.navigate(['listar'])
      this.listar();
      });
    }else if(result.isDenied){
      Swal.fire({
        title: "Cancelado",
        text: "La eliminacion fue cancelada",
        icon: "info"
      })
    }
    this.listar();

  });

  }

}
