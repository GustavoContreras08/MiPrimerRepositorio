import { ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Computadora } from '../../Entidades/Computadora';
import { ServiceWS } from '../../Service/service-ws';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-editar-compus',
  imports: [FormsModule],
  templateUrl: './editar-compus.html',
  styleUrl: './editar-compus.css',
})
export class EditarCompus implements OnInit{

  //inyectar las clases para navegar y usar los metodos de peticiones http
  constructor(private router: Router, private service: ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  compu : Computadora = new Computadora();

  ngOnInit(): void {
    this.buscarCompus();
  }

  buscarCompus(){
    let CompuString = localStorage.getItem('idCompu2');
    this.compu.idCompu2 = Number(CompuString);
    this.service.buscarCompu(this.compu.idCompu2).subscribe(data => {
      this.compu = data;
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
    this.service.editarCompu(this.compu).subscribe(data =>{
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
