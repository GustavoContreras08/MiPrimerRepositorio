import { Routes } from '@angular/router';
import { ListarLibros } from './Componentes/listar-libros/listar-libros';
import { GuardarLibros } from './Componentes/guardar-libros/guardar-libros';
import { EditarLibros } from './Componentes/editar-libros/editar-libros';

export const routes: Routes = [
    {path: 'listar', component : ListarLibros},
    {path: 'guardar', component : GuardarLibros},
    {path: 'editar', component : EditarLibros}
];
