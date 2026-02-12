import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../../Service/service-ws';
import { Hijo } from '../../../Entidades/Hijo';
import Swal from 'sweetalert2';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-listar-hijo',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './listar-hijo.html',
  styleUrl: './listar-hijo.css',
})
export class ListarHijo implements OnInit{

    constructor(private router : Router, private service : ServiceWS, private cd: ChangeDetectorRef){}
  
    hijo : Hijo = new Hijo();
    hijos: Hijo[] = [];

    ngOnInit(): void {
      this.listarH();
    }

    listarH(){
  this.service.listarHijo().subscribe(data=>{
    this.hijos = data;
    this.cd.detectChanges();
  })
}

  editarButtonH(hijo : Hijo){
      localStorage.setItem('idHijo', hijo.idHijo.toString());
      this.router.navigate(['editarHijo']);
    }
  
    eliminarButtomH(hijo : Hijo){
      Swal.fire({
      title: "¿Seguro que quieres eliminar el ID: " + hijo.idHijo + " ?",
      text: "Este movimiento no se puede revertir!",
      icon: "warning",
      showCancelButton: true,
      confirmButtonColor: "#3085d6",
      cancelButtonColor: "#d33",
      confirmButtonText: "Si, eliminalo"
      }).then((result) => {
        if (result.isConfirmed) {
          this.service.eliminarHijo(hijo.idHijo).subscribe(data => {
          Swal.fire({
            title: "Eliminado!",
            text: JSON.stringify(data),
            icon: "success"
        });
        //this.router.navigate(['listar'])
        this.listarH();
        });
      }else if(result.isDenied){
        Swal.fire({
          title: "Cancelado",
          text: "La eliminacion fue cancelada",
          icon: "info"
        })
      }
      this.listarH();
  
    });
  
    }

}
