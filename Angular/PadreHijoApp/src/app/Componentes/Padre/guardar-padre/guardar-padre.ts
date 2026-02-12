import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ServiceWS } from '../../../Service/service-ws';
import { Padre } from '../../../Entidades/Padre';
import { Router } from '@angular/router';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-guardar-padre',
  imports: [FormsModule],
  templateUrl: './guardar-padre.html',
  styleUrl: './guardar-padre.css',
})
export class GuardarPadre {

  constructor(private router : Router, private service : ServiceWS){}

  padre : Padre = new Padre();

  guardar(){
    this.service.guardarPadre(this.padre).subscribe(data=>{
      Swal.fire({
        icon: 'success',
        title: "Guardar",
        text:JSON.stringify(data),
        showConfirmButton: false,
        timer: 2500
      });
      this.router.navigate(['listarPadre']);
    })
  }

}
