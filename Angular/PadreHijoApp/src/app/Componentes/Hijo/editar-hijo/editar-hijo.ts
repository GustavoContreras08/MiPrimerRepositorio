import { ChangeDetectorRef, Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../../Service/service-ws';
import { Hijo } from '../../../Entidades/Hijo';
import Swal from 'sweetalert2';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-editar-hijo',
  imports: [CommonModule, FormsModule],
  templateUrl: './editar-hijo.html',
  styleUrl: './editar-hijo.css',
})
export class EditarHijo {

  constructor(private router: Router, private service: ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  hijo : Hijo = new Hijo();

  ngOnInit(){
  this.buscarHijos();
}


  buscarHijos(){
  let HijoString = localStorage.getItem('idHijo');

  if(HijoString){
    this.hijo.idHijo = Number(HijoString);

    this.service.buscarHijo(this.hijo.idHijo).subscribe((data: Hijo) => {
      this.hijo = data;

      Swal.fire({
        title: "EDITAR",
        icon: "success",
        text: "Informacion Cargada",
        draggable: true
      });

      this.changeDetectorRef.detectChanges();
    });
  }
}


  editarDatos(){
    this.service.editarHijo(this.hijo).subscribe(data =>{
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
