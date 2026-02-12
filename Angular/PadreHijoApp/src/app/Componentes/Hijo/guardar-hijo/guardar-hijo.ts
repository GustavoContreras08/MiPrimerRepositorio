import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceWS } from '../../../Service/service-ws';
import { Hijo } from '../../../Entidades/Hijo';
import Swal from 'sweetalert2';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { Padre } from '../../../Entidades/Padre';

@Component({
  selector: 'app-guardar-hijo',
  imports: [CommonModule,FormsModule],
  templateUrl: './guardar-hijo.html',
  styleUrl: './guardar-hijo.css',
})
export class GuardarHijo {

  constructor(private router : Router, private service : ServiceWS){}

  padres : Padre[] = [];
  hijo : Hijo = new Hijo();

  guardarH() {

    // ✅ Validar que haya padre seleccionado
    if (!this.hijo.padre || !this.hijo.padre.idPadre) {
      Swal.fire("Error", "Debe seleccionar un padre", "warning");
      return;
    }

    // ✅ Crear objeto SOLO para enviar al backend
    const hijoEnviar = {
      idHijo: this.hijo.idHijo,
      nombre: this.hijo.nombre,
      apellido: this.hijo.apellido,
      edad: this.hijo.edad,
      hobbie: this.hijo.hobbie,
      idPadre: this.hijo.padre.idPadre
    };

    console.log("📤 JSON enviado al backend:", hijoEnviar);

    this.service.guardarHijo(hijoEnviar as any).subscribe({

      next: (data) => {
        Swal.fire({
          icon: 'success',
          title: "Guardar",
          text: JSON.stringify(data),
          showConfirmButton: false,
          timer: 2500
        });

        this.router.navigate(['listarHijo']);
      },

      error: (err) => {
        console.error("❌ Error backend:", err);

        Swal.fire({
          icon: 'error',
          title: "Error al guardar",
          text: err.error || "Revisa la consola"
        });
      }

    });

  }

}
