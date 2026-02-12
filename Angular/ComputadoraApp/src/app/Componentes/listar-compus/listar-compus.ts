import { ChangeDetectionStrategy, ChangeDetectorRef, Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../Service/service-ws';
import { Computadora } from '../../Entidades/Computadora';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-listar-compus',
  imports: [],
  templateUrl: './listar-compus.html',
  styleUrl: './listar-compus.css',
})

//OnInit es un ciclo de vida que se carga una vez que el html se cargo,pero este de aqui nos indeca en que momento de la via de mi html, se cargara la informacione que este solicitada
//Al ser un listado de computadoras, necesito que se cargue al inici de la vida de mi html para visualizar todo sin la necesidad de recargar la pagina o clickear un boton en especifico
export class ListarCompus implements OnInit{

  //agregar constructor para inyectar clases
  constructor(private router : Router, private service : ServiceWS, private changeDetectorRef: ChangeDetectorRef){}

  //instanciar el objeto
  compu : Computadora = new Computadora();
  compus !: Computadora[];

  //este metodo es el que se encarga de qiue el ciclo de vida funcione correctamente, o sea cargada automaticamente la unformacion d que to le indique aqui.
  ngOnInit(): void {
    //el flujo de datos que estoy recibiendo a. hacer la peticion hrrp, debe de ir en este metodoque aplica el clico de vida    
    this.listarC();
  }

  //metodo que utiliza al metodo dentro de el service el cual hace la peticion de listar en mi controlador backend
  listarC(){
    //subscribe es un tipo de manejador de datos, osea maneja de forma correcta el flujo de datos que voy a recibir al hacer peticiones a mi controlador
    this.service.listarCompu().subscribe(data => {
      this.compus = data
      console.log('listado exitoso' + JSON.stringify(data));
      this.changeDetectorRef.detectChanges(); //imprime en la consola del navegador la respuesta de mi controlador backend, y no debe de usarse en una aplicacion en produccion
    })
  }

  editarButton(computadora : Computadora){
    localStorage.setItem('idCompu2', computadora.idCompu2.toString());
    this.router.navigate(['editar']);
  }

  eliminarButtom(compu : Computadora){
    Swal.fire({
    title: "¿Seguro que quieres eliminar el ID: " + compu.idCompu2 + " ?",
    text: "Este movimiento no se puede revertir!",
    icon: "warning",
    showCancelButton: true,
    confirmButtonColor: "#3085d6",
    cancelButtonColor: "#d33",
    confirmButtonText: "Si, eliminalo"
    }).then((result) => {
      if (result.isConfirmed) {
        this.service.eliminarCompu(compu.idCompu2).subscribe(data => {
        Swal.fire({
          title: "Eliminado!",
          text: JSON.stringify(data),
          icon: "success"
      });
      //this.router.navigate(['listar'])
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
