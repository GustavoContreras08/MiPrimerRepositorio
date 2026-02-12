import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceWS } from '../../../Service/service-ws';
import { Padre } from '../../../Entidades/Padre';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar-padre',
  imports: [FormsModule],
  templateUrl: './editar-padre.html',
  styleUrl: './editar-padre.css',
})
export class EditarPadre implements OnInit{
  
  constructor(private router: Router, private service: ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  padre : Padre = new Padre();

  ngOnInit(): void {
    this.buscarPadres();
  }

  buscarPadres(){
    let PadreString = localStorage.getItem('idPadre');
    this.padre.idPadre = Number(PadreString);
    this.service.buscarPadre(this.padre.idPadre).subscribe(data => {
      this.padre = data;
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
    this.service.editarPadre(this.padre).subscribe(data =>{
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
