import { Component, signal } from '@angular/core';
import { Router, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('ComputadoraApp');

  //Constructor para inicializar el router
  constructor(private router : Router){}

  //funciones para llamar a mis componentes
  listar(){
    this.router.navigate(['listar']);
  }

  guardar(){
    this.router.navigate(['guardar'])
  }

  editar(){
    this.router.navigate(['editar'])
  }
}
