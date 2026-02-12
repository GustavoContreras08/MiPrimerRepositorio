import { Routes } from '@angular/router';
import { ListarPadre } from './Componentes/Padre/listar-padre/listar-padre';
import { GuardarPadre } from './Componentes/Padre/guardar-padre/guardar-padre';
import { EditarPadre } from './Componentes/Padre/editar-padre/editar-padre';
import { ListarHijo } from './Componentes/Hijo/listar-hijo/listar-hijo';
import { GuardarHijo } from './Componentes/Hijo/guardar-hijo/guardar-hijo';
import { EditarHijo } from './Componentes/Hijo/editar-hijo/editar-hijo';

export const routes: Routes = [
    {path : 'listarPadre', component : ListarPadre},
    {path : 'guardarPadre', component : GuardarPadre},
    {path : 'editarPadre', component : EditarPadre},

    {path : 'listarHijo', component : ListarHijo},
    {path : 'guardarHijo', component : GuardarHijo},
    {path : 'editarHijo', component : EditarHijo}
];
